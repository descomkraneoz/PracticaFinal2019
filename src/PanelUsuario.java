import javax.swing.*;
import java.awt.*;

public class PanelUsuario extends JPanel {
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField();
    JButton nuevoUsuario = new JButton("Crear nuevo Usuario");
    GridBagLayout gbl = new GridBagLayout();

    public PanelUsuario() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Bienvenido al panel de usuario", 200, 200);
    }

    public static void main(String[] args) {
        PanelUsuario miPanel = new PanelUsuario();
        MarcoUsuario miMarco = new MarcoUsuario();
        miMarco.add(miPanel);
        miMarco.centrarMarco();

    }

}
