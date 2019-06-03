import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelUsuario extends JPanel {
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField(20);
    JButton nuevoUsuario = new JButton("Crear nuevo Usuario");


    public PanelUsuario() {
        add(password);
        add(passwordField);
        add(nuevoUsuario);
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                char entradaPass = e.getKeyChar();
                if (entradaPass < '0' || entradaPass > '9') {
                    e.consume();
                }
            }
        });
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (passwordField.getUIClassID().length() == 9) {

                }
            }
        });

        nuevoUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

            }
        });
    }

    public String getPasswordField() {
        return passwordField.getUIClassID();
    }


    public static void main(String[] args) {
        PanelUsuario miPanel = new PanelUsuario();
        MarcoUsuario miMarco = new MarcoUsuario();
        miMarco.add(miPanel);
        miMarco.centrarMarco();

    }

}
