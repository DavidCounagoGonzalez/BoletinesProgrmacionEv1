
package boletin7_2;

public class Operaciones {
    private short num1;
    private short num2;
    
    public void Operaciones(){
        if (num1>=num2){
            System.out.println("La resta de los números es: "+(num1-num2));
        }
        System.out.println("La suma de los número es "+(num1+num2));
    }
    
    public short getNum1(){
        return num1;
    }
    public void setNum1(short num1){
        this.num1=num1;
    }
    public short getNum2(){
        return num2;
    }
    public void setNum2(short num2){
        this.num2=num2;
    }
}
