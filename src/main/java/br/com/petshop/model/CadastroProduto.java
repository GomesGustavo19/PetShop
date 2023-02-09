package br.com.petshop.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CadastroProduto {

    Scanner leitor = new Scanner(System.in);
    private int codigoProduto;
    private String nomeProduto;
    private double valor;
    private int quantidade;
    List<CadastroProduto> produtos = new ArrayList<>();

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getnomeProduto() {
        return nomeProduto;
    }

    public void setnomeProduto(String produto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {

        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void cadastrarProduto() {

        CadastroProduto cadastroProduto = new CadastroProduto();

        System.out.println("Codigo Produto: ");
        cadastroProduto.setCodigoProduto(leitor.nextInt());
        System.out.println("Nome do Produto:  ");
        cadastroProduto.setnomeProduto(leitor.next());
        System.out.println("Valor: ");
        cadastroProduto.setValor(leitor.nextDouble());
        System.out.println("Quantidade: ");
        cadastroProduto.setQuantidade(leitor.nextInt());

        produtos.add(cadastroProduto);
    }

    public void consultarEstoque(String produto) {
        if (nomeProduto.equalsIgnoreCase("banho")) {
            System.out.println("pet cheirosinho!");
        } else if (quantidade <= 10) {
            if (nomeProduto.equalsIgnoreCase(produto))
            System.out.println("Estoque Baixo");
        }
    }

}