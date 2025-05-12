import java.io.File;

public class EliminarArchivo {
    public static void main(String[] args) {

        File archivo = new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivoaeliminar.txt");

        if(archivo.delete()){
            System.out.println("Archivo eliminado con exito");
        }else{
            System.out.println("no se pudo eliminar el archivo");
        }
    }
}
