/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_EvaSalgado;

/**
 *
 * @author evaja
 */
public class estacionaria extends consola{
   private int controles;
   private int almacenamiento;
   private String conexion;

    public estacionaria() {
    }

    public estacionaria(int controles, int almacenamiento, String conexion, int ID, String fabricante, int añouso, double precio, String modelo) {
        super(ID, fabricante, añouso, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexion = conexion;
    }


    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "estacionaria{" + "controles=" + controles + ", almacenamiento=" + almacenamiento + ", conexion=" + conexion + '}';
    }
    
    
}
