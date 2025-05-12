import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarPalabra {
    public static void main(String[] args) {
        int total_palabras = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt"));

            String lineas;
            while ((lineas = lector.readLine()) != null){
                String[] palabras = lineas.split("\\s+");
                total_palabras += palabras.length;
            }

            lector.close();

            System.out.println("El archivo tiene " + total_palabras + "palabras");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
