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
public class Usuario {
    private String nombre;
    private int edad;
    private String nacimiento;
    private String username;
    private String password;
    private ArrayList solicitudes;

    public Usuario(ArrayList solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(solicitudes x) {
        solicitudes.add(x);
    }

    

    public Usuario(String nombre, int edad, String nacimiento, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", nacimiento=" + nacimiento + ", username=" + username + ", password=" + password + '}';
    }

    void getSolicitudes(solicitudes solicitudes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
