import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Campeonato {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Equipos> equipos;
    private List<Arbitro> arbitros;



    public void setArbitros(List<Arbitro> arbitros) {
        this.arbitros = arbitros;
    }

    public List<Arbitro> getArbitros() {
        return this.arbitros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaInicio;
    }


    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }
}