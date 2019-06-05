import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class ListaDeUsuario {
    public static void main(String[] args) {
        ListaDeUsuario lu = new ListaDeUsuario();
        Usuario u = new Usuario("Maria", "Martos", "martos@gmail.com", 19, 01, 1989);
        lu.anyadirUsuario(u);
        lu.leeDeFichero();
    }

    private static File FICHERO_GUARDADO_USUARIOS = new File("usuarios.txt");
    private final List<Usuario> listaUsuario = null;
    private Map<String, Usuario> usuarios = new TreeMap<>();

    {
        if (FICHERO_GUARDADO_USUARIOS.exists()) {
            this.leeDeFichero();
        }
    }

    public void leeDeFichero() {
        try {
            List<String> lineas = Files.readAllLines(FICHERO_GUARDADO_USUARIOS.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean estaElUsuario(String ID_USUARIO) {
        return usuarios.containsKey(ID_USUARIO);
    }

    public Usuario elegirUsuario(String ID_Usuario) {
        if (estaElUsuario(ID_Usuario)) {
            return usuarios.get(ID_Usuario);
        }
        return null;
    }

    public void anyadirUsuario(Usuario nuevoUsuario) {
        if (usuarios.containsKey(nuevoUsuario.getID_Usuario())) {
            throw new IllegalArgumentException("Error, no introducir dos usuarios iguales");
        }
        usuarios.put(nuevoUsuario.getID_Usuario(), nuevoUsuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        if (!usuarios.containsKey(usuario.getID_Usuario())) {
            throw new IllegalArgumentException("El usuario no existe");
        }
        usuarios.remove(usuario);
    }

    public void guardaEnFichero(File fichero) {
        Usuario u = new Usuario(null, null, null, 0, 0, 0);
        fichero = FICHERO_GUARDADO_USUARIOS;
        try (FileWriter fw = new FileWriter(FICHERO_GUARDADO_USUARIOS)) {
            PrintWriter pw = new PrintWriter(fw);
            pw.print(u);
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Usuarios correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String info() {
        String salida = "";
        if (listaUsuario.size() == 0) {
            return "No hay usuarios en tu lista";
        } else {
            for (Usuario u : listaUsuario) {
                salida += u.infoUsuario();
            }
        }
        return salida;
    }
}