package domain.entities;

import domain.GenreRepository;
import domain.GenreRepositoryImpl;
import junit.framework.Assert;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author josueribeiro@github.com
 */
public class BookTest
{

	static EntityManagerFactory emf;
	EntityManager em;

	@BeforeClass
	public static void setUp() throws ClassNotFoundException
	{
//		emf = Persistence.createEntityManagerFactory("hsqldb-jpa");
		emf = Persistence.createEntityManagerFactory("hsqldb-jpa");
	}

	@Before
	public void initEntityManager() {
		em = emf.createEntityManager();
	}

	@Test
	public void testPersist() {
		try {

			GenreRepository repo=new GenreRepositoryImpl(em);
			Genre genre=repo.save("genre 1");
			// Persist in database
			Book book = new Book();
			book.setName("book2");
			book.setIsbn("isbn");
			book.setGenre(genre);
			em.getTransaction().begin();
			em.persist(book);
			em.getTransaction().commit();

			// Find by id
			Book bookDB = em.find(Book.class, book.getId());

			Assert.assertEquals(book.getName(), bookDB.getName());
			Assert.assertEquals(genre.getName(),book.getGenre().getName());
		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testUpdate() {
		try {

			// Find by id in database
			Book book = em.find(Book.class, 10); // See file import.sql
			book.setName("name 22");
			book.setIsbn("isbn");

			// Persist in database
			em.getTransaction().begin();
			em.merge(book);
			em.getTransaction().commit();

			// Find by id
			Book bookDB = em.find(Book.class, 10);
			Assert.assertEquals(book.getName(), bookDB.getName());

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testFindById() {
		try {

			// Find by id in database
			Integer bookId = 11;
			Book book = em.find(Book.class, bookId); // See file import.sql

			Assert.assertEquals(bookId, book.getId());

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testFindByReference() {
		try {

			// Find by id in database
			Integer bookId = 10;
			Book book = em.getReference(Book.class, bookId); // See file import.sql

			Assert.assertEquals(bookId, book.getId());

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testRemove() {
		try {

			// Find by id in database and remove
			Integer bookId = 10;
			Book book = em.find(Book.class, bookId); // See file import.sql
			em.getTransaction().begin();
			em.remove(book);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Book bookDB = em.find(Book.class, bookId); // See file import.sql

			Assert.assertNull(bookDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@After
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterClass
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}
