import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cantante extends Poeta {

    List<ListaDiscos> listado = new ArrayList<>();


    public Cantante(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);

    }

    public Cantante(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento);

    }

    public Cantante(String nombre, String apellido1) {
        super(nombre, apellido1);

    }

    public Cantante(String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);

    }

    @Override
    public String toString() {
        return "El cantante " + super.getNombre() + " " + super.getPrimerApellido();
    }


}


