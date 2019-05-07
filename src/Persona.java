import java.time.LocalDate;

public class Persona {
    private final String nombre;
    private final String apellidos;
    private final String pseudonimo;
    Sexo sexo;
    private int edad;
    private String nacionalidad;
    private final int diaNacimiento;
    private final int mesNacimiento;
    private final int anyoNacimiento;
    private static int diaDEP;
    private static int mesDEP;
    private static int anyoDEP;

    enum Sexo {
        HOMBRE, MUJER;
    }

    public Persona(String nombre, String apellidos, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anyoNacimiento = anyoNacimiento;
        Persona.diaDEP = diaDEP;
        Persona.mesDEP = mesDEP;
        Persona.anyoDEP = anyoDEP;
    }

    public Persona(String nombre, String apellidos, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        LocalDate fechaNac = LocalDate.of(anyoNacimiento, mesNacimiento, diaNacimiento);
        return fechaNac;
    }

    public LocalDate getFechaDEP() {
        LocalDate fechaDEP = LocalDate.of(Persona.anyoDEP, Persona.mesDEP, Persona.diaDEP);
        return fechaDEP;
    }

    public int getEdadActual() {
        LocalDate fechaHoy = LocalDate.now();
        int edad = fechaHoy.getYear() - getFechaNacimiento().getYear();
        return edad;
    }

    public int getEdadFinal() {
        int edad = getFechaDEP().getYear()-getFechaNacimiento().getYear();
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", sexo=" + sexo +
                ", edad=" + getEdadActual() +
                ", nacionalidad='" + nacionalidad + '\'';
    }
}
