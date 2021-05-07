
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class LibroCalificaciones {
    private String nombreDelCurso; //Nombre del curso que representa este libro
    private String[][] matriz; //arreglo bidimensional de calificaciones de estudiantes
    
    //el constructor con dos argumentos inicializa nombreDelCurso y el arreglo calificaciones
    
    public LibroCalificaciones(String nombre, String[][] arregloMatriz){
        nombreDelCurso=nombre; //inicializa nombreDelCurso
        matriz=arregloMatriz; // almacena calificaciones
        //letras=le;
    }//fin del constructor de LibroCalificaciones con dos argumentos
    
    //metodo para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }//fin del metodo esteblecerNombreDelCurso
    
    //metodo para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }//fin del metodo obtenerNombreDelCurso
    
    //muestra un mensaje de bienvenida al usuario de libroCalificaciones
    public void mostrarMensaje(){
        //obtenerNombreDelCurso obtiene el nombre del curso
        System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n\n", obtenerNombreDelCurso());
    }
    
    //realiza varias operaciones sobrelos datos
    public void procesarCalificaciones(){
        //imprime el arreglo de calificaciones
        imprimirCalificaciones();
    }
    
    //imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones(){
        System.out.println("las calificaciones son:\n");
        System.out.print("                ");//alinea encabezados de columnas
        
        //crea un encabezado de columna para cada una de las pruebas
        for(int prueba=0; prueba<matriz[0].length;prueba++){
           System.out.printf("prueba %s ", prueba+1);
           
        }
        
        //crea filas/columnas de texto que representan el arreglo calificaciones
        for(int estudiante = 0;estudiante<matriz.length; estudiante++){
            System.out.printf("\nEstudiante %2d", estudiante+1);
            for(String prueba: matriz[estudiante]){//imprime calificaciones de estudiante
                System.out.printf("%8s", prueba);
            }
        }
    }
    
    
    
    public void GuardarDatos(File file, String[][] arregloCalif){
                
        if(!file.exists()){
            try{
            file.createNewFile();
            System.out.println(file.getName()+" Ha sido creado");
            
                /*Escribe en el fichero la cadena que recibe la función.
                 *el string "\r\n" significa salto de linea*/
                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true), "utf-8"))) {
                    /*Escribe en el fichero la cadena que recibe la función.
                    *el string "\r\n" significa salto de linea*/
                    Fescribe.write(Arrays.toString(arregloCalif) + "\r\n");  
                    //Cierra el flujo de escritura  
                }
            }
            catch(IOException ex){
                System.out.print("error");
            }
        }
        
        
    }
    
}
