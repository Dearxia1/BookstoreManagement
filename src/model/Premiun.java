package model;
import java.util.*;

public class Premiun extends User{

    private String name;
    private String id;
    private String date_affiliation;
    private ArrayList<Books> my_Books;
    private ArrayList<Magazines> my_Magazines;
    
    public Premiun(
        
        String name,
        String id,
        String date_affiliation,
        String name2,
        String id2,
        String date_affiliation2
        ) {

        super(name, id, date_affiliation);
        this.name = name2;
        if (id2 != null) {
            this.id = id2;
        } else {
            this.id = ""; // Otra alternativa es asignar un valor por defecto en caso de que id2 sea null
        }
        this.date_affiliation = date_affiliation2;
        this.my_Books = new ArrayList<>();
        this.my_Magazines = new ArrayList<>();
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

    public ArrayList<Books> getMy_Books() {
        return my_Books;
    }

    public void setMy_Books(ArrayList<Books> my_Books) {
        this.my_Books = my_Books;
    }

    public ArrayList<Magazines> getMy_Magazines() {
        return my_Magazines;
    }

    public void setMy_Magazines(ArrayList<Magazines> my_Magazines) {
        this.my_Magazines = my_Magazines;
    }
    

}
