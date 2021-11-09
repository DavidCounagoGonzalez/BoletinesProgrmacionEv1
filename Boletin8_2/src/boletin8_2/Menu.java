
package boletin8_2;

import javax.swing.JOptionPane;




public class Menu {
    
    
    public void Menu(){

        
        String eleccion= JOptionPane.showInputDialog(null, "1.- Superficie del cuadrado 2.- Superficie de un triángulo. 3.-Superficie de un Círculo");
        int seleccion = Integer.parseInt(eleccion);
        
        switch (seleccion){
            case 1: 
                supCuadrado();
                break;
                
            case 2:
                supTriángulo();
                break;
            
            case 3:
                supCirculo();
                break;
                
            default: 
                JOptionPane.showMessageDialog(null, "No es una opción válida.");
                break;
                
        }
        
    }
    
    public void supCuadrado(){
        String ladoS= JOptionPane.showInputDialog(null, "Dame el lado del cuadrado:");
        float lado= Float.parseFloat(ladoS);
        float superficie=lado*lado;
        JOptionPane.showMessageDialog(null,"La superficie del cuadrado es: "+superficie);
    }
    public void supTriángulo(){
        String baseS= JOptionPane.showInputDialog(null, "Dame la base del triángulo: ");
        float base= Float.parseFloat(baseS);
        String alturaS= JOptionPane.showInputDialog(null, "Dame la altura del triángulo: ");
        float altura= Float.parseFloat(alturaS);
        float superficie= (float) (0.5*(base*altura));
        JOptionPane.showMessageDialog(null,"La superficie del triángulo es: "+superficie);
    }
    public void supCirculo(){
        String radioS= JOptionPane.showInputDialog(null, "Dame el radio del círculo: ");
        float radio= Float.parseFloat(radioS);
        float superficie= (float) (Math.PI*radio*radio);
        JOptionPane.showMessageDialog(null,"La superficie del círculo es: "+ superficie);
    }
}
