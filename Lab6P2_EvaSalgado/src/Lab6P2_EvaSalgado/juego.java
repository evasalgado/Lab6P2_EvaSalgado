/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_EvaSalgado;

import java.util.Date;

/**
 *
 * @author evaja
 */
public class juego {
    private String nombre;
    private String descripcion;
    private Date lanzamiento;
    private double precio;
    private boolean estado;
    private boolean rentable;
    private boolean agregado;
    private int disponibles;

    public juego() {
    }
    
    
    public juego(String nombre, String descripcion, Date lanzamiento, double precio, boolean estado, boolean rentable, boolean agregado, int disponibles) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lanzamiento = lanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.disponibles = disponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public String toString() {
        return "juego{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", lanzamiento=" + lanzamiento + ", precio=" + precio + ", estado=" + estado + ", rentable=" + rentable + ", agregado=" + agregado + ", disponibles=" + disponibles + '}';
    }
    
    
}
