package exercicio5;

public class Gps {
    private String idioma;
    private String rota;

    public Gps() {
    }

    public Gps(String idioma, String rota) {
        this.idioma = idioma;
        this.rota = rota;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public void mostrar() {
        System.out.println("Informação Atual do GPS:");
        System.out.println("Idioma: " + this.idioma);
        System.out.println("Rota: " + this.rota);
    }
}
