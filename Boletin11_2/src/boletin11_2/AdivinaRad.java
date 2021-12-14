
package boletin11_2;

import javax.swing.JOptionPane;


public class AdivinaRad {

    public void Adivina(){
    int numOculto;
    int numPosible;
    int continuar;
    int intentos;
do{
numOculto=(int)(Math.random()*50);
intentos=Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea el número de intentos: "));
for (int i=0;i<intentos;i++){
numPosible=Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el número que creas entre 0-50: "));
if (numOculto==numPosible){
    JOptionPane.showMessageDialog(null, "Has acertado!!!");
    break;
}
else{
    if (numOculto<numPosible){
        JOptionPane.showMessageDialog(null, "El número por adivinar es menor.");
    }
    else{
        JOptionPane.showMessageDialog(null, "El número por adivinar es mayor.");
    }
}
}
continuar= Integer.parseInt(JOptionPane.showInputDialog("Deseas volver a Jugar? \n SI=1     NO=0"));
}while(continuar==1);
JOptionPane.showMessageDialog(null, "Gracias por jugar.");
}
}
