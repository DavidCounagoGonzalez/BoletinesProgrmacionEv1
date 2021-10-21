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
public class Boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float valordolar;
        float euros ;
        float dolares;
        //para ler instancio un obxeto tipo escaner utilizando un constructor.
    Scanner sc=new Scanner(System.in);
        System.out.println("Teclee el valor del dolar: ");
    valordolar= sc.nextFloat();
        System.out.println("Teclee la cantidad de euros : ");
    euros= sc.nextFloat();
    dolares=valordolar*euros;
        System.out.println("El cmabio de "+ euros +" euros a dolares equivale a "+dolares+" dolares");
    
        
                
    }
    
}
