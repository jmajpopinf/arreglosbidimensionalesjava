
import java.io.File;
import java.util.Scanner;

//pruebaLiboCalificaciones crea un objeto LibroCalificaciones, usando un arreglo bidimensional
//de calificaciones, y despues invoca al metodo procesarCalificaciones para analizarlas
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        File file=new File("Datos.txt");
        //arreglo bidimensional de calificacines de estudiantes
        //int[][] arregloCalif = {{87,96,70},{68,87,90},{94,100,90},{100,81,82},{89,56,98},{67,88,90},{67,88,91},{66,99,100},{88,77,88},{66,93,84}};
        
        String matriz[][] = new String[1][3];
        Scanner consola = new Scanner(System.in);
            for (int x=0; x < matriz.length; x++) {
                for (int y=0; y < matriz[x].length; y++) {
                    System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                    matriz[x][y] = consola.nextLine();
                }
            }
            
            for (int x=0; x < matriz.length; x++) {
                for (int y=0; y < matriz[x].length; y++) {
                    System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
                }
            }
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("CS101 Introduccion a la programacion en java",matriz);
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
        miLibroCalificaciones.GuardarDatos(file, matriz);
        
    }
}
