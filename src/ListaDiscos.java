import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ListaDiscos {
    private static final char DELIMITADOR = ';';
    List<Disco> lista;

    ListaDiscos() {
        lista = new ArrayList<>();
    }

    public String muestraTodos() {
        String salida = "";
        for (Disco d : lista
        ) {
            salida += d.toString() + "\n";
        }
        return salida;
    }

    public void pideYAnyade() {
        Disco disco = new Disco("prueba", 0);
        String nombre = "";
        int unidadesVendidas = 0;
        disco.setNombreDisco(JOptionPane.showInputDialog("Introduce título: ", nombre.toUpperCase()));
        disco.setUnidadesVendidas(Integer.parseInt(JOptionPane.showInputDialog("Unidades vendidas ", unidadesVendidas)));
        lista.add(disco);

    }

    public void guardaEnFichero(File fichero) {
        try (PrintWriter salida = new PrintWriter(fichero)) {
            for (Disco v : lista
            ) {
                salida.print(v.getNombreDisco() + DELIMITADOR + v.getUnidadesVendidas() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void leeDeFichero(File fichero) {

        String nombreDisco;
        int unidadesVendidas;
        int posicionDelimitador;
        try {
            List<String> lineasFichero = Files.readAllLines(fichero.toPath());
            for (int i = 0; i < lineasFichero.size(); i++) {
                posicionDelimitador = lineasFichero.get(i).indexOf(DELIMITADOR);
                nombreDisco = lineasFichero.get(i).substring(0, posicionDelimitador);
                unidadesVendidas = Integer.parseInt(lineasFichero.get(i).substring(posicionDelimitador + 1));
                lista.add(new Disco(nombreDisco, unidadesVendidas));
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Introduzca un número correcto ");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (StringIndexOutOfBoundsException siobe) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del fichero, puede que el delimitador no sea el correcto (;)");
        }
    }


}