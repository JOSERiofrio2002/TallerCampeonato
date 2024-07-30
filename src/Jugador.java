public class Jugador extends Persona {
    private EstadisticasJugador estadisticasJugador;
    private Categoria categoria;
    private int partidosJugados;
    private int anotaciones;
    private int amonestaciones;

    // ... (otros métodos)

    public int getPartidosJugados() {
        return this.partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getAnotaciones() {
        return this.anotaciones;
    }

    public void setAnotaciones(int anotaciones) {
        this.anotaciones = anotaciones;
    }

    public int getAmonestaciones() {
        return this.amonestaciones;
    }

    public void setAmonestaciones(int amonestaciones) {
        this.amonestaciones = amonestaciones;
    }


    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getNombre() {
            return this.getNombre();
    }
}