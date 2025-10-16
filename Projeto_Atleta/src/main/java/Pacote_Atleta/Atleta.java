package Pacote_Atleta;

public class Atleta {
    private String nome;
    private String esporte;
    private int idade;

    public Atleta(String nome, String esporte, int idade) {
        this.nome = nome;
        this.esporte = esporte;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEsporte() {
        return esporte;
    }

    public int getIdade() {
        return idade;
    }
}
