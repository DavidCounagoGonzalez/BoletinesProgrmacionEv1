
package boletin6_3;
import java.util.Scanner;

public class Boletin6_3 {

    public static void main(String[] args) {
        
        double radio;
        
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        radio=datos.nextDouble();
        
        Circulo calculo=new Circulo();
        calculo.getRadio();
        calculo.setRadio(radio);
        calculo.getPi();
        calculo.calcularArea();
        calculo.calcularLongitud();

    }
    
}
