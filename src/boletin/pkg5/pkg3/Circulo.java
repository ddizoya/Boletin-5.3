/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg5.pkg3;

/**
 *
 * @author David
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14;

    public Circulo (){
        
    }
    
    public Circulo (double radio){
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
public double calcularArea (){
        double cuenta = 2*PI* Math.pow(radio, 2);
        return cuenta;
}       

public double calcularLongitud (){
        double longitud = 2*PI*radio;
        return longitud;
}





}
