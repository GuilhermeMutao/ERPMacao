/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package trab;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Hospital {
    
            private static long serial;
        private int id;
        private String nome;
        private String abrv;
        private String cidade;
        private String endereco;
        private String CNPJ;
        private String Tel;
        private Date dataM;
        
        public Hospital () {
            
            id = (int) Hospital.serial++;
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
         
        public String getAbrv () {
            return abrv;
        }
        
        public void setAbrv(String Abrv) {
            this.abrv = abrv;
        }
         
        public String getCidade() {
            return cidade;
        }
        
        public void setCidade (String Cidade) {
            this.cidade = cidade;
        }
        
        public String getTelefone (String telefone) {
            return Tel;
        }
        
        public void setTelefone (String Tel) {
            this.Tel = Tel;
        }
         
          public String getEndereco (String endereco) {
             return endereco;
         }
          public void setEndereco (String endereco) {
              this.endereco = endereco;
          }

          
          
        public String getCNPJ(String CNPJ) {
        return CNPJ;
        }
        
        public void setCNPJ (String CNPJ) {
            this.CNPJ = CNPJ;
        }
        
        
        public Date getDataM (Date dataM) {
            return dataM;
        }
        
        public void setDataM    (Date dataM) {
            this.dataM = dataM;
        }
        

         @Override
    public String toString() {
        return "Este eh o hospital " + this.nome + " COM CNPJ" + this.CNPJ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.CNPJ);
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
        final Hospital other = (Hospital) obj;
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        return true;
    }
}
   
        
        
    