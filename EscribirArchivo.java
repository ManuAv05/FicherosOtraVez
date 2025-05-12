import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt");
            escritor.write("Hola zahiri, ere un bb tonti");
            System.out.println("Archivo creado con exito");
            escritor.close();
        }catch (IOException e){
            System.out.println("No se ha podido generar el archivo" + e.getMessage());
        }
    }
}
