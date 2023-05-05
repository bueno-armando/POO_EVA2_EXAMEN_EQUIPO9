/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class Manufacture extends Employees{
    Scanner sc = new Scanner(System.in);
    public Manufacture() {
       super();
       
    }
    public Manufacture(String name, String LastName, int Age, double BasicSalary) {
        super(name, LastName, Age, BasicSalary);
    }

    @Override
    public double CalcularSalario() {
        System.out.println("Horas trabajadas por semana: ");
        int horas = sc.nextInt();
        double SalarioSemanal = GetBasicSalary() *horas;
        return SalarioSemanal;
        
    }
    
    @Override
    public String toString(){
       return  super.toString()+"\n"+"Salario Semanal: $"+CalcularSalario();
    }
  
   
}
