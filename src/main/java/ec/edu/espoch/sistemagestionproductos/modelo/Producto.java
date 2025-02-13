
package ec.edu.espoch.sistemagestionproductos.modelo;

/**
 *
 * @author Eddy
 */
public class Producto {
    
    private int id;
    private String nombre;
    private float precio;
    private boolean estado;

    public Producto(int id, String nombre, float precio, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
