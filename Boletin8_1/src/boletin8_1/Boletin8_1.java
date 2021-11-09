
package boletin8_1;

import java.util.Scanner;


public class Boletin8_1 {

    public static void main(String[] args) {
        
        Scanner datos=new Scanner(System.in);
        
        int ventas;
        
        System.out.println("Introduce el número de ventas anuales del producto: ");
        ventas=datos.nextInt();
        
        int tipo = 0;
        String tipoString = null;
        
        if(ventas<=100){
            tipo=1;
        }
        
        else if (100<ventas && ventas<=500){
            tipo=2;
       }
        else if (500<ventas & ventas<=1000){
            tipo=3;
        }
        else{
            tipo=4;
        }
        
        switch(tipo){
            case 1:
                tipoString="Baja";
                break;
            case 2:
                tipoString="Media";
                break;
            case 3:
                tipoString="Alta";
                break;
            case 4:
                tipoString="de Primeira Necesidade";
                break;
        }
        System.out.println("La importacia de las ventas del producto es " + tipoString);
        
    }
    
}
