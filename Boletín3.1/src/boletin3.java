
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
     /* Ejercicio 2
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double celsius;
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Introuce la temperatura en Cº que desees convertir: ");
    celsius=sc.nextDouble();
        System.out.println(celsius+"Cº equivalen a "+(celsius*1.8+32)+"Fº y a "+(celsius+273)+"Kº");
        
    
    }
    
}
