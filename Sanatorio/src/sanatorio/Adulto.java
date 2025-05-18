
package sanatorio;

import sanatorio.interfaces.Administracion; // importamos la interfaz administracion


public class Adulto extends Paciente implements Administracion{ //utilizamos implements y el nombre de la interfaz para implementar en la clase esos metodos
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
}
