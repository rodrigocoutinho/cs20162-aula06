/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shakaw
 */
public class cpfTest {
    
    public cpfTest() {
    }

    /**
     * Testa vetor com numeros válidos.
     */
    @Test
    public void testCpf() {
        int n[] = {0,1,4,5,3,4,2,3,1,6,5};
        Cpf.cpf(n);
    }
    
    /**
     * Testa a entrada de numeros inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido() throws Exception {
        int n[] = {0,0,0,0,0,0,0,0,0,0,0};
        Cpf.cpf(n);
    }

    /**
     * Testa vetor com numeros válidos..
     */
    @Test
    public void testCpf2() {
        int n[] = {0,1,4,5,3,4,2,3,1,6,5};
        Cpf.cpf2(n);
    }
    
    /**
     * Testa a entrada de numeros inválido.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalido2() throws Exception {
        int n[] = {0,0,0,0,0,0,0,0,0,0,0};
        Cpf.cpf2(n);
    }

    /**
     * Test of mod method, of class cpf.
     */
    @Test
    public void testMod() {
        Cpf.mod(3,2);
    }
    
}
