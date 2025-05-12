import java.io.File;

public class ListarDirectorio {
    public static void main(String[] args) {
        File directorioActual = new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez");

        File[] elementos = directorioActual.listFiles();

        if(elementos != null){
            for(File elemento : elementos){
                if(elemento.isFile()){
                    System.out.println(elemento.getName() + "- Archivo");
                } else if (elemento.isDirectory()) {
                    System.out.println(elemento.getName() + "- Directorio");
                }
            }
        }else{
            System.out.println(" No se ha podido listar ");
        }


    }
}
