
package sanatorio;

import sanatorio.interfaces.Administracion;

public class Internado extends Paciente implements Administracion{
    protected String habitacion;
    protected String presionArterial;
    protected String rh;
    
    public Internado(String dni, String nombre, String obraSocial, String presionArterial, String habitacion, String rh){
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.habitacion = habitacion;
        this.rh = rh;
    }

    @Override
    public String getCoberturaOS() {
        return obraSocial;
    }

    @Override
    public double getDescuento() {
        return 0.05;
    }

    @Override
    public String getVademecum() {
        return "Paracetamol, Ibuprofeno";
    }
}
