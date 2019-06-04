import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DialogoNuevoUsuario extends JDialog {
    private final JTextField nombre = new JTextField();
    private final JTextField apellidos = new JTextField();
    private final JTextField correo = new JTextField();
    private final JTextField diaNacimiento = new JTextField("dd");
    private final JTextField mesNacimiento = new JTextField("mm");
    private final JTextField anyoNacimiento = new JTextField("aaaa");
    private final JButton aceptar = new JButton("Aceptar");

    DialogoNuevoUsuario() {
        setLayout(new GridLayout(0, 2));
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Nuevo Usuario");
        add(new JLabel("Nombre: "));
        add(nombre);
        add(new JLabel("Apellidos: "));
        add(apellidos);
        add(new JLabel("Correo electronico:"));
        add(correo);
        add(new JLabel("Día de nacimiento:"));
        add(diaNacimiento);
        add(new JLabel("Mes de nacimiento:"));
        add(mesNacimiento);
        add(new JLabel("Año de nacimiento:"));
        add(anyoNacimiento);
        add(aceptar);
        colocarBoton();
        pack();
    }

    private void colocarBoton() {
        aceptar.setBounds(150, 100, 150, 40);
        aceptar.setFont(new Font("arial", 0, 15));
    }

    public static void main(String[] args) {
        DialogoNuevoUsuario d = new DialogoNuevoUsuario();
    }

}
