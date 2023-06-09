/**
 * The Controller class manages the registration, editing, and deletion of books, magazines, and users,
 * as well as generating reports on reading and sales statistics.
 */
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



/**
 * The function registers a regular user by creating a Regular object with the given name and ID and
 * adding it to a RegularUser list.
 * 
 * @param name The name of the regular user being registered.
 * @param id The id parameter is a unique identifier for the regular user being registered. It could be
 * a string of characters or numbers that distinguishes one user from another.
 */
    public void registerRegular_user(

        String name,
         String id){

        Regular regular_user = new Regular(
            name,
            id,
            null,
            null,
            null,
            null,
            null,
            null);

        RegularUser.add(regular_user);
        
    }

   /**
    * This function registers a new premium user with a given name and ID and adds them to a list of
    * premium users.
    * 
    * @param name The name of the premium user being registered.
    * @param id The ID is a unique identifier for the premium user being registered. It could be a
    * number or a string of characters that distinguishes this user from others in the system.
    */
    public void registerPremiun_user(

        String name,
         String id){

        Premiun premiun_user = new Premiun(
            name,
             id,null,
              null,
               null,
               null,
               null,
               null);

        PremiunUser.add(premiun_user);
            
        }

        // REGISTER BOOKS
  /**
   * The function registers a book by creating a new instance of the Books class with the given
   * parameters and adding it to a list of books.
   * 
   * @param name The name of the book being registered.
   * @param numberPages The number of pages in the book, represented as a String.
   * @param publicationDate A string representing the publication date of the book. It could be in any
   * format, such as "MM/DD/YYYY" or "YYYY-MM-DD".
   * @param accumulatedPagesRead The total number of pages that have been read in the book so far.
   * @param hexadecimalIdentifier A unique identifier for the book represented in hexadecimal format.
   * It is likely used for database or indexing purposes.
   * @param shortReview A brief summary or evaluation of the book.
   * @param genre an enum type representing the genre of the book (e.g. Romance, Mystery, Science
   * Fiction)
   * @param urlBookCover A string representing the URL of the book cover image.
   * @param salesValue The sales value parameter is a Double data type that represents the monetary
   * value of the book's sales. It could be the total revenue generated by the book or the price at
   * which the book is sold per copy.
   * @param soldCopies The parameter "soldCopies" represents the number of copies of the book that have
   * been sold.
   */
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

     /**
      * This Java function edits the name of a book in a list of books based on its hexadecimal
      * identifier.
      * 
      * @param hexadecimalIdentifier The hexadecimal identifier is a unique identifier assigned to a
      * book in the form of a hexadecimal number. It is used to identify a specific book in the list of
      * books.
      * @param name The new name that you want to assign to the book.
      */
        public void edit_book_name(String hexadecimalIdentifier,String name){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setName(name);
        
                }
            }  
        }

     /**
      * This Java function edits the short review of a book object in a list of books based on its
      * hexadecimal identifier.
      * 
      * @param hexadecimalIdentifier A unique identifier for a book in hexadecimal format. It is used
      * to identify the book that needs to be edited.
      * @param review The new review that will replace the existing short review of the book with the
      * specified hexadecimal identifier.
      */
        public void edit_book_review(String hexadecimalIdentifier,String review){

            for(int i = 0; i < books.size();i++){
    
                if(books.get(i).getHexadecimal_identifier().equals(hexadecimalIdentifier)){
    
                    books.get(i).setShort_review(review);
        
                }
            }
        }
    

/**
 * The function erases a book from a list of books based on its hexadecimal identifier.
 * 
 * @param id The parameter "id" is a String that represents the hexadecimal identifier of a book that
 * needs to be erased from a list of books.
 */

        public void erase_book(String id){

            for(int i = 0; i < books.size(); i++){

                if(books.get(i).getHexadecimal_identifier().equals(id)){

                    books.remove(i);

                }
            }
        }
/**
 * The function "consult_book" searches for a book in a list of books by its hexadecimal identifier and
 * prints its information.
 * 
 * @param id The parameter "id" is a String variable that represents the hexadecimal identifier of a
 * book. The method "consult_book" searches for a book in the "books" list that matches the given
 * identifier and prints its information using the "toString" method.
 */

        public void consult_book(String id){

            for(int i = 0; i < books.size();i++){

                if(books.get(i).getHexadecimal_identifier().equals(id)){

                   System.out.println(books.get(i).toString());

                }
            }
        }

  /**
   * This Java function searches for a magazine in a list by its alphanumeric identifier and prints its
   * information.
   * 
   * @param id The alphanumeric identifier of the magazine that needs to be consulted.
   */
        public void consult_magazine(String id){

            for(int i = 0; i < magazines.size();i++){

                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){

                   System.out.println(magazines.get(i).toString());

                }
            }
        }

/**
 * This Java function searches for a regular user by their ID and prints their information.
 * 
 * @param id The parameter "id" is a String variable that represents the unique identifier of a regular
 * user. The method "consult_UserR" takes this parameter as input and searches for a regular user with
 * the matching id in the "RegularUser" list. If a match is found, the method prints out the
 */
        public void consult_UserR(String id) {
            for (int i = 0; i < RegularUser.size(); i++) {
                Regular regularUser = RegularUser.get(i);
                if (regularUser.getId() != null && regularUser.getId().equals(id)) {
                    System.out.println(regularUser.toString());
                }
            }
        }

     /**
      * This Java function searches for a Premium User object in a list by ID and prints its
      * information.
      * 
      * @param id The parameter "id" is a String variable that represents the unique identifier of a
      * Premium user. The method "consult_UserP" takes this parameter as input and searches for a
      * Premium user with the matching ID in the "PremiunUser" ArrayList. If a match is found, the
      * method prints
      */
        public void consult_UserP(String id) {
            for (int i = 0; i < PremiunUser.size(); i++) {
                Premiun premiunUser = PremiunUser.get(i);
                if (premiunUser.getId() != null && premiunUser.getId().equals(id)) {
                    System.out.println(premiunUser.toString());
                }
            }
        }

      /**
       * This Java function searches for a regular user's name based on their ID.
       * 
       * @param id The ID of the regular user whose name is being consulted.
       * @return The method is returning a String that represents the name of a RegularUser object that
       * matches the given id parameter. If there is no match, an empty String will be returned.
       */
        public String consult_namerR(String id) {

            String msg = "";

            for (int i = 0; i < RegularUser.size(); i++) {
                Regular regularUser = RegularUser.get(i);
                if (regularUser.getId() != null && regularUser.getId().equals(id)) {
                    msg += (regularUser.getName());
                }
            }

            return msg;
        }

    /**
     * This Java function takes an ID as input and returns the name of a book associated with a regular
     * user with that ID.
     * 
     * @param id The parameter "id" is a String variable that represents the ID of a regular user.
     * @return The method `consult_namepageR` returns a `String` that represents the name of a book
     * associated with a regular user with the given `id`.
     */
        public String consult_namepageR(String id) {

            String msg = "";

            for (int i = 0; i < RegularUser.size(); i++) {
                Regular regularUser = RegularUser.get(i);
                if (regularUser.getId() != null && regularUser.getId().equals(id)) {
                    msg += (regularUser.getMy_Books().get(i).getName());
                }
            }

            return msg;
        }
/**
 * This Java function retrieves the number of pages of a book belonging to a regular user with a given
 * ID.
 * 
 * @param id The ID of the regular user whose book's number of pages needs to be consulted.
 * @return The method `consult_numpageR` returns a `String` that represents the number of pages of a
 * book associated with a regular user with the given `id`.
 */

        public String consult_numpageR(String id) {

            String msg = "";

            for (int i = 0; i < RegularUser.size(); i++) {
                Regular regularUser = RegularUser.get(i);
                if (regularUser.getId() != null && regularUser.getId().equals(id)) {
                    msg += (regularUser.getMy_Books().get(i).getNumber_pages());
                }
            }

            return msg;
        }





        //MANAGMENT OF MAGAZINES

    /**
     * This function registers a new magazine by creating a Magazine object and adding it to a list of
     * magazines.
     * 
     * @param name The name of the magazine being registered.
     * @param number_pages A string representing the number of pages in the magazine.
     * @param publication_date A string representing the date of publication of the magazine in the
     * format "YYYY-MM-DD".
     * @param accumulated_pages_read The number of pages that have been read by all readers combined
     * for this magazine.
     * @param alphanumeric_identifier A unique identifier for the magazine that consists of both
     * letters and numbers.
     * @param category Category is an enum type that represents the category of the magazine. It could
     * be one of the following values: FASHION, SPORTS, TECHNOLOGY, NEWS, ENTERTAINMENT, LIFESTYLE,
     * TRAVEL, FOOD, or OTHER.
     * @param url_magazine_cover A string representing the URL of the magazine cover image.
     * @param subscription_price The subscription price is the amount of money that a person has to pay
     * to receive a magazine regularly for a certain period of time. It is a double data type, which
     * means it can store decimal values.
     * @param frequency_of_issuance The frequency of issuance refers to how often the magazine is
     * published or released, such as weekly, monthly, or quarterly. It is a string parameter that
     * specifies the frequency of the magazine's publication.
     * @param active_subscriptions The number of current active subscriptions for the magazine.
     */
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


     /**
      * This function edits the name of a magazine object in a list based on its alphanumeric
      * identifier.
      * 
      * @param id A string representing the alphanumeric identifier of the magazine to be edited.
      * @param name The new name that will replace the current name of the magazine.
      */
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

     /**
      * This Java function edits the frequency of issuance of a magazine object in a list based on its
      * alphanumeric identifier.
      * 
      * @param id A string representing the alphanumeric identifier of the magazine that needs to be
      * edited.
      * @param frequency The frequency of issuance is a string parameter that represents how often a
      * magazine is published or released, such as weekly, monthly, quarterly, etc.
      */
        public void edit_magazine_frequencyOfIssuance(String id, String frequency){

            for(int i = 0; i < magazines.size();i++){
    
                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){
    
                    magazines.get(i).setFrequency_of_issuance(frequency);
        
                }
            }

        }

/**
 * This Java function removes a magazine from a list of magazines based on its alphanumeric identifier.
 * 
 * @param id The alphanumeric identifier of the magazine that needs to be erased from the list of
 * magazines.
 */

        public void erase_magazine(String id){

            for(int i = 0; i < magazines.size(); i++){

                if(magazines.get(i).getAlphanumeric_identifier().equals(id)){

                    magazines.remove(i);

                }
            }
        }

    /**
     * The function AutoGenerateObjects creates and adds sample objects to the books, magazines,
     * RegularUser, and PremiunUser lists and then calls consult functions to retrieve information
     * about the added objects.
     */
        public void AutoGenerateObjetcs(){

            Books book = new Books("A Game of Thrones", "694", "01/08/1996", 0, "4AF", "Join adventurers across the seven kingdoms", Genre.FANTASY, "AGOT.png", 19.99, 212018485);
            books.add(book);
            consult_book("4AF");

            Magazines magazine = new Magazines("Vogue", "40", "01/06/2021", 0, "Z1T", Category.VARIETIES, "LMV2021.jpg", 4.99, "1", 122867);
            magazines.add(magazine);
            consult_magazine("Z1T");

            Regular user_regular = new Regular("Daniel Mejia","1107836426", "12/08/2023", null, null, "Daniel Mejia","1107836426","1107836426");
            RegularUser.add(user_regular);
            consult_UserR("1107836426");

            Premiun user_Premiun = new Premiun("Alfonso Ruales", "6246387011", "18/12/2023", null, null, "Alfonso Ruales","6246387011","18/12/2023");
            PremiunUser.add(user_Premiun);
            consult_UserP("6246387011");
            
        }

     /**
      * This Java function searches for a Premium user in a list by their ID and returns the user
      * object if found, otherwise it returns null.
      * 
      * @param userId A String representing the ID of the user being searched for in a collection of
      * Premium users.
      * @return The method `searchUserPById` returns a `Premiun` object that matches the given
      * `userId`. If no matching user is found, it returns `null`.
      */
        public Premiun searchUserPById(String userId) {
            for (Premiun user : PremiunUser) {
                if (user.getId().equalsIgnoreCase(userId)) {
                    return user;
                }
            }
            return null; // Si no se encuentra el usuario con el ID dado
        }

     /**
      * This Java function searches for a regular user by their ID and returns the user object if
      * found, otherwise it returns null.
      * 
      * @param userId The parameter "userId" is a String that represents the ID of the user being
      * searched for in the "RegularUser" list. The method iterates through the list and returns the
      * user object that matches the given ID, or null if no user is found with that ID.
      * @return The method `searchUserRById` returns a `Regular` object that matches the given
      * `userId`. If no matching user is found, it returns `null`.
      */
        public Regular searchUserRById(String userId) {
            for (Regular user : RegularUser) {
                if (user.getId().equalsIgnoreCase(userId)) {
                    return user;
                }
            }
            return null; // Si no se encuentra el usuario con el ID dado
        }
    
/**
 * The function searches for a book in a list of books by its hexadecimal identifier and returns the
 * book if found, otherwise returns null.
 * 
 * @param BookId The BookId parameter is a String that represents the unique hexadecimal identifier of
 * a book. The method searches for a book in a collection of books by comparing the BookId parameter
 * with the hexadecimal identifier of each book in the collection. If a match is found, the method
 * returns the book object. If no
 * @return The method is returning an object of type `Books` which represents a book that matches the
 * given `BookId`. If no book is found with the given `BookId`, the method returns `null`.
 */
        public Books searchBookById(String BookId) {
            for (Books book : books) {
                if (book.getHexadecimal_identifier().equalsIgnoreCase(BookId)) {
                    return book;
                }
            }
            return null; 
        }

      /**
       * This Java function searches for a magazine object in a list of magazines by its alphanumeric
       * identifier and returns it, or returns null if not found.
       * 
       * @param revistaId revistaId is a String variable that represents the alphanumeric identifier of
       * a magazine that we want to search for in a list of magazines.
       * @return The method `searchMagazineById` returns an object of type `Magazines` if a magazine
       * with the specified alphanumeric identifier is found in the `magazines` list. If no such
       * magazine is found, it returns `null`.
       */
        public Magazines searchMagazineById(String revistaId) {
            for (Magazines magazine : magazines) {
                if (magazine.getAlphanumeric_identifier().equalsIgnoreCase(revistaId)) {
                    return magazine;
                }
            }
            return null; 
        }
        /**
         * The function allows a user to buy a book by searching for the user and book by their
         * respective IDs and returning true if successful.
         * 
         * @param userId The ID of the user who wants to buy the book.
         * @param BookId The unique identifier of the book being purchased.
         * @return The method is returning a boolean value. If the user and book are not null, the user
         * buys the book and the method returns true. Otherwise, it returns false.
         */
        public boolean Buybook(String userId, String BookId) {
            Regular user = searchUserRById(userId);
            Books book = searchBookById(BookId);
        
            if (user != null && book != null) {
                user.comprarLibro(book);
                return true; 
            }
            return false; 
        }
        
    
    /**
     * This function subscribes a regular user to a magazine if both the user and magazine exist.
     * 
     * @param userId A string representing the ID of the user who wants to subscribe to a magazine.
     * @param magazineId The ID of the magazine that the user wants to subscribe to.
     * @return The method returns a boolean value, either true or false. True is returned if the user
     * and magazine exist and the user is successfully subscribed to the magazine, and false is
     * returned if either the user or magazine does not exist.
     */
        public boolean SubscribeMagazine(String userId, String magazineId) {
            Regular user = searchUserRById(userId);
            Magazines book = searchMagazineById(magazineId);
    
            if (user != null && book != null) {
                user.suscribirseRevista(book);
                return true;
            }
            return false; 
        }
/**
 * The function allows a premium user to buy a book by checking if the user and book exist and then
 * calling the "comprarLibro" method.
 * 
 * @param userId A string representing the unique identifier of a premium user who wants to buy a book.
 * @param BookId The unique identifier of the book that the user wants to buy.
 * @return The method is returning a boolean value. It returns true if the user and book are not null
 * and the user is able to buy the book, and false otherwise.
 */

        public boolean BuybookP(String userId, String BookId) {
            Premiun user = searchUserPById(userId);
            Books book = searchBookById(BookId);
    
            if (user != null && book != null) {
                user.comprarLibro(book);
                return true;
            }
            return false; 
        }
    
     /**
      * This Java function subscribes a premium user to a magazine if both the user and magazine exist.
      * 
      * @param userId A string representing the unique identifier of a user who wants to subscribe to a
      * magazine.
      * @param magazineId A string representing the unique identifier of a magazine.
      * @return The method returns a boolean value, either true or false.
      */
        public boolean SubscribeMagazineP(String userId, String magazineId) {
            Premiun user = searchUserPById(userId);
            Magazines magazine = searchMagazineById(magazineId);
    
            if (user != null && magazine != null) {
                user.suscribirseRevista(magazine);
                return true;
            }
            return false;
        }
    
      /**
       * The function displays a 6x6 matrix with numbered rows and columns and placeholders for values,
       * and calls another function to modify the matrix based on user input.
       * 
       * @param id The id parameter is a String that represents an identifier for the matrix being
       * displayed.
       * @param code It is an integer parameter used in the method to modify the matrix based on the
       * code value. However, the code value is not defined in this method and it is not clear what it
       * represents.
       */
        public void showMatriz(String id, int code) {


            String[][] matriz = new String[6][6];

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (i == 0 && j == 0) {
                        matriz[i][j] = "       ";
                    } else if (i == 0) {
                        matriz[i][j] = "   " + j + "   ";
                    } else if (j == 0) {
                        matriz[i][j] = "   " + i + "   ";
                    } else {
                        matriz[i][j] = "| ___ |";
                    }
                }
            }
    
            for (int i = 0; i < 6; i++) {
                System.out.println();
                for (int j = 0; j < 6; j++) {
                    System.out.print(matriz[i][j] + " ");
                    modifyMatriz(id, matriz,code);
                }
            }
    
            System.out.println("\n");
        
        }
/**
 * The function modifies a given matrix by replacing a specific element with a hexadecimal identifier
 * obtained from a user's book.
 * 
 * @param id A string representing the ID of a user.
 * @param matriz A two-dimensional array of strings representing a matrix.
 * @param code The parameter "code" is an integer variable that is not used in the method. It is not
 * relevant to the functionality of the method.
 */

        public void modifyMatriz(String id,String[][] matriz, int code){

           String idd =  searchUserRById(id).getMy_Books().get(0).getHexadecimal_identifier();

            matriz[1][1] =  "| " + idd + " |";
        }

    /**
     * The function "generarInformes" generates multiple reports related to book and magazine sales and
     * subscriptions.
     */
        public void generarInformes() {
            generarInformeAcumuladoTotal();
            generarInformeGeneroCategoriaMasLeidos();
            generarInformeTop5();
            generarInformeVentasLibros();
            generarInformeSuscripcionesRevistas();
        }
    
/**
 * This function generates a report of the total accumulated pages read in books and magazines.
 */

        private void generarInformeAcumuladoTotal() {
            int totalPaginasLibros = 0;
            int totalPaginasRevistas = 0;
    
            for (Books book : books) {
                totalPaginasLibros += book.getAccumulated_pages_read();
            }
    
            for (Magazines magazine : magazines) {
                totalPaginasRevistas += magazine.getAccumulated_pages_read();
            }
    
            System.out.println("Total de páginas leídas en libros: " + totalPaginasLibros);
            System.out.println("Total de páginas leídas en revistas: " + totalPaginasRevistas);
        }
    
    /**
     * The function generates a report on the most read genre of books and category of magazines based
     * on the accumulated pages read.
     */
        private void generarInformeGeneroCategoriaMasLeidos() {
            int maxPaginasLibro = 0;
            Genre generoMasLeido = null;
    
            for (Books book : books) {
                if (book.getAccumulated_pages_read() > maxPaginasLibro) {
                    maxPaginasLibro = book.getAccumulated_pages_read();
                    generoMasLeido = book.getGenre();
                }
            }
    
            double maxPaginasRevista = 0;
            Category categoriaMasLeida = null;
    
            for (Magazines magazine : magazines) {
                if (magazine.getAccumulated_pages_read() > maxPaginasRevista) {
                    maxPaginasRevista = magazine.getAccumulated_pages_read();
                    categoriaMasLeida = magazine.getCategory();
                }
            }
    
            System.out.println("Género de libro más leído: " + generoMasLeido + " con " + maxPaginasLibro + " páginas leídas.");
            System.out.println("Categoría de revista más leída: " + categoriaMasLeida + " con " + maxPaginasRevista + " páginas leídas.");
        }
   /**
    * The function generates a report of the top 5 most read books and magazines, sorted by accumulated
    * pages read.
    */
    
        private void generarInformeTop5() {
            List<Books> topLibros = new ArrayList<>(books);
            topLibros.sort(Comparator.comparingInt(Books::getAccumulated_pages_read).reversed());
            topLibros = topLibros.subList(0, Math.min(5, topLibros.size()));
    
            List<Magazines> topRevistas = new ArrayList<>(magazines);
            topRevistas.sort(Comparator.comparingInt(Magazines::getAccumulated_pages_read).reversed());
            topRevistas = topRevistas.subList(0, Math.min(5, topRevistas.size()));
    
            System.out.println("Top 5 de libros más leídos:");
            for (Books book : topLibros) {
                System.out.println("Libro: " + book.getName() + ", Género: " + book.getGenre() + ", Páginas leídas: " + book.getAccumulated_pages_read());
            }
    
            System.out.println("Top 5 de revistas más leídas:");
            for (Magazines magazine : topRevistas) {
                System.out.println("Revista: " + magazine.getName() + ", Categoría: " + magazine.getCategory() + ", Páginas leídas: " + magazine.getAccumulated_pages_read());
            }
        }
    
       /**
        * This Java function generates a sales report for a list of books, displaying their name,
        * genre, number of copies sold, and total sales value.
        */
        private void generarInformeVentasLibros() {
            for (Books book : books) {
                System.out.println("Libro: " + book.getName() + ", Género: " + book.getGenre() + ", Ventas: " + book.getSold_copies() + ", Valor total: " + book.getSales_value());
            }
        }
    
/**
 * This function generates a report of active subscriptions and total payments for each magazine in a
 * list.
 */
        private void generarInformeSuscripcionesRevistas() {
            for (Magazines magazine : magazines) {
                System.out.println("Revista: " + magazine.getName() + ", Categoría: " + magazine.getCategory() + ", Suscripciones activas: " + magazine.getActive_subscriptions() + ", Valor total pagado: " + magazine.getSubscription_price());
            }
        }
}
