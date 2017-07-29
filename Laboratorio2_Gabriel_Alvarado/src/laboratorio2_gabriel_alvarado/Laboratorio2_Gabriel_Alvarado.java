/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabriel_alvarado;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class Laboratorio2_Gabriel_Alvarado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList();
        String op = "";
        while (!op.equals("g")) {
            op = JOptionPane.showInputDialog(""
                    + "a- crear usuario\n"
                    + "b-listar persona \n"
                    + "c-modificar persona\n"
                    + "d-eliminar persona\n"
                    + "e-Login\n"
                    + "g-Salir");
            if (op.equals("a")) {
                int i;
                String nombre;
                String nacimiento;
                String username;
                String contraseña;
                nombre = JOptionPane.showInputDialog("Ingrese nombre");
                i = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese edad")
                );
                nacimiento = JOptionPane.showInputDialog("Ingrese lugar de nacimiento");

                username = JOptionPane.showInputDialog("Crear username");

                contraseña = JOptionPane.showInputDialog("Ingrese la contraseña");

                lista.add(new Usuario(nombre, i, nacimiento, username, contraseña));
            }

            if (op.equals("b")) {
                String s = "";
                for (Object t : lista) {
                    if (t instanceof Usuario) {
                        s += "" + lista.indexOf(t) + "- " + t + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }

            if (op.equals("c")) {
                int i;
                String nombre;
                int edad = 0;
                String nacimiento = "";
                String username = "";
                String contraseña = null;
                i = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a modificar")
                );
                nombre = JOptionPane.showInputDialog("nuevo nombre");
                ((Usuario) lista.get(i)).setNombre(nombre);
                ((Usuario) lista.get(i)).setEdad(edad);
                ((Usuario) lista.get(i)).setNacimiento(nacimiento);
                ((Usuario) lista.get(i)).setUsername(username);
                ((Usuario) lista.get(i)).setPassword(contraseña);
            }

            if (op.equals("d")) {
                int i2;

                i2 = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "pocision a eliminar")
                );

                lista.remove(i2);
            }

            if (op.equals("e")) {
                String usuario;
                String password;

                JOptionPane.showMessageDialog(null, "Login");
                usuario = JOptionPane.showInputDialog("Ingrese Usuario:");
                password = JOptionPane.showInputDialog("Ingrese la contraseña:");
                boolean t = false;
                for (Usuario m : lista) {
                    if (m.getUsername().equalsIgnoreCase(usuario) && m.getPassword().equalsIgnoreCase(password)) {
                        t = true;
                        JOptionPane.showMessageDialog(null, "INGRESO EXITOSAMENTE");
                    }
                    String opcion;
                    int amigos = 0;
                    String add = "";

                    opcion = JOptionPane.showInputDialog("a-Agregar Amigos \n"
                            + "b-solicitudes \n "
                            + "c-Enviar mensajes \n"
                            + "d-buzon \n"
                            + "e-Eliminar mensajes \n"
                            + "f-Eliminar amigos \n");

                    switch (opcion) {

                        case "a":
                            String s2 = "";
                            for (Usuario y : lista) {
                                if (y instanceof Usuario) {
                                    s2 += "" + lista.indexOf(y) + "- " + y + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, s2);
                            System.out.println("");
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Agregar Amigos"));
                            
                            int cont = 0;
                            boolean friend = false;

                            for (Usuario z : lista) {
                                if (z.getUsername().equalsIgnoreCase(usuario)) {
                                    friend = true;
                                }

                                if (friend == false) {
                                    JOptionPane.showMessageDialog(null, "El usuario no esta disponible");

                                }
                                if (friend == true) {
                                    if (cont == pos) {
                                        for (Usuario lista1 : lista) {
                                            lista1.getSolicitudes(new solicitudes(s2, lista));
                                        }
                                    }
                                    cont++;
                                }

                            }

                            break;
                        case "b":
                            String s3= "";
                            ArrayList<solicitudes> lista2 = new ArrayList();
                            for (solicitudes q : lista2) {
                                if (q instanceof solicitudes) {
                                    s3 += "" + lista.indexOf(q) + "- " + q + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, s3);

                            break;

                        case "c":
                            JOptionPane.showMessageDialog(null, "MENSAJES");
                            Date fecha = new Date();
                            JOptionPane.showMessageDialog(null, fecha);
                            String mensajes = "";
                            
                            mensajes = JOptionPane.showInputDialog("Envie un mensaje");

                            break;
                        case "d":
                            break;

                        case "e":
                            break;

                        case "f":

                            break;

                        case "g":
                            break;
                    }

                }
            }
        }

    }
}
