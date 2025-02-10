import java.util.LinkedList;

public class PrintQueue {
    private LinkedList<PrintJob> trabajosImpresion;

    public PrintQueue() {

        this.trabajosImpresion = new LinkedList<>();
    }

    public void agregarTrabajo(PrintJob nuevoTrabajo) {

        if (trabajosImpresion.isEmpty()) {
            trabajosImpresion.add(nuevoTrabajo);
        }

        int indice = 0;
        while (indice < trabajosImpresion.size()) {
            PrintJob actual = trabajosImpresion.get(indice);

            // Comparar la prioridad
            if ((nuevoTrabajo.getPrioridad() == 'H' && actual.getPrioridad() != 'H') || (nuevoTrabajo.getPrioridad() == 'M' && actual.getPrioridad() == 'L')) {
                break;
            }

            // Si la prioridad es igual, se debe ordenar por hora
            if (nuevoTrabajo.getPrioridad() == actual.getPrioridad() && nuevoTrabajo.getHora().compareTo(actual.getHora()) < 0) {
                break;
            }

            indice++;
        }

        trabajosImpresion.add(indice, nuevoTrabajo);
    }

    // Elimina los nodos
    public PrintJob procesarTrabajo() {
        if (!trabajosImpresion.isEmpty()) {
            return trabajosImpresion.removeFirst();
        }
        return null;
    }

    // Muestra los trabajos
    public void mostrarCola() {
        if (trabajosImpresion.isEmpty()) {
            System.out.println("La cola esta vacia");
            return;
        }

        System.out.println("Cola de impresion:");
        for (PrintJob job : trabajosImpresion) {
            System.out.println(job);
        }

    }




}
