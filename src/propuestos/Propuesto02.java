
package propuestos;

/**
 *2.Crear un programa en Java que permita registrar compras dentro de una matriz de 4x4.
 * Visualizar el total y el promedio de las compras.
 */
import java.util.Scanner;
public class Propuesto02 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double[][] compras = new double[4][4];
        double totalCompras = 0.0;
        int numCompras = 4 * 4;  

        System.out.println("Registro de Compras (4x4)");       
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese la compra para la posición [" + i + "][" + j + "]: ");
                compras[i][j] = lectura.nextDouble();
                totalCompras += compras[i][j];
            }
        }
        
        double promedioCompras = totalCompras / numCompras;
        
        System.out.println("\nTotal de las compras: $" + totalCompras);
        System.out.println("Promedio de las compras: $" + promedioCompras);
                
    }
}
    
