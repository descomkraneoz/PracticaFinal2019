import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DialogoNuevoUsuario extends JDialog {
    File file = new File("usuarios.txt");
    private final JTextField nombre = new JTextField();
    private final JTextField apellidos = new JTextField();
    private final JTextField correo = new JTextField();
    private final JTextField diaNacimiento = new JTextField("dd");
    private final JTextField mesNacimiento = new JTextField("mm");
    private final JTextField anyoNacimiento = new JTextField("aaaa");
    private final JButton aceptar = new JButton("Aceptar");
    private final JButton cancelar = new JButton("Cancelar");
    private final JLabel textoNombre = new JLabel("Nombre:");
    private final JLabel textoApellidos = new JLabel("Apellidos:");
    private final JLabel textoCorreo = new JLabel("Correo electronico:");
    private final JLabel textoFecha = new JLabel("Fecha de nacimiento:");
    private final JLabel textoDia = new JLabel("Día");
    private final JLabel textoMes = new JLabel("Mes");
    private final JLabel textoAnio = new JLabel("Año");

    DialogoNuevoUsuario() {
        setLayout(new GridLayout(0, 2));
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Nuevo Usuario");
        anyadeComponentes();
        anyadeEstilos();
        evitaLetrasEnJTextField();
        EventoCorreo ec = new EventoCorreo();
        correo.addFocusListener(ec);
        EventoCancelar eb = new EventoCancelar();
        cancelar.addActionListener(eb);
        EventoAceptar ea = new EventoAceptar();
        aceptar.addActionListener(ea);
        pack();
    }

    private void anyadeComponentes() {
        add(textoNombre);
        add(nombre);
        add(textoApellidos);
        add(apellidos);
        add(textoCorreo);
        add(correo);
        add(textoFecha);
        add(new JLabel(""));
        add(textoDia);
        add(diaNacimiento);
        add(textoMes);
        add(mesNacimiento);
        add(textoAnio);
        add(anyoNacimiento);
        add(aceptar);
        add(cancelar);
    }

    private void estiloBoton() {
        List<JButton> listaBoton = new ArrayList();
        listaBoton.add(aceptar);
        listaBoton.add(cancelar);
        for (JButton j : listaBoton) {
            j.setBounds(150, 100, 150, 40);
            j.setFont(new Font("cooper light", Font.BOLD, 15));
            j.setBackground(new Color(255, 23, 83, 100));
            j.setForeground(Color.BLUE);
            Border linea = new LineBorder(Color.BLACK);
            Border margen = new EmptyBorder(5, 15, 5, 15);
            Border componentes = new CompoundBorder(linea, margen);
            j.setBorder(componentes);
        }
    }

    private void estiloJLabel() {
        List<JLabel> listaTexto = new ArrayList();
        listaTexto.add(textoNombre);
        listaTexto.add(textoApellidos);
        listaTexto.add(textoCorreo);
        listaTexto.add(textoFecha);
        listaTexto.add(textoDia);
        listaTexto.add(textoMes);
        listaTexto.add(textoAnio);
        for (JLabel j : listaTexto) {
            j.setFont(new Font("Verdana", 0, 15));
            //j.setBackground(new Color(255, 23, 83, 100));
        }
        textoFecha.setFont(new Font("Verdana", Font.ITALIC, 15));
    }

    private void estiloJTextField() {
        List<JTextField> listaField = new ArrayList();
        listaField.add(nombre);
        listaField.add(apellidos);
        listaField.add(correo);
        listaField.add(diaNacimiento);
        listaField.add(mesNacimiento);
        listaField.add(anyoNacimiento);
        for (JTextField j : listaField) {
            j.setFont(new Font("Verdana", 0, 15));
            j.setForeground(new Color(255, 23, 83, 100));
        }
    }

    private void anyadeEstilos() {
        estiloBoton();
        estiloJLabel();
        estiloJTextField();
    }

    private void validarEmail(String correo) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = patron.matcher(correo);
        if (matcher.find() == true) {
            System.out.println("El email ingresado es válido.");
        } else {
            JOptionPane.showMessageDialog(null, "El email ingresado es inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void evitaLetras(JTextField textField) {
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

    private void evitaLetrasEnJTextField() {
        evitaLetras(diaNacimiento);
        evitaLetras(mesNacimiento);
        evitaLetras(anyoNacimiento);
    }

    private void guardaUsuario(String infoUsuario, File file) throws IOException {
        FileWriter fw = new FileWriter(file.getPath(), true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(infoUsuario);
        pw.close();
    }

    private class EventoCorreo extends FocusAdapter {

        public void focusLost(FocusEvent e) {
            validarEmail(correo.getText());
        }
    }

    private class EventoCancelar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            nombre.setText(null);
            apellidos.setText(null);
            correo.setText(null);
            diaNacimiento.setText(null);
            mesNacimiento.setText(null);
            anyoNacimiento.setText(null);
        }
    }

    private class EventoAceptar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Usuario u = new Usuario(
                    nombre.getText(),
                    apellidos.getText(),
                    correo.getText(),
                    Integer.parseInt(diaNacimiento.getText()),
                    Integer.parseInt(mesNacimiento.getText()),
                    Integer.parseInt(anyoNacimiento.getText())
            );
            try {
                guardaUsuario(u.infoUsuario(), file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            cancelar.doClick(2);
        }
    }
}
