import java.io.File;

public interface Utilizable {

    public String info();

    public void guardaEnFichero(File file);

    public Object leerDeFichero(File file);


}