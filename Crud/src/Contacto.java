import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacto {
    static Scanner sc = new Scanner(System.in);
    private String nombre;
    private int telefono;
    private String email;
    private static List<Contacto> lista_contactos = new ArrayList<>();

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        lista_contactos.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Contacto agregarContacto(){
        System.out.println("Ingrese el nombre del contacto");
        String nombre = sc.nextLine().trim();
        System.out.println("Ingrese el numero del telefono del contacto");
        int telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el correo electronico");
        String correo = sc.nextLine();

        return new Contacto(nombre, telefono, correo);

    }

    public static void eliminarContacto(String nombre_a_eliminar){
         for (Contacto contacto : lista_contactos){
             if (contacto.getNombre().equalsIgnoreCase(nombre_a_eliminar)){
                 lista_contactos.remove(contacto);
                 System.out.println("Contacto Eliminado " + nombre_a_eliminar);
                 return;
             }else {
                 System.out.println("Contacto no encontrado");
             }

         }
    }

    public static void mostrarLista(){
        if (lista_contactos.isEmpty()){
            System.out.println("No hay contactos");
        }
        else {
            System.out.println("==============Lista de contactos===============");
            for (Contacto c : lista_contactos){
                System.out.println("Nombre contacto : " + c.getNombre());
                System.out.println("Telefono contacto: " + c.getTelefono());
                System.out.println("Email contacto: " + c.getEmail());
                System.out.println("---------------------------------------");
            }
        }
    }

    public static void buscarContacto(String nombre_buscar){
        for(Contacto c : lista_contactos){
            if (c.getNombre().equalsIgnoreCase(nombre_buscar)){
                System.out.println("Nombre contacto : " + c.getNombre());
                System.out.println("Telefono contacto: " + c.getTelefono());
                System.out.println("Email contacto: " + c.getEmail());
                System.out.println("---------------------------------------");
            }
            else {
                System.out.println("No se ha encontrado el contacto");
            }

        }

    }
    public static void exportarJson() throws IOException {
            ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File("C:\\Users\\Manuel\\Desktop\\FicherosOtraVez\\generado"), lista_contactos);
        System.out.println("Contactos exportados correctamente");


    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }
}
