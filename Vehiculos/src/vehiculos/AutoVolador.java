/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @ingejohan1813
 * @class AutoVolador
 * @version 1.0
 * Clase de auto volador que hereda de la clase carro para su implementacion
 */
public class AutoVolador extends carro{
    public boolean estaVolando = false;

    public AutoVolador(int puertas, String color, String marca, int asientos, int peso, char placa, String tamanioRuedas, String velocidad, Date anioCompra) {
        super(puertas, color, marca, asientos, peso, placa, tamanioRuedas, velocidad, anioCompra);
    }

    public AutoVolador() {
    }

    public boolean isEstaVolando() {
        return estaVolando;
    }

    public void setEstaVolando(boolean estaVolando) {
        this.estaVolando = estaVolando;
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
    
    /**
     * Metodo volar para que nuestro auto vuele o aterrice 
     * @param estado 
     * el estado es un booleano que controla si esta volando o no
     */
    
    public void Volar(boolean estado){
        this.estaVolando = estado;
    }
}
