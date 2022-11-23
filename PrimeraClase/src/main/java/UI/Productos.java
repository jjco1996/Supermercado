
package UI;

public class Productos {
   
    private int precio;
    private String tipo;
    private String estado;
    
    Productos(int id ,String nombre , String clasificacion){
        this.precio= precio;
        this.tipo= tipo;
        this.estado= estado;}

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}  