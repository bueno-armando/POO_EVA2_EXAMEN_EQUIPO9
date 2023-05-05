/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2daev_prob1_icecreams;

/**
 *
 * @author galle
 */
public class movimientov extends movimiento {
    
    public movimientov (){
    super (); 
}
    public movimientov (double Vo,double Vf,double A, double T){
        super(Vo,Vf,A,T); 
    }

    @Override
    public double calcularDistancia() {
        double d =(getVf()-getVo())/(2*getA());
        return d;
    }
    
}
