import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cantantes extends Poeta {

    List<ListaDiscos> listado = new ArrayList<>();


    public Cantantes(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP, ListaDiscos listaDiscos) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);

    }

    public Cantantes(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, ListaDiscos listaDiscos) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento);

    }

    public Cantantes(String nombre, String apellido1, ListaDiscos listaDiscos) {
        super(nombre, apellido1);

    }

    public Cantantes(String nombre, String apellido1, String apellido2, ListaDiscos listaDiscos) {
        super(nombre, apellido1, apellido2);

    }

    @Override
    public String toString() {
        return "El cantante " + super.getNombre() + " " + super.getPrimerApellido();
    }


}

