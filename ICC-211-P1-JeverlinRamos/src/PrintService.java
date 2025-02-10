public class PrintService {

    private PrintQueue imprimirCola;

    // constructor
    public PrintService() {

        this.imprimirCola = new PrintQueue();

    }

    // Agregar un trabajo a la cola
    public void agregarTrabajo(String usuario, String hora, char prioridad) {

        // Verificar si el trabajo tiene una prioridad, sino ponerle una por defecto
        if (prioridad != 'L' && prioridad != 'M' && prioridad != 'H') {
            prioridad = 'M';
        }

        PrintJob nuevoTrabajo = new PrintJob(usuario, hora, prioridad);
        imprimirCola.agregarTrabajo(nuevoTrabajo);
        System.out.println("Se agrego un nuevo trabajo: " + nuevoTrabajo);

    }

    // Procesa el trabajo
    public void procesarTrabajos() {

        PrintJob trabajoProcesado = imprimirCola.procesarTrabajo();
        if (trabajoProcesado != null) {
            System.out.println("Procesando: " + trabajoProcesado);
        } else {
            System.out.println("No se encuentran trabajos");
        }

    }

    // Imprime los trabajos en cola
    public void mostrarCola() {

        System.out.println("Cola - Trabajos: ");
        imprimirCola.mostrarCola();

    }



}
