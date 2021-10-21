
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class boletin3 {
    /* Ejercicio 1
    */
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float preciotarifa;
        float preciopagado;
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el precio inicial del producto: ");
    preciotarifa=sc.nextFloat();
        System.out.println("Introduzca el precio que ha pagado: ");
    preciopagado=sc.nextFloat();
        System.out.println("El descuento en la compra será del "+(preciopagado*100)/preciotarifa+"%");
    }
    
}
