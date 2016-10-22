/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package cs;

import org.junit.Test;

/**
 *
 * @author Shakaw
 */
public class cpfTest {

    /**
     * Testa vetor com numeros válidos.
     */
    @Test
    public void testCpf() {
        int n[] = {0, 1, 4, 5, 3, 4, 2, 3, 1, 6, 5};
        Cpf.cpf(n);
    }

    /**
     * Testa a entrada de numeros inválido.
     *
     * @throws java.lang.Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        int n[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Cpf.cpf(n);
    }

    /**
     * Testa a entrada de numeros inválido.
     *
     */
    public void testNumeroInvalido2() {
        int n[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Cpf.cpf(n);
    }

    /**
     * Testa vetor com numeros válidos..
     */
    @Test
    public void testCpf2() {
        int n[] = {0, 1, 4, 5, 3, 4, 2, 3, 1, 6, 5};
        Cpf.cpf2(n);
    }

    /**
     * Testa a entrada de numeros inválido.
     *
     * @throws java.lang.Exception
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido3() throws Exception {
        int n[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Cpf.cpf2(n);
    }

    /**
     * Testa a entrada de numeros inválido.
     *
     */
    public void testNumeroInvalido4() {
        int n[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        Cpf.cpf2(n);
    }

    /**
     * Test of mod method, of class cpf.
     */
    @Test
    public void testMod() {
        Cpf.mod(3, 2);
    }

}
