
package boletin7;



public class Positivo {
    private double num;
 
    public void Positivo(){
 
    if (num > 0){
        System.out.println("El número es positivo.");
}
    else{
        System.out.println("El número es negativo.");
    }
    }
    public double getNum(){
        return num;
    }
    public void setNum(double num){
        this.num=num;
    }
    
}
