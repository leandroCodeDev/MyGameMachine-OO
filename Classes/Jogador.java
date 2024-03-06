package Classes;

import Interfaces.Ijogador;

import java.util.ArrayList;
import java.util.List;

public class Jogador implements Ijogador {

    private String nome;
    private int pontuacao;
    private List<String> historicos;

    public Jogador(String nome,int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        historicos = new ArrayList<>();
    }

    public Jogador(String nome) {
        this.nome = nome;
        pontuacao = 0;
        historicos = new ArrayList<>();
    }

    @Override
    public void registrarVitoria() {
        pontuacao += 1;
    }

    @Override
    public void registrarDerrota() {
        if (pontuacao >= 1) {
            pontuacao -= 1;
        }
    }

    @Override
    public void adicionarHistorico(String jogada) {
        historicos.add(jogada);
    }

    @Override
    public void mostrarHistorico() {

        if (historicos.size() == 0) {
            System.out.println(this.nome + " não tem historico de jogadas ainda.");
        } else {
            for (String historico : historicos) {
                System.out.println(historico);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
