import Classes.Jogador;
import Classes.Jogo;
import Interfaces.Ijogador;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Ijogador jogador = new Jogador("Jogador 1");
        jogo.adicionarJogador(jogador);
        init(jogo);

        Scanner scan = new Scanner(System.in);
        do {
            jogo.motrarMenu();

            int opcao = scan.nextInt();
            System.out.println("\n");
            switch (opcao){
                case(1):
                    jogo.jogoParOuImpar(scan, jogador);
                    break;
                case(2):
                    jogador.mostrarHistorico();
                    break;
                case(3):
                    jogo.mostrarRankingJogador();
                    break;
                case(4):
                    return;
                default:
                    System.out.println("Selecione uma opção Valida");
            }
            System.out.println("\n\n\n");
        }while (true);

    }

    public static void init(Jogo jogo){
        jogo.adicionarJogador(new Jogador("j 1",1));
        jogo.adicionarJogador(new Jogador("j 2",80));
        jogo.adicionarJogador(new Jogador("j 3",5));
        jogo.adicionarJogador(new Jogador("j 4",25));
        jogo.adicionarJogador(new Jogador("j 5",10));
        jogo.adicionarJogador(new Jogador("j 6",50));
    }
}


