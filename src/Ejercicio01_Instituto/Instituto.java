/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01_Instituto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

    public Instituto(String codigo, String nombre, String direccion, String ciudad) throws FileNotFoundException {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.plantilla = new ArrayList<Personal>();

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

    public Personal bucarEmpleado_nrp(String nrp) {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i).getNrp().equals(nrp)) {
                return plantilla.get(i);
            }
        }
        return null;
    }
//Personal buscarEmpleado(int telefono): Buscará en el ArrayList el objeto cuyo teléfono coincida con pasado por parámetro, devolviendo el objeto si existe o null.Ç

    public Personal bucarEmpleado_tlf(int tlf) {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i).getNrp().equals(tlf)) {
                return plantilla.get(i);
            }
        }
        return null;
    }
//Personal director(): devolverá el director, buscándolo en el ArrayList.

//verDatos: mostrará los datos de tipo String del instituto.
    public void verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instituto");
        sb.append(" codigo ").append(codigo);
        sb.append(" nombre ").append(nombre);
        sb.append(" direccion ").append(direccion);
        sb.append(" ciudad ").append(ciudad);
        sb.append(" plantilla ").append(plantilla);
        System.out.println(sb.toString());
    }
//boolean altaEmpleado(Personal p): Añadirá al ArrayList el objeto recibido como parámetro.

    public boolean altaEmpleado(Personal p) {
        if (plantilla.add(p)) {
            return true;
        }
        return false;

    }
//boolean bajaEmpleado(Personal p): Eliminará del ArrayList el objeto recibido como parámetro, si existe.

    public boolean bajaEmpleado(Personal p) {
        if (plantilla.remove(p)) {
            return true;
        }

        return false;
    }
//Los métodos void verLaborales(), verProfesores() y verPersonal(), que mostrarán, respectivamente: sólo el personal laboral, sólo los profesores o todo el personal del centro.

    public void verLaborales() {

        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof Laboral) {
                plantilla.get(i).verDatos();
            }
        }
    }

    public void verProfesores() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof Profesor) {
                plantilla.get(i).verDatos();
            }
        }
    }

    public void verPersonal() {
        for (int i = 0; i < plantilla.size(); i++) {
            plantilla.get(i).verDatos();
        }
    }
//Los métodos void guardarLaborales(), guadarInterinos() y guardarTitulares() que guardarán en su correspondiente archivo, la información del ArrayList (Laborales.dat, Interinos.dat y Titulares.dat).

    public void guardarLaborales() throws FileNotFoundException, IOException {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Laboral.dat");
            salida = new ObjectOutputStream(salida);
            for (Personal p : plantilla) {
                if (p instanceof Laboral) {
                    salida.writeObject(p);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                salida.close();
                fichero.close();
            } catch (IOException x) {
            }
        }
    }

    public void guadarInterinos() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof ProfesorInterino) {
            }
        }
    }

    public void guardarTitulares() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof ProfesorTitular) {
            }
        }
    }
//Los métodos void leerLaborales(), leerInterinos() y leerTitulares(), que leerán de su correspondiente archivo, la información almacenándola en el ArrayList.

    public void leerLaborales() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof Laboral) {
            }
        }
    }

    public void leerInterinos() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof ProfesorInterino) {
            }
        }
    }

    public void leerTitulares() {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i) instanceof ProfesorTitular) {
            }
        }
    }
//pedirDatosEmpleado: pedirá por teclado todos los datos de un nuevo Empleado, preguntando si es laboral, interino o titular, devolviendo un objeto de la clase Personal.

    public Personal pedirDatosEmpleado() {
        return null;
    }
}
