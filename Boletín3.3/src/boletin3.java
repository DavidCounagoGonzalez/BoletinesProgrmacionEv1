
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
     /* Ejercicio 3
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long nbilletes100;
        long nbilletes20;
        long nbilletes5;
        long nmonedas1;
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cantidad de billetes de 100: ");
    nbilletes100=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 20: ");
    nbilletes20=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 5: ");
    nbilletes5=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 1 : ");
    nmonedas1=sc.nextInt();
        System.out.println("Tu cantidad total de euros es de "+(100*nbilletes100+20*nbilletes20+5*nbilletes5+nmonedas1));
        
               
    
    }
    
}
