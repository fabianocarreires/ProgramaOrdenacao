package Aula03;

import java.util.Scanner;
import java.util.Random;

public class Tarefa1 {

    static int[] meuArray = new int[20];

    public static void main(String[] args) {
        int opcao;
        int opcao1;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        do {
            System.out.println("***Programa de Ordenação***");
            System.out.println("Menu de Opções");
            System.out.println("1 - Digitar 20 números");
            System.out.println("2 - Gerar 20 números");
            System.out.println("3 - Ordenar");
            System.out.println("4 - Sair");
            System.out.print("Opção : ");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.println("Digite 20 números inteiros: ");
                for (int i = 0; i < 20; i++) {
                    meuArray[i] = entrada.nextInt();
                }
            }
            if (opcao == 2) {
                System.out.println("Gerei 20 números inteiros para você.");
                for (int i = 0; i < 20; i++) {
                    meuArray[i] = numero.nextInt(999);
                }
            }
            if (opcao == 3) {
                do {
                    System.out.println("Menu Ordenação");
                    System.out.println("1 - BubbleSort");
                    System.out.println("2 - InsertionSort");
                    System.out.println("3 - SelectionSort");
                    System.out.println("4 - Voltar Menu Anterior");
                    System.out.print("Opção : ");
                    opcao1 = entrada.nextInt();
                    if (opcao1 == 1) {
                        System.out.println("O vetor original era esse: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                        bubbleSort();
                        System.out.println("E o vetor ordenado via BubbleSort ficou assim:");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                    }
                    if (opcao1 == 2) {
                        System.out.println("O vetor original era esse: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                        insertionSort();
                        System.out.println("E o vetor ordenado via InsertionSort ficou assim:");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                    }
                    if (opcao1 == 3) {
                        System.out.println("O vetor original era esse: ");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                        selectionSort();
                        System.out.println("E o vetor ordenado via SelectionSort ficou assim:");
                        for (int i = 0; i < 20; i++) {
                            System.out.print(meuArray[i] + " ");
                        }
                        System.out.println("\n");
                    }
                } while (opcao1 != 4);
            }
        } while (opcao != 4);
    }

    public static void bubbleSort() {
        for (int i = 0; i < meuArray.length - 1; i++) {
            for (int j = 0; j < meuArray.length - 1 - i; j++) {
                if (meuArray[j] > meuArray[j + 1]) {
                    int aux = meuArray[j];
                    meuArray[j] = meuArray[j + 1];
                    meuArray[j + 1] = aux;
                }
            }
        }
    }

    public static void insertionSort() {
        for (int i = 1; i < meuArray.length; i++) {
            int j = i;
            while (j > 0 && meuArray[j] < meuArray[j - 1]) {
                int aux = meuArray[j];
                meuArray[j] = meuArray[j - 1];
                meuArray[j - 1] = aux;
                j -= 1;
            }
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < meuArray.length; i++) {
            int i_menor = i;
            for (int j = i + 1; j < meuArray.length; j++) {
                if (meuArray[j] < meuArray[i_menor]) {
                    i_menor = j;
                }
            }
            int aux = meuArray[i];
            meuArray[i] = meuArray[i_menor];
            meuArray[i_menor] = aux;
        }
    }
}
