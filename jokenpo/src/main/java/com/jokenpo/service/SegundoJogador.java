package com.jokenpo.service;

import java.util.Scanner;

public class SegundoJogador {

    public static int Opção2() throws NumberFormatException {

        Scanner sc = new Scanner(System.in);
        int opt2 = 0;

        do {
            opt2 = 0;
            System.out.println("\nSegundo Passo - Digite sua segunda opção: ");
            System.out.println("1 - Pedra\n2 - Tesoura\n3 - Papel");

            try {
                opt2 = Integer.parseInt(sc.nextLine());
                if (opt2 < 1 || opt2 > 3) {
                    System.out.println("Por favor, digite uma opção válida!");
                }
            } catch (NumberFormatException e){
                System.out.println("Opção inválida, por favor, digite novamente!");
            }
        } while (opt2 < 1 || opt2 > 3);
        return opt2;
    }

}
