
package boletin6_1;


public class Boletin6_1 {

    public static void main(String[] args) {
        
        int velocidade;
        int acelerado;
        int frenado;
        
        acelerado=(int)(Math.random()*120+1);
        frenado=(int)(Math.random()+120+1);
   
        Coche cambioV=new Coche();
        cambioV.acelerar(95);
        cambioV.frenado(23);
    }
    
}
