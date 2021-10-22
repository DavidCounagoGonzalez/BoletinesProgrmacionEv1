
package boletin6_3;



public class Circulo {
    
    private double radio;
    private final double Pi;
    private double area;
    private double longitud;
    
public Circulo(){
    radio = 0;
    Pi = 3.14;
}
    
public Circulo(double r, double p){
    radio=r;
    Pi=p;
}
public double getRadio(){
    return radio;
}
public void setRadio(double r){
    radio=r;
}
public double getPi (){
    return Pi;
}
public void calcularArea (){
    area=Pi*Math.pow(radio,2);
    System.out.println("El area de la circunferecia es de: "+area+" cm");
}    
public void calcularLongitud (){
    longitud=2*Pi*radio;
    System.out.println("La longitud de la circunferecia es de: "+longitud+" cm");
}
}
