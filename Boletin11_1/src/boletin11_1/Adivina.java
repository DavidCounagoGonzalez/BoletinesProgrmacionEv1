
package boletin11_1;

import javax.swing.JOptionPane;

public class Adivina {
    public void Adivina(){
    int numOculto;
    int numPosible;
    int continuar;
    int intentos;
do{
do{
    numOculto= Integer.parseInt(JOptionPane.showInputDialog("Escribe un número entre 0-50 para que advine la otra persona: "));
    }while(0>numOculto || numOculto>50);
intentos=Integer.parseInt(JOptionPane.showInputDialog("Intoduce el número de intentos: "));
for (int i=0;i<intentos;i++){
numPosible=Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el número que creas: "));
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
continuar= Integer.parseInt(JOptionPane.showInputDialog("Deseas volvver a Jugar? \n SI=1     NO=0"));
}while(continuar==1);
JOptionPane.showMessageDialog(null, "Gracias por jugar.");
}
}