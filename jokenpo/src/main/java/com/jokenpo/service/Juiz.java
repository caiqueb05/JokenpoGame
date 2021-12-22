package com.jokenpo.service;

public class Juiz {

    public static String verificaResultado(int opt1, int opt2) {
        String empate = "\nHouve um Empate!\n";
        String pedra = "\nResultado: Pedra ganhou!\n";
        String tesoura = "\nResultado: Tesoura ganhou!\n";
        String papel = "\nResultado: Papel ganhou!\n";

        if (opt1 == 1 && opt2 == 2 || opt1 == 2 && opt2 == 1) {
            System.out.println(pedra);
            return pedra;
        } else if (opt1 == 2 && opt2 == 3 || opt1 == 3 && opt2 == 2) {
            System.out.println(tesoura);
            return tesoura;
        } else if (opt1 == 1 && opt2 == 3 || opt1 == 3 && opt2 == 1) {
            System.out.println(papel);
            return papel;
        } else if (opt1 == opt2) {
            System.out.println(empate);
        } return empate;
    }

}
