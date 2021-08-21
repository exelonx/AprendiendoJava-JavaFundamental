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
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto nuevoProducto = new Producto(1, "Aguacate", 200, 7);
        System.out.println(nuevoProducto.toString());
    }
    
}
