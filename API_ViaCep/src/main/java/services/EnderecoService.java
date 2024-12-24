package services;

import entities.Endereco;
import resources.exceptions.APIException;

import java.io.IOException;
import java.util.Map;

public class EnderecoService {

    private final CepApiService cepApiService;

    private Endereco endereco;

    public EnderecoService(CepApiService cepApiService) {
        this.cepApiService = cepApiService;
        this.endereco = new Endereco();
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void buscaEndereco(String cep) {

        Map<String, String> cepDetalhes = cepApiService.buscarCep(cep);

        this.endereco.setBairro(cepDetalhes.get("bairro"));
        this.endereco.setEstado(cepDetalhes.get("estado"));
        this.endereco.setCep(cep);
        this.endereco.setRua(cepDetalhes.get("logradouro"));
        this.endereco.setUf(cepDetalhes.get("uf"));

    }



    public void numeroEndereco(String numero) {
      endereco.setNumero(numero);
    }

    public void casaOrAp(boolean isCasa){

        if (isCasa){
            endereco.setCasa(isCasa);
            return;
        }
        endereco.setApartamento(isCasa);

    }


}
