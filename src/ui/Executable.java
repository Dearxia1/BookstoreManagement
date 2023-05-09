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
            System.out.println("|                                                                                                  |");
            System.out.println("|                                                                                                  |");
            System.out.println("====================================================================================================");
            System.out.print("Digite su opcion: ");
            
            int option = reader.nextInt();
            reader.nextLine(); // Leer el salto de línea después del número
            System.out.print("\n\n\n");
            switch (option) {
                case 1:
                    System.out.println("+----------------------------------------+");
                    System.out.println("|          REGISTRAR USUARIOS             |");
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
                            System.out.println("Usuario registrado con exito...\n\n");
                            break;
            
                        case 2:
                            registerPremiun_user();
                            System.out.println("Usuario registrado con exito...\n\n");
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
                        reader.nextLine(); // consumir el salto de línea
                        System.out.print("\n\n\n");
                        int option3 = 0;
                        int option4 = 0;
                        switch(option2){
                            case 1:
                                System.out.println("===============================");
                                System.out.println("|        Gestión de libros     |");
                                System.out.println("===============================");
                                System.out.println("|                             |");
                                System.out.println("|  1. Registrar libro         |");
                                System.out.println("|  2. Modificar libro         |");
                                System.out.println("|  3. Borrar libro            |");
                                System.out.println("|  4. Volver al menú principal |");
                                System.out.println("|                             |");
                                System.out.println("===============================");
                                System.out.print("Ingrese una opción: ");
                                option3 = reader.nextInt();
                                reader.nextLine(); // consumir el salto de línea
                                System.out.print("\n\n\n");
                    
                                switch(option3){
                                    case 1:
                                        registerBook();
                                        break;
                                    case 2:
                                        System.out.println("  1. Modificar nombre del libro ");
                                        System.out.println("  2. Modificar reseña del libro  ");
                                        System.out.print("Ingrese una opción: ");
                                        int option6 = reader.nextInt();
                                        switch(option6) {
                                            case 1:
                                                edit_book_name();
                                                System.out.println("Nombre modificado exitosamente....");
                                                break;
                                            case 2:
                                                // Lógica para modificar el caracter hexadecimal del libro
                                                break;
                                            default:
                                                System.out.println("Opción inválida. Intente nuevamente.");
                                                 break;
                                        }
                                        break;
                                    case 3:
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
                                System.out.println("|       Gestión de revistas    |");
                                System.out.println("===============================");
                                System.out.println("|                             |");
                                System.out.println("|  1. Registrar revista       |");
                                System.out.println("|  2. Modificar revista       |");
                                System.out.println("|  3. Borrar revista          |");
                                System.out.println("|  4. Volver al menú principal |");
                                System.out.println("|                             |");
                                System.out.println("===============================");
                                System.out.print("Ingrese una opción: ");
                                option4 = reader.nextInt();
                                reader.nextLine(); // consumir el salto de línea
                                System.out.print("\n\n\n");
                                
                                switch(option4){
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
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
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    
        System.out.println("Vuelve pronto!");
    }


    public void registerRegular_user(){

        System.out.print("  Digite su numero de cedula: ");
        String id = reader.nextLine();
        System.out.print("  Digite su nombre completo ");
        String name = reader.nextLine();

        controller.registerRegular_user(name, id);

    }

    public void registerPremiun_user(){

        System.out.print("  Digite su numero de cedula: ");
        String id = reader.nextLine();
        System.out.print("  Digite su nombre completo ");
        String name = reader.nextLine();

        controller.registerPremiun_user(name, id);

    }

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
        
        // Imprimir la información recolectada
        System.out.println("Libro registrado con exito....");

        controller.registerBook(name, genre, publicationDate, numPages, id, review, null, url, saleValue, numPages);

    }


    public void edit_book_name(){
        
        System.out.print("\n");
        reader.nextLine();
        System.out.print("Digite el identificar del libro a modificar el nombre:");
        String id = reader.nextLine();
        System.out.print("Cual es el nuevo nombre?: ");
        String name = reader.nextLine();

        controller.edit_book_name(id, name);

    }


}

