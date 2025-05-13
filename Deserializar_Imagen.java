import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Deserializar_Imagen {
    public static void main(String[] args) {
        try {
            // Leer los bytes del archivo serializado
            File archivo = new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\imagen_serializada.dat");
            byte[] bytesImagen = new byte[(int) archivo.length()];

            try (FileInputStream fis = new FileInputStream(archivo)) {
                int leidos = fis.read(bytesImagen);
                if (leidos != bytesImagen.length) {
                    System.err.println("❌ No se leyeron todos los bytes correctamente.");
                    return;
                }
            }

            // Reconstruir la imagen
            ByteArrayInputStream bais = new ByteArrayInputStream(bytesImagen);
            BufferedImage imagen = ImageIO.read(bais);

            if (imagen == null) {
                System.err.println("❌ No se pudo reconstruir la imagen: datos corruptos o formato incorrecto.");
                return;
            }

            // Guardar imagen reconstruida
            ImageIO.write(imagen, "png", new File("generado/nuevafotillo.png"));
            System.out.println("✅ Imagen deserializada correctamente como 'nueva_foto.jpg'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

