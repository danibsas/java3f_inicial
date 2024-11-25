package sistemapoliciaarmas_final;

public class ArmaLarga extends Arma implements Interface{
    
    private String justif_uso;
    private int nivel; // 1..5
    private int selloRenar;


   //CONSUTRUCTOR
    public ArmaLarga(String nombre, int cant_minuciones, double alcance, String marca, int calibre, int estado, String justif_uso, int nivel, int selloRenar) {
        super(nombre, cant_minuciones, alcance, marca, calibre, estado);
        this.justif_uso = justif_uso;
        this.nivel = nivel;
        this.selloRenar = selloRenar;
    }

    public String getJustif_uso() {
        return justif_uso;
    }

    public void setJustif_uso(String justif_uso) {
        this.justif_uso = justif_uso;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getSelloRenar() {
        return selloRenar;
    }

    public void setSelloRenar(int selloRenar) {
        this.selloRenar = selloRenar;
    }

    @Override
    public String toString() {
        return "ArmaLarga{" +
                "Nombre del arma=' " + this.getNombre() + '\'' +
                "Justificacion de uso=' " + this.getJustif_uso() + '\'' +
                ", selloRenar=' " + this.getSelloRenar() + '\'' +
                ", nivel= " + this.getNivel() +
                ", cant_minuciones= " + getCant_minuciones() +
                ", calibre= " + super.getCalibre() +
                ", alcance= " + super.getAlcance() +
                ", marca=' " + super.getMarca() + '\'' +
                ", estado=' " + super.getEstado() + '\'' +
                '}';
    }
    
    
}
