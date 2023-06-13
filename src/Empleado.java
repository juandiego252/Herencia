public class Empleado extends Persona {
    private String puesto;
    private String cargo;

    public Empleado(){
        super();
    }

    public Empleado(int CI, String nombre, String apellido, String direccion, int telefono, String puesto, String cargo) {
        super(CI, nombre, apellido, direccion, telefono);
        this.puesto = puesto;
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
