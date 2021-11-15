
package boletin9_3;

import javax.swing.JOptionPane;

public class AreaRec {
    
    public void AreaRec(){
        int base;
        int altura;
        
        do{
            base =Integer.parseInt(JOptionPane.showInputDialog(null, "Introuce la base del rectángulo: "));
    }        while (base<=0);
        
        do {
            altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introuce la altura del rectángulo: "));
        }   while (altura<=0);
        
        int area=base*altura;
        JOptionPane.showMessageDialog(null, area);
    }
    
}
