package UI;

public class Inventario extends Productos {
    
    private int id;
    private String nombre;
    private String clasificacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

   public Inventario (int id, String nombre, String clasificacion) {
        super(id, nombre, clasificacion);
   }
}