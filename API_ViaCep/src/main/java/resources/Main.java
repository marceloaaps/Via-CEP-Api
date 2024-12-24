package resources;

import services.CepApiService;
import services.EnderecoService;
import services.PessoaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a CEP API");

        PessoaService pessoaService = new PessoaService();

        System.out.println("Qual seu nome?");
        pessoaService.pessoaNome("asdjiodsa");

        System.out.println("Qual sua idade");
        pessoaService.idadePessoa(sc.next());

        System.out.println("Digite seus endereços, quando nao tiver mais nenhum digite '0'");

        while (!"0".equals(sc.next())) {
            System.out.println("Começou aqui");

            CepApiService cepApiService = new CepApiService();
            EnderecoService es = new EnderecoService(cepApiService);

            System.out.println("Qual o endereço? ");
            es.buscaEndereco(sc.next());

            System.out.print("É Casa? \n 1 - SIM \n 2 - Qualquer outra coisa \n");

            if("1".equals(sc.next())){
                es.casaOrAp(true);
            }

            System.out.println("Digite o numero da casa/ap: ");
            es.numeroEndereco(sc.next());

            pessoaService.adicionaEndereco(es.getEndereco());

            System.out.println(pessoaService);

        }

    }
}
