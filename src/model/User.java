package model;

public class User {
    
    private String name;
    private String id;
    private String date_affiliation;

    public User(

    String name,
    String id,
    String date_affiliation) {
        
        this.name = name;
        this.id = id;
        this.date_affiliation = date_affiliation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_affiliation() {
        return date_affiliation;
    }

    public void setDate_affiliation(String date_affiliation) {
        this.date_affiliation = date_affiliation;
    }



    
}
