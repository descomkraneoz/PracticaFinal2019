public class Poeta extends Persona {

    ObraPoetica obra;

    public Poeta(String nombre, String apellidos, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP, ObraPoetica obras) {
        super(nombre, apellidos, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);
        this.obra = obras;
    }

    public ObraPoetica getObra() {
        return obra;
    }

    public void setObra(ObraPoetica obra) {
        this.obra = obra;
    }

    @Override
    public String toString() {
        return super.toString() + ", su obra es= " + obra;
    }
}
