/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

/**
 *
 * @author JMRivera
 */
public abstract class Profesor extends Personal {

    private String especialidad;
    private String puesto;

    public Profesor(String especialidad, String puesto, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.especialidad = especialidad;
        this.puesto = puesto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void verDato() {
        System.out.println("------------ Profesor ------------");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Puesto: " + puesto);
    }

    public double salario(int salario) {
        return salario + 1800;// no recibe nada 
    }
    public void complementos(){
        //complemento: Si es Director, 800€; Jefe de Estudios, Vicedirector o Secretario, 400€; Jefe de Departamento, 50€; y Tutor, 25€.
        
    }

}
