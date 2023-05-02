package model;

public class Revistas extends Bibliographic_Products{
    
    private String alphanumeric_identifier;
    private Category category;
    private String url_magazine_cover;
    private double subscription_price;
    private String frequency_of_issuance;
    private int Active_subscriptions;

    public Revistas(
        
     String name,
     String number_pages,
     String publication_date,
     int accumulated_pages_read,
     String alphanumeric_identifier,
     Category category,
     String url_magazine_cover,
     double subscription_price,
     String frequency_of_issuance,
     int active_subscriptions) {

        super(name, number_pages, publication_date, accumulated_pages_read);
        this.alphanumeric_identifier = alphanumeric_identifier;
        this.category = category;
        this.url_magazine_cover = url_magazine_cover;
        this.subscription_price = subscription_price;
        this.frequency_of_issuance = frequency_of_issuance;
        Active_subscriptions = active_subscriptions;
    }

    

}
