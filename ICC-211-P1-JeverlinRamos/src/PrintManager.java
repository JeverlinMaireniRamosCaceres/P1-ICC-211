import java.util.*;

public class PrintManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService printService = new PrintService();

        System.out.println("Cantidad de trabajos a ingresar: ");
        int cantidad = sc.nextInt();

        String usuario = "";
        String hora;
        char prioridad;

        for (int indice = 0; indice < cantidad; indice++) {
            System.out.println("Usuario: " );
            usuario = sc.nextLine();
            System.out.println("Hora (formato HH:mm): ");
            hora = sc.nextLine();
            System.out.println("Prioridad: (L - Baja, M - Media, H - Alta)");
            prioridad = sc.next().charAt(0);
            printService.agregarTrabajo(usuario, hora, prioridad);
        }


        // Mostrar la cola
        printService.mostrarCola();


    }
}