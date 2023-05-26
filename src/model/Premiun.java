package model;
import java.util.*;

public class Premiun extends User{

    private String name;
    private String id;
    private String date_affiliation;

    public Premiun(String name, String id, String date_affiliation, ArrayList<Books> my_Books,
            ArrayList<Magazines> my_Magazines, String name2, String id2, String date_affiliation2) {
        super(name, id, date_affiliation);
        this.name = name2;
        if (id2 != null) {
            this.id = id2;
        } else {
            this.id = ""; 
        }
        date_affiliation = date_affiliation2;
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

    @Override
    public String toString() {
        return "Premiun [name=" + name + ", id=" + id + ", date_affiliation=" + date_affiliation + "]";
    }

    

}
