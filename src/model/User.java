package model;
import java.util.ArrayList;

public class User {
    
    private String name;
    private String id;
    private String date_affiliation;
    private ArrayList<Books> my_Books;
    private ArrayList<Magazines> my_Magazines;




    public User(String name, String id, String date_affiliation) {
        this.name = name;
        this.id = id;
        this.date_affiliation = date_affiliation;
        my_Books = new ArrayList<>();
        my_Magazines = new ArrayList<>();

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

    public void comprarLibro(Books libro) {
        my_Books.add(libro);
    }

    public void suscribirseRevista(Magazines revista) {
        my_Magazines.add(revista);
    }


    
}
