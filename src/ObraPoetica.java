public class ObraPoetica {

    private final String nombre;
    private final String editorial;
    private int anioPublicacion;
    TipoPoesia tipoPoesia;

    enum TipoPoesia {
        DRAMATICA, LIRICA, EPICA, BUCOLICA;
    }

    public ObraPoetica(String nombre, String editorial, int anioPublicacion, TipoPoesia tipoPoesia) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.tipoPoesia = tipoPoesia;
    }

    @Override
    public String toString() {
        return nombre + '\'' +
                ", editorial='" + editorial + '\'' +
                ", añoPublicación=" + anioPublicacion +
                ", tipoPoesia=" + tipoPoesia;
    }
}
