
package alquiler;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class principal {// herencia minimo deben existir dos clases

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String placa = JOptionPane.showInputDialog(null,
                "------------ALQUILER VEHICULO-----------\n"
                        + "Ingresar la placa del vehiculo\n");

        int numDias = Integer.parseInt(JOptionPane.showInputDialog(null, "------------ALQUILER VEHICULO-----------\n"
                + "Ingrese dias a alquilar:"));

        int tipoVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null,
                "------------ALQUILER VEHICULO-----------\n"
                        + "Ingrese Tipo Vehiculo: \n 1. Automovil \n 2. Microbus \n 3. Furgon \n 4. Camion"));

        // System.out.println("Ingrese placa:");
        // String placa = entrada.nextLine();
        // System.out.println("Ingrese dias a alquilar:");
        // int numDias = entrada.nextInt();
        // System.out.println("Ingrese Tipo Vehiculo: \n 1. Automovil \n 2. Microbus \n
        // 3. Furgon \n 4. Camion");
        // int tipoVehiculo = entrada.nextInt();

        alquilerVehi mensajero = new alquilerVehi(numDias, tipoVehiculo); // polimorfismo
        mensajero.tipo();

        System.out.println("Placa: " + placa);
    }
}