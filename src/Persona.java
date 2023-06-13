public class Persona {
    private int CI;
    private String Nombre;
    private String Apellido;
    private String Direccion;

    private int telefono;

    // Constructor
    public Persona(){

    }
    public Persona(int CI, String nombre, String apellido, String direccion, int telefono) {
        this.CI = CI;
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        this.telefono = telefono;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Metoodos

    public void caminar(){
        System.out.println("Este es el metodo de caminar que pertenece a persona");
    }

    private int trabajar(){

        return 0;
    }

}
