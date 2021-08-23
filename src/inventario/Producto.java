/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

//*************************************************************************************************
//*************************************************************************************************
//** Hecho por: Kevin Cubas, aka Exelon  ******* Proyecto: Aprendiendo Java       *****************     
//***                                     ******* Fecha de creación: 21/08/2021    ****************							
//**** Contacto: Kevincubas@unah.hn        ******* Última modificación: 21/08/2021  ***************   
//*****           Kevin.otaku@hotmail.com   *******                                  **************			
//******	   +504 33598469             *******                                  *************							
//*************************************************************************************************
//*************************************************************************************************
public class Producto {
    //Declaraciones de campo de instancia
    private int numeroIdProducto;
    private String nombreProducto;
    private int cantidadProducto;
    private double precioProducto;
    private boolean estatus = true;
    
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
    public boolean getEstatus(){return estatus;}
    
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
    public void setEstatus(boolean estatus){
        this.estatus = estatus;
    }
    
    //Metodo para calcular el valor del inventario actual del producto
    public double getInventarioValor(){
        return (double)(precioProducto*cantidadProducto);
    }
    
    //Método ToString
    public String toString(){
        String salida = "";
        String estatusString = this.estatus == true ? "Activo" : "Descatalogado";
        salida = "\nID Producto\t: "+numeroIdProducto
                +"\nNombre Producto\t: " + nombreProducto
                +"\nCantidad\t: "+ cantidadProducto
                +"\nPrecio\t\t: "+ precioProducto
                +"\nPrecio del stock: " + getInventarioValor()
                +"\nEstatus\t\t: "+ estatusString+"\n";
        return salida;
    }
}
