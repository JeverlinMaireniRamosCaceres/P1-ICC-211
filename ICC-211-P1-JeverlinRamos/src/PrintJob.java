public class PrintJob {

    // Atributos
    String usuario;
    String hora;
    char prioridad;

    // Constructor
    public PrintJob(String usuario, String hora, char prioridad) {
        this.usuario = usuario;
        this.hora = hora;
        this.prioridad = prioridad;
    }

    // Metodos getter y setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "usuario='" + usuario + '\'' + ", hora='" + hora + '\'' + ", prioridad=" + prioridad + '}';
    }

}
