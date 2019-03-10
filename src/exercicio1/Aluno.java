package exercicio1;

import java.util.ArrayList;

public class Aluno {
    public String nome;
    public double notas[];
    public double media;
    private String sala;

    public Aluno(String nome, double[] notas, String sala) {
        this.nome = nome;
        this.sala = sala;
        this.notas = notas;
        this.atualizarMedia(notas);
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public double[] getNotas() {
        return notas;
    }

    public String getSala() {
        return sala;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia() {
        this.atualizarMedia(this.notas);
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
        this.atualizarMedia(notas);
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void atualizarMedia(double notas[]) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        this.media = soma/notas.length;
    }
}
