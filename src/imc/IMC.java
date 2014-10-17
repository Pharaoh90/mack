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
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double altura = 1.83;
        double peso = 70;
        
        Pessoa teste = new Pessoa();
        double imc = teste.calcImc(altura, peso);
        String saida = teste.avalObesidade(imc);
        System.out.println(saida + " " + imc);
    }
    
}
