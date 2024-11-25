package sistemapoliciaarmas_final;

public class ArmaCorta extends Arma{
    
    private int esAutomatica; //1: SI, 2: NO
    
    //CONSTRUCTOR
    public ArmaCorta(String nombre, int cant_minuciones, double alcance, String marca, int calibre, int estado, int esAutomatica) {
        super(nombre, cant_minuciones, alcance, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public int isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(int esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
    
    //FUNCION VERIFICA ALCANCE
    public String alcanceMayor200(double alcance){
        if (this.getAlcance() >= 200) return "Si";
        else return "No";
    }
    
    
}
