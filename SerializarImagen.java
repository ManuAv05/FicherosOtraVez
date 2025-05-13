import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class SerializarImagen {
    public static void main(String[] args) {
        try{

            BufferedImage imagen = ImageIO.read(new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\vini.png"));
            if (imagen == null) {
                System.err.println("❌ No se pudo leer la imagen original.");
                return;
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(imagen, "png", baos);
            byte[] bytesimagen = baos.toByteArray();

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\imagen_serializada.dat");
            fos.write(bytesimagen);
            fos.close();

            System.out.println( "Imagen serializada correctamente");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
