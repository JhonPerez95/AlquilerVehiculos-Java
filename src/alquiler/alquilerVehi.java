//encapsulamiento   se encarga de ocultar nuestros a tributos y funciones ...solo pueden ser accedidos desde la misma clase..ya
//ocultamiento      variables private no las ve la clase ppla...ya
//Es la capacidad de ocultar los detalles internos del comportamiento de una clase y exponer sólo los detalles que sean necesarios para el resto del sistema.
//polimorfismo      polimorfirmos en la misma clase se denomina sobre carga de metodos..ya
//herencia          se necsitan dos clases alquilerVehi extends...ya
//abstracción         
//modularidad       las operaciones ejecutadas por cada vehiculo...ya 
//exepciones verificadas que resultan de IOExeption...ya
// no dependen del programador pero java aobliga a la solucion
//exepciones NO verificadas que resutan de runTimeExeption 
// (las soluciona el programados como una division de un entoreo en 0

package alquiler;

import javax.swing.JOptionPane;

public class alquilerVehi extends principal {

    int coche = 0;
    int microbus = 0;
    int carga = 0;
    int camion = 0;
    int numDias = 0; // atributos que hererada el metodo
    double result = 0;
    String placa = "";
    int tipoVehiculo = 0; // atributos que hererada el metodo
    int tipo = 0;

    // exepciones verificadas que resultan de IOExeption
    // no dependen del programador pero java aobliga a la solucion
    // exepciones NO verificadas que resutan de runTimeExeption
    // (las soluciona el programados como una division de un entoreo en 0

    public alquilerVehi(int numDias, int tipoVehiculo, String placa) {
        this.numDias = numDias;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
    }

    public alquilerVehi(String placa) { // polimorfirmos en la misma clase se
        // denomina sebre carga de metodoso
        this.placa = placa;
    }

    private void coche() { // metodos o funciones //encapsulamiento
        result = numDias * (50 + 1.5); // modularidad

        JOptionPane.showMessageDialog(null,
                "Vehiculo tipo Automovil:\n"
                        + "- Valor: " + result + "\n"
                        + "- Dias Alquilados: " + numDias + "\n"
                        + "- Placa Vehiculo: " + placa);

        // System.out.println("valor: " + result + " por : " + numDias + " dias a
        // alquilar");
    }

    private void microbus() { // metodos o funciones
        result = numDias * (50 + 1.5);

        JOptionPane.showMessageDialog(null,
                "Vehiculo tipo Microbus:\n"
                        + "- Valor: " + result + "\n"
                        + "- Dias Alquilados: " + numDias + "\n"
                        + "- Placa Vehiculo: " + placa);
    }

    private void carga() { // metodos o funciones
        result = numDias * (50 + 20);
        JOptionPane.showMessageDialog(null,
                "Vehiculo tipo Furgon de carga:\n"
                        + "- Valor: " + result + "\n"
                        + "- Dias Alquilados: " + numDias + "\n"
                        + "- Placa Vehiculo: " + placa);
    }

    private void camion() {// metodos o funciones
        result = numDias * 50;
        JOptionPane.showMessageDialog(null,
                "Vehiculo tipo Camion:\n"
                        + "- Valor: " + result + "\n"
                        + "- Dias Alquilados: " + numDias + "\n"
                        + "- Placa Vehiculo: " + placa);

    }

    public void tipo() { // metodos o funciones
        if (tipoVehiculo == 1) {
            coche();// llamo una funcion
        } else if (tipoVehiculo == 2) {
            microbus(); // llamo una funcion
        } else if (tipoVehiculo == 3) {
            carga();// llamo una funcion
        } else if (tipoVehiculo == 4) {
            camion(); // llamo una funcion
        } else {
            JOptionPane.showMessageDialog(null, "Vehiculo no existe!");
            System.exit(0);
        }
    }
}
