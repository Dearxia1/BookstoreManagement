package model;

public class Magazines extends Bibliographic_Products{
    
    private String alphanumeric_identifier;
    private Category category;
    private String url_magazine_cover;
    private double subscription_price;
    private String frequency_of_issuance;
    private int Active_subscriptions;

    public Magazines(
        
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

    public String getAlphanumeric_identifier() {
        return alphanumeric_identifier;
    }

    public void setAlphanumeric_identifier(String alphanumeric_identifier) {
        this.alphanumeric_identifier = alphanumeric_identifier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUrl_magazine_cover() {
        return url_magazine_cover;
    }

    public void setUrl_magazine_cover(String url_magazine_cover) {
        this.url_magazine_cover = url_magazine_cover;
    }

    public double getSubscription_price() {
        return subscription_price;
    }

    public void setSubscription_price(double subscription_price) {
        this.subscription_price = subscription_price;
    }

    public String getFrequency_of_issuance() {
        return frequency_of_issuance;
    }

    public void setFrequency_of_issuance(String frequency_of_issuance) {
        this.frequency_of_issuance = frequency_of_issuance;
    }

    public int getActive_subscriptions() {
        return Active_subscriptions;
    }

    public void setActive_subscriptions(int active_subscriptions) {
        Active_subscriptions = active_subscriptions;
    }

    @Override
    public String toString() {
        return "Magazines [alphanumeric_identifier=" + alphanumeric_identifier + ", category=" + category
                + ", url_magazine_cover=" + url_magazine_cover + ", subscription_price=" + subscription_price
                + ", frequency_of_issuance=" + frequency_of_issuance + ", Active_subscriptions=" + Active_subscriptions
                + "]";
    }

    

}
