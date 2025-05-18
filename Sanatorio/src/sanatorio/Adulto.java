
package sanatorio;


public class Adulto extends Paciente{
    protected String presionArterial;
    protected double altura;
    protected double peso;
    
    public Adulto(String dni, String nombre, String obraSocial, String presionArterial, double altura, double peso){
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }
}
