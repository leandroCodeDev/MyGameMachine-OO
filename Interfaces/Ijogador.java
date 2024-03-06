package Interfaces;

public interface Ijogador {

    public void registrarVitoria();
    public void registrarDerrota();
    public void adicionarHistorico(String jogada);
    public void mostrarHistorico();
    public int getPontuacao();
    public String getNome();
}
