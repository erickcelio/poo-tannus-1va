package exercicio2;

public class Pessoa {
    public String nome;
    public int idade;
    public String sexo;
    public String x[];

    public Pessoa(String nome, int idade, String sexo, String[] x) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.x = x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String[] getX() {
        return x;
    }

    public void setX(String[] x) {
        this.x = x;
    }

    public void showElementX(int pos) {
        System.out.println(this.x[pos-1]);
    }

    public void showAllElementsX() {
        for (String el: x) {
            System.out.println(el);
        }
    }
}
