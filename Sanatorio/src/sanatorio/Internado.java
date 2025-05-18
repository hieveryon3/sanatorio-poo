
package sanatorio;

import sanatorio.interfaces.Administracion;
import sanatorio.interfaces.ClinicaMedica;
import sanatorio.interfaces.Nutricion;

public class Internado extends Paciente implements Administracion, Nutricion, ClinicaMedica{
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

    @Override
    public String getTipoDeDieta() {
        return "Vegetariana";
    }

    @Override
    public String solicitarRX() {
        return "Radiografía solicitada por el paciente " + nombre + ". Con DNI: " + dni;
    }

    @Override
    public String solicitarAnalisisSangre() {
        return "Análisis de sangre completo solicitado por el paciente " + nombre +". Con DNI: " + dni;
    }
}
