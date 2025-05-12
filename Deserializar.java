import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {
    public static void main(String[] args) {
        try{
            FileInputStream archivo = new FileInputStream("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\persona.ser");
            ObjectInputStream entrada = new ObjectInputStream(archivo);

            Persona persona = (Persona) entrada.readObject();

            archivo.close();
            entrada.close();

            System.out.println("Objeto deserializado con exito");
            System.out.println(persona);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
