import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Equipos {
    private String nombre;
    private Date fechaInicio;
    private List<Jugador> jugadores;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;


    public int getPartidosGanados() {
        return this.partidosGanados;
    }

    public void setpartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getpartidosPerdidos() {
        return this.partidosPerdidos;
    }

    public void setpartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return this.partidosEmpatados;
    }

    public void setpartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }


    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesFavor() {
        return this.golesFavor;
    }

    public int getGolesContra() {
        return this.golesContra;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int calcularPuntos() {
        return partidosGanados * 3 + partidosEmpatados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Jugador> getJugadores() {
        return this.jugadores;
    }

    public int getPuntos() {
        return calcularPuntos();
    }
}