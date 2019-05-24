import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private final String nombre;
    private final String apellidos;
    private static int diaNacimiento;
    private static int mesNacimiento;
    private static int anyoNacimiento;
    private final String email;
    private final String password;
    private final ListaDePoetas lista = new ListaDePoetas();


    public Usuario(String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anyoNacimiento, String email, String password) {
        this.nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
        this.apellidos = apellidos.substring(0, 1).toUpperCase() + apellidos.substring(1).toLowerCase();
        Usuario.diaNacimiento = diaNacimiento;
        Usuario.mesNacimiento = mesNacimiento;
        Usuario.anyoNacimiento = anyoNacimiento;
        this.email = email;
        this.password = password;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getFechaNacimiento() {
        LocalDate fechaNac = LocalDate.of(Usuario.anyoNacimiento, Usuario.mesNacimiento, Usuario.diaNacimiento);
        return fechaNac;
    }

    public ListaDePoetas getLista() {
        return lista;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    public String info() {
        String salida = "";
        salida += getNombre() + " " + getApellidos() + "\n";
        salida += " nacido el " + getFechaNacimiento() + "\n";
        salida += " correo electrónico " + getEmail();
        return salida;
    }

}
