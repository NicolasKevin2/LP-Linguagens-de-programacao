import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercícios Loops");
        exercicio1();
        exercicio2();
        exercicio3();
    }

    private static void exercicio1() {
        int cont = 0;
        for (int i = 2; i <= 1000; i += 2) {
            if (i % 3 == 0) {
                System.out.println(i + "");
                cont++;
            }
        }
        System.out.println("Total de números: " + cont);
    }

    private static void exercicio2() {
        Scanner scn = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número");
            numero = scn.nextInt();
            soma = soma + numero;
        }
        System.out.println("A média dos números é: " + soma / 10);
    }

    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        int area = 0;
        int largura = 0;
        int comprimento = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a largura do terreno: ");
            largura = scn.nextInt();
            System.out.println("Digite o comprimento do terreno: ");
            comprimento = scn.nextInt();
            area = largura * comprimento;
            System.out.println("A área do terreno é: " + area);
        }
    }
}