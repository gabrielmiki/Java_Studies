package miki.edu.bookpub.controllers;

import jakarta.servlet.http.HttpServletRequest;
import miki.edu.bookpub.editors.IsbnEditor;
import miki.edu.bookpub.entity.Book;
import miki.edu.bookpub.entity.Reviewers;
import miki.edu.bookpub.model.Isbn;
import miki.edu.bookpub.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Isbn isbn) {
        return bookRepository.findBookByIsbn(isbn.toString());
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {

        binder.registerCustomEditor(Isbn.class, new IsbnEditor());

    }

    @RequestMapping(value = "/{isbn}/reviewers", method = RequestMethod.GET)
    public List<Reviewers> getReviewers(@PathVariable("isbn") Book book) {

        return book.getReviewers();

    }

    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public String getSessionId(HttpServletRequest request) {

        return request.getSession().getId();

    }

}
