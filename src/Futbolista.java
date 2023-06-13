public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private  int num_camiseta;
    private String representante;

    public Futbolista(){
        super();
    }

    public Futbolista(int CI, String nombre, String apellido, String direccion, int telefono,String equipo,String posicion,
                      int num_camiseta,String representante) {
        super(CI, nombre, apellido, direccion, telefono);
        this.equipo = equipo;
        this.posicion = posicion;
        this.num_camiseta = num_camiseta;
        this.representante = representante;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}
