import java.util.Date;

public class Persona {

    private String nombre;
    private int dni;
    private Date fechaNacimiento;
    private String nacionalidad;
    private int sexo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

}
