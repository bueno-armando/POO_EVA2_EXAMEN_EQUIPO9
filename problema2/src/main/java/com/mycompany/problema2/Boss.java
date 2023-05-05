/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

/**
 *
 * @author Cesar
 */
public  class Boss extends Employees{
    public Boss() {
        super();
    }

    public Boss(String name, String LastName, int Age, double BasicSalary) {
        super(name, LastName, Age, BasicSalary);
    }

    @Override
    public String toString(){
       return  super.toString()+ " Salario Semanal: $"+GetBasicSalary();
    }

    @Override
    public double CalcularSalario() {
        return GetBasicSalary();
    }
}
