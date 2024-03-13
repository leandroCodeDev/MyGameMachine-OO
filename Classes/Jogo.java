package Classes;

import Interfaces.Ijogador;
import Interfaces.Ijogo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Jogo implements Ijogo {

    private List<Ijogador> jogadores;
    public Jogo(){
        jogadores = new ArrayList<>();
    }
    @Override
    public void motrarMenu() {
        System.out.println("Seja bem vindo ao jogo Par ou Impar! \n\n");
        System.out.println("Menu:");
        System.out.println("1. jogar");
        System.out.println("2. Ver Histórico de Jogadas");
        System.out.println("3. Ver Ranking");
        System.out.println("4. Sair \n");
        System.out.print("Escolha uma opção: ");
    }

    public void jogoParOuImpar(Scanner scan, Ijogador jogador){
        String sair = "sim";
        do {
            System.out.println("Instruções: Você escolherá ser Par ou Ímpar e em seguida escolherá um número de 0 a 10.\n" +
                    "O computador também escolherá um número de 0 a 10. Se a soma dos dois números for par e você escolheu Par, você ganha! E vice-versa.");
            System.out.println("Faça a sua escolhar: \"Par\" ou \"Impar\" ");
            System.out.print("Digite a sua escolhar aqui:");

            String escolha = scan.next();
            escolha += scan.nextLine();
            System.out.print("Digite seu número (0 a 10):");
            int jogada = scan.nextInt();

            Random random = new Random();
            int jogadaComputador = random.nextInt(0, 10);

            int calculaJogada = jogadaComputador + jogada;

            String resultado = calculaJogada % 2 == 0 ? "par" : "impar";

            System.out.println("\n");
            System.out.println("Número do jogador: " + jogada);
            System.out.println("Número do computador: " + jogadaComputador);
            System.out.println("Soma: " + calculaJogada);
            System.out.println(resultado.toUpperCase() + " venceu!");
            System.out.println("\n");

            String historico= jogador.getNome()+": "+escolha+"" +
                    ", "+jogador.getNome()+": "+jogada+", Computador: "+jogadaComputador+", Resultado: ";
            if (resultado.equalsIgnoreCase(escolha)) {
                jogador.registrarVitoria();
                this.ordenarVitoriaJogador(jogador);
                System.out.println("Você ganhou!");
                historico += "Vitória!";
            } else {
                jogador.registrarDerrota();
                this.ordenarDerrotaJogador(jogador);
                System.out.println("Você perdeu.");
                historico += "derrota.";
            }
            jogador.adicionarHistorico(historico);

            System.out.println("Deseja jogar novamente? [sim/nao]");
            sair = scan.next();
            sair += scan.nextLine();

        }while (sair.equalsIgnoreCase("sim"));
    }

    public void adicionarJogador(Ijogador jogador){
        jogadores.add(jogador);
    }

    public void ordenarDerrotaJogador(Ijogador jogador){
        int posicao = jogadores.indexOf(jogador);
        for (int i = posicao; i < jogadores.size(); i++) {
            if(posicao == jogadores.size()-1){
                return;
            }
            Ijogador jogadorAbaixo =  jogadores.get(posicao+1);
            if(jogador.getPontuacao() < jogadorAbaixo.getPontuacao() ){
                Collections.swap(jogadores,posicao,posicao+1);
                posicao= posicao+1;
            }else{
                return;
            }
        }
    }

    public void ordenarVitoriaJogador(Ijogador jogador){
        int posicao = jogadores.indexOf(jogador);
        for (int i = jogadores.size(); 0 < i; i--) {
            if(posicao == 0){
                return;
            }
            Ijogador jogadorAcima =  jogadores.get(posicao-1);

            if(jogador.getPontuacao() > jogadorAcima.getPontuacao() ){
                Collections.swap(jogadores,posicao,posicao-1);
                posicao= posicao-1;

            }else{
                return;
            }
        }
    }



    public void mostrarRanking(){

        System.out.println("Lista de jogadores");
        for(Ijogador j:jogadores){
            System.out.println("Nome: " + j.getNome() + " Pontução: "+j.getPontuacao());
        }


    }
}
