import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MostrarCSV {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\datos.csv";
        String linea;

        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));

            while((linea = lector.readLine()) != null){
                String[] columnas = linea.split(",");

                for(String valor : columnas){
                    System.out.printf("%-15s ", valor);
                }
                System.out.println();
            }

        }catch (IOException e){
            System.out.println("Error al mostrar CSV" + e.getMessage());
        }
    }
}
