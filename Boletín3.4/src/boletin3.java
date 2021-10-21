
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
     /* Ejercicio 4
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long teuros;
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número entero total de euros: ");
    teuros=sc.nextInt();
    long resto1=teuros%100;
    long resto2=resto1%20;
    long resto3=resto2%5;
        System.out.println("Tu cantidad entera total de euros se dividirá en\n"+(teuros/100)+" billetes de 100€\n"+(resto1/20)+" billetes de 20€\n"+(resto2/5)+" billetes de 5€\n"+(resto3/1)+" monedas de 1€");
    
    }
    
}
