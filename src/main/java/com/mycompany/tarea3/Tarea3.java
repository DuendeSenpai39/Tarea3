/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea3;

/**
 *
 * @author Jose
 */
public class Tarea3 {

public static void main(String[] args) {
               
        var pais1 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad1 = new Ciudad("Cuenca","Pedro Palacios");
        
        var provincia1 = new Provincia("Azuay",ciudad1,909.585);
        
        
        pais1.addProvince(provincia1);
        
 
        System.out.println(ciudad1.getinfoCiudad());
        System.out.println(provincia1.getinfoProvincia());
        System.out.println(pais1.getinfoPais());
        
        
    }
}

