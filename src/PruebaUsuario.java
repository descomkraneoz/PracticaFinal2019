public class PruebaUsuario {
    public static void main(String[] args) {
        PanelUsuario miPanel = new PanelUsuario();
        MarcoUsuario miMarco = new MarcoUsuario();
        miMarco.add(miPanel);
        //miMarco.centrarMarco();
        miMarco.pack();
        //panelUsuario.mostrar();
        //Usuario nuevo=panelUsuario.getUsuario();
        //System.out.println(nuevo);

       /* LectorTarjetas lector=new LectorTarjetas();
        lector.bloquea();
        String leido=lector.getLectura();
        System.out.println(leido); */
    }
}

