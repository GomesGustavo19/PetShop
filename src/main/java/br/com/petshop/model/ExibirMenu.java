package br.com.petshop.model;

import java.util.Scanner;

public class ExibirMenu {

    public static void menu() {

        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        Menu de Opções                     |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 01 - Cadastrar Cliente                    |");
        System.out.println("| 02 - Cadastrar Produto                    |");
        System.out.println("| 03 - Consultar cliente                    |");
        System.out.println("| 04 - Ponto de Venda                       |");
        System.out.println("| 05 - Imprimir relatório de produtos       |");
        System.out.println("| 50 - Exibir o menu de opções              |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 99 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }

    public static void main(String[] args) {

        short opcao = 50;
        Scanner leitor = new Scanner(System.in);
        CadastroCliente cadastroCliente = new CadastroCliente();
        CadastroProduto cadastroProduto = new CadastroProduto();
        RegistroDeVenda registroDeVenda = new RegistroDeVenda();

        do{
            menu();

            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                   cadastroCliente.cadastrarCliente();
                    break;
                case 2:
                    cadastroProduto.cadastrarProduto();
                    break;
                case 3:
                   cadastroCliente.consultarCliente();
                    break;
                case 4:
                    registroDeVenda.registrarVenda();
                    break;
                case 50:
                    menu();
                    break;
                default:
                    menu();
            }
        }while(opcao != 99);
    }

}
