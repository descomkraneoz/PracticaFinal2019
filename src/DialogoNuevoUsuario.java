import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DialogoNuevoUsuario extends JDialog {
    private final JTextField nombre = new JTextField();
    private final JTextField apellidos = new JTextField();
    private final JTextField correo = new JTextField();
    private final JTextField diaNacimiento = new JTextField("dd");
    private final JTextField mesNacimiento = new JTextField("mm");
    private final JTextField anyoNacimiento = new JTextField("aaaa");
    private final JButton aceptar = new JButton("Aceptar");
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
        estiloBoton();
        estiloJLabel();
        estiloJTextField();
        pack();
    }

    private void estiloBoton() {


        aceptar.setBounds(150, 100, 150, 40);
        aceptar.setFont(new Font("cooper light", Font.BOLD, 15));
        aceptar.setBackground(Color.BLUE);
        aceptar.setForeground(Color.YELLOW);
        Border linea = new LineBorder(Color.BLACK);
        Border margen = new EmptyBorder(5, 15, 5, 15);
        Border componentes = new CompoundBorder(linea, margen);
        aceptar.setBorder(componentes);

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
        }
        textoFecha.setFont(new Font("Verdana", Font.ITALIC, 15));

    }

    private void estiloJTextField() {
        //nombre.setBackground(Color.GREEN);
    }
}
