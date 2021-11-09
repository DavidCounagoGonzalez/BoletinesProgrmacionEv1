
package boletin6_1;

import java.util.Scanner;

public class Boletin6_1 {

    public static void main(String[] args) {
        
        int velocidade;
        int acelerado;
        int frenado;
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce la aceleración: ");
        acelerado=datos.nextInt();
        System.out.println("Introduce la deceleración: ");
        frenado=datos.nextInt();
   
        Coche cambioV=new Coche();
        cambioV.acelerar(acelerado);
        cambioV.frenado(frenado);
    }
    
}
