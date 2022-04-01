package domain;

import domain.entities.Genre;

import javax.persistence.PersistenceException;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

public class GenreController {

/*	protected final GenreRepository genreRepository;

	public GenreController(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}

	@Get("/{id}")
	public Genre show(Long id) {
		return genreRepository
				.findById(id)
				.orElse(null);
	}

	@Put
	public HttpResponse update(@Body @Valid GenreUpdateCommand command) {
		int numberOfEntitiesUpdated = genreRepository.update(command.getId(), command.getName());

		return HttpResponse
				.noContent()
				.header(HttpHeaders.LOCATION, location(command.getId()).getPath());
	}

	@Get(value = "/list{?args*}")
	public List<Genre> list(@Valid SortingAndOrderArguments args) {
		return genreRepository.findAll(args);
	}

	@Post
	public HttpResponse<Genre> save(@Body @Valid GenreSaveCommand cmd) {
		Genre genre = genreRepository.save(cmd.getName());

		return HttpResponse
				.created(genre)
				.headers(headers -> headers.location(location(genre.getId())));
	}

	@Post("/ex")
	public HttpResponse<Genre> saveExceptions(@Body @Valid GenreSaveCommand cmd) {
		try {
			Genre genre = genreRepository.saveWithException(cmd.getName());
			return HttpResponse
					.created(genre)
					.headers(headers -> headers.location(location(genre.getId())));
		} catch(PersistenceException e) {
			return HttpResponse.noContent();
		}
	}

	@Delete("/{id}")
	public HttpResponse delete(Long id) {
		genreRepository.deleteById(id);
		return HttpResponse.noContent();
	}

	protected URI location(Long id) {
		return URI.create("/genres/" + id);
	}

	protected URI location(Genre genre) {
		return location(genre.getId());
	}*/
}