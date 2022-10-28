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
        
        
        var pais2 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad2 = new Ciudad("Ambato","Javier Altamirano");
        
        var provincia2 = new Provincia("Tungurahua",ciudad2,489.537);
        
        pais2.addProvince(provincia2);
        
        
        var pais3 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad3 = new Ciudad("Azogues","Romel Sarmiento Castro");
        
        var provincia3 = new Provincia("Cañar",ciudad3,281.396);
        
        pais3.addProvince(provincia3);
        
        
        var pais4 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad4 = new Ciudad("Santa Elena","Otto Vera Palacios");
        
        var provincia4 = new Provincia("Santa Elena",ciudad4,164.196);
        
        pais4.addProvince(provincia4);
        
        
        var pais5 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad5 = new Ciudad("Ibarra","Andrea Scacco");
        
        var provincia5 = new Provincia("Imbabura",ciudad5,184.457);
        
        pais5.addProvince(provincia5);
        
        
        var pais6 = new Pais("Ecuador",1809,24,17.888474);
        
        var ciudad6 = new Ciudad("Guayaquil","Cynthia Viteri");
        
        var provincia6 = new Provincia("Guayas",ciudad6,2.644891);
        
        pais6.addProvince(provincia6);
        
        
        System.out.println(ciudad1.getinfoCiudad());
        System.out.println(provincia1.getinfoProvincia());
        System.out.println(pais1.getinfoPais());
        
        System.out.println(ciudad2.getinfoCiudad());
        System.out.println(provincia2.getinfoProvincia());
        System.out.println(pais2.getinfoPais());
        
        System.out.println(ciudad3.getinfoCiudad());
        System.out.println(provincia3.getinfoProvincia());
        System.out.println(pais3.getinfoPais());
        
        System.out.println(ciudad4.getinfoCiudad());
        System.out.println(provincia4.getinfoProvincia());
        System.out.println(pais4.getinfoPais());
        
        System.out.println(ciudad5.getinfoCiudad());
        System.out.println(provincia5.getinfoProvincia());
        System.out.println(pais5.getinfoPais());
        
        System.out.println(ciudad6.getinfoCiudad());
        System.out.println(provincia6.getinfoProvincia());
        System.out.println(pais6.getinfoPais());
    }
}

