package vttp.batch5.paf.day1.model;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Game {
    private int gameId;
    private String name;
    private int year;
    private int ranking;
    private int usersRated;
    private String url;
    private String image;


    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getUsersRated() {
        return usersRated;
    }
    public void setUsersRated(int usersRated) {
        this.usersRated = usersRated;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public static Game toMovie(SqlRowSet rs) {
        Game m = new Game();
        m.setYear(rs.getInt("year"));
        m.setUrl(rs.getString("url"));
        m.setName(rs.getString("name"));
        m.setGameId(rs.getInt("gid"));
        m.setImage(rs.getString("image"));
        m.setRanking(rs.getInt("ranking"));
        m.setUsersRated(rs.getInt("user_rated"));
        return m;
    }
    
}
