package com.jokenpo.teste;

import com.jokenpo.juiz.Resultado;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultadoTest {

    @Test
    public void verificaEmpate() {
        int opt1 = 1;
        int opt2 = 1;
        String RetornoFeito = Resultado.verificaEmpate(opt1, opt2);
        assertEquals("\nHouve um Empate!\n", RetornoFeito);
    }

    @Test
    public void verificaVencedorPedra() {
        int opt1 = 1;
        int opt2 = 2;
        String RetornoEsperado = "\nResultado: Pedra ganhou!\n";
        String RetornoFeito = Resultado.verificaPedra(opt1, opt2);
        assertEquals(RetornoEsperado, RetornoFeito);
    }

    @Test
    public void verificaVencedorTesoura() {
        int opt1 = 2;
        int opt2 = 3;
        String RetornoFeito = Resultado.verificaTesoura(opt1, opt2);
        assertEquals("\nResultado: Tesoura ganhou!\n", RetornoFeito);
    }

    @Test
    public void verificaVencedorPapel() {
        int opt1 = 1;
        int opt2 = 3;
        String RetornoFeito = Resultado.verificaPapel(opt1, opt2);
        assertEquals("\nResultado: Papel ganhou!\n", RetornoFeito);
    }

}
