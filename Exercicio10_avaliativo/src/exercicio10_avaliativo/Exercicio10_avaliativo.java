/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio10_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        int n, aux, primo = 1;
        System.out.println("Digite um número: ");
        n = result.nextInt();
        aux = result.nextInt();
        while (aux == 2)
        {
        if (n % aux == 0)
        {
        System.out.println("Número primo");
        }
        else
        {
        System.out.println("Não é número primo");
        }
        }
    }
    
}
