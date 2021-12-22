package com.jokenpo;

import com.jokenpo.service.Juiz;
import com.jokenpo.service.PrimeiroJogador;
import com.jokenpo.service.SegundoJogador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class JokenpoApplication {

	public static int Opcao(PrimeiroJogador op, int opt1){
		System.out.println(op.Opção());
		return opt1;
	}

	public static int Opcao2(SegundoJogador op, int opt2){
		System.out.println(op.Opção2());
		return opt2;
	}

	public static void main(String[] args) throws NumberFormatException {
		SpringApplication.run(JokenpoApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.println("\nOlá, seja bem vindo ao Jokenpo!");

		/*Definição variáveis*/
		int novamente, aux;

		/*Loop*/
		do {
			int opt1 = PrimeiroJogador.Opção(), opt2 = SegundoJogador.Opção2();
			Juiz.verificaResultado(opt1, opt2);

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
						System.out.println("\nPor favor, digite uma opção válida!\n");
					}

				} catch (NumberFormatException e) {
					System.out.println("\nOpção inválida, por favor, digite novamente!\n");
				}
			} while (novamente != 1);

			aux = novamente;

		} while (aux == 1);

	}

}
