/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.util.Objects;
import java.time.LocalDate;

/**
 *
 * @author GuiGu
 */
public class Administrador {
        private static long serial;
    private long id;
    private String nome;
    private String CPF;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private String endereco;
    private String login;
    private String senha;

    public Administrador() {
        
        id = Administrador.serial++;
    }
    public long getId() {
        return id;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return  "\n==================================================================================" +
                "\nID: " + this.id + 
                "\nAdministrador(a): " + this.nome + 
                "\nCPF: " + this.CPF + 
                "\nEndereço: " + this.endereco +
                "\nLogin: " + this.login +
                "\nSenha: " + this.senha +
                "\nCriado em: " + this.dataCriacao +
                "  Modificado em: " + this.dataModificacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.CPF);
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }   
    
    
}
