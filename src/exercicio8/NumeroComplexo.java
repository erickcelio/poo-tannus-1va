package exercicio8;

public class NumeroComplexo {
    private double real;
    private double imaginaria;

    public NumeroComplexo (double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public NumeroComplexo () {
        this.real = 0.0;
        this.imaginaria = 0.0;
    }

    public void inicializaNumero (double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public boolean eIgual (NumeroComplexo y) {
        return this.real == y.real && this.imaginaria == y.imaginaria;
    }

    public void imprimeNumero () {
        System.out.println(this.real + " + (" + this.imaginaria + ")i");
    }

    public void somar(NumeroComplexo y) {
        this.real += y.real;
        this.imaginaria += y.imaginaria;
    }

    public void subtrair(NumeroComplexo y) {
        this.real -= y.real;
        this.imaginaria -= y.imaginaria;
    }

    public void multiplica(NumeroComplexo y) {
        double real = this.real * y.real - this.imaginaria * y.imaginaria;
        double imaginaria = this.real * y.imaginaria + this.imaginaria * y.real;
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void dividir(NumeroComplexo y) {
        double real = (this.real * y.real + this.imaginaria * y.imaginaria) / y.real * y.real + y.imaginaria * y.imaginaria;
        double imaginaria = (this.imaginaria * y.real - this.real * y.imaginaria) / y.real * y.real + y.imaginaria * y.imaginaria;
        this.real = real;
        this.imaginaria = imaginaria;
    }
 }
