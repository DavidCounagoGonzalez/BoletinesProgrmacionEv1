
package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {
    
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Escribe un número: ");
        short num1= datos.nextShort();
        System.out.println("Escribe otro número: ");
        short num2=datos.nextShort();
        
        Operaciones obxOp=new Operaciones();
        obxOp.setNum1(num1);
        obxOp.getNum1();
        obxOp.setNum2(num2);
        obxOp.getNum2();
        obxOp.Operaciones();
        
    }
    
}
