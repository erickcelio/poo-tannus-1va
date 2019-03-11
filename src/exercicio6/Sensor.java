package exercicio6;

public class Sensor {
    private boolean ligado;
    private String codigo;
    private boolean ativado;

    public Sensor(String codigo) {
        this.codigo = codigo;
        this.ativado = false;
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void ativar() {
        this.ativado = true;
    }

    public void desativar() {
        this.ativado = false;
    }
}
