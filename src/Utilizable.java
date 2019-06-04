import java.io.File;

public interface Utilizable {

    String info();

    void guardaEnFichero(File file);

    Object leerDeFichero(File file);


}