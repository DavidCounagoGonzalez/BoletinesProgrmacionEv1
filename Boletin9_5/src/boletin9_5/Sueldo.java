
package boletin9_5;

import javax.swing.JOptionPane;

public class Sueldo {
    
    public void Sueldo(){
        
        int salario;
        int continuar=0;
        int entre=0;
        int mas=0;
        int menos=0;
        int trabajador=0;
        
        do{
            salario=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el salario: \n (Si el salario es 0 finalizará el conteo)"));
            trabajador++;
            if (salario>=1000){
                if (salario<=1750){
                    entre++;
                }
                else{
                    mas++;
                }
            }
            else if (salario>0) {
                menos++;
            }
            /*continuar=Integer.parseInt(JOptionPane.showInputDialog(null, "Quiere añadir otro salrio? \n SI=1 NO=0"));
            switch(continuar){
                case 0:
                    break;
                case 1:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción.");
                    continuar=Integer.parseInt(JOptionPane.showInputDialog(null, "Quiere añadir otro salrio? \n SI=1 NO=0"));
                    break;  
            }*/
            
        }while (salario!=0);
        
        menos=(menos*100)/trabajador;
        JOptionPane.showMessageDialog(null, mas+" trabajador/es cobran más de 1750€ \n "+entre+" trbajador/es cobran entre 1000 y 1750€ \n y el "+ menos+"% cobra menos de 1000€");
        JOptionPane.showMessageDialog(null, "Hasta la próxima y Gracias");
    }
    
}
