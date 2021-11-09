
package boletin7;

import java.util.Scanner;

public class Boletin7_1 {

    public static void main(String[] args) {
        
        double num;
        
        Scanner dato=new Scanner(System.in);
        System.out.println("Escribe un número: ");
        num=dato.nextDouble();
                
        Positivo obxPos=new Positivo();
        obxPos.setNum(num);
        obxPos.getNum();
        obxPos.Positivo();

        
    }
    
}
