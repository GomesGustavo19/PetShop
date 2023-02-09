package br.com.petshop.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CadastroCliente {
    private String nomeDono;
    private int documento;
    private String nomePet;
    private String endereco;

    Scanner leitor = new Scanner(System.in);

    List<CadastroCliente> clientes = new ArrayList<>();

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarCliente() {

        CadastroCliente cadastroCliente = new CadastroCliente();

        System.out.println("Nome Do Dono: ");
        setNomeDono(leitor.next());
        System.out.println("Documento: ");
        setDocumento(leitor.nextInt());
        System.out.println("Endereço: ");
        setEndereco(leitor.next());
        System.out.println("Nome do pet: ");
        setNomePet(leitor.next());

    }

    public void consultarCliente() {
        CadastroCliente buscaCliente = new CadastroCliente();

        System.out.println("Entrar com o documento do cliente: ");
        buscaCliente.setDocumento(leitor.nextInt());
        System.out.println("---------------------------------------");

        if (Objects.equals(buscaCliente, getDocumento())) {
            System.out.println("Cliente não cadastrado, realizar o cadastro: ");
            cadastrarCliente();
        } else {

            clientes.forEach(System.out::println);
            //System.out.println("Documento: " + this.getDocumento());
           // System.out.println("Nome do Dono: " + this.getNomeDono());
            //System.out.println("Nome do Pet: " + this.getNomePet());
            //System.out.println("Endereço: " + this.getEndereco());
        }

    }

}