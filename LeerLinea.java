import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerLinea {
    public static void main(String[] args) {

        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                System.out.println(linea);
            }

            lector.close();
        }catch(IOException e){
            System.out.println("No se ha podido leer el archivo");
        }
    }
}
