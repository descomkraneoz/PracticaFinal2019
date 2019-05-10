public class Hola {
    public static void main(String[] args) {
        //System.out.println(" Hola mundo ");
        Poeta pepe = new Poeta("Pepe", "Martinez", null, Poeta.Sexo.HOMBRE, "español", 12, 03, 1985);


        //System.out.println(pepe.getFechaNacimiento());

        //System.out.println(pepe.getEdad());

        //System.out.println("----------------------");


        //System.out.println(pepe);

        ObraPoetica veinte = new ObraPoetica("Veinte poemas de amor", "Nascimento", 1924, ObraPoetica.TipoPoesia.BUCOLICA);

        Cantantes pablo = new Cantantes("Pablo", "Neruda", null, Poeta.Sexo.HOMBRE, "Chileno", 12, 7, 1904,
                23, 9, 1973, veinte);

        System.out.println(pablo.getEdadFinal());



    }
}
