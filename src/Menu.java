import java.util.Date;

public class Menu {
    public static void main(String[] args) {
        Persona miPersona = new Persona(1755014238,"Juan","Cordova","av de la prensa",77887);
        System.out.println(miPersona.getCI());
        Persona pedro = new Persona();
        System.out.println(pedro.getCI());

        Estudiante Juan = new Estudiante(177578,"Juan","Cordova","prensa",9999,1212,"juanca@epn.edu.ec","software","tercero");
        Estudiante Diego = new Estudiante();
        System.out.println("Juan:" + Juan.getNombre());
        Juan.caminar();
        Juan.estudiar();
        Juan.leer();
        Juan.memorizar();

        System.out.println("Diego:");
        Diego.setNombre(" Nombre establecido como Diego");
        System.out.println("Diego:" + Diego.getNombre());
        Diego.caminar();
        Diego.memorizar();
        Diego.leer();
        Diego.estudiar();


    }
}
