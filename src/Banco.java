import java.util.Scanner;

public class Banco {

        public static void main(String[] args) {
            String cliente = "Cliente 1";
            String conta = "Corrente";
            double saldo = 2448.50;
            int opcao = 0;

            // Dados do cliente 1

            System.out.println("**********************");
            System.out.println("Cliente: " + cliente);
            System.out.println("Conta: " + conta);
            System.out.println("Saldo atual: " + saldo);
            System.out.println("**********************");

            // Menu

            String menu = """
                    \nDigite sua opção:
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - Sair
                    """;

            Scanner opcoes = new Scanner(System.in);

            while (opcao != 4) {
                System.out.println(menu);
                opcao = opcoes.nextInt();

                if (opcao == 1) {
                    System.out.println("O saldo é: " + saldo);

                    // Enviar valor

                } else if (opcao == 2) {
                    System.out.println("Qual valor você deseja transferir?");
                    double valorTransferido = opcoes.nextDouble();

                    if (valorTransferido > 0 && valorTransferido <= saldo) {
                        saldo -= valorTransferido;
                        System.out.println("Transferência realizada. Saldo atualizado: " + saldo);
                    } else if (valorTransferido <= 0) {
                        System.out.println("Valor inválido. Tente novamente.");
                    }  else {
                        System.out.println("Saldo insuficiente");
                    }

                    // Receber valor

                } else if (opcao == 3) {
                    System.out.println("Valor recebido: ");
                    double valorRecebido = opcoes.nextDouble();

                    if (valorRecebido > 0) {
                        saldo += valorRecebido;
                        System.out.println("Recebimento realizado. Saldo atualizado: " + saldo);
                    } else {
                        System.out.println("Valor inválido. Tente novamente.");
                    }

                } else if (opcao == 4) {
                    System.out.println("Obrigado por utilizar nosso sistema!");

                } else if (opcao != 4) {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }

            opcoes.close();
        }
    }
