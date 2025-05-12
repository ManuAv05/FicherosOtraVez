import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt";


        File lector = new File(ruta);
        File archivoNuevo = new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivorenombrado.txt");

        if(lector.renameTo(archivoNuevo)){
            System.out.println("Archivo renombrado con exito");
        }
        else{
            System.out.println("No se ha podido renombrar el archivo");
        }
    }
}
