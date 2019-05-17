import java.time.LocalDate;
import java.util.Objects;

public class Poeta {
    private final String nombre;
    private final String primerApellido;
    private String segundoApellido;
    private String pseudonimo;
    Sexo sexo;
    private int edad;
    private String nacionalidad;
    private static int diaNacimiento;
    private static int mesNacimiento;
    private static int anyoNacimiento;
    private static int diaDEP;
    private static int mesDEP;
    private static int anyoDEP;

    enum Sexo {
        HOMBRE, MUJER;
    }

    public Poeta(String nombre, String apellido1,String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento, int diaDEP, int mesDEP, int anyoDEP) {
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        this.primerApellido = apellido1.substring(0,1).toUpperCase()+apellido1.substring(1).toLowerCase();;
        this.segundoApellido = apellido2.substring(0,1).toUpperCase()+apellido2.substring(1).toLowerCase();;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        Poeta.diaNacimiento = diaNacimiento;
        Poeta.mesNacimiento = mesNacimiento;
        Poeta.anyoNacimiento = anyoNacimiento;
        Poeta.diaDEP = diaDEP;
        Poeta.mesDEP = mesDEP;
        Poeta.anyoDEP = anyoDEP;
    }

    public Poeta(String nombre, String apellido1,String apellido2, String pseudonimo, Sexo sexo, String nacionalidad, int diaNacimiento, int mesNacimiento, int anyoNacimiento) {
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        this.primerApellido = apellido1.substring(0,1).toUpperCase()+apellido1.substring(1).toLowerCase();;
        this.segundoApellido = apellido2.substring(0,1).toUpperCase()+apellido2.substring(1).toLowerCase();;
        this.pseudonimo = pseudonimo;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        Poeta.diaNacimiento = diaNacimiento;
        Poeta.mesNacimiento = mesNacimiento;
        Poeta.anyoNacimiento = anyoNacimiento;
    }

    public Poeta(String nombre, String apellido1){
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        this.primerApellido=apellido1.substring(0,1).toUpperCase()+apellido1.substring(1).toLowerCase();;

    }

    public Poeta(String nombre, String apellido1,String apellido2){
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        this.primerApellido=apellido1.substring(0,1).toUpperCase()+apellido1.substring(1).toLowerCase();;
        this.segundoApellido=apellido2.substring(0,1).toUpperCase()+apellido2.substring(1).toLowerCase();;

    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
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
        LocalDate fechaNac = LocalDate.of(Poeta.anyoNacimiento, Poeta.mesNacimiento, Poeta.diaNacimiento);
        return fechaNac;
    }

    public LocalDate getFechaDEP() {
        LocalDate fechaDEP = LocalDate.of(Poeta.anyoDEP, Poeta.mesDEP, Poeta.diaDEP);
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

    public String versoConocido(String verso) {
        return verso;
    }

    @Override
    public String toString() {
        return "Poeta{" +
                "nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", pseudonimo='" + pseudonimo + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poeta poeta = (Poeta) o;
        return nombre.equals(poeta.nombre) &&
                primerApellido.equals(poeta.primerApellido) &&
                Objects.equals(segundoApellido, poeta.segundoApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, primerApellido, segundoApellido);
    }
}