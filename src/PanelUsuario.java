import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelUsuario extends JPanel {
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField(20);
    JButton nuevoUsuario = new JButton("Crear nuevo Usuario");

    private void colocarBoton() {
        nuevoUsuario.setBounds(150, 100, 150, 40);
        nuevoUsuario.setFont(new Font("arial", 0, 15));
    }


    public PanelUsuario() {
        add(password);
        add(passwordField);
        add(nuevoUsuario);
        colocarBoton();
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
        ActionListener oyenteBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogoNuevoUsuario dnu = new DialogoNuevoUsuario();
            }
        };
        nuevoUsuario.addActionListener(oyenteBoton);
    }

    public String getPasswordField() {
        return passwordField.getUIClassID();
    }


    /*public static void main(String[] args) {
        PanelUsuario miPanel = new PanelUsuario();
        MarcoUsuario miMarco = new MarcoUsuario();
        miMarco.add(miPanel);
        miMarco.centrarMarco();

    }*/

}
