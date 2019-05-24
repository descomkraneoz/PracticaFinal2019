import javax.swing.*;

public class DialogoUsuario extends JDialog {
    Usuario nuevoUsuario = new Usuario("Pepe", "Martinez", 28, 03, 1985, "pepito@gmail.com", "1234567890");
    JLabel nombreUsuario = new JLabel();
    JTextField campoNombre = new JTextField();
    JLabel apellidosUsuario = new JLabel();
    JTextField campoApellidos = new JTextField();


    public DialogoUsuario() {


    }


}
