
package boletin9_4;

import javax.swing.JOptionPane;

public class Tabla {
    
    public void Tabla(){
        int numero;
        int continuar;
        int multiplicador=0;
        numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe el número del que quieras saber su tabla: "));
        do{
            
            multiplicador++;
            int producto= numero*multiplicador;
            JOptionPane.showMessageDialog(null, numero+" x "+multiplicador+" = "+producto);
            
            continuar=Integer.parseInt(JOptionPane.showInputDialog(null, "Desea continuar? \n Sí=1 No=0 "));
            switch (continuar) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción.");
                     continuar=Integer.parseInt(JOptionPane.showInputDialog(null, "Desea continuar? \n Sí=1 No=0 "));
                    
            }
            
        } while (continuar==1);
        JOptionPane.showMessageDialog(null, "Adiós.");
    }
    
}
