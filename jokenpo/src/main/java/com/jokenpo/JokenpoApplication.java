package com.jokenpo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class JokenpoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JokenpoApplication.class, args);

		Scanner sc = new Scanner(System.in);

		/*Definição variáveis*/
		int opt1, opt2;
		int novamente = 0;
		String empate = "\nHouve um Empate!\n";
		String pedra = "\nPedra ganhou!\n";
		String tesoura = "\nTesoura ganhou!\n";
		String papel = "\nPapel ganhou!\n";

		System.out.println("\nOlá, seja bem vindo ao Jokenpo!");

		/*Loop*/
		do {

			System.out.println("\nDigite sua primeira opção: ");
			System.out.println("1 - Pedra\n2 - Tesoura\n3 - Papel");
			opt1 = sc.nextInt();

			System.out.println("\nDigite sua segunda opção: ");
			System.out.println("1 - Pedra\n2 - Tesoura\n3 - Papel");
			opt2 = sc.nextInt();

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

			System.out.println("Deseja jogar novamente?\n1 - Sim\n0 - Não");
			novamente = sc.nextInt();

		} while (novamente == 1);
		if (novamente == 0) {
			System.out.println("\nObrigado por jogar!");
		}
		System.exit(0);


	}

}
