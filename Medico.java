/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Medico {
    
    private Date localDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
            private static long serial;
        private int id;
        private String nome;
        private String endereco;
        private String CPF;
        private int Tel;
        private String espec;
        private String login;
        private String senha;
        private Date dataM;
        
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
         
         
         
          public String getEndereco (String endereco) {
             return endereco;
         }
          public void setEndereco (String endereco) {
              this.endereco = endereco;
          }

          
          
        public String getCPF(String CPF) {
        return CPF;
        }
        
        public void setCPF (String CPF) {
            this.CPF = CPF;
        }
        
        
        public int getTelefone (int telefone) {
            return Tel;
        }
        
        public void setTelefone (int Tel) {
            this.Tel = Tel;
        }
        
        
        
        public String getEspec (String Espec) {
            return espec;
        }
        
        public void setEspec (String espec) {
            this.espec = espec;
        }
        
        
        public String getLogin (String login) {
            return login;
        }
        
        public void setLogin (String login) {
            this.login = login;
        }
        
        
        public String getSenha (String senha) {
            return senha;
        }
        
        public void setSenha (String senha) {
            this.senha = senha;
        }
        
        final Date data = localDate();
        

         @Override
    public String toString() {
        return "Este eh o medico " + this.nome + " COM CPF" + this.CPF;
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
