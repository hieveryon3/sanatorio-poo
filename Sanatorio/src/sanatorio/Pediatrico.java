
package sanatorio;


public class Pediatrico extends Paciente{
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
}
