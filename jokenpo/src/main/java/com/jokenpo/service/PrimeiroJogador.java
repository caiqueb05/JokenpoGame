package com.jokenpo.service;

import java.util.Scanner;

public class PrimeiroJogador  {

    public static int Opção() throws NumberFormatException{

        Scanner sc = new Scanner(System.in);
        int opt1 = 0;

        do {
            opt1 = 0;
            System.out.println("\nPrimeiro Passo - Digite sua primeira opção: ");
            System.out.println("1 - Pedra\n2 - Tesoura\n3 - Papel");

            try {
                opt1 = Integer.parseInt(sc.nextLine());
                if (opt1 < 1 || opt1 > 3) {
                    System.out.println("Por favor, digite uma opção válida!");
                }
            } catch (NumberFormatException e){
                System.out.println("Opção inválida, por favor, digite novamente!");
            }
        } while (opt1 < 1 || opt1 > 3);
        return opt1;
    }
}
