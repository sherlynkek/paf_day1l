package vttp.batch5.paf.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vttp.batch5.paf.day1.model.Book;
import vttp.batch5.paf.day1.service.BookService;

@Controller
@RequestMapping()
public class BookController {
    
    @Autowired
    private BookService bookService;
    
    @GetMapping("/books")
    public ModelAndView getBooks(@RequestParam(required=true) String author, 
                                @RequestParam(defaultValue = "10") int count) {
        List<Book> book = bookService.getBooks(count);
        ModelAndView mav = new ModelAndView("books");
        mav.addObject("author", author);
        mav.addObject("count", count);
        mav.addObject("books", book);
        mav.setStatus(HttpStatusCode.valueOf(200));

        return mav;
    }
}
