public class ListaEnlazada<P> {

    Nodo cabeza;

    public void agregarNodo(int dato) {
        if(cabeza == null) {
            cabeza = new Nodo(dato);
        } else {
            Nodo actual = cabeza;
            while(actual != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = new Nodo(dato);
        }
    }


    public void imprimirLista() {
        Nodo actual = cabeza;
            while (actual != null) {
                System.out.println(actual.dato + " -> ");
                actual = actual.siguiente;
            }
        System.out.println("null");
    }

    public int size() {
        int tamaño = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            tamaño++;
            actual = actual.siguiente;
        }
        return tamaño;
    }

    public boolean isEmpty() {
        return cabeza == null;

    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
}
