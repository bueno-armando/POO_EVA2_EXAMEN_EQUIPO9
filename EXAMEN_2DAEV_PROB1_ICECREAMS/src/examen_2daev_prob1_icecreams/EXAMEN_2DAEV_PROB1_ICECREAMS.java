/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_2daev_prob1_icecreams;

/**
 *
 * @author galle
 */
public class EXAMEN_2DAEV_PROB1_ICECREAMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movimiento mov1 = new movimientou (0,10,2,5){};
        System.out.println("La distancia recorrida es: "+mov1.calcularDistancia());
        
        movimiento mov2 = new movimientoa (0,90,0.5,3){};
        System.out.println("La distancia recorrida es: "+mov2.calcularDistancia());
        
        movimiento mov3 = new movimientov (90,50,-0.4,25){};
        System.out.println("La distancia recorrida es: "+mov3.calcularDistancia());
    }
    
}
