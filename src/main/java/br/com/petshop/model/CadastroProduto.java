package br.com.petshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity
public class CadastroProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoProduto;
    private String nomeProduto;
    private double valor;
    private int quantidade;

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

    public void consultarEstoque(String produto) {
        if (nomeProduto.equalsIgnoreCase("banho")) {
            System.out.println("pet cheirosinho!");
        } else if (quantidade <= 10) {
            if (nomeProduto.equalsIgnoreCase(produto))
            System.out.println("Estoque Baixo");
        }
    }

}