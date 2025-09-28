package Pacote_Fruta;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Fruta> frutas;

    public Cliente(String nome) {
        this.nome = nome;
        this.frutas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public List<Fruta> getFrutas() { return frutas; }

    public void adicionarFruta(Fruta f) {
        frutas.add(f);
    }
}