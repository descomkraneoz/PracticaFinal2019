public class Dramaturgo extends Poeta {
    private final String obraCumbre;


    public Dramaturgo(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad,
                      int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP, String obraCumbre) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento, diaDEP, mesDEP, anyoDEP);
        this.obraCumbre = obraCumbre;
    }

    public Dramaturgo(String nombre, String apellido1, String apellido2, String pseudonimo, Sexo sexo, String nacionalidad,
                      int diaNacimiento, int mesNacimiento, int anyoNacimiento, String obraCumbre) {
        super(nombre, apellido1, apellido2, pseudonimo, sexo, nacionalidad, diaNacimiento, mesNacimiento, anyoNacimiento);
        this.obraCumbre = obraCumbre;
    }

    public Dramaturgo(String nombre, String apellido1, String obraCumbre) {
        super(nombre, apellido1);
        this.obraCumbre = obraCumbre;
    }

    public String getObraCumbre() {
        return obraCumbre;
    }

    public String info() {
        String salida = "";
        salida += "El dramaturgo " + super.getNombre() + " " + super.getPrimerApellido() + " su obra cumbre es " + getObraCumbre();
        return salida;
    }

    @Override
    public String toString() {
        return "Dramaturgo " + super.getNombre() + " " + super.getPrimerApellido() + " " + getObraCumbre();
    }
}
