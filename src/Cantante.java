import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cantante extends Poeta {

    ListaDiscos listadoDiscos;


    public Cantante(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);
        listadoDiscos = new ListaDiscos();
    }

    public Cantante(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento);
        listadoDiscos = new ListaDiscos();

    }

    public Cantante(String nombre, String apellido1) {
        super(nombre, apellido1);
        listadoDiscos = new ListaDiscos();

    }

    public Cantante(String nombre, String apellido1, String apellido2) {
        super(nombre, apellido1, apellido2);
        listadoDiscos = new ListaDiscos();

    }

    @Override
    public String toString() {
        return "El cantante " + super.getNombre() + " " + super.getPrimerApellido();
    }

    public static void main(String[] args) {

        Cantante fulano = new Cantante("pepe", "perez");
        Disco p = new Disco("mar de espinas", 50);
        fulano.listadoDiscos.pideYAnyade();
        fulano.listadoDiscos.discos.add(p);
        System.out.println(fulano.toString() + fulano.listadoDiscos.muestraTodos());
    }


}


