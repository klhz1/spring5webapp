package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookRepository, Long> {
}
