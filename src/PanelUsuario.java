import javax.swing.*;
import java.awt.*;

public class PanelUsuario extends JFrame {

    public PanelUsuario() {
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ventana de Usuario");
    }

    public void centraPantalla() {
        Toolkit miPantallaCentrada = Toolkit.getDefaultToolkit();
        Dimension tamanyoPantalla = miPantallaCentrada.getScreenSize();
        int alturaPantalla = tamanyoPantalla.height;
        int anchoPantalla = tamanyoPantalla.width;
        setSize(anchoPantalla / 2, alturaPantalla / 2);
        setLocation(anchoPantalla / 4, alturaPantalla / 4);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //video 57 de pildoras

    public static void main(String[] args) {
        PanelUsuario mi = new PanelUsuario();
        mi.centraPantalla();
    }
}
