/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabriel_alvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Mensajes {
    private String fecha;
    private String emisor;
    private String receptor;

    public Mensajes(String fecha, String emisor, String receptor) {
        this.fecha = fecha;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "fecha=" + fecha + ", emisor=" + emisor + ", receptor=" + receptor + '}';
    }
    
    
}
