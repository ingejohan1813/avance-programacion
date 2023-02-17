/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.awt.BorderLayout;

/**
 * 
 * @author ingejohan1813
 * @class Vehiculos
 * @version 1.0
 * Clase de vehiculos 
 */

public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        carro mazda = new carro();
        mazda.marca = "mazda";
        mazda.setMarca("mazda");
        System.out.println(mazda.getMarca());
        AutoVolador carro = new AutoVolador();
        carro.setEstaVolando(true);
        if(carro.isEstaVolando()){
            System.out.println("Esta volando");
        }else{
            System.out.println( "No esta volando");
        }
    }

} 
