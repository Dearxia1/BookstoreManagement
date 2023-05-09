package model;

public class Bibliographic_Products{

    private String name;
    private String number_pages;
    private String publication_date;
    private int accumulated_pages_read;

    public Bibliographic_Products(
        
        String name, 
        String number_pages,
        String publication_date,
        int accumulated_pages_read) {

        this.name = name;
        this.number_pages = number_pages;
        this.publication_date = publication_date;
        this.accumulated_pages_read = accumulated_pages_read;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(String number_pages) {
        this.number_pages = number_pages;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public int getAccumulated_pages_read() {
        return accumulated_pages_read;
    }

    public void setAccumulated_pages_read(int accumulated_pages_read) {
        this.accumulated_pages_read = accumulated_pages_read;
    }





    
}