package ui;

import model.Controller;
import java.util.Scanner;


public class Executable {
    
    private Scanner reader;
    private Controller controller;

    public Executable() {
        reader = new Scanner(System.in);
        controller = new Controller();
    }

    public static void main(String[] args) {
        Executable exe = new Executable();
        exe.menu();
    }
    
  /**
   * This function displays a menu with various options and performs corresponding actions based on the
   * user's input.
   */
    public void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("====================================================================================================");
            System.out.println("|                                         MENÚ PRINCIPAL                                           |");
            System.out.println("====================================================================================================");
            System.out.println("| Opciones:                                                                                        |");
            System.out.println("|                                                                                                  |");
            System.out.println(String.format("| %-5s %-90s |", "1.", "Registrar usuarios, regulares y premium"));
            System.out.println(String.format("| %-5s %-90s |", "2.", "Gestionar productos bibliográficos: registrar, modificar y borrar libros y revistas."));
            System.out.println(String.format("| %-5s %-90s |", "3.", "Generar objetos automaticamente."));
            System.out.println(String.format("| %-5s %-90s |", "4.", "Permitir a un usuario comprar un libro o suscribirse a una revista."));
            System.out.println(String.format("| %-5s %-90s |", "5.", "Mostrar biblioteca" ));
            System.out.println(String.format("| %-5s %-90s |", "6.", "Sesion de lectura" ));
            System.out.println(String.format("| %-5s %-90s |", "7.", "informes" ));
            System.out.println("|                                                                                                  |");
            System.out.println("====================================================================================================");
            System.out.print("Digite su opcion: ");
            
            int option = reader.nextInt();
            reader.nextLine();
            System.out.print("\n\n\n");
            switch (option) {
                case 1:
                    System.out.println("+----------------------------------------+");
                    System.out.println("|          REGISTRAR USUARIOS            |");
                    System.out.println("+----------------------------------------+");
                    System.out.println("| Elija el tipo de usuario que desea ser:|");
                    System.out.println("| 1. Regular                             |");
                    System.out.println("| 2. Premium                             |");
                    System.out.println("| 3. Salir                               |");
                    System.out.println("+----------------------------------------+");
                    System.out.print("Ingrese una opción: ");
            
                    int option20 = reader.nextInt();
                    reader.nextLine();
                    System.out.print("\n\n");
            
                    switch(option20){
                        case 1:
                            registerRegular_user();
                            System.out.println("\n Usuario registrado con exito...\n\n");
                            break;
            
                        case 2:
                            registerPremiun_user();
                            System.out.println("\n Usuario registrado con exito...\n\n");
                            break;
            
                        case 3:
                            System.out.println("Volviendo al menú principal...\n\n");
                            break;
            
                        default:
                            System.out.println("Opción inválida.\n\n");
                            break;
                    }
                    break;
                case 2:
                    int option2 = 0;
                    do {
                        System.out.println("====================================");
                        System.out.println("|      Gestión de productos        |");
                        System.out.println("|          bibliográficos          |");
                        System.out.println("====================================");
                        System.out.println("|                                  |");
                        System.out.println("|  1. Gestionar libros             |");
                        System.out.println("|  2. Gestionar revistas           |");
                        System.out.println("|  3. Salir                        |");
                        System.out.println("|                                  |");
                        System.out.println("====================================");
                        System.out.print("Ingrese una opción: ");
                        option2 = reader.nextInt();
                        reader.nextLine(); 
                        System.out.print("\n\n\n");
                        int option3 = 0;
                        int option4 = 0;
                        switch(option2){
                            case 1:
                                System.out.println("===============================");
                                System.out.println("|        Gestión de libros    |");
                                System.out.println("===============================");
                                System.out.println("|                             |");
                                System.out.println("|  1. Registrar libro         |");
                                System.out.println("|  2. Modificar libro         |");
                                System.out.println("|  3. Borrar libro            |");
                                System.out.println("|  4. Volver                  |");
                                System.out.println("|                             |");
                                System.out.println("===============================");
                                System.out.print("Ingrese una opción: ");
                                option3 = reader.nextInt();
                                reader.nextLine();
                                System.out.print("\n\n\n");
                    
                                switch(option3){
                                    case 1:
                                        registerBook();
                                        break;
                                    case 2:
                                        System.out.println("  1. Modificar nombre del libro ");
                                        System.out.println("  2. Modificar reseña del libro  ");
                                        System.out.print("\n Ingrese una opción: ");
                                        int option6 = reader.nextInt();
                                        switch(option6) {
                                            case 1:
                                                edit_book_name();
                                                System.out.println("Nombre modificado exitosamente....");
                                                break;
                                            case 2:
                                                edit_book_review();
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Intente nuevamente.");
                                                 break;
                                        }
                                        break;
                                    case 3:
                                          erase_book();

                                        break;
                                    case 4:
                                        System.out.println("Volviendo al menú principal...");
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Intente nuevamente.");
                                        break;
                                }
                    
                                break;
                                    
                            case 2:
                                System.out.println("===============================");
                                System.out.println("|       Gestión de revistas   |");
                                System.out.println("===============================");
                                System.out.println("|                             |");
                                System.out.println("|  1. Registrar revista       |");
                                System.out.println("|  2. Modificar revista       |");
                                System.out.println("|  3. Borrar revista          |");
                                System.out.println("|  4. Volver                  |");
                                System.out.println("|                             |");
                                System.out.println("===============================");
                                System.out.print("Ingrese una opción: ");
                                option4 = reader.nextInt();
                                reader.nextLine(); 
                                System.out.print("\n\n\n");
                                
                                switch(option4){
                                    case 1:
                                    registerMagazine();
                                        break;
                                    case 2:
                                    System.out.println("  1. Modificar nombre de la revista ");
                                    System.out.println("  2. Modificar frecuencia de actualización   ");
                                    System.out.print("\n Ingrese una opción: ");
                                    int option7 = reader.nextInt();
                                    switch(option7) {
                                        case 1:
                                            edit_magazine_name();
                                            System.out.println("Nombre modificado exitosamente....");
                                            break;
                                        case 2:
                                            edit_magazine_frequencyOfIssuance();
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Intente nuevamente.");
                                             break;
                                    }
                                        break;
                                    case 3:
                                            erase_magazine();
                                        break;
                                    case 4:
                                        System.out.println("Volviendo al menú principal...");
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Intente nuevamente.");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("¡Hasta luego!");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                                break;
                        }
                    } while(option2 != 3);
                    break;
                case 3:
                 AutoGenerateObjetcs();
                    break;

                case 4:
                SaveBooksOrMagazines();
                    break;

                case 5:
                showMatriz();
                    break;

                case 6: 
                    lecture();
                break;

                case 7: 
                generarInformes();
                 break;
                    

                case 8: 
                exit = true;
                default:
                    System.out.println("Opción inválida");
                 
            }
        }
    
        System.out.println("Vuelve pronto!");
    }


  /**
   * This function registers a regular user by taking their name and ID as input and passing it to the
   * controller.
   */
    public void registerRegular_user(){

        System.out.print("  Digite su numero de cedula: ");
        String id = reader.nextLine();
        System.out.print("  Digite su nombre completo ");
        String name = reader.nextLine();

        controller.registerRegular_user(name, id);

    }
/**
 * This function prompts the user to input their ID and name, and then registers them as a premium user
 * using a controller.
 */

    public void registerPremiun_user(){

        System.out.print("  Digite su numero de cedula: ");
        String id = reader.nextLine();
        System.out.print("  Digite su nombre completo ");
        String name = reader.nextLine();

        controller.registerPremiun_user(name, id);

    }
/**
 * This function registers a book by collecting information from the user and passing it to a
 * controller to be stored.
 */

    public void registerBook(){

        System.out.print("Identificador: ");
        String id = reader.nextLine();
        
        System.out.print("Nombre del libro: ");
        String name = reader.nextLine();
        
        System.out.print("Número de páginas: ");
        int numPages = reader.nextInt();
        reader.nextLine(); 
        
        System.out.print("Reseña corta: ");
        String review = reader.nextLine();
        
        System.out.print("Fecha de publicación (dd/mm/yyyy): ");
        String publicationDate = reader.nextLine();
        
        System.out.print("Género: ");
        String genre = reader.nextLine();
        
        System.out.print("URL de la portada: ");
        String url = reader.nextLine();
        
        System.out.print("Valor de venta (en USD): ");
        double saleValue = reader.nextDouble();
        reader.nextLine(); 
        
      
        System.out.println("Libro registrado con exito....");

        controller.registerBook(name, Integer.toString(numPages), publicationDate, 0, id, review, null, url, saleValue, 0);


    }

/**
 * This function prompts the user to enter the ID of a book and a new name for it, and then calls a
 * controller method to edit the book's name.
 */

    public void edit_book_name(){
        
        System.out.print("\n");
        reader.nextLine();
        System.out.print("Digite el identificar del libro a modificar el nombre:");
        String id = reader.nextLine();
        System.out.print("Cual es el nuevo nombre?: ");
        String name = reader.nextLine();

        controller.edit_book_name(id, name);

    }

/**
 * This Java function prompts the user to enter the identifier of a book they want to delete, confirms
 * the deletion with the user, and then calls a controller function to delete the book.
 */
    public void erase_book(){
    
    System.out.print("Cual es el identificador del libro que quieres eliminar: ");
    String id = reader.nextLine();
    System.out.println("Estas seguro que quieres eliminar " + id + "\n1.Si\n2.No");
    int option = reader.nextInt();   

        switch(option){
            
            case 1:
            controller.erase_book(id);
            System.out.println("Libro eliminado exitosamente...");
            break;

            case 2:
            break;

            default:
            System.out.println("Opcion invalida....");
            break;


        }
    }

    /**
     * This Java function prompts the user to input a book identifier and a new review, and then calls
     * a controller function to edit the book review.
     */
    public void edit_book_review(){

        System.out.print("\n");
        reader.nextLine();
        System.out.print("Cual es el identificador del libro a modificar la reseña:");
        String id = reader.nextLine();
        System.out.println("Cual es la nueva reseña?: ");
        String review = reader.nextLine();

        controller.edit_book_review(id, review);

    }

    // ONLY FOR DEBUGGIN
   /**
    * This Java function prompts the user to input the ID of a book to be consulted and then calls a
    * controller method to perform the consultation.
    */
    public void consult_book(){

        System.out.println("Cual es el id del libro a consultar");
        String id = reader.nextLine();
        controller.consult_book(id);

    }

        // ONLY FOR DEBUGGIN
/**
 * This Java function prompts the user to input an ID and then calls a controller function to consult a
 * user with that ID.
 */
        public void consult_userR(){

            System.out.println("Cual es el id del usuario a consultar");
            String id = reader.nextLine();
            controller.consult_UserR(id);
    
        }

            // ONLY FOR DEBUGGIN
         /**
          * This Java function prompts the user to input an ID and then calls a controller function to
          * consult a user with that ID.
          */
            public void consult_userP(){

                System.out.println("Cual es el id del usuario a consultar");
                String id = reader.nextLine();
                controller.consult_UserP(id);
        
            }




    
    /**
     * This function registers a magazine by taking input from the user and passing it to a controller
     * method.
     */
    public void registerMagazine(){

        System.out.print("Nombre de la revista: ");
        String name = reader.nextLine();
        
        System.out.print("Número de páginas: ");
        int numPages = reader.nextInt();
        reader.nextLine(); 

        System.out.print("Fecha de publicación (dd/mm/yyyy): ");
        String publicationDate = reader.nextLine();

        System.out.print("Identificador: ");
        String id = reader.nextLine();
        
        System.out.print("Categoria");
        String review = reader.nextLine();

        System.out.print("URL de la portada: ");
        String url = reader.nextLine();
        
        System.out.print("Precio subscripcion (en USD): ");
        double saleValue = reader.nextDouble();
        reader.nextLine(); 

        System.out.print("Frecuencia actualizacion (en Meses): ");
        String frequency_of_issuance = reader.nextLine();
        reader.nextLine(); 
        
        System.out.println("Revista registrada con exito....");

        controller.registerMagazine(name,Integer.toString(numPages),publicationDate,0,id,null,url,saleValue,frequency_of_issuance,0);

    

    }


   /**
    * This Java function prompts the user to enter the identifier of a magazine and a new name, and
    * then calls a controller function to edit the magazine's name.
    */
    public void edit_magazine_name(){
        
        System.out.print("\n");
        reader.nextLine();
        System.out.print("Digite el identificar de la revista a modificar el nombre:");
        String id = reader.nextLine();
        System.out.print("Cual es el nuevo nombre?: ");
        String name = reader.nextLine();

        controller.edit_book_name(id, name);

    }

   /**
    * This Java function prompts the user to input the ID of a magazine and a new frequency of
    * issuance, and then calls a controller function to edit the magazine's name with the given ID and
    * frequency.
    */
    public void edit_magazine_frequencyOfIssuance(){
        
        System.out.print("\n");
        reader.nextLine();
        System.out.print("Digite el identificar de la revista a modificar la frecuencia de actualizacion:");
        String id = reader.nextLine();
        System.out.print("Cual es la nueva programación (en Meses): ");
        String frequency = reader.nextLine();

        controller.edit_book_name(id, frequency);

    }

  /**
   * This Java function prompts the user to enter the identifier of a magazine they want to delete,
   * confirms the deletion with the user, and then calls a controller function to delete the magazine.
   */
    public void erase_magazine(){

        System.out.print("Cual es el identificador de la revista que quieres eliminar: ");
        String id = reader.nextLine();
        System.out.println("Estas seguro que quieres eliminar " + id + "\n1.Si\n2.No");
        int option = reader.nextInt();   
    
            switch(option){
                
                case 1:
                controller.erase_magazine(id);
                System.out.println("revista eliminado exitosamente...");
                break;
    
                case 2:
                break;
    
                default:
                System.out.println("Opcion invalida....");
                break;
    
    
            }

    }


      /**
       * This function calls a method to automatically generate objects and prints a success message.
       */
        public void AutoGenerateObjetcs(){

            
            controller.AutoGenerateObjetcs();
            System.out.println("Objetos generados exitosamente....");

        }


   
      /**
       * This function prompts the user for their ID and subscription status, and allows them to buy
       * books or subscribe to magazines based on their status.
       */
        public void SaveBooksOrMagazines(){

            System.out.print("Ingrese su ID de usuario: ");
            String usuarioId = reader.nextLine();
            
            System.out.println("Es usted \n1. Premium\n2. Regular");
            int option2 = reader.nextInt();
            switch (option2) {
                case 1:
                    System.out.println("Desea comprar o suscribirse a \n1. libro\n2. revista\n3. salir ");
                    int option = reader.nextInt();
                    switch (option) {
                        case 1:
                            reader.nextLine();
                            System.out.print("Ingrese el ID del libro que desea comprar: ");
                            String libroId = reader.nextLine();
                            boolean compraExitosa = controller.BuybookP(usuarioId, libroId);
                            if (compraExitosa) {
                                System.out.println("La compra del libro se ha registrado correctamente.");
                            } else {
                                System.out.println("No se pudo realizar la compra del libro.");
                            }
                            break;
        
                        case 2:
                            System.out.print("Ingrese el ID de la revista a la que desea suscribirse: ");
                            String revistaId = reader.nextLine();
                            boolean suscripcionExitosa = controller.SubscribeMagazineP(usuarioId, revistaId);
                            if (suscripcionExitosa) {
                                System.out.println("La suscripción a la revista se ha registrado correctamente.");
                            } else {
                                System.out.println("No se pudo realizar la suscripción a la revista.");
                            }
                            break;
        
                        case 3:
                            break;
        
                        default:
                            System.out.println("Opción inválida....");
                            break;
                    }
                    break;
        
                case 2:
                    System.out.println("Desea comprar o suscribirse a \n1. libro\n2. revista\n3. salir ");
                    int option5 = reader.nextInt();
                    switch (option5) {
                        case 1:
                            reader.nextLine();
                            System.out.print("Ingrese el ID del libro que desea comprar: ");
                            String bookId = reader.nextLine();
                            boolean compraExitosa = controller.Buybook(usuarioId, bookId);
                            if (compraExitosa) {
                                System.out.println("La compra del libro se ha registrado correctamente.");
                            } else {
                                System.out.println("No se pudo realizar la compra del libro.");
                            }
                            break;
        
                        case 2:
                            reader.nextLine();
                            System.out.print("Ingrese el ID de la revista a la que desea suscribirse: ");
                            String magazineId = reader.nextLine();
                            boolean suscripcionExitosa = controller.SubscribeMagazine(usuarioId, magazineId);
                            if (suscripcionExitosa) {
                                System.out.println("La suscripción a la revista se ha registrado correctamente.");
                            } else {
                                System.out.println("No se pudo realizar la suscripción a la revista.");
                            }
                            break;
        
                        case 3:
                            break;
        
                        default:
                            System.out.println("Opción inválida....");
                            break;
                    }
                    break;
    

                default:
                    System.out.println("Opción inválida....");
                    break;
            }
        }

      /**
       * This function displays a matrix of bibliographic products and prompts the user to select a
       * product for reading, based on their user ID and account type.
       */
        public void showMatriz(){
           
            int countR = 0;
            int countP = 0;
            System.out.print("Ingrese su ID de usuario: ");
            String usuarioId = reader.nextLine();
            
            System.out.println("Es usted \n1. Premium\n2. Regular");
            int option2 = reader.nextInt();
            System.out.println("\n\n");
            
            switch (option2) {
                case 1:
                countP++;
                System.out.println("        Biblioteca de " + controller.consult_namerR(usuarioId) );
                controller.showMatriz(usuarioId,countP);
                System.out.println("\nDigite la coordenada x,y o el codigo correspondiente\ndel producto bibliografico para iniciar un sesion de lectura\nDigite A para ir a la anterior pagina\nDigite S para ir a la siguiente pagina\nDigite E para salir)");
            
                    break;
        
                case 2:
                countR++;
                System.out.println("        Biblioteca de " + controller.consult_namerR(usuarioId) );
                controller.showMatriz(usuarioId,countR);
                System.out.println("\nDigite la coordenada x,y o el codigo correspondiente\ndel producto bibliografico para iniciar un sesion de lectura\nDigite A para ir a la anterior pagina\nDigite S para ir a la siguiente pagina\nDigite E para salir)");
  
                    break;
        
                default:
                    System.out.println("Opción inválida....");
                    break;
            }
        }

      /**
       * This function allows a user to read a bibliographic product by inputting their user ID and the
       * product code, and then navigating through the pages using the options "A" to go back a page,
       * "S" to go forward a page, and "E" to exit.
       */
        public void lecture() {

            int init = 0;
            
            System.out.print("Ingrese su ID de usuario: ");
            String usuarioId = reader.nextLine();
    
            System.out.print("Ingrese el código de su producto bibliográfico para iniciar la lectura: ");
            String code = reader.nextLine();
    
            while (true) {
                message(init,usuarioId,code);
    
                String option = reader.nextLine();
    
                switch (option.toUpperCase()) {
                    case "A":
                        if (init > 0 && init < Integer.parseInt(controller.consult_numpageR(usuarioId))) {
                            init--;
                        }
                        break;
    
                    case "S":
                        
                        init++;
                       
                        break;
    
                    case "E":
                        return; 
    
                    default:
                        System.out.println("Opción inválida");
                        break;
                  }
                }
            }

      /**
       * This function prints out a message for a reading session, including instructions for
       * navigating pages.
       * 
       * @param init an integer representing the current page number being read
       * @param usuario A string representing the user's name or username.
       * @param code It is a String parameter that is not used in the method. It seems to be
       * unnecessary and can be removed.
       */
        public void message(int init, String usuario, String code){


            System.out.println("Sesion de lectura en proceso: \n");
            System.out.println("leyendo: " + controller.consult_namepageR(usuario) );
            System.out.println("leyendo pagina " + init + " de " + Integer.parseInt(controller.consult_numpageR(usuario)) +  " :  \n");

            System.out.println("Digite A para ir a la anterior pagina");
            System.out.println("Digite S para ir a la siguiente pagina");
            System.out.println("Digite E para vover al menu inicial ");
            System.out.print("OPCION: ");

        }
     /**
      * This function calls the "generarInformes()" method of the "controller" object.
      */
        
        public void generarInformes(){

            controller.generarInformes();

        }






}

