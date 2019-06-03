import java.io.*;
import java.util.*;

public class ListaDePoetas implements Serializable {
    private final List<Poeta> listaPoetas;
    private final File ficheroDeGuardadoPoetas;

    ListaDePoetas(String ID) {
        ficheroDeGuardadoPoetas = new File(ID);
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


    public void escribir() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ficheroDeGuardadoPoetas))) {
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            new IllegalArgumentException("No se pudo leer la lista de Poetas correctamente ya que no se encontró el fichero.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Poeta> getLista() {
        return listaPoetas;
    }


    public ListaDePoetas leer(File fichero) {
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