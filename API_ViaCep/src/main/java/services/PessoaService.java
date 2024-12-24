package services;

import entities.Endereco;
import entities.Pessoa;

import java.util.ArrayList;

public class PessoaService {

    private Pessoa pessoa;

    public PessoaService() {
        this.pessoa = new Pessoa();
    }

    public void pessoaNome(String nome) {
        this.pessoa.setNome(nome);
    }

    public void idadePessoa(String idade) {
        this.pessoa.setIdade(idade);
    }

    public void cpfPessoa(String cpf) {
        this.pessoa.setCPF(cpf);
    }

    public void adicionaEndereco(Endereco endereco){
        this.pessoa.adicionarEndereco(endereco);
    }

    @Override
    public String toString() {
        return "PessoaService{" +
                "pessoa=" + pessoa +
                '}';
    }
}
