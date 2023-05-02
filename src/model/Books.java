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

    
}
