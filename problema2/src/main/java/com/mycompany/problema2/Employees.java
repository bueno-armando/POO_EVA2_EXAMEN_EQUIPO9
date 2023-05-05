/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema2;

/**
 *
 * @author Cesar
 */
public abstract class Employees implements Capturando   {
    //Atributos
     private String name;
     private String LastName;
     private int Age;
     private double BasicSalary;
    //Constructores
    public Employees(){
        this.name="----";
        this.LastName="----";
        this.Age = 0;
        this.BasicSalary =0;
    }

    public Employees(String name, String LastName, int Age, double BasicSalary) {
        this.name = name;
        this.LastName = LastName;
        this.Age = Age;
        this.BasicSalary = BasicSalary;
    }
    
   //GET AND SET pir interface
    
   @Override
   public  void SetName(String name){
       this.name = name;
   }
   
   @Override
    public String GetName(){
       return this.name;
   }
    
   @Override
    public void SetLastName(String LastName){
        this.LastName = LastName;
    }
    
    @Override
    public String GetLastName(){
      return this.LastName;
    }
    
    @Override
    public void SetAge(int Age){
      this.Age = Age;
    }
    
    @Override
    public int GetAge(){
      return this.Age;
    }
    
    @Override
    public void SetBasicSalary(double BasicSalary){
      this.BasicSalary = BasicSalary;    
    }
    
    @Override
    public double GetBasicSalary(){
      return this.BasicSalary;
    }
    
   @Override
   public String toString(){
   return name+" "+LastName;
   }
   public abstract double CalcularSalario();
   
   
    
}
