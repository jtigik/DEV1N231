/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Objects;

/**
 *
 * @author jtsilva
 */
public class Cliente {
    private String nome;
    private Long cpf;
    private Long cel;
    private String endereco;
    private String endereco2;
    private Integer numero;
    private String cidade;
    private String estado;
    private Integer cep;

    public Cliente(String nome, Long cpf, Long cel, String endereco, String endereco2, Integer numero, String cidade, String estado, Integer cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cel = cel;
        this.endereco = endereco;
        this.endereco2 = endereco2;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCel() {
        return cel;
    }

    public void setCel(Long cel) {
        this.cel = cel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
}
