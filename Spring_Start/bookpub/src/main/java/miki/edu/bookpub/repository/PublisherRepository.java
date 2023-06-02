package miki.edu.bookpub.repository;

import miki.edu.bookpub.entity.Author;
import miki.edu.bookpub.entity.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PublisherRepository extends
        CrudRepository<Publisher, Long>, PagingAndSortingRepository<Publisher, Long> {
}
