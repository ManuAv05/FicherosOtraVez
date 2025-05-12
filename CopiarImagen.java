import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarImagen {
    public static void main(String[] args) {
        String origen = "C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\vini.png";
        String copia = "C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\vinicopia.png";

        try{
            FileInputStream fis = new FileInputStream(origen);
            FileOutputStream fos = new FileOutputStream(copia);

            fis.transferTo(fos);


            System.out.println("Archivo copiado correctamente");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
