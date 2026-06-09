/*
Neste exercício, você terá de realizar os seguintes passos no seu algoritmo usando o console da IDE para interagir com o seu programa:

Dê boas vindas a um usuário no console.

Logo depois, peça ao usuário alguns dados: nome completo, cpf, idade, peso, altura e estado civíl.

Você terá de receber cada um dos dados e exibi-los de acordo com a descrição do exercício.

Dicas: atente-se ao tipo de variável que você precisa receber e preste atenção nas diferenças de sintaxe em para receber cada tipo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema!");
        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu estado civil: ");
        String estadoCivil = sc.next();

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + estadoCivil);
        sc.close();
    }
}