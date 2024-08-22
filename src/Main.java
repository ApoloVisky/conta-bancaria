

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeCliente = "Adeilton da Silva";
        String  tipoConta = "Corrente";
        double saldo = 2000.0;
        int opcao = 0;
        double deposito = 0;
        double saque = 0;
        double saldoDeposito;
        double saldoSaque;


        while(opcao != 4) {
            System.out.println("*********************************");
            System.out.println("Dados iniciais do cliente: \n");
            System.out.println("Nome: " + nomeCliente);
            System.out.println("Tipo da conta: " + tipoConta);
            System.out.println("Saldo inicial: " + saldo);
            System.out.println("*********************************\n");

            System.out.println("Operações\n");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Finalizar Operação\n");
            System.out.print("Digite a operação que deseja: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é de: "+saldo);

            } else if (opcao == 2) {
                System.out.print("Digite o valor para depósito: ");
                deposito = scanner.nextDouble();
                saldoDeposito = deposito +saldo;
                saldo = saldoDeposito;
                System.out.println("Seu saldo atual é de: "+saldoDeposito);

            } else if (opcao ==3) {
                System.out.print("Digite o valor para saque: ");
                saque = scanner.nextDouble();

                //Função caso o saque seja maior que o saldo
                if (saque < saldo){
                    saldoSaque = saldo - saque;
                    saldo = saldoSaque;
                    System.out.println("Seu saldo atual é: "+saldoSaque);
                } else {
                    System.out.println("Valor indisponível para saque;");
                }

            }else {
                System.out.println("Digite uma opção válida.");
            }


        }

    }
}