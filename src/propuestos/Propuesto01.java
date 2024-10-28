
package propuestos;

/**
 *
 * 1-Crear un programa en Java que permita registrar ventas dentro de una matriz de 4x4.
 * Visualizar el total de las ventas.
 */
import java.util.Scanner;
public class Propuesto01 {
   public static void main(String[] args) {
        
        double[][] ventas = new double[4][4];
        double totalVentas = 0.0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Registro de Ventas (4x4)");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la venta para la posición [" + i + "][" + j + "]: ");
                ventas[i][j] = lectura.nextDouble();
                totalVentas += ventas[i][j];
            }
        }
        
        System.out.println("\nTotal de las ventas: $" + totalVentas);
                
    }

    
}
