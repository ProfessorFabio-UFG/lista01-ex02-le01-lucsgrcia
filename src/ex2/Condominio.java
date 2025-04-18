package ex2;

import java.util.Scanner;

public class Condominio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        int contador = 1;

        while (continuar) {

            System.out.println("\nCadastro de Moradores:");
            System.out.println("\nMorador " + contador);
            contador++;
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Data de Nascimento (dd/mm/yyyy): ");
            String dataNascimento = sc.nextLine();
            System.out.print("Sexo: ");
            char sexo = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Celular (##) 9####-####: ");
            String celular = sc.nextLine();
            System.out.print("Apartamento: ");
            int apartamento = sc.nextInt();
            System.out.print("Bloco: ");
            int bloco = sc.nextInt();

            Morador m = new Morador(nome, dataNascimento, sexo, cpf, celular, apartamento, bloco);

            System.out.println("\n" + m);

            System.out.println("\n(1)Cadastrar novo morador" +
                    "\n(2)Sair");

            int op = sc.nextInt();
            sc.nextLine();

            if (op > 1) {
                continuar = false;
            }
        }
    }
}
