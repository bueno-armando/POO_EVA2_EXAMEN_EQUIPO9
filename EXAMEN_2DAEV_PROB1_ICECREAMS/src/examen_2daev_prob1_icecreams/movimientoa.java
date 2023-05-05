/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2daev_prob1_icecreams;

/**
 *
 * @author galle
 */
public class movimientoa extends movimiento {

    public movimientoa() {
    }

    public movimientoa(double Vo, double Vf, double a, double t) {
        super(Vo, Vf, a, t);
    }

    
    @Override
    public double calcularDistancia() {
        double d = (getVo()*getT())+((getA()*(getT()*getT())))/2;
        return d;
    }

}
