import Classes.Jogo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Scanner scan = new Scanner(System.in);
        do {
            jogo.motrarMenu();
            int opcao = scan.nextInt();
            switch (opcao){
                case(1):
                    jogo.jogoParOuImpar(scan);
                    break;
                case(4):
                    return;
                default:
                    System.out.println("Selecione uma opção Valida");
            }


        }while (true);







    }
}


