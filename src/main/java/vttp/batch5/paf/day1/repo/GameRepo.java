package vttp.batch5.paf.day1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.LinkedList;

import vttp.batch5.paf.day1.model.Game;
import static vttp.batch5.paf.day1.repo.Queries.SQL_SELECT_GAME;
import static vttp.batch5.paf.day1.repo.Queries.SQL_SELECT_GAME_LIMIT;

@Repository
public class GameRepo {
    
    @Autowired
    private JdbcTemplate template;
    
    public List<Game> getGames(int limit) {
        /// select * from game where limit ?
        SqlRowSet rs = template.queryForRowSet(SQL_SELECT_GAME_LIMIT, limit);
        List<Game> results = new LinkedList<>();

        // will return true if there are records to read
        while (rs.next()) {
            results.add(Game.toMovie(rs));
        }

        return results;
    }

    // public List<Game> getGames() {
    //    SqlRowSet rs =  template.queryForRowSet(SQL_SELECT_GAME);
    //    // will return true if there are records to read
    //    List<Game> results = new LinkedList<>();

    //    while(rs.next()) {
    //     results.add(Game.toMovie(rs));
    //    }
       
    //    return results;
    // }

    public List<Game> getGames() {
        return getGames(5);
     }
}

