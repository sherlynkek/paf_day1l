package vttp.batch5.paf.day1.repo;

import static vttp.batch5.paf.day1.repo.Queries.SQL_SELECT_BOOK;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.day1.model.Book;

@Repository
public class BookRepo {
    
    @Autowired
    private JdbcTemplate template;
    
    public List<Book> getBook(int limit) {
        SqlRowSet rs = template.queryForRowSet(SQL_SELECT_BOOK, limit);
        List<Book> result = new LinkedList<>();

        while(rs.next()) {
            result.add(Book.toBook(rs));
        }
        return result;
        
    }

    
}
