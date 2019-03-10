package exercicio3;

public class ContaCorrente {
    private int numero;
    private double saldo = 0;

    public ContaCorrente(int numero) {
        this.numero = numero;
    }

    public double depositar(double valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        this.saldo = this.saldo - valor;
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
