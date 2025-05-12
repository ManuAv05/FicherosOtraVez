import com.sun.source.tree.WhileLoopTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPalabra {
    public static void main(String[] args) {
        String palabra_buscada = "te";
        int contador = 0;

        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                String[] palabras = linea.toLowerCase().split("\\s+");

                for(String palabra : palabras){
                    if(palabra.equals(palabra_buscada)){
                        contador++;
                    }
                }
            }
            System.out.println("La palabra buscada : " +" "+ palabra_buscada + " aparece " + contador);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
