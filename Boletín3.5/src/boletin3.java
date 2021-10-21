
import java.util.Scanner;

public class boletin3 {
     /* Ejercicio 5
    */

    public static void main(String[] args) {
        double sueldofijo;
        int totalventas;
        double quilometraje;
        int diasdesplazamiento;
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Dame tu salario fijo: ");
    sueldofijo=sc.nextDouble();
        System.out.println("Introduce el número total de ventas que realizaste: ");
    totalventas=sc.nextInt();
        System.out.println("Introduce los kilometros recorridos durante el mes: ");
    quilometraje=sc.nextDouble();
        System.out.println("Introduce el número de días que has tenido que desplazarte. ");
    diasdesplazamiento=sc.nextInt();
    double sueldobruto=sueldofijo+totalventas*0.5+quilometraje*2+diasdesplazamiento*30;
        System.out.println("Tu sueldo bruto será de "+sueldobruto+"€ y el sueldo líquido equivaldrá a "+(sueldobruto-sueldobruto*0.18-36)+"€");
    
    }
    
}
