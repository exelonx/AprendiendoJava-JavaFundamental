/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//*************************************************************************************************
//*************************************************************************************************
//** Hecho por: Kevin Cubas, aka Exelon  ******* Proyecto: Aprendiendo Java       *****************     
//***                                     ******* Fecha de creación: 21/08/2021    ****************							
//**** Contacto: Kevincubas@unah.hn        ******* Última modificación: 21/08/2021  ***************   
//*****           Kevin.otaku@hotmail.com   *******                                  **************			
//******	   +504 33598469             *******                                  *************							
//*************************************************************************************************
//*************************************************************************************************
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        int tempNumero = 0;
        String tempNombre = "";
        int tempCantidad = 0;
        double tempPrecio = 0.00;
        Scanner in = new Scanner(System.in);
        //Instancias de objetos
        Producto nuevoProducto1 = new Producto();
        Producto nuevoProducto2 = new Producto();
        
        //Objeto p1
        System.out.println("Ingrese el número ID del producto: ");
        tempNumero = in.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        tempNombre = in.next();
        System.out.println("Ingrese la cantidad disponible del producto: ");
        tempCantidad = in.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        tempPrecio = Math.round(in.nextDouble()*100)/100d;
        Producto nuevoProducto3 = new Producto(tempNumero, tempNombre, tempCantidad, tempPrecio);
        System.out.println("\n"+nuevoProducto3);
        
        //Objeto p2
        in.nextLine();
        System.out.println("\nIngrese el número ID del producto: \b");
        tempNumero = in.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        tempNombre = in.next();
        System.out.println("Ingrese la cantidad disponible del producto: ");
        tempCantidad = in.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        tempPrecio = Math.round(in.nextDouble()*100)/100d;
        Producto nuevoProducto4 = new Producto(tempNumero, tempNombre, tempCantidad, tempPrecio);
        System.out.println("\n"+nuevoProducto4);
        in.close();
        
        //Objeto p6
        Producto nuevoProducto6 = new Producto(1, "Peras", 50, 10);
        nuevoProducto6.setEstatus(false);
        System.out.println("\n"+nuevoProducto6);
    }
}
