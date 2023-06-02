package miki.edu.bookpub.repository;

import miki.edu.bookpub.entity.Reviewers;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewerRepository extends PagingAndSortingRepository<Reviewers, Long> {
}
