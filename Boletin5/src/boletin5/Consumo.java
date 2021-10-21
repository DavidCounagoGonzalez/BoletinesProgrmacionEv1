
package boletin5;

import java.util.Scanner;

public class Consumo {
    
    public float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    Scanner datos=new Scanner(System.in);
    
//Constructores
    public Consumo(){
    }
    
    public Consumo(float km, float L,float vMed, float pGas ){
        this.km=km;
        litros=L;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    

    public float getTiempo (){
        return vMed/km;
    }
    public float consumoMedio(){
        return 100*litros/km;
    }
    public float consumoEuros(){
        return litros*pGas*100/km;
    }
    public void setKm(float km){
        this.km=km;
    }
    public void setLitros(float litros){
        this.litros=litros;
    }
    public void setVmed(float vMed){
        this.vMed=vMed;
    }
    public void setPgas(float pGas){
        this.pGas=pGas;
    }
    public void ConsumoT(){
        System.out.println("El consumo medio cada 100km fue de : "+100*litros/km+" L y la velocidad media fue de: "+ vMed);
    }

}
