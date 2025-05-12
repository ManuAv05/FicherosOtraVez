
import java.io.FileWriter;
import java.io.IOException;

public class EscribirSobreYaEscrito {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt", true);

            escritor.write("\n hola hola hola \n");
            escritor.write("adio adio adio adio \n");

            escritor.close();

            System.out.println("Agregado con exito");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
