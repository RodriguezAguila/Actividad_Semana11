
package propuestos;

/**
 *4.Crear un programa en Java que permita generar ventas aleatorias (1000-10000) y asignar los a una matriz de datos de 3 x 3.
 * Visualizar el total y el promedio de las ventas
 */
import java.util.Scanner;
public class Propuesto04 {
   public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double[][] ventas = new double[3][3];
        double totalVentas = 0.0;
        int numVentas = 3 * 3;       

        System.out.print("Ingrese una semilla inicial (número entero) para generar las ventas aleatorias: ");
        int semilla = lectura.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                semilla = (semilla * 32719 + 3) % 32749;  
                ventas[i][j] = 1000 + (semilla % 9001); 
                totalVentas += ventas[i][j];
                System.out.printf("Venta en posición [%d][%d]: $%.2f%n", i, j, ventas[i][j]);
            }
        }
       
        double promedioVentas = totalVentas / numVentas;
        
        System.out.printf("\nTotal de las ventas: $%.2f%n", totalVentas);
        System.out.printf("Promedio de las ventas: $%.2f%n", promedioVentas);
        
    }
    
}
