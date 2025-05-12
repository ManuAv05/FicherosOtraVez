import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        menu();
    }
    public static void menu() throws IOException {
        System.out.println("== GESTOR DE CONTACTOS ==");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Listar todos los contactos");
        System.out.println("5. Exportar JSON");
        System.out.println("6. Salir");


        int opcion = 0;
        while (opcion != 6 ){
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();
            if (opcion == 1){
                Contacto.agregarContacto();
                System.out.println("Contacto Agregado con exito ");

            }
            else if(opcion == 2){
                sc.nextLine(); // ← Esto va primero, para limpiar el buffer
                System.out.println("Dime el nombre del contacto que deseas eliminar");
                String nombre_eliminar = sc.nextLine().trim();
                Contacto.eliminarContacto(nombre_eliminar);
            }
            else if (opcion == 4){
                Contacto.mostrarLista();
            }
            else if (opcion == 3){
                sc.nextLine();
                System.out.println("Dime el nombre del contacto que deseas buscar");
                String nombre_buscar = sc.nextLine().trim();
                Contacto.buscarContacto(nombre_buscar);
            } else if (opcion == 5) {
                Contacto.exportarJson();
            } else if(opcion == 6)  {
                System.out.println("Saliendo...");
                break;
            }
            else{
                System.out.println("Opcion no valida, introduzca de nuevo un numero");
            }


        }


    }
}