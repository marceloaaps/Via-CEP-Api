package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa {

    private String nome;
    private String idade;
    private String CPF;
    private ArrayList<Endereco> endereco;

    public Pessoa() {
            this.endereco = new ArrayList<>();
    }

    public Pessoa(String nome, String idade, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public  void adicionarEndereco(Endereco endereco){
        this.endereco.add(endereco);
    }

    public List<Endereco> getEndereco() {
        return Collections.unmodifiableList(endereco);
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", CPF='" + CPF + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
