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
        int tamañoPedido = -1;
        Scanner in = new Scanner(System.in);
        
        //Solicitud de números de productos a agregar
        System.out.print("Ingrese el número de producto que quiere agregar \n"
                + "Ingrese 0 (cero) si no quiere agregar productos: ");
        do{
            try{
                tamañoPedido = in.nextInt();
            }catch(Exception e){    //Evita que se ingrese letras
                in.nextLine();
                System.out.print("Tipo de dato inválido, solo números: ");
            }
            if(tamañoPedido<0){
                System.out.print("Dato fuera de rango, solo números positivos: ");
            }
        }while(tamañoPedido<0); //Repetira hasta que se ingrese un rango valido
        
        //Comparación de resultados
        if(tamañoPedido == 0){
            System.out.print("\nNo se requieren productos\n");
        }else{
            Producto nuevoProducto[] = new Producto[tamañoPedido];  //Crear un arreglo con un número de objetos ingresados anteriormente
            for(int i = 0; i<tamañoPedido; i++){
                in.nextLine();
                System.out.print("\nIngrese el número ID del producto: ");
                tempNumero = in.nextInt();
                System.out.print("Ingrese el nombre del producto: ");
                tempNombre = in.next();
                System.out.print("Ingrese la cantidad disponible del producto: ");
                tempCantidad = in.nextInt();
                System.out.print("Ingrese el precio del producto: ");
                tempPrecio = Math.round(in.nextDouble()*100)/100d;
                nuevoProducto[i] = new Producto(tempNumero, tempNombre, tempCantidad, tempPrecio);  //Instanciar un nuevo producto en cada iteración
            }
            for(Producto productosLlevar : nuevoProducto){  //Imprimir la información de los Productos
                System.out.println(productosLlevar);
            }
        }
        in.close();
    }
}
