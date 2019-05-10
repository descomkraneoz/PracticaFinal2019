import java.util.HashMap;
import java.util.Map;

public class Cantantes extends Poeta {

    private String nombreDisco;
    private int anyoPublicacion;
    private int unidadesVendidas;

    Map<String,String> discos=new HashMap<>();

    public Cantantes(String nombre, String apellidos, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP) {
        super(nombre, apellidos, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);

    }

    public Cantantes(String nombre, String apellidos, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        super(nombre, apellidos, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento);

    }

    public Cantantes(String nombre, String apellidos) {
        super(nombre, apellidos);

    }


    @Override
    public String toString() {
        return super.toString() + ", su obra es= " + "";
    }
}
