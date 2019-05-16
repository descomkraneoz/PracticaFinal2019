import java.util.Objects;

public class Disco {

    private String nombreDisco;
    private int unidadesVendidas;

    public Disco(String nombreDisco, int unidadesVendidas) {
        this.nombreDisco = nombreDisco;
        if (unidadesVendidas > 0) {
            this.unidadesVendidas = unidadesVendidas;
        }

    }

    public Disco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "nombreDisco='" + nombreDisco + '\'' +
                ", unidadesVendidas=" + unidadesVendidas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disco disco = (Disco) o;
        return
                unidadesVendidas == disco.unidadesVendidas &&
                        Objects.equals(nombreDisco, disco.nombreDisco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDisco);
    }

}