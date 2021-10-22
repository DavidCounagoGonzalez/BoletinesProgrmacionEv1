
package boletin6_1;


public class Coche {
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar (int acelerado){
        velocidade= velocidade+acelerado;
        System.out.println("El coche ahora va a: "+velocidade+"km/h");
    }
    public void frenado (int frenado){
        velocidade=velocidade-frenado;
        System.out.println("El coche ahora va a: "+velocidade+"km/h");
    }
    
}
