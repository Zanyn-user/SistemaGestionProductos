package ec.edu.espoch.sistemagestionproductos.modelo;

/**
 *
 * @author Eddy
 */
public class GestorProductos {

    int tamañoVector = 10;
    Producto[] producto = new Producto[tamañoVector];

    public void agregarProducto(Producto producto) {
        for (int i = 0; i < this.producto.length; i++) {
            if (this.producto[i] == null) {
                this.producto[i].setNombre(producto.getNombre());
                this.producto[i].setPrecio(producto.getPrecio());
                this.producto[i].setEstado(producto.getEstado());          
            }
        }
    }
    
    public Producto[] listarProductos(){
       Producto[] auxTareas = new Producto[tamañoVector];
       for (int i = 0; i < producto.length; i++) {
            if (producto[i].getEstado()) {
                auxTareas[i].setNombre(producto[i].getNombre());
                auxTareas[i].setPrecio(producto[i].getPrecio());
                auxTareas[i].setEstado(producto[i].getEstado());
            }
        }
        return auxTareas;
    }

}
