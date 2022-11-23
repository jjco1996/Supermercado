package Servicios;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String usuario = "programación";
    private static String contrasena = "mosquera";
    private static String bd = "Estudio";
    private static String servidor = "bdestudio.cbx3elyo0yfa.us-east-1.rds.amazonaws.com";
    private static String puerto = "3306";

private static String cadena = "jdbc:mariadb://"+servidor+":"+puerto+"/"+bd;

    public static Connection Conectar(){
    Object conectar = null;
        if (conectar == null) {
            try {
                String usuario = null;
                conectar = DriverManager.getConnection(cadena, usuario, contrasena);
                System.out.println("Conexion exitosa");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al conectar la Base de Datos: " + e.toString());
                //System.out.println("Error "+ e);
            }

        }
            return (Connection) conectar;

    }
}


