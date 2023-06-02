package miki.edu.bookpub;

import miki.edu.bookpub.entity.Author;
import miki.edu.bookpub.entity.Book;
import miki.edu.bookpub.entity.Publisher;
import miki.edu.bookpub.repository.AuthorRepository;
import miki.edu.bookpub.repository.BookRepository;
import miki.edu.bookpub.repository.PublisherRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

public class StartupRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        logger.info("Welcome to the Book Catalog System!");

        Author author = new Author("Gabriel", "Miki");
        author = authorRepository.save(author);

        Publisher publisher = new Publisher("Terra");
        publisher = publisherRepository.save(publisher);

        Book book = new Book("913-4-12345-096-1", "Java Struggles",
                author, publisher);
        bookRepository.save(book);

    }

    @Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
        logger.info("Number of Books: " + bookRepository.count());
    }

}
