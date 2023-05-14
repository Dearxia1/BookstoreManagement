package model;
import java.util.*;


public class Controller {
    
    ArrayList<Books> books;
    ArrayList<Regular> RegularUser;
    ArrayList<Premiun> PremiunUser;
    ArrayList<Magazines> magazines;

    public Controller() {

        books = new ArrayList<>();
        RegularUser = new ArrayList<>();
        PremiunUser = new ArrayList<>();
        magazines = new ArrayList<>();
    }


    // REGISTER USERS
    public void registerRegular_user(

        String name,
         String id){

        Regular regular_user = new Regular(
            name,
            id,
            null,
            null,
            null,
            null);

        RegularUser.add(regular_user);
        
    }

    public void registerPremiun_user(

        String name,
         String id){

        Premiun premiun_user = new Premiun(
            name,
             id,null,
              null,
               null,
               null);

        PremiunUser.add(premiun_user);
            
        }

        // REGISTER BOOKS
        public void registerBook(

            String name,
             String numberPages,
              String publicationDate,
               int accumulatedPagesRead,
                String hexadecimalIdentifier,
                 String shortReview,
                  Genre genre,
                  String urlBookCover,
                   Double salesValue,
                    int soldCopies) {

            Books book = new Books(

                name,
                numberPages,
                publicationDate,
                accumulatedPagesRead,
                hexadecimalIdentifier,
                shortReview,
                genre,
                urlBookCover,
                salesValue,
                soldCopies);

            books.add(book);
        
        }


        // MANAGMENT OF BOOKS.

        public void edit_book_name(String hexadecimalIdentifier,String name){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setName(name);
        
                }else{
                    System.out.println("No existe un libro con id " + hexadecimalIdentifier);

                }
            }  
        }

        public void edit_book_review(String hexadecimalIdentifier,String review){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setShort_review(review);
        
                }
            }
        }
    


        public void erase_book(String id){

            for(int i = 0; i < books.size(); i++){

                if(books.get(i).getHexadecimal_identifier().equals(id)){

                    books.remove(i);

                }
            }
        }

        public void consult_book(String id){

            for(int i = 0; i < books.size();i++){

                if(books.get(i).getHexadecimal_identifier().equals(id)){

                   System.out.println(books.get(i).toString());

                }
            }
        }

        public void consult_magazine(String id){

            for(int i = 0; i < magazines.size();i++){

                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){

                   System.out.println(magazines.get(i).toString());

                }
            }
        }

        public void consult_UserR(String id) {
            for (int i = 0; i < RegularUser.size(); i++) {
                Regular regularUser = RegularUser.get(i);
                if (regularUser.getId() != null && regularUser.getId().equals(id)) {
                    System.out.println(regularUser.toString());
                }
            }
        }

        public void consult_UserP(String id) {
            for (int i = 0; i < PremiunUser.size(); i++) {
                Premiun premiunUser = PremiunUser.get(i);
                if (premiunUser.getId() != null && premiunUser.getId().equals(id)) {
                    System.out.println(premiunUser.toString());
                }
            }
        }




        //MANAGMENT OF MAGAZINES

        public void registerMagazine(
        String name,
        String number_pages,
        String publication_date,
        int accumulated_pages_read,
        String alphanumeric_identifier,
        Category category,
        String url_magazine_cover,
        double subscription_price,
        String frequency_of_issuance,
        int active_subscriptions){

            Magazines magazine = new Magazines(name, number_pages, publication_date, accumulated_pages_read, alphanumeric_identifier, category, url_magazine_cover, subscription_price, frequency_of_issuance, active_subscriptions);
            magazines.add(magazine);

        }


        public void edit_magazine_name(String id, String name){

            for(int i = 0; i < magazines.size();i++){
    
                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){
    
                    magazines.get(i).setName(name);
        
                }else{
                    System.out.println("No existe una revista con id " + id);

                }
            }

            System.out.println("El nombre se modifico y ahora es: " + name);


        }

        public void edit_magazine_frequencyOfIssuance(String id, String frequency){

            for(int i = 0; i < magazines.size();i++){
    
                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){
    
                    magazines.get(i).setFrequency_of_issuance(frequency);
        
                }
            }

        }


        public void erase_magazine(String id){

            for(int i = 0; i < magazines.size(); i++){

                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){

                    magazines.remove(i);

                }
            }
        }

        public void AutoGenerateObjetcs(){

            Books book = new Books("A Game of Thrones", "694", "01/08/1996", 0, "4AF", "Join adventurers across the seven kingdoms", Genre.FANTASY, "AGOT.png", 19.99, 212018485);
            books.add(book);
            consult_book("4AF");

            Magazines magazine = new Magazines("Vogue", "40", "01/06/2021", 0, "Z1T", Category.VARIETIES, "LMV2021.jpg", 4.99, "1", 122867);
            magazines.add(magazine);
            consult_magazine("Z1T");

            Regular user_regular = new Regular("Daniel Mejia","1107836426", "12/08/2023", "Daniel Mejia", "1107836426", "12/08/2023");
            RegularUser.add(user_regular);
            consult_UserR("1107836426");

            Premiun user_Premiun = new Premiun("Alfonso Ruales", "6246387011", "18/12/2023", "Alfonso Ruales", "6246387011", "18/12/2023");
            PremiunUser.add(user_Premiun);
            consult_UserP("6246387011");
            
        }

        public Regular searchUserPById(String userId) {
            for (Regular user : RegularUser) {
                if (user.getId().equals(userId)) {
                    return user;
                }
            }
            return null; // Si no se encuentra el usuario con el ID dado
        }

        public Regular searchUserRById(String userId) {
            for (Regular user : RegularUser) {
                if (user.getId().equals(userId)) {
                    return user;
                }
            }
            return null; // Si no se encuentra el usuario con el ID dado
        }
    
        public Books searchBookById(String BookId) {
            for (Books book : books) {
                if (book.getHexadecimal_identifier().equals(BookId)) {
                    return book;
                }
            }
            return null; // Si no se encuentra el libro con el ID dado
        }

        public Magazines searchMagazineById(String revistaId) {
            for (Magazines magazine : magazines) {
                if (magazine.getAlphanumeric_identifier().equals(revistaId)) {
                    return magazine;
                }
            }
            return null; // Si no se encuentra la revista con el ID dado
        }
    
        public void Buybook(String userId, String BookId) {
            Regular user = searchUserRById(userId);
            Books book = searchBookById(BookId);
    
            if (user != null && book != null) {
                user.comprarLibro(book);
            }
        }
    
        public void SubscribeMagazine(String userId, String magazineId) {
            Regular user = searchUserRById(userId);
            Magazines book = searchMagazineById(magazineId);
    
            if (user != null && book != null) {
                user.suscribirseRevista(book);
            }
        }

        public void BuybookP(String userId, String BookId) {
            Regular user = searchUserPById(userId);
            Books book = searchBookById(BookId);
    
            if (user != null && book != null) {
                user.comprarLibro(book);
            }
        }
    
        public void SubscribeMagazineP(String userId, String magazineId) {
            Regular user = searchUserPById(userId);
            Magazines magazine = searchMagazineById(magazineId);
    
            if (user != null && magazine != null) {
                user.suscribirseRevista(magazine);
            }
        }
    



}
