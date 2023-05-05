/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2daev_prob1_icecreams;

/**
 *
 * @author galle
 */
public abstract class movimiento {
    double Vo;
    private double Vf;
    private double a;
    private double t;

    public movimiento() {
        this.Vo = 0;
        this.Vf = 0;
        this.a = 0;
        this.t = 0;
    }
    public movimiento(double Vo, double Vf, double a, double t) {
        this.Vo = Vo;
        this.Vf = Vf;
        this.a = a;
        this.t = t;
    }

    public double getVo() {
        return Vo;
    }

    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    public double getVf() {
        return Vf;
    }

    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public abstract double calcularDistancia ();
        
}
