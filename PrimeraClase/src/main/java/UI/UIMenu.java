package UI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UIMenu {
    public static void verMenu() {
        
        System.out.println("SUPERMERCADOS MERQUEFACIL");
        System.out.println("¡Bienvenido a la app de compras online de Merquefacil!");
        System.out.println("Seleccione el producto que desea adquirir: ");
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
    

        do {
            System.out.println("1. Vegetales");
            System.out.println("2. Frutas");
            System.out.println("3. Dulces");
            System.out.println("4. Productos de aseo");
            System.out.println("0. Salir");
            
            
            Scanner cap = new Scanner(System.in);
            opcion = Integer.valueOf(cap.nextLine());
            
                                   
            switch (opcion) {
                    case 1:
                    System.out.println("Vegetales");
                    break;
                    case 2:
                    System.out.println("Frutas");
                    break;
                    case 3:
                    System.out.println("Dulces");
                    break;
                    case 4:
                    System.out.println("Productos de aseo");
                    break;
                    case 0:
                    System.out.println("Gracias por utilizar nuestra app");
                    break;
                    default:
                    System.out.println("Opción invalida. Ingrese una opcion correcta");
            
            }
        } while (opcion != 0);
    }
}