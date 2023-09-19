import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
//Bibliotecas utilizadas
public class Loteria {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int escolha;

        do {
            // Imprime opções no terminal
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    int numeroApostado;

                    do {
                        System.out.print("Digite um número de 0 a 100: ");
                        numeroApostado = scanner.nextInt();

                        if (numeroApostado < 0 || numeroApostado > 100) {
                            System.out.println("Número inválido.");
                        }

                    } while (numeroApostado < 0 || numeroApostado > 100);

                    int numeroSorteado = random.nextInt(101);

                    if (numeroApostado == numeroSorteado) {
                        System.out.println("Você ganhou R$ 1.000,00!");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
                    }
                    break;
                //Opção 2,código para criar apostas com letras de A à Z
                case 2:
                    char letraPremiada = 'N'; // Substitua 'X' pela letra de sua escolha

                    System.out.println("Bem-vindo à loteria! Aposta entre A e Z:");
                    scanner.nextLine(); // Consumir a nova linha pendente após a escolha anterior
                    String userInput = scanner.nextLine().toUpperCase(); // Ler a aposta como string e converter para maiúscula

                    if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
                        char aposta = userInput.charAt(0);

                        if (aposta == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;
                //Opção 3,código para fazer apostas com número ímpar ou par
                case 3:
                    System.out.print("Digite um número inteiro para apostar em par ou ímpar: ");
                    int numeroApostadoParImpar = scanner.nextInt();

                    if (numeroApostadoParImpar % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                    //Opção 0,encerra o jogo de loteria.
                case 0:
                    System.out.println("Saindo do jogo. Obrigado por participar!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (escolha != 0);

        scanner.close(); // Feche o scanner no final do programa
    }
}
