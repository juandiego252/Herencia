public class Doctor extends Persona{
    private String especiaidad;
    private String horario;
    private int cod_doc;
    private String hospital;

    public Doctor(){
        super();
    }
    public Doctor(int CI, String nombre, String apellido, String direccion, int telefono, String especiaidad, String horario,
                  int cod_doc,String hospital) {
        super(CI, nombre, apellido, direccion, telefono);
        this.especiaidad = especiaidad;
        this.horario = horario;
        this.cod_doc = cod_doc;
        this.hospital = hospital;
    }

    public String getEspeciaidad() {
        return especiaidad;
    }

    public void setEspeciaidad(String especiaidad) {
        this.especiaidad = especiaidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCod_doc() {
        return cod_doc;
    }

    public void setCod_doc(int cod_doc) {
        this.cod_doc = cod_doc;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
