import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PanelUsuario extends JPanel {

    File fichero = new File("usuarios.txt");
    JLabel password = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField("*", 20);
    JButton nuevoUsuario = new JButton("Crear nuevo Usuario");

    public PanelUsuario() {
        setBackground(new Color(232, 36, 21, 91));
        anyadeComponente();
        cargaEstilos();
        IncorporaDialogoNuevoUsuario idnu = new IncorporaDialogoNuevoUsuario();
        nuevoUsuario.addActionListener(idnu);
        evitaLetras(passwordField);
        IncorporarDialogoUsuario idu = new IncorporarDialogoUsuario();
    }

    private void anyadeComponente() {
        add(password);
        add(passwordField);
        add(nuevoUsuario);
    }

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

    private void cargaEstilos() {
        estiloBoton();
        estiloJLabel();
        estiloJtextField();
    }

    private void evitaLetras(JPasswordField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada = e.getKeyChar();
                if (entrada < '0' || entrada > '9') {
                    e.consume();
                }
            }
        });
    }

    /*private void leerUsuario() throws IOException {
        FileReader fr=new FileReader(fichero.getPath());
        BufferedReader br=new BufferedReader(fr);
        String cadena=br.readLine();
        while (cadena!=null){
            System.out.println(cadena);
            cadena=br.readLine();
        }try{
            if (fr!=null){
                fr.close();
                }
        }catch (IOException e){
                System.out.println(e.getMessage());
        }
    }  */


    public String getPasswordField() {
        return passwordField.getUIClassID();
    }

    private class IncorporaDialogoNuevoUsuario implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DialogoNuevoUsuario dnu = new DialogoNuevoUsuario();
        }
    }

    private class IncorporarDialogoUsuario implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (getPasswordField().length() == 9) {
                //existeUsuario();
            }
        }
    }

}
