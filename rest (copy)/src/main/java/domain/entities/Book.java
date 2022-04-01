package domain.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book")
public class Book {

	public Book() {}

	public Book(@NotNull String isbn, @NotNull String name, Genre genre) {
		this.isbn = isbn;
		this.name = name;
		this.genre = genre;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name = "name", nullable = false)
	private String name;

	@NotNull
	@Column(name = "isbn", nullable = false)
	private String isbn;

	@ManyToOne
	@JoinColumn(name = "genre", referencedColumnName = "id",foreignKey=@ForeignKey(name="FK_genre", value=ConstraintMode.CONSTRAINT))
	private Genre genre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", isbn='" + isbn + '\'' +
				", genre=" + genre +
				'}';
	}
}