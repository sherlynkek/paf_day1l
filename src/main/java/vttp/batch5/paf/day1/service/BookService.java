package vttp.batch5.paf.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.batch5.paf.day1.model.Book;
import vttp.batch5.paf.day1.repo.BookRepo;

@Service
public class BookService {
    
    @Autowired
    private BookRepo bookRepo;
    
    public List<Book> getBooks() {
        return bookRepo.getBook(10);
    }

    public List<Book> getBooks(int count) {
        return bookRepo.getBook(count);
    }
}
