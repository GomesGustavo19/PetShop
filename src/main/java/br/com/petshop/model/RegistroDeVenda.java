package br.com.petshop.model;

import java.util.List;
import java.util.Scanner;

public class RegistroDeVenda extends CadastroProduto {

    CadastroCliente cadastroCliente = new CadastroCliente();
    Scanner leitor = new Scanner(System.in);

    public void registrarVenda() {

        cadastroCliente.consultarCliente();
        String produto = leitor.next();

       consultarEstoque(produto);


    }
}