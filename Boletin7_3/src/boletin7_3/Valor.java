
package boletin7_3;

import java.util.Scanner;

public class Valor {
    private double num1;
    
    public void Valor(){
        if (num1>0){
            System.out.println("+");
        }
        else if (num1==0){
            System.out.println(0);
        }
        else{
            System.out.println("-");
        }
    }

public double setNum1 (){
    Scanner dato=new Scanner(System.in);
    System.out.println("Escribe un número: ");
    num1=dato.nextDouble();
    return num1;
}    
}

