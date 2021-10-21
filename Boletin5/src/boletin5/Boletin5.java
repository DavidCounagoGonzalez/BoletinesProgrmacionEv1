
package boletin5;

import java.util.Scanner;

public class Boletin5 {
    
 
    public static void main(String[] args) {
        
    float km;
    float vMed;
    float litros;
    
    Scanner datos=new Scanner(System.in);
        System.out.println("Introduce los km recorridos: ");
        km=datos.nextFloat();
        System.out.println("Introduce la Velocidad media: ");
        vMed=datos.nextFloat();
        System.out.println("Introduce los litros consumidos: ");
        litros=datos.nextFloat();
        
        Consumo consume=new Consumo();
        consume.setLitros(50);
        consume.setPgas(1.57f);
        
        Consumo consumo=new Consumo();
        consumo.setKm(km);
        consumo.setVmed(vMed);
        consumo.setLitros(litros);
        consumo.ConsumoT();
    }
    
    
}
