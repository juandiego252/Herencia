public class Estudiante extends Persona {
    private int codigo_unico;
    private String correo_inst;
    private  String carrera;
    private  String semestre;

    public Estudiante(){
        super();
    }

    public Estudiante(int CI, String nombre, String apellido, String direccion, int telefono, int codigo_unico,String correo_inst,
                      String carrera,String semestre) {
        super(CI, nombre, apellido, direccion, telefono);

        // Atributos propios de la clase estudiante
        this.codigo_unico = codigo_unico;
        this.correo_inst = correo_inst;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(int codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public String getCorreo_inst() {
        return correo_inst;
    }

    public void setCorreo_inst(String correo_inst) {
        this.correo_inst = correo_inst;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void estudiar(){
        System.out.println("Este es el metodo estudiar que pertenece a estudiantes");
    }

    public void memorizar(){
        System.out.println("Este es el metodo memorizar que pertenece a estudiante");
    }
    public void leer(){
        System.out.println("Este es el metodo leer que pertenece a estudiante");
    }
}
