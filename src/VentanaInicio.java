import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton aceptarButton;
    private JButton nuevoUsuarioButton;
    private JButton cancelarButton;


    public VentanaInicio() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has pulsado aceptar");
            }
        });
    }

    public static void main(String[] args) {
        VentanaInicio miVentana = new VentanaInicio();


    }
}
