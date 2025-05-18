
package sanatorio;

//Creamos la clase abstracta Paciente de manera pública, ya que las clases que sean heredadas deben acceder a sus atributos y métodos.
public abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;
    
    public Paciente(String dni, String nombre, String obraSocial ){
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
}
