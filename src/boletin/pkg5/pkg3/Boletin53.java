
package boletin.pkg5.pkg3;

import java.awt.BorderLayout;

/**
 *
 * @author David
 */
public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circ1 = new Circulo ();
            System.out.println("El área del círculo 1 es: "+ circ1.calcularArea());
        Circulo circ2 = new Circulo ();
            circ2.setRadio(14);
            System.out.println("El área del círculo 2 es: " + circ2.calcularArea());
            System.out.println("La longitud del círculo 2 es: "+ circ2.calcularLongitud());
    }
    
}
