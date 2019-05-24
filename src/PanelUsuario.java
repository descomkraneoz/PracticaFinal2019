import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelUsuario extends JPanel {
    JLabel password = new JLabel(" Introduce tu clave ");
    JPasswordField passwordField = new JPasswordField("", 18);
    JButton botonNuevoUsuario = new JButton("Crear nuevo Usuario");
    String leido = "";

    public PanelUsuario() {
        add(password);
        add(passwordField);
        add(botonNuevoUsuario);

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                pulsacion(e);
            }
        });

        botonNuevoUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                nuevoUsuario(e);
            }
        });
    }

    private void pulsacion(KeyEvent e) {
        this.leido += e.getKeyChar();
        if (this.leido.length() == 10) {
            this.setVisible(false);
            //System.out.println(leido);
        }
    }

    private void nuevoUsuario(KeyEvent e) {


    }

    public String getLectura() {
        String salida = leido;
        leido = "";
        return salida;
    }

}
