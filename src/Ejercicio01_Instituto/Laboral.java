/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

/**
 *
 * @author DAM_T
 */
public class Laboral extends Personal {

    private String categoria;
    private String turno;

    public Laboral(String categoria, String turno, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.categoria = categoria;
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double salario() {
        return 1000;
    }

    @Override
    public double complemento() {
        //Administrativo, 300€; Ordenanza, 200€; y Limpieza, 100€.
        switch (categoria) {
            case "Administrativo" -> {
                return 300;
            }
            case "Ordenanza" -> {
                return 200;
            }
            case "Limpieza" -> {
                return 100;
            }
            default ->
                throw new AssertionError();
        }
            }


    
    
    
    
    public String verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laboral");
        sb.append("categoria=").append(categoria);
        sb.append("turno=").append(turno);
        return sb.toString();
    }

}
