package model;
import java.util.*;


public class Controller {
    
    ArrayList<Books> books;
    ArrayList<Regular> RegularUser;
    ArrayList<Premiun> PremiunUser;

    public Controller() {

        books = new ArrayList<>();
        RegularUser = new ArrayList<>();
        PremiunUser = new ArrayList<>();
    }


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


        public void edit_book_name(String hexadecimalIdentifier,String name){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setName(name);
        
                } 
            }

            System.out.println("El nombre se modifico y ahora es: " + name);
        }


        public void edit_book_review(String hexadecimalIdentifier,String review){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setShort_review(review);
        
                } 
            }
        }




}
