/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabriel_alvarado;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
class solicitudes {
    private String emisor;
    private ArrayList receptor;

    public solicitudes(String emisor, ArrayList receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

   
    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public ArrayList getReceptor() {
        return receptor;
    }

    public void setReceptor(ArrayList receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "solicitudes{" + "emisor=" + emisor + ", receptor=" + receptor + '}';
    }

   
    
    
}
