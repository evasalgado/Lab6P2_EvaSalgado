/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_EvaSalgado;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author evaja
 */

public class consola {

    protected int ID;
    protected String fabricante;
    protected int añouso;
    protected double precio;
    ArrayList<juego> juegos = new ArrayList<juego>();
    protected String modelo;

    public consola() {
    }

    public consola(int ID, String fabricante, int añouso, double precio, String modelo) {
        this.ID = ID;
        this.fabricante = fabricante;
        this.añouso = añouso;
        this.precio = precio;
        this.modelo = modelo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAñouso() {
        return añouso;
    }

    public void setAñouso(int añouso) {
        this.añouso = añouso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<juego> juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "consola{" + "ID=" + ID + ", fabricante=" + fabricante + ", a\u00f1ouso=" + añouso + ", precio=" + precio + ", juegos=" + juegos + ", modelo=" + modelo + '}';
    }
    
    
}
