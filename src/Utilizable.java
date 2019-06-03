import java.io.File;
import java.io.IOException;

public interface Utilizable {

    public String info();

    public void escribeEnFichero(File file) throws IOException;

    public void leeDeFichero(File fichero);

    public void pideYAnyade();
}