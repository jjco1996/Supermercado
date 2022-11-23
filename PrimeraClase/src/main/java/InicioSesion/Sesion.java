package InicioSesion;
package UI;

import InicioSesion.Login;
import java.util.ArrayList;
import java.util.Scanner;

public class Sesion {

    @SuppressWarnings("empty-statement")
    public static void Autenticacion() {
        ArrayList<Login> logins;
        logins = new ArrayList();
        logins.add(new Login(1, "l@out.com", "123"));

        System.out.println("Bienvenido a Mercados online Merquefacil");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese usuario:");
        String user = sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String password = sc.nextLine();
        
        boolean anail0k = false;

        do {
            System.out.println("");
           } 
        
        while (anail0k);{
        }

    }

}
