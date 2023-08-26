/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_EvaSalgado;
import javax.swing.DefaultListModel;
/**
 *
 * @author evaja
 */
public class portátil extends consola {

    private String tamaño;
    private int bateria;
    private boolean estuche;

    public portátil() {
        super();
    }

    public portátil(String tamaño, int bateria, boolean estuche, int ID, String fabricante, int añouso, double precio, String modelo) {
        super(ID, fabricante, añouso, precio, modelo);
        this.tamaño = tamaño;
        this.bateria = bateria;
        this.estuche = estuche;
    }

  
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        return "port\u00e1til{" + "tama\u00f1o=" + tamaño + ", bateria=" + bateria + ", estuche=" + estuche + '}';
    }
    
}
