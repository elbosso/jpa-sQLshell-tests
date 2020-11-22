package domain;

import domain.entities.Genre;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GenreRepositoryImpl implements GenreRepository {
	private final EntityManager entityManager;

	public GenreRepositoryImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Optional<Genre> findById(@NotNull Long id) {
		return Optional.ofNullable(entityManager.find(Genre.class, id));
	}

	@Override
	@Transactional
	public Genre save(@NotBlank String name) {
		Genre genre = new Genre(name);
		entityManager.persist(genre);
		return genre;
	}

	@Override
	@Transactional
	public void deleteById(@NotNull Long id) {
		findById(id).ifPresent(entityManager::remove);
	}

	private final static List<String> VALID_PROPERTY_NAMES = Arrays.asList("id", "name");

	public List<Genre> findAll(@NotNull SortingAndOrderArguments args) {
		String qlString = "SELECT g FROM Genre as g";
		if (args.getOrder().isPresent() && args.getSort().isPresent() && VALID_PROPERTY_NAMES.contains(args.getSort().get())) {
			qlString += " ORDER BY g." + args.getSort().get() + " " + args.getOrder().get().toLowerCase();
		}
		TypedQuery<Genre> query = entityManager.createQuery(qlString, Genre.class);
		query.setMaxResults(args.getMax().orElse(10)/*.orElseGet(applicationConfiguration::getMax)*/);
		args.getOffset().ifPresent(query::setFirstResult);

		return query.getResultList();
	}

	@Override
	@Transactional
	public int update(@NotNull Long id, @NotBlank String name) {
		return entityManager.createQuery("UPDATE Genre g SET name = :name where id = :id")
				.setParameter("name", name)
				.setParameter("id", id)
				.executeUpdate();
	}

	@Override
	@Transactional
	public Genre saveWithException(@NotBlank String name) {
		save(name);
		throw new PersistenceException();
	}
}