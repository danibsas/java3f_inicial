package sistemapoliciaarmas_final;

public class Policia {
    
    private String nombre, apellido;
    private int legajo;
    private String nombre_arma;

    //CONTRUCTOR
    public Policia(String nombre, String apellido, int legajo, String nombre_arma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.nombre_arma = nombre_arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre_arma() {
        return nombre_arma;
    }

    public void setNombre_arma(String nombre_arma) {
        this.nombre_arma = nombre_arma;
    }

    public String toString() {
        return "Policia{" +
                "nombre=' "       + this.getNombre() + '\'' +
                ", apellido=' "   + this.getApellido() + '\'' +
                ", legajo= "      + this.getLegajo() +
                ", Nombre arma= " + this.getNombre_arma() +
                '}';

    }

}
