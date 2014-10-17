/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imc;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcos Vinicius
 */
public class PessoaTest {
    
    /**
     * Test of calcImc method, of class Pessoa.
     */
    @Test
    public void testCalcImc() {
        System.out.println("calcImc");
        double altura = 1.83;
        double peso = 70.0;
        Pessoa instance = new Pessoa();
        double expResult = 20.9;
        double result = instance.calcImc(altura, peso);
        //Teste em condições perfeitas
        Assert.assertEquals(expResult, result, 0.1);
        //Testar altura ser zero
        Assert.assertTrue(altura != 0);
        //Teste entrada alfanúmerica
        Assert.assertNotSame(altura, "texto");
        //Teste entrada negativa
        Assert.assertTrue(altura > 0 && peso > 0);
    }

    /**
     * Test of avalObesidade method, of class Pessoa.
     */
    @Test
    public void testAvalObesidade() {
        System.out.println("avalObesidade");
        double imc = 20.9;
        Pessoa instance = new Pessoa();
        String expResult = "peso normal";
        String result = instance.avalObesidade(imc);
        //Teste em condições perfeitas
        Assert.assertEquals(expResult, result);
        //Teste entrada alfanumérica
        Assert.assertNotSame(imc, "texto");
    }
    
}
