/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author Kevin
 */
public class Producto {
    //Declaraciones de campo de instancia
    private int numeroIdProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private double precioProducto;
    
    //Constructor predeterminado
    public Producto(){
    }
    //Constructor sobrecargado para los 4 atributos
    public Producto(int numeroIdProducto, String nombreProducto, int cantidadProducto, double precioProducto){
        this.numeroIdProducto = numeroIdProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }
    //Getters
    public int getNumeroID(){return numeroIdProducto;}
    public String getNombreProducto(){return nombreProducto;}
    public int getCantidadProducto(){return cantidadProducto;}
    public double getPrecioProducto(){return precioProducto;}
    
    //Setters
    public void setNumeroID(int numeroID){
        this.numeroIdProducto = numeroID;
    }
    public void setNombreProducto(String nombre){
        this.nombreProducto = nombre;
    }
    public void setCantidadProducto(int cantidad){
        this.cantidadProducto = cantidad;
    }
    public void setPrecioProducto(double precio){
        this.precioProducto = precio;
    }
    
    //Método ToString
    public String toString(){
        String salida = "";
        salida = "ID Producto\t: "+numeroIdProducto
                +"\nNombre Producto\t: "+ nombreProducto
                +"\nCantidad\t: "+ cantidadProducto
                +"\nPrecio\t\t: "+ precioProducto;
        return salida;
    }
}
