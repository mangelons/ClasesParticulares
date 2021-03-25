package clasesparticulares;

import java.util.Date;

/**
 *
 * @author Miguel Angel Torres Font
 */
public class Clase {
    private Date dia;
    private double horas;
    private String concepto;
    private boolean pagada;

    public Clase(Date dia, double horas, String concepto) {
        this.dia = dia;
        pagada = false;
        this.horas = horas;
        this.concepto = concepto;
    }

    public Date getDia() {
        return dia;
    }

    public void pagarClase()
    {
        pagada = true;
    }
    
    public boolean getPagada()
    {
        return pagada;
    }
    public void setDia(Date dia) {
        this.dia = dia;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    @Override
    public String toString() {
        return horas+" horas ---- "+concepto + " --- "+dia;
    }
    
    
}
