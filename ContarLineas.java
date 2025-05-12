import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        int contador_lineas = 0;

        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                contador_lineas++;
            }

            lector.close();
            System.out.println("El archivo tiene " + contador_lineas + " lineas");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
