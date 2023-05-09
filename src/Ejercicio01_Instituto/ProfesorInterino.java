/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

/**
 *
 * @author DAM_T
 */
public class ProfesorInterino extends Profesor{
 private boolean sustituto;

    public ProfesorInterino(boolean sustituto, String especialidad, String puesto, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(especialidad, puesto, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.sustituto = sustituto;
    }

    public boolean isSustituto() {
        return sustituto;
    }

    public void setSustituto(boolean sustituto) {
        this.sustituto = sustituto;
    }

    @Override
    public double salario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double complemento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     @Override
   public void verDatos(){
        System.out.println("Profesor Interino");
   }
    
}
