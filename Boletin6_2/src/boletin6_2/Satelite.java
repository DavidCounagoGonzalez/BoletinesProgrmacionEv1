/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

/**
 *
 * @author david
 */
public class Satelite{
 
    private static double meridiano ;
    private static double paralelo;
    private static double distanciaTerra ;

 public double getSatelite ( ) {

  return meridiano = paralelo = distanciaTerra = 0 ;
}

public void setSatelite ( double m, double p , double d ){

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println ("o satelite atopase  no paralelo "+paralelo+ "; meridiano " + meridiano + "  ;a unha distancia da terra " +distanciaTerra );
}
}