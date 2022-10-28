/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Jose
 */
public class Provincia {
    String nombreProvincia;
    Ciudad capitalCiudad;
    double poblacionProvincia;
    
    public Provincia(String nombreProvincia,Ciudad capitalCiudad,double poblacionProvincia){
        this.nombreProvincia = nombreProvincia;
        this.capitalCiudad = capitalCiudad;
        this.capitalCiudad.setProvince(this);
        this.poblacionProvincia = poblacionProvincia ;
    }
    public String getinfoProvincia(){
        var retorno = "El nombre de la provincia es :"+this.nombreProvincia+ ", ademas su capital es: "
                +this.capitalCiudad.nombreCiudad+" ,y la densidad poblacional es de :"
                +this.poblacionProvincia+ " Millones de habitantes";
        return retorno; 
    }
    
    public String toString(){
        return nombreProvincia;
    }   
}
