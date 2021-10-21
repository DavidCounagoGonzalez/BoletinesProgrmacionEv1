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
        float millasmarinas;
        float metros;
        final int EQUIVALENCIA=1852 ;
        //para ler instancio un obxeto tipo escaner utilizando un constructor.
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud en millas marinas: ");
    millasmarinas= sc.nextFloat();
        System.out.println("La equivalencia a 1 milla son 1852 metros.");
    //metros=millasmarinas*EQUIVALENCIA;
        //System.out.println(millasmarinas+" millas marinas equivalen a "+metros+" metros.");
        System.out.println(millasmarinas+" millas marinas equivalen a "+millasmarinas*EQUIVALENCIA+" metros.");

    
        
                
    }
    
}
