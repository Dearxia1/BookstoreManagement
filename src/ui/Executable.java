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
            System.out.println("|                                         MENÚ PRINCIPAL                                          |");
            System.out.println("====================================================================================================");
            System.out.println(" Opciones:                                                                                       ");
            System.out.println("        2. Gestionar productos bibliográficos: registrar, modificar y borrar libros y revistas.  ");
			System.out.print("\n\n");
			System.out.print("Digite su opcion: ");
			int option = reader.nextInt();
			reader.nextLine(); // Leer el salto de línea después del número
			System.out.print("\n\n\n");

			switch (option) {

                case 1: 
                    break;
				case 2:

                int option2 = 0;
                        do {
                            System.out.println("====================================");
                            System.out.println("Gestión de productos bibliográficos");
                            System.out.println("==================================== \n");
                            System.out.println("1. Gestionar libros");
                            System.out.println("2. Gestionar revistas");
                            System.out.println("3. Salir\n");
                            System.out.print("Ingrese una opción: ");
                            option2 = reader.nextInt();
                            reader.nextLine(); // consumir el salto de línea
                            
                            switch(option2) {
                                case 1:
                                    
                                    break;
                                case 2:
                                    
                                    break;
                                case 3:
                                    System.out.println("¡Hasta luego!");
                                    break;
                                default:
                                    System.out.println("Opción inválida. Intente nuevamente.");
                                    break;
                            }
                            
                        } while(option2 != 3);

					break; // --------
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Opción inválida");
					break;
			}
		}
	}



}
