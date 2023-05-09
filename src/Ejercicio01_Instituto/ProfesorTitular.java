/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

/**
 *
 * @author DAM_T
 */
public class ProfesorTitular extends Profesor{
//Atributo 
    private boolean conDestino;
//Metodos

    public ProfesorTitular(String especialidad, String puesto, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(especialidad, puesto, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
    }

    public boolean isConDestino() {
        return conDestino;
    }

    public void setConDestino(boolean conDestino) {
        this.conDestino = conDestino;
    }

    @Override
    public double salario() {
        //salario: el del padre más 300€.
        return super.salario(300);
    }

    @Override
    public double complemento() {
        //complemento: se sumará al del padre: 50€ por cada trienio; si tiene destino, 300€.
        if (conDestino) {
            return salario()+300;
        }
        return salario();
    }
    //trienios
    @Override
   public void verDatos(){
        System.out.println("Profesor titular");
   }
}
