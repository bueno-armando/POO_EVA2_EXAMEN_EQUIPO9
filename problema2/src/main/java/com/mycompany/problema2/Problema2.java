 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;

/**
 *
 * @author Cesar
 */
public class Problema2 {

    public static void main(String[] args) {
        
        Support soporte = new Support("José", "González", 180, 50);
        Boss jefe = new Boss("PEPE", "LastName", 10, 5000);
        System.out.println(soporte.toString());
        System.out.println(jefe.toString());
        
    }
}
