package clasesparticulares;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Sistema {

    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    
    public static void cargarDatos()
    {
        XStream xstream;
        xstream = new XStream(new DomDriver());
        xstream.alias("alumno", Alumno.class);
        xstream.alias("clase", Clase.class);
        
        try {
            FileInputStream file_input_xml = new FileInputStream(new File("src/datos.xml"));
            alumnos = (ArrayList) xstream.fromXML(file_input_xml);
            
            if(alumnos == null){
                System.out.println("ERROR: No se encuentra alumnado ni clases");
                System.exit(-1);
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Nuevo ingreso en la aplicacion", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
        }  
    }
    
    public static void main(String[] args) {
        cargarDatos();
        Vista v = new Vista(alumnos);
        v.setVisible(true);
    }

}
