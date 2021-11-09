
package boletin7_5;

import java.util.Scanner;

public class Mayor {
    Scanner datos;
    
    public void Mayor(){
    
    datos= new Scanner(System.in);
    
    int num1= PedirNum1();
    int num2= PedirNum2();
    int num3= PedirNum3();
    
    
    if (num1>num2 & num1>num3){
            System.out.println("El número "+ num1 + " es el mayor");
}
    else if (num1>num2 & num1<num3){
            System.out.println("El número "+ num3 + " es el mayor");
}
    else if (num1<num2 & num2>num3){
            System.out.println("El número "+ num2 + " es el mayor");
}
    else if (num1<num2 & num2<num3){
            System.out.println("El número "+ num3 + " es el mayor");
}
    }
        public int PedirNum1 (){
        System.out.println("Dame un número entero: ");
        int num1=datos.nextInt();
        return num1;
    }
        public int PedirNum2 (){
        System.out.println("Dame un número entero: ");
        int num2=datos.nextInt();
        return num2;
    }
        public int PedirNum3 (){
        System.out.println("Dame un número entero: ");
        int num3=datos.nextInt();
        return num3;
    }
    

}
