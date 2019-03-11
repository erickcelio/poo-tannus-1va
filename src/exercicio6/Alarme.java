package exercicio6;

public class Alarme {
    private String tipo;
    private boolean ativo;

    Alarme(String tipo) {
        this.tipo = tipo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }
}
