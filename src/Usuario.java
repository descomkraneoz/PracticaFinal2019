import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

public class Usuario {
    public static final int CANTIDAD_DE_NUMEROS_IDENTIFICACION = 10;
    public static final int LINEAS_DE_LECTURA = 6;
    public static String NUMEROS = "0123456789";
    private final String ID_Usuario;
    private final String nombre;
    private final String apellidos;
    private final String correoElectronico;
    private static int diaNacimiento;
    private static int mesNacimiento;
    private static int anyoNacimiento;
    private static LocalDate fechaDeRegistro;
    private ListaDePoetas listaUsuario;


    public Usuario(String nombre, String apellidos, String correoElectronico, int diaNacimiento,
                   int mesNacimiento, int anyoNacimiento, String ficheroDeGuardado) {
        this.ID_Usuario = getGenerarID_Usuario();
        if (ID_Usuario.length() != CANTIDAD_DE_NUMEROS_IDENTIFICACION) {
            throw new IllegalArgumentException("El  identificador de usuario ha de tener 10 carácteres");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        Usuario.diaNacimiento = diaNacimiento;
        Usuario.mesNacimiento = mesNacimiento;
        Usuario.anyoNacimiento = anyoNacimiento;
        Usuario.fechaDeRegistro = LocalDate.now();
        if (ficheroDeGuardado == "" || ficheroDeGuardado == null || !Paths.get(ficheroDeGuardado).toFile().exists()) {
            this.listaUsuario = new ListaDePoetas(ID_Usuario);
        } else {
            this.listaUsuario = listaUsuario.leerDeFichero(Paths.get(ID_Usuario).toFile());
        }
    }

    public Usuario(String nombre, String apellidos, String correoElectronico, int diaNacimiento,
                   int mesNacimiento, int anyoNacimiento) {
        this.ID_Usuario = getGenerarID_Usuario();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        Usuario.diaNacimiento = diaNacimiento;
        Usuario.mesNacimiento = mesNacimiento;
        Usuario.anyoNacimiento = anyoNacimiento;
        Usuario.fechaDeRegistro = LocalDate.now();
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public ListaDePoetas getListaDePoetas() {
        return listaUsuario;
    }

    public String getID_Usuario() {
        return ID_Usuario;
    }

    public LocalDate getFechaNacimiento() {
        LocalDate fechaNac = LocalDate.of(Usuario.anyoNacimiento, Usuario.mesNacimiento, Usuario.diaNacimiento);
        return fechaNac;
    }

    public LocalDate getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public static String getGenerarID_Usuario() {
        String psw = "";
        for (int i = 0; i < CANTIDAD_DE_NUMEROS_IDENTIFICACION; i++) {
            psw += (NUMEROS.charAt((int) (Math.random() * CANTIDAD_DE_NUMEROS_IDENTIFICACION)));
        }
        return psw;
    }

    public String infoUsuario() {
        String salida = "";
        salida += this.ID_Usuario + " \n";
        salida += this.nombre + " \n";
        salida += this.apellidos + " \n";
        salida += this.correoElectronico + " \n";
        salida += getFechaNacimiento() + " \n";
        salida += this.fechaDeRegistro + " \n";
        return salida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return ID_Usuario == usuario.ID_Usuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID_Usuario);
    }

}