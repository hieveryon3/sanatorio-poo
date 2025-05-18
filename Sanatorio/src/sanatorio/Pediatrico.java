
package sanatorio;

import sanatorio.interfaces.Administracion;
import sanatorio.interfaces.Nutricion;

public class Pediatrico extends Paciente implements Administracion, Nutricion{
    //Utilizamos extends para heredar un atributos y metodos de una clase
    protected double peso;
    protected String celular;
    protected String tutor;
    
    public Pediatrico (String dni, String nombre, String obraSocial, double peso, String celular, String tutor){
        super(dni, nombre, obraSocial); 
        //super(...) se usa dentro del constructor de una subclase para llamar al constructor de la clase padre (la clase de la que hereda).
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
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
        return "Hipocalórica";
    }
}
