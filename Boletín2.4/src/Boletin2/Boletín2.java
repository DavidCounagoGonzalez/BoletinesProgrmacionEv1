/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boletin2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Boletín2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
        float num2 ;
        //para ler instancio un obxeto tipo escaner utilizando un constructor.
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
    num1= sc.nextFloat();
        System.out.println("Introuzca otro número: ");
    num2= sc.nextFloat();
    float suma=num1+num2;
    float resta1=num1-num2;
    float resta2=num2-num1;
    float producto=num1*num2;
    float cociente1=num1/num2;
    float cociente2=num2/num1;
        System.out.println("A continuación se mostrarán las operaciones con "+num1+" y "+num2);
        System.out.println("suma= "+num1+"+"+num2+"="+suma);
        System.out.println("resta= "+resta1+" o "+resta2);
        System.out.println("producto= "+producto);
        System.out.println("cociente= "+cociente1+" o "+cociente2);

    
        
                
    }
    
}
