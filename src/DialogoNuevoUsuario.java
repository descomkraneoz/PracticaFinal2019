import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*public class DialogoNuevoUsuario extends JDialog {
    private final JLabel nombre = new JLabel();
    private final JLabel primerApellido = new JLabel();
    private final JLabel segundoApellido = new JLabel();
    private final JLabel email = new JLabel();
    private final JLabel fechaDeNacimiento = new JLabel();

    DialogoNuevoUsuario() {
        setLayout(new GridLayout(0, 2));
        add(new JLabel("Nombre: "));
        add(nombre);
        add(new JLabel("Primer Apellido: "));
        add(primerApellido);
        add(new JLabel("Segundo Apellido: "));
        add(segundoApellido);
        add(new JLabel("Correo electronico:"));
        add(email);
        add(new JLabel("Fecha de nacimiento:"));
        add(fechaDeNacimiento);

        fechaDeNacimiento.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char entrada = e.getKeyChar();
                if (entrada < '0' || entrada > '9' || !"/".equals(entrada)) {
                    e.consume();
                }

            }
        });
    }

    public Usuario getUsuario() {
        return new Usuario(getNumeroUsuario(),
                nombreYApellido.getText().substring(0, nombreYApellido.getText().indexOf(' ')),
                nombreYApellido.getText().substring(nombreYApellido.getText().indexOf(' ')),
                correoElectronico.getText(),
                fechaDeNacimiento.getText());
    }

}*/
