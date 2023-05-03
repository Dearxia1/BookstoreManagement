package model;

public class Premiun extends User{

    private String name;
    private String id;
    private String date_affiliation;
    
    public Premiun(
        
        String name,
        String id,
        String date_affiliation,
        String name2,
        String id2,
        String date_affiliation2) {

        super(name, id, date_affiliation);
        name = name2;
        id = id2;
        date_affiliation = date_affiliation2;
    }
    

}
