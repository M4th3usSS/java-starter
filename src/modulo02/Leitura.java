package modulo02;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        // crie a variável de leitura dos dados
        Scanner s = new Scanner(System.in);
        // use os métodos de leitura específicos do tipo desejado
        System.out.print("Digite uma linha: ");
        String linha = s.nextLine(); // le a linha
        System.out.print("Digite um numero: ");
        int i = s.nextInt(); // le um inteiro
        System.out.print("Digite um numero: ");
        double d = s.nextDouble(); // le um ponto-flutuante
    }
}
