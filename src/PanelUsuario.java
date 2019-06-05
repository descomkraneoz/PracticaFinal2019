import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelUsuario extends JPanel {
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField(20);
    JButton nuevoUsuario = new JButton("Crear nuevo Usuario");

    private void estiloBoton() {
        nuevoUsuario.setBounds(150, 100, 150, 40);
        nuevoUsuario.setFont(new Font("arial", Font.BOLD, 15));
        nuevoUsuario.setBackground(new Color(255, 141, 23, 100));
        nuevoUsuario.setForeground(new Color(232, 36, 21, 91));
        Border linea = new LineBorder(Color.BLACK);
        Border margen = new EmptyBorder(5, 15, 5, 15);
        Border componentes = new CompoundBorder(linea, margen);
        nuevoUsuario.setBorder(componentes);

    }

    private void estiloJLabel() {
        password.setFont(new Font("arial", Font.BOLD, 15));
    }

    private void estiloJtextField() {
        passwordField.setBackground(new Color(255, 141, 23, 100));
        passwordField.setForeground(new Color(255, 23, 83, 100));
    }



    public PanelUsuario() {
        setBackground(new Color(232, 36, 21, 91));
        add(password);
        add(passwordField);
        add(nuevoUsuario);
        estiloBoton();
        estiloJLabel();
        estiloJtextField();
        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) { //evita que introduzcan letras
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
                    System.out.println("probando este campo");
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

}
