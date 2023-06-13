import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main(String[] args) {

        ArrayList <Estudiante> integrantes = new ArrayList<Estudiante>();
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
        integrantes.add(Juan);
        integrantes.add(Diego);

        System.out.println("array y for ");
        for (Estudiante integrante : integrantes){
            System.out.println(integrante.getNombre() + " " + integrante.getApellido());
            integrante.leer();
        }

    }
}
