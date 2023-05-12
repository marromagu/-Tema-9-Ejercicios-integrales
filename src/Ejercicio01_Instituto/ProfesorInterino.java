/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

/**
 *
 * @author DAM_T
 */
public class ProfesorInterino extends Profesor {

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
        return super.salario(0);
    }

    @Override
    public double complemento() {
        return 0;
    }

    public String verDatos() {//tipo void + super de la clase padre
        String txt = "Profesor Interino";
        return txt;
    }

}
