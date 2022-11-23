package modelo;

import Servicios.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void ConsultarUsuarioBD(){

    }
    public static void CrearUsuarioBD(Usuario usuario){

        Conexion conexion = new Conexion();
        Connection con = Conexion.Conectar();

        PreparedStatement ps = null;
        try{
            String query = "INSERT INTO [dbo].[Usuarios](numDocumento,tipoDocumento,nombre,email,contrasena) VALUES (?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setInt(1, usuario.getNumDocumento());
            ps.setString(2, usuario.getTipoDocumento());
            ps.setString(3, usuario.getNombre());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getContrasena());
            ps.executeUpdate();
            System.out.println("Usuario Creado");


        } catch (SQLException e) {
            System.out.println(e);
        }


    }
}