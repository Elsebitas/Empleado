/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

import empleado.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author tibio
 */
public class Procesos {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("", 0, "", 0);
        Empleado empleado2 = new Empleado("", 0, "", 0);
        Empleado empleado3 = new Empleado("", 0, "", 0);
        Empleado empleado4 = new Empleado("", 0, "", 0);
        Empleado empleado5 = new Empleado("", 0, "", 0);
        
        JOptionPane.showMessageDialog(null, "Empleado 1");
        empleado1.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        empleado1.setDireccion(JOptionPane.showInputDialog("Digite la direccion"));
        empleado1.setTelefono((int) Long.parseLong(JOptionPane.showInputDialog("Digite el telefono")));
        
        JOptionPane.showMessageDialog(null, "Empleado 2");
        empleado2.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        empleado2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        empleado2.setDireccion(JOptionPane.showInputDialog("Digite la direccion"));
        empleado2.setTelefono((int) Long.parseLong(JOptionPane.showInputDialog("Digite el telefono")));
        
        JOptionPane.showMessageDialog(null, "Empleado 3");
        empleado3.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        empleado3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        empleado3.setDireccion(JOptionPane.showInputDialog("Digite la direccion"));
        empleado3.setTelefono((int) Long.parseLong(JOptionPane.showInputDialog("Digite el telefono")));
        
        JOptionPane.showMessageDialog(null, "Empleado 4");
        empleado4.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        empleado4.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        empleado4.setDireccion(JOptionPane.showInputDialog("Digite la direccion"));
        empleado4.setTelefono((int) Long.parseLong(JOptionPane.showInputDialog("Digite el telefono")));
        
        JOptionPane.showMessageDialog(null, "Empleado 5");
        empleado5.setNombre(JOptionPane.showInputDialog("Digite el nombre"));
        empleado5.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad")));
        empleado5.setDireccion(JOptionPane.showInputDialog("Digite la direccion"));
        empleado5.setTelefono((int) Long.parseLong(JOptionPane.showInputDialog("Digite el telefono")));
        
        String pregunta;
        int opcion;
        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Que empleado desea ver:\n 1. Empleado 1\n 2. Empleado 2\n 3. Empleado 3\n 4. Empleado 4\n 5. Empleado 5"));
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Nombre: "+empleado1.getNombre() +"\n"+ empleado1.getEdad() 
                            +"\n"+ empleado1.getDireccion() +"\nTelefono: "+ empleado1.getTelefono());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Nombre: " + empleado2.getNombre() +"\nEdad: "+ empleado2.getEdad() 
                            +"\nDireccion: "+ empleado2.getDireccion() +"\nTelefono: "+ empleado2.getTelefono());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Nombre: " + empleado3.getNombre() +"\nEdad: "+ empleado3.getEdad() 
                            +"\nDireccion: "+ empleado3.getDireccion() +"\nTelefono: "+ empleado3.getTelefono());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Nombre: " + empleado4.getNombre() +"\nEdad: "+ empleado4.getEdad() 
                            +"\nDireccion: "+ empleado4.getDireccion() +"\nTelefono: "+ empleado4.getTelefono());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Nombre: " + empleado5.getNombre() +"\nEdad: "+ empleado5.getEdad() 
                            +"\nDireccion: "+ empleado5.getDireccion() +"\nTelefono: "+ empleado5.getTelefono());
                    break;
                    
            }
          
            pregunta = JOptionPane.showInputDialog("Desea buscar otro empleado (Si/No)");
        } while (pregunta == "si" || pregunta == "SI");
        
    }
}
