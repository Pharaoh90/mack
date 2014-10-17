/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imc;

/**
 *
 * @author Marcos Vinicius
 */
public class Pessoa {
    
    
    
    public double calcImc(double altura, double peso) {
        double imc = peso / (altura * altura);
        return imc;
    }
    
    public String avalObesidade(double imc) {
        String saida;
        
         if (imc < 20)
            saida = "abaixo do peso";
         else if ((imc >= 20) && (imc < 25))
            saida = "peso normal";
         else if ((imc >= 25) && (imc < 30))
            saida = "acima do peso";
         else if ((imc >= 30) && (imc < 34))
            saida = "obeso";
         else
            saida = "muito obeso";
         
         return saida;
    }
    
}
