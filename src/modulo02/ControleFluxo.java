package modulo02;

import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada

        System.out.println("=====================================================");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Solicita entrada de texto

        System.out.print("Sua data de nascimento: ");
        int ano = scanner.nextInt(); // Solicita entrada de inteiro

        // Estrutura de controle - if/if-else/else
        if (ano < 0) {
            System.out.println("Não é um ano!");
        } else if ((ano%4==0 && ano%100!=0) || ano%400==0)  {
            System.out.println(nome + " nasceu em um ano bissexto!");
        } else {
            System.out.println(nome + " não nasceu em um ano bissexto!");
        }

        System.out.println("=====================================================");

        System.out.print("Escolha uma opção do menu:\n\n[A] Adicionar\n[R] Remover\n[E] Editar\n[M] Mover\n\n>>> ");

        char op = scanner.next().charAt(0); // Solicita entrada de char

        // Estrutura de controle - switch
        switch (op) {
            case 'A':
                System.out.println("Você escolheu a opção Adicionar");
                break;
            case 'R':
                System.out.println("Você escolheu a opção Remover");
                break;
            case 'E':
                System.out.println("Você escolheu a opção Editar");
                break;
            case 'M':
                System.out.println("Você escolheu a opção Mover");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("=====================================================");

        System.out.print("Digite o número de repetições do laço while: ");
        int rep = scanner.nextInt();
        int x = 1;

        // Laço de repetição while:
        while (x <= rep) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();
        System.out.println("=====================================================");

        System.out.print("Digite o número de repetições do laço do-while: ");
        int rep1 = scanner.nextInt();
        int y = 1;

        // Laço de repetição do-while:
        do  {
            System.out.print(y + " ");
            y++;
        } while (y <= rep1);

        System.out.println();
        System.out.println("=====================================================");

        System.out.println("Repetição for 1-10");

        // Laço de repetição for:
        for (int a = 1; a < 11; a++)
            System.out.print(a + " ");

        System.out.println();
        System.out.println("=====================================================");

        System.out.println("Repetição for 1-10 | usando break");

        // O comando break quebra o laço de repetição:
        for (int a = 1; a < 11; a++) {
            if (a > 5) break;
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("=====================================================");

        System.out.println("Repetição for 1-10 | usando continue");

        // O comando continue recomeça a iteração do loop:
        for (int a = 1; a < 11; a++) {
            if ( a % 2 == 0) continue;
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("=====================================================");

        /*
            O break por padrão sai do laço mais interno, podemos sair de laços
            externos rotulando-os, veja nesse exemplo, vamos sair de um loop
            externo quando no escopo de um loop interno, uma condição for atendida.
        */

        System.out.print("Usando break com rótulos:\n\n");

        loop1: for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                if(a == 5) break loop1; // Saindo do loop mais externo
                System.out.printf("Loop 1 = %d | Loop 2 = %d\n", a, b);
            }
            System.out.println("---");
        }

        System.out.println();
        System.out.println("=====================================================");

        /*
            O continue por padrão passo a iteração do laço mais interno, podemos
            passar a iteração de loops externos rotulando-os, veja nesse exemplo,
            vamos passar a iteração de um loop externo quando no escopo de um loop
            interno, uma condição for atendida.
        */

        System.out.print("Usando continue com rótulos:\n\n");

        loop1: for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                if(a % 2 == 0) continue loop1; // Saindo do loop mais externo
                System.out.printf("Loop 1 = %d | Loop 2 = %d\n", a, b);
            }
            System.out.println("---");
        }

        System.out.println();
        System.out.println("=====================================================");
    }
}
