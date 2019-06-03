import java.io.*;
import java.util.*;

public class ListaDePoetas implements Serializable, Utilizable {
    private final List<Poeta> listaPoetas;
    private final File ficheroDeGuardadoPoetas;

    ListaDePoetas(String ID_Usuario) {
        ficheroDeGuardadoPoetas = new File(ID_Usuario);
        listaPoetas = new ArrayList<>();
    }

    public void anyadirPoeta(Poeta PoetaNuevo) {
        listaPoetas.add(PoetaNuevo);
    }

    public void eliminarPoeta(Poeta poeta) {
        if (!listaPoetas.contains(poeta)) {
            throw new IllegalArgumentException("El poeta que desea borrar no esta en la lista, bad luck!!");
        }
        listaPoetas.remove(poeta);
    }

    public List<Poeta> getLista() {
        return listaPoetas;
    }

    public String info() {
        String salida = "";
        if (listaPoetas.size() == 0) {
            return "No hay poetas en tu lista";
        } else {
            for (Poeta p : listaPoetas) {
                salida += p.infoCorta();
            }
        }
        return salida;
    }


    public void guardaEnFichero(File fichero) {
        fichero = ficheroDeGuardadoPoetas;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroDeGuardadoPoetas))) {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Poetas correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ListaDePoetas leerDeFichero(File fichero) {
        ListaDePoetas nuevaLista = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            nuevaLista = (ListaDePoetas) ois.readObject();
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Poetas correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            new IllegalArgumentException("Error, el objeto no corresponde con la lista");
            e.printStackTrace();
        }
        return nuevaLista;
    }
}