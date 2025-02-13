/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemagestionproductos.controlador;

import ec.edu.espoch.sistemagestionproductos.modelo.GestorProductos;
import ec.edu.espoch.sistemagestionproductos.modelo.Producto;
import ec.edu.espoch.sistemagestionproductos.vista.Vista;


public class Controlador {
    
    private GestorProductos modelo;
    private Vista vista;

    public Controlador(GestorProductos modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void agregarProducto(){
    
        try {
            if (this.vista != null) {
                
                Producto objProducto = new Producto();
                objProducto.setId(this.vista.getId);
                objProducto.setNombre(this.vista.getName());
            } else {
            }
            
        } catch (Exception e) {
        }
        
    }
}
