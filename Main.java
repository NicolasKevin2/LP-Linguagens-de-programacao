import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício loops");
        exercicio1();
        exercicio2();
    }

    //Faça o algoritmo que leia X números,faça a leitura dos números e imprima quantos números sao pares e ímpares
    private static void exercicio1() {
        int contpar = 0;
        int contimpar = 0;
        int num = -1;
        Scanner scn = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Digite um número");
            num = scn.nextInt();
            if (num % 2 == 0) {
                contpar = contpar + 1;
            } else {
                contimpar = contimpar + 1;
            }
        }
        System.out.println("a quantidade de números  pares é :" + contpar);
        System.out.println("a quantidade de números ímpar é:" + contimpar);
    }

    private static void exercicio2() {
        int cont = 0;
        int soma = 0;
        int num = 0;
        Scanner scn = new Scanner(System.in);
        while (num != -1) {
            System.out.println("Digite o" + num + "numero");
            num = scn.nextInt();
            cont = cont + 1;
            soma = soma + num;
        }
        System.out.println("total de números digitados" + cont);
        System.out.println("soma dos números" + soma);
    }

    private static void exercicio3() {
        Scanner scn = new Scanner(System.in);
        double nota;
        double soma = 0.0;
        for (int i = 1; i < 3; i++) {
            System.out.println("Digite a " + i + "nota");
            nota = scn.nextDouble();
            soma = soma + nota;
        }
        System.out.println("A soma das notas foi:" + soma);
        System.out.println("A média das notas foi:" + (soma / 3));
    }
}