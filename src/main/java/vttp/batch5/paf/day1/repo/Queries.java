package vttp.batch5.paf.day1.repo;


public class Queries {

        public static final String SQL_SELECT_GAME_LIMIT = """
                select * from game limit ?
                """;

        public static final String SQL_SELECT_GAME = """
                select * from game limit 10
                """;

        public static final String SQL_SELECT_BOOK = """
                select * from kindle 
                where author like ?
                order by title asc
                """;

}
