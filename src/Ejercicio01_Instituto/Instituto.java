/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

import java.util.ArrayList;

/**
 *
 * @author DAM_T
 */
public class Instituto {

    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private ArrayList<Personal> plantilla;

    public Instituto(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public ArrayList<Personal> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Personal> plantilla) {
        this.plantilla = plantilla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
//Personal buscarEmpleado(String nrp): Buscará en el ArrayList el objeto cuyo NRP con el String pasado por parámetro, devolviendo el objeto si existe o null.

//Personal buscarEmpleado(int telefono): Buscará en el ArrayList el objeto cuyo teléfono coincida con pasado por parámetro, devolviendo el objeto si existe o null.
//Personal director(): devolverá el director, buscándolo en el ArrayList.
//verDatos: mostrará los datos de tipo String del instituto.
//boolean altaEmpleado(Personal p): Añadirá al ArrayList el objeto recibido como parámetro.
//boolean bajaEmpleado(Personal p): Eliminará del ArrayList el objeto recibido como parámetro, si existe.
//Los métodos void verLaborales(), verProfesores() y verPersonal(), que mostrarán, respectivamente: sólo el personal laboral, sólo los profesores o todo el personal del centro.
//Los métodos void guardarLaborales(), guadarInterinos() y guardarTitulares() que guardarán en su correspondiente archivo, la información del ArrayList (Laborales.dat, Interinos.dat y Titulares.dat).
//Los métodos void leerLaborales(), leerInterinos() y leerTitulares(), que leerán de su correspondiente archivo, la información almacenándola en el ArrayList.
//pedirDatosEmpleado: pedirá por teclado todos los datos de un nuevo Empleado, preguntando si es laboral, interino o titular, devolviendo un objeto de la clase Personal.

    
}
