
package boletin9_1;

import javax.swing.JOptionPane;

public class Numeros {
    
    public void Numeros(){
        int numero, negativo=0, cero=0, positivo=0 ;
        
        
        for (int i=0 ;i<10;i++){
           numero= Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
           
           if(numero==0){ //Si el número es cero
               cero++; //Aumentamos en 1 el número de ceros
           }
           else if (numero>0){
               positivo++;
           }
           else{
               negativo++;
           }
            
        }
        JOptionPane.showMessageDialog(null,"El resultado es: \n Positivos: "+positivo+"\n Ceros: "+cero+"\n Negativos: "+negativo);
    }
    
}
