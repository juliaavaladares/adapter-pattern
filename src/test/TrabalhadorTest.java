package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Trabalhador;

public class TrabalhadorTest {
    @Test
    void deveRetornarSalarioTrabalhadorCLT() {
        Trabalhador trabalhador = new Trabalhador();

        trabalhador.setRegimeTrabalho("CLT");
        trabalhador.setSalario((float) 1900.30);

        assertEquals(1900.30/2, trabalhador.getSalario());
        assertEquals("CLT", trabalhador.getRegimeDeTrabalho());
    }


    @Test
    void deveRetornarSalarioTrabalhadorCNPJ() {
        Trabalhador trabalhador = new Trabalhador();

        trabalhador.setRegimeTrabalho("CNPJ");
        trabalhador.setSalario((float) 1900.30);

        assertEquals(1900.30*2, trabalhador.getSalario());
        assertEquals("CNPJ", trabalhador.getRegimeDeTrabalho());
    }
}
