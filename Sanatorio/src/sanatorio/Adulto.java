
package sanatorio;

import sanatorio.interfaces.Administracion; // importamos la interfaz administracion
import sanatorio.interfaces.ClinicaMedica;


public class Adulto extends Paciente implements Administracion, ClinicaMedica{ //utilizamos implements y el nombre de la interfaz para implementar en la clase esos metodos
    protected String presionArterial;
    protected double altura;
    protected double peso;
    
    public Adulto(String dni, String nombre, String obraSocial, String presionArterial, double altura, double peso){
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }
    @Override
    public String getCoberturaOS(){
        return obraSocial;
    }
    
    @Override
    public double getDescuento(){
        return 0.05;
    }
    
    @Override
    public String getVademecum(){
        return "Paracetamol, Ibuprofeno";
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
