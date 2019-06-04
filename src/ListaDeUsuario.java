import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class ListaDeUsuario implements Utilizable {

    private static File FICHERO_GUARDADO_USUARIOS = new File("usuarios.txt");
    private final List<Usuario> listaUsuario = null;
    private Map<String, Usuario> usuarios = new TreeMap<>();

    {
        if (FICHERO_GUARDADO_USUARIOS.exists()) {
            this.leeYGuardaEnFichero();
        }
    }

    public void leeYGuardaEnFichero() {
        try {
            List<String> lineas = Files.readAllLines(FICHERO_GUARDADO_USUARIOS.toPath());
            Iterator<String> iterator = lineas.iterator();
            String[] lineasDelUsuarioActual = new String[Usuario.LINEAS_DE_LECTURA];
            int[] fechaDelUsuario = new int[Usuario.LINEAS_DE_LECTURA - 3];
            while (iterator.hasNext()) {
                for (int i = 0; i < Usuario.LINEAS_DE_LECTURA; i++) {
                    lineasDelUsuarioActual[i] = iterator.next();
                }
                usuarios.put(lineasDelUsuarioActual[0], new Usuario(lineasDelUsuarioActual[0], lineasDelUsuarioActual[1], lineasDelUsuarioActual[2],
                        fechaDelUsuario[3], fechaDelUsuario[4], fechaDelUsuario[5], lineasDelUsuarioActual[6]));
            }
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


    @Override
    public void guardaEnFichero(File fichero) {
        fichero = FICHERO_GUARDADO_USUARIOS;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_GUARDADO_USUARIOS))) {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Usuarios correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object leerDeFichero(File file) {
        ListaDeUsuario nuevaLista = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO_GUARDADO_USUARIOS))) {
            nuevaLista = (ListaDeUsuario) ois.readObject();
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Usuarios correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            new IllegalArgumentException("Error, el objeto no se corresponde con la lista");
            e.printStackTrace();
        }
        return nuevaLista;
    }

    @Override
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