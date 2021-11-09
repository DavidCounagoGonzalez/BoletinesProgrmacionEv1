
package boletin7_4;

import java.util.Scanner;

public class Persoa {
    Scanner datos=new Scanner(System.in);
    private String nome;
    private float peso;
    
    public Persoa (String nome, float peso){
        this.nome=nome;
        this.peso=peso;
    }
    
    public Persoa (){
        
    }
    
    //public void Comparar(Persoa obxpersoa1, Persoa obxpersoa2){
        
    //}
    
    public void Comparar(Persoa obxpersoa1, Persoa obxpersoa2){
        if (obxpersoa1.peso>obxpersoa2.peso){
            System.out.println("La persona que más pesa es "+obxpersoa1.nome+" con "+obxpersoa1.peso+" Kg por una diferencia de "+(obxpersoa1.peso-obxpersoa2.peso));
        }
        else{
            System.out.println("La persona que más pesa es "+obxpersoa2.nome+" con "+obxpersoa2.peso+" Kg por una diferencia de "+(obxpersoa2.peso-obxpersoa1.peso));
        }
    }
    
    /*public String lerNome(){
        System.out.println("Escriba el nombre de la primera persona: ");
        nome1=datos.nextLine();
        return nome1;
    }
    public float lerPeso(){
        System.out.println("Teclea el peso de la primera persona: ");
        peso1=datos.nextFloat();
        return peso1;
    }*/


        
}
