/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobasicojava.lendoteclado;

import java.util.Scanner;

/**
 *
 * @author Marcelo Bastos
 */
public class LendoTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome, sua idade, qtde filhos e se tem bicho estimação:");
        String nome = scan.next();
        int idade = scan.nextInt();        
        byte filho = scan.nextByte();
        boolean pet = scan.nextBoolean();
        
        
        System.out.println("Você digitou:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Filhos: " + filho);
        System.out.println("Pet: " + pet);
        
    }
}
