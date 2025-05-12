import java.io.FileReader;
import java.io.IOException;

public class LeerCaracter {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt";

        try{
            FileReader lector = new FileReader(ruta);
            int caracter;
            while ((caracter = lector.read())!= -1){
                System.out.print((char) caracter);
            }

            lector.close();
        }catch (IOException e){
            System.out.println("No se ha leer el archivo" + e.getMessage());
        }
    }
}
