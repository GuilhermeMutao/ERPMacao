/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Medico {
    
  
            private static long serial;
        private int id;
        private String nome;
        private String endereco;
        private String CPF;
        private String Tel;
        private String espec;
        private String login;
        private String senha;
        private double salario;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;
        
        
        public Medico () {
            
            id = (int) Medico.serial++;
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
         
         
         
          public String getEndereco () {
             return endereco;
         }
          public void setEndereco (String endereco) {
              this.endereco = endereco;
          }

          
          
        public String getCPF() {
        return CPF;
        }
        
        public void setCPF (String CPF) {
            this.CPF = CPF;
        }
        
        public String getTelefone () {
            return Tel;
        }
        
        public void setTelefone (String Tel) {
            this.Tel = Tel;
        }
        
        
        
        public String getEspec () {
            return espec;
        }
        
        public void setEspec (String espec) {
            this.espec = espec;
        }
        
        
        public String getLogin () {
            return login;
        }
        
        public void setLogin (String login) {
            this.login = login;
        }
        
        
        public String getSenha () {
            return senha;
        }
        
        public void setSenha (String senha) {
            this.senha = senha;
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

        public void DataModificacao(LocalDate dataModificacao) {
            this.dataModificacao = dataModificacao;
        }
    
         public double getSalarioM () {
            return salario;
        }
        
        public void setSalarioM (double SalarioM) {
            this.salario = SalarioM;
        } 
        

         @Override
    public String toString() {
       return "\nID: " + this.id +
              "\nMédico(a): " + this.nome + 
              "\nCPF: " + this.CPF +
              "\nEspecialização: " + this.espec +
              "\nEndereço: " + this.endereco +
              "\nTelefone: " + this.Tel +
              "nSalario: " + this.salario +
              "\nLogin: " + this.login +
              "\nSenha: " + this.senha +
              "\nCriado em: " + this.dataCriacao;
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }
   
        
        
    
}
