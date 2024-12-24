package entities;

import com.google.gson.annotations.SerializedName;
import services.CepApiService;

public class Endereco {
    private String numero;
    private String cep;
    private boolean casa;
    private boolean apartamento;

    @SerializedName("logradouro")
    private String rua;
    private String bairro;
    private String uf;
    private String estado;

    public Endereco() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void isCasa(boolean b) {
        this.casa = b;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public void isApartamento(boolean b) {
        this.apartamento = b;
    }

    public void setApartamento(boolean apartamento) {
        this.apartamento = apartamento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", casa=" + casa +
                ", apartamento=" + apartamento +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", uf='" + uf + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
