/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author ingejohan1813
 * @class carro
 * @version 1.0
 * Clase carro
 */
public class carro {
    
    //Atributos
    
    public int puertas;
    public String color;
    public String marca;
    public int asientos;
    public int peso;
    private char placa;
    public String tamanioRuedas;
    public String velocidad;
    public Date anioCompra;

    public carro(int puertas, String color, String marca, int asientos, int peso, char placa, String tamanioRuedas, String velocidad, Date anioCompra) {
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
        this.asientos = asientos;
        this.peso = peso;
        this.placa = placa;
        this.tamanioRuedas = tamanioRuedas;
        this.velocidad = velocidad;
        this.anioCompra = anioCompra;
    }
    

  
    carro() {
        
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getPlaca() {
        return placa;
    }

    public void setPlaca(char placa) {
        this.placa = placa;
    }

    public String getTamanioRuedas() {
        return tamanioRuedas;
    }

    public void setTamanioRuedas(String tamanioRuedas) {
        this.tamanioRuedas = tamanioRuedas;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public Date getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(Date anioCompra) {
        this.anioCompra = anioCompra;
    }
    
    
    
    
}
