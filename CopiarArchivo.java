import java.io.*;

public class CopiarArchivo {
    public static void main(String[] args) {
        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocreado.txt"));
            BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\archivocopia.txt"));

            String linea;

            while ((linea = lector.readLine()) != null){
                escritor.write(linea);
                escritor.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
