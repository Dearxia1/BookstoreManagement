package model;

public class Books extends Bibliographic_Products {
    
    private String hexadecimal_identifier;
    private String short_review;
    private Genre genre;
    private String url_book_cover;
    private Double sales_value;
    private int sold_copies;

    public Books(

        String name, 
        String number_pages,
        String publication_date,
        int accumulated_pages_read,
        String hexadecimal_identifier,
        String short_review,
        Genre genre,
        String url_book_cover,
        Double sales_value,
        int sold_copies){



        super(name,number_pages,publication_date,accumulated_pages_read);
        this.hexadecimal_identifier = hexadecimal_identifier;
        this.short_review = short_review;
        this.genre = genre;
        this.url_book_cover = url_book_cover;
        this.sales_value = sales_value;
        this.sold_copies = sold_copies;
    }

    public String getHexadecimal_identifier() {
        return hexadecimal_identifier;
    }

    public void setHexadecimal_identifier(String hexadecimal_identifier) {
        this.hexadecimal_identifier = hexadecimal_identifier;
    }

    public String getShort_review() {
        return short_review;
    }

    public void setShort_review(String short_review) {
        this.short_review = short_review;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getUrl_book_cover() {
        return url_book_cover;
    }

    public void setUrl_book_cover(String url_book_cover) {
        this.url_book_cover = url_book_cover;
    }

    public Double getSales_value() {
        return sales_value;
    }

    public void setSales_value(Double sales_value) {
        this.sales_value = sales_value;
    }

    public int getSold_copies() {
        return sold_copies;
    }

    public void setSold_copies(int sold_copies) {
        this.sold_copies = sold_copies;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + getName() + '\'' +
                ", number_pages='" + getNumber_pages() + '\'' +
                ", publication_date='" + getPublication_date() + '\'' +
                ", accumulated_pages_read=" + getAccumulated_pages_read() +
                ", hexadecimal_identifier='" + hexadecimal_identifier + '\'' +
                ", short_review='" + short_review + '\'' +
                ", genre=" + genre +
                ", url_book_cover='" + url_book_cover + '\'' +
                ", sales_value=" + sales_value +
                ", sold_copies=" + sold_copies +
                '}';
    }

    
}
