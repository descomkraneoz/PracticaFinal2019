import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ListaDiscos implements Utilizable {
    private static final char DELIMITADOR = ';';
    List<Disco> discos;

    ListaDiscos() {
        discos = new ArrayList<>();
    }

    @Override
    public String info() {
        String salida = "";
        for (Disco d : discos
        ) {
            salida += d.info() + "\n";
        }
        return salida;
    }

    @Override
    public void guardaEnFichero(File file) {
        try (PrintWriter salida = new PrintWriter(file)) {
            for (Disco v : discos
            ) {
                salida.print(v.getNombreDisco() + DELIMITADOR + v.getUnidadesVendidas() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object leerDeFichero(File file) {
        ListaDiscos nuevaLista = null;
        String nombreDisco;
        int unidadesVendidas;
        int posicionDelimitador;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            nuevaLista = (ListaDiscos) ois.readObject();
            List<String> lineasFichero = Files.readAllLines(file.toPath());
            for (int i = 0; i < lineasFichero.size(); i++) {
                posicionDelimitador = lineasFichero.get(i).indexOf(DELIMITADOR);
                nombreDisco = lineasFichero.get(i).substring(0, posicionDelimitador);
                unidadesVendidas = Integer.parseInt(lineasFichero.get(i).substring(posicionDelimitador + 1));
                discos.add(new Disco(nombreDisco, unidadesVendidas));
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Introduzca un número correcto ");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (StringIndexOutOfBoundsException siobe) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del fichero, puede que el delimitador no sea el correcto (;)");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return nuevaLista;
    }

    public void pideYAnyade() {
        Disco disco = new Disco("prueba", 0);
        String nombre = "";
        int unidadesVendidas = 0;
        disco.setNombreDisco(JOptionPane.showInputDialog("Introduce título: ", nombre.toUpperCase()));
        disco.setUnidadesVendidas(Integer.parseInt(JOptionPane.showInputDialog("Unidades vendidas ", unidadesVendidas)));
        discos.add(disco);

    }


}
