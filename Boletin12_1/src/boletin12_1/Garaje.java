
package boletin12_1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Garaje {
        int plazas=5;
        int numeroCoches = 0;
        String matricula;
        int opcion;
        
        public void Garaje(){
Garaje reprod = new Garaje();
do{
reprod.Menu();
}while (opcion!=0);
    }
        public void Menu(){
            Garaje realizar=new Garaje();
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Que acción desea realizar? \n 1.Añadir vehículo. \n 2.Salir del garaje. \n 3.Salir"));
            switch(opcion){
                case 3:
                    break;
                case 1: 
                    realizar.Añadir(); 
                    numeroCoches++;
                    
                    
                case 2:
                    realizar.Salir();
                    
                default:
                    JOptionPane.showMessageDialog(null, "No es una opción.");
                    
                    
            }
        }
        public void Añadir(){
            Garaje repro=new Garaje();
        if(plazas!=numeroCoches){
            JOptionPane.showMessageDialog(null, "Quedan "+(plazas-numeroCoches)+" plaza/s libre/s");
            matricula=JOptionPane.showInputDialog("Introduzca su matrícula: ");
            

        
    }
        else{
            JOptionPane.showMessageDialog(null, "COMPLETO");
            
        }
       repro.Menu();
        }
        public void Salir(){
            Garaje repro=new Garaje();
            JOptionPane.showInputDialog("Inserte matrícula: ");
            double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Cuanto tiempo estuvo aparcado? "));
            double precio;
            double pago;
            if (tiempo<=180){
                precio=0.0083*tiempo;
            }
            else{
                precio=1.5+0.003*(tiempo-180);
            }
           pago=Double.parseDouble(JOptionPane.showInputDialog("El precio es de: "+precio+"\n Introduzca el dinero porfavor."));
           double vuelta = 0;
           if (pago==precio){
               vuelta=0;
           }
           else if (pago>precio){
               vuelta=pago-precio;
           }
           else{
               
           }
            JOptionPane.showMessageDialog(null, "FACTURA \n MATRÍCULA COCHE: "+matricula+"\n TEMPO: "+tiempo+"\n PRECIO: "+precio+"\n CARTOS RECIBIDOS: "+pago+"\n CARTOS DEVOLTOS: "+vuelta);
            
            
            numeroCoches--;
            repro.Menu();
        }
    
    
}
