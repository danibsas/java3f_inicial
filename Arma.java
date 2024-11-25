package sistemapoliciaarmas_final;

public abstract class Arma {

    private String nombre;
    private int cant_minuciones;
    private double alcance;
    private String marca;
    private int calibre;
    private int estado;  // 1: NUEVA; 2: EN MANTENIMIENTO; 3: EN USO

    //CONSTRUCTOR
    public Arma(String nombre, int cant_minuciones, double alcance, String marca, int calibre, int estado) {
        this.nombre = nombre;
        this.cant_minuciones = cant_minuciones;
        this.alcance = alcance;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_minuciones() {
        return cant_minuciones;
    }

    public void setCant_minuciones(int cant_minuciones) {
        this.cant_minuciones = cant_minuciones;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    //VERIFICA SI ESTA EN CONDICIONES
    public String enCondiciones(int estado, int calibre)
    {
        if ((calibre >= 9) && (estado == 3)){
            return "Está en condiciones";
        } else return "No está en condiciones";
    }
    
}
