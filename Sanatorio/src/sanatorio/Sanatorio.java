 
package sanatorio;

public class Sanatorio {

    public static void main(String[] args) {
        Pediatrico persona1 =  new Pediatrico ("23529134", "Emiliano Ojeda", "OSECAC", 65.5, "3765672351", "Dr. Gomez" );
        Adulto persona2 = new Adulto("87654321", "Maria Gomez", "Swiss Medical", "120/80", 1.65, 60);
        Internado persona3 = new Internado("11223344", "Carlos Ruiz", "Galeno", "130/85", "Habitación 101", "A+");

        System.out.println("=== Administración ===");
        System.out.println(persona1.nombre + ": OS = " + persona1.getCoberturaOS() + ", Descuento = " + persona1.getDescuento() + ", Vademecum = " + persona1.getVademecum());
        System.out.println(persona2.nombre + ": OS = " + persona2.getCoberturaOS() + ", Descuento = " + persona2.getDescuento() + ", Vademecum = " + persona2.getVademecum());
        System.out.println(persona3.nombre + ": OS = " + persona3.getCoberturaOS() + ", Descuento = " + persona3.getDescuento() + ", Vademecum = " + persona3.getVademecum());

        System.out.println("");

        System.out.println("=== Nutrición ===");
        System.out.println(persona1.nombre + ": Dieta = " + persona1.getTipoDeDieta());
        System.out.println(persona3.nombre + ": Dieta = " + persona3.getTipoDeDieta());

        System.out.println("");

        System.out.println("=== Clínica Médica ===");
        System.out.println(persona3.nombre + ": " + persona3.solicitarRX());
        System.out.println(persona3.nombre + ": " + persona3.solicitarAnalisisSangre());
        System.out.println(persona2.nombre + ": " + persona2.solicitarRX());
        System.out.println(persona2.nombre + ": " + persona2.solicitarAnalisisSangre());
    }
}
