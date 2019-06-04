import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoUsuario extends JDialog {
    /*private Usuario usuarioActual;
    private PanelUsuario panelIntroduccionUsuario =new PanelUsuario();
    //private PanelNuevoUsuario panelNuevoUsuario=new PanelNuevoUsuario();
    private ListaDeUsuario listaDeUsuario=new ListaDeUsuario();
    //private PanelAceptarYCancelar aceptarYCancelarUsuario= new PanelAceptarYCancelar() {
        @Override
        public ActionListener aceptar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!numeroDeIdentificacionValido(panelIntroduccionUsuario.getNumeroUsuario())){
                        JOptionPane.showMessageDialog(null,"El número de usuario ha de ser de "
                                + Usuario.CANTIDAD_DE_NUMEROS_IDENTIFICACION+" números.","Error",JOptionPane.ERROR_MESSAGE);
                    } else if(!listaDeUsuario.estaElUsuario(panelIntroduccionUsuario.getPasswordField())){
                        nuevoUsuario();
                    }else{
                        usuarioActual=listaDeUsuario.elegirUsuario(panelIntroduccionUsuario.getPasswordField());
                        dispose();
                    }

                }
            };
        }
        private void nuevoUsuario(){
            DialogoUsuario.this.remove(panelIntroduccionUsuario);
            setTitle("Nuevo Usuario");
            DialogoUsuario.this.add(panelNuevoUsuario, BorderLayout.CENTER);
            setVisible(false);
            DialogoUsuario.this.remove(aceptarYCancelarUsuario);
            aceptarYCancelarUsuario=new PanelAceptarYCancelar() {
                @Override
                public ActionListener aceptar() {
                    return new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try{
                                usuarioActual=new Usuario(panelIntroduccionUsuario.getNumeroUsuario(),
                                        panelNuevoUsuario.getNombre(),
                                        panelNuevoUsuario.getApellidos(),
                                        panelNuevoUsuario.getCorreoElectronico(),
                                        panelNuevoUsuario.getFechaDeNacimiento());
                                listaDeUsuario.anyadirUsuario(usuarioActual);
                                listaDeUsuario.escribir();
                                dispose();
                            }catch (IllegalArgumentException iae){
                                JOptionPane.showMessageDialog(null,iae.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    };

                }

                @Override
                public ActionListener cancelar() {
                    return new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dispose();
                        }
                    };
                }
            };
            DialogoUsuario.this.add(aceptarYCancelarUsuario, BorderLayout.SOUTH);

            setVisible(true);
        }

        @Override
        public ActionListener cancelar() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            };
        }
    };

    DialogoUsuario(){
        setModal(true);
        setTitle("Usuario");
        setLayout(new BorderLayout());
        setBounds(0,0,400,125);
        add(panelIntroduccionUsuario,BorderLayout.CENTER);
        add(aceptarYCancelarUsuario,BorderLayout.SOUTH);

        setModal(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    private static boolean numeroDeIdentificacionValido(String numeroDeValidacion){
        return numeroDeValidacion.length()==Usuario.CANTIDAD_DE_NUMEROS_IDENTIFICACION;
    }

    public Usuario getUsuario() {
        return usuarioActual;
    }*/
}