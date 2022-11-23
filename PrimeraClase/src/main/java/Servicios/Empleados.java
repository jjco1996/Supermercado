package UI;

import java.math.BigInteger;

public class Empleados {

  
    int id;
    String nombre;
    BigInteger identificacion;
    String tipoDocumento;
    String email;
    String direccion;
    String ciudad;
    BigInteger telefono;
    String puesto;

    Empleados(int id, String nombre, BigInteger identificacion, String tipoDocumento, String email,
            String direccion, String ciudad, BigInteger telefono, String puesto) 
    {

        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoDocumento = tipoDocumento;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.puesto = puesto;
    }
}
