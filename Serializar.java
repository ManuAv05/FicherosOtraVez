import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) {
        Persona persona = new Persona("Manuel" , 19);

        try{
            FileOutputStream entrada = new FileOutputStream("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado\\persona.ser");
            ObjectOutputStream salida = new ObjectOutputStream(entrada);

            salida.writeObject(persona);

            entrada.close();
            salida.close();

            System.out.println("Objeto serializado");


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
