package vttp.batch5.paf.day1.model;

import java.util.Date;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Book {
    private int asin;
    private String title;
    private String author;
    private String image;
    private String product;
    private float stars;
    private int reviews;
    private float price;
    private Date published;
    private String catName;

    public int getAsin() {
        return asin;
    }
    public void setAsin(int asin) {
        this.asin = asin;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public float getStars() {
        return stars;
    }
    public void setStars(float stars) {
        this.stars = stars;
    }
    public int getReviews() {
        return reviews;
    }
    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Date getPublished() {
        return published;
    }
    public void setPublished(Date published) {
        this.published = published;
    }
    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
    }

    public static Book toBook(SqlRowSet rs) {
        Book b = new Book();
        b.setAsin(rs.getInt("asin"));
        b.setTitle(rs.getString("title"));
        b.setAuthor(rs.getString("author"));
        b.setImage(rs.getString("imgUrl"));
        b.setProduct(rs.getString("productURL"));
        b.setStars(rs.getFloat("stars"));
        b.setReviews(rs.getInt("reviews"));
        b.setPrice(rs.getFloat("price"));
        b.setPublished(rs.getDate("publishedDate"));
        b.setCatName(rs.getString("category_name"));
        return b;
    }
    
}
