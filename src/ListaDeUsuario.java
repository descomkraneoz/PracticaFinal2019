import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ListaDeUsuario {

    private static File ficheroDeGuardadoUsuarios = new File("usuarios.txt");
    private Map<String, Usuario> usuarios = new TreeMap<>();

    {
        if (ficheroDeGuardadoUsuarios.exists()) {
            this.leer();
        }
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

    public boolean estaElUsuario(String numerodeUsuario) {
        return usuarios.containsKey(numerodeUsuario);
    }

    public void escribir() throws IOException {
        Iterator<String> iterator = usuarios.keySet().iterator();
        while (iterator.hasNext()) {
            usuarios.get(iterator.next()).escribeEnFichero(ficheroDeGuardadoUsuarios);
        }
    }


    public void leer() {
        try {
            List<String> lineas = Files.readAllLines(ficheroDeGuardadoUsuarios.toPath());
            Iterator<String> iterator = lineas.iterator();
            String[] lineasDelUsuarioActual = new String[Usuario.LINEAS_DE_LECTURA];
            int[] fechaDelUsuario = new int[Usuario.LINEAS_DE_LECTURA];
            while (iterator.hasNext()) {
                for (int i = 0; i < Usuario.LINEAS_DE_LECTURA; i++) {
                    lineasDelUsuarioActual[i] = iterator.next();

                }
                usuarios.put(lineasDelUsuarioActual[0], new Usuario(lineasDelUsuarioActual[0], lineasDelUsuarioActual[1], lineasDelUsuarioActual[2],
                        lineasDelUsuarioActual[3], fechaDelUsuario[4], fechaDelUsuario[5], fechaDelUsuario[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}