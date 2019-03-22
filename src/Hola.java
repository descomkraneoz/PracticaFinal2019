public class Hola {
    public static void main(String[] args) {
        //System.out.println(" Hola mundo ");
        Persona pepe = new Persona("Pepe", "Martinez", null, Persona.Sexo.HOMBRE, "español", 12, 03, 1985);


        //System.out.println(pepe.getFechaNacimiento());

        //System.out.println(pepe.getEdad());

        //System.out.println("----------------------");


        //System.out.println(pepe);

        ObraPoetica veinte = new ObraPoetica("Veinte poemas de amor", "Nascimento", 1924, ObraPoetica.TipoPoesia.BUCOLICA);

        Poeta pablo = new Poeta("Pablo", "Neruda", null, Persona.Sexo.HOMBRE, "Chileno", 12, 7, 1904,
                23, 9, 1973, veinte);

        System.out.println(pablo);



    }
}
