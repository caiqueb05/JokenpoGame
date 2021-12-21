package com.jokenpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class JokenpoApplication {

	public static void main(String[] args) throws NumberFormatException {
		SpringApplication.run(JokenpoApplication.class, args);

		Scanner sc = new Scanner(System.in);

		/*Definição variáveis*/
		int opt1 = 0, opt2 = 0;
		int novamente, aux;
		String empate = "\nHouve um Empate!\n";
		String pedra = "\nPedra ganhou!\n";
		String tesoura = "\nTesoura ganhou!\n";
		String papel = "\nPapel ganhou!\n";

		System.out.println("\nOlá, seja bem vindo ao Jokenpo!");

		/*Loop*/
		do {

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

			if (opt1 == 1 && opt2 == 1 || opt1 == 2 && opt2 == 2 || opt1 == 3 && opt2 == 3) {
				System.out.println(empate);
			}

			if (opt1 == 1 && opt2 == 2) {
				System.out.println(pedra);
			} else if (opt1 == 1 && opt2 == 3) {
				System.out.println(papel);
			}

			if (opt1 == 2 && opt2 == 1) {
				System.out.println(pedra);
			} else if (opt1 == 2 && opt2 == 3) {
				System.out.println(tesoura);
			}

			if (opt1 == 3 && opt2 == 1) {
				System.out.println(papel);
			} else if (opt1 == 3 && opt2 == 2) {
				System.out.println(tesoura);
			}

			do {
				novamente = 0;
				System.out.println("Deseja jogar novamente?\n1 - Sim\n0 - Não");

				try {
					novamente = Integer.parseInt(sc.nextLine());
					if (novamente == 0) {
						System.out.println("\nObrigado por jogar!");
						System.exit(0);
					}
					if (novamente != 1 && novamente != 0) {
						System.out.println("Por favor, digite uma opção válida!");
					}

				} catch (NumberFormatException e) {
					System.out.println("\nOpção inválida, por favor, digite novamente!\n");
				}
			} while (novamente != 1);

			aux = novamente;

		} while (aux == 1);

	}

}
