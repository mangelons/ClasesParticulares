package clasesparticulares;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Alumno {
    
    private String nombre;
    private String apellidos;
    private String asignatura;
    private String email;
    private double precio;
    private ArrayList<Clase> clases;

    public Alumno(String nombre, String apellidos, String email, String asignatura, double precio, ArrayList clases) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.asignatura = asignatura;
        this.precio = precio;
        this.clases = clases;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addClase(Clase c) {
        clases.add(c);
    }
    
    public void eliminarClase(Clase c)
    {
        try
        {
            clases.remove(c);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar la clase", "Error al eliminar la clase: "+c.toString(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre+" "+apellidos;
    }
    
    

}
