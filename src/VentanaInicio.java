import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaInicio {
    private JPanel panel1;
    private JTextField textField1;
    private JButton verificarButton;
    private JButton nuevoUsuarioButton;
    private JButton salirButton;
    private JPasswordField passwordField1;

    public VentanaInicio() {
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("He pulsado salir");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("VentanaInicio");
        frame.setContentPane(new VentanaInicio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }
}
