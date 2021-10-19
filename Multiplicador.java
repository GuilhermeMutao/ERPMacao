/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.math.BigDecimal;  
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author Matheus
 */
public class Multiplicador {
            private static long serial;
         private int id;
         private Date dataI;
         private Date dataT;
         String tipo;
         private String estado;
         double valor;
         private Date dataC;
         private Date dataM;
         
         
         public Multiplicador () {
            
            id = (int) Multiplicador.serial++;
        }
        
        public long getId() {
            return id;
        }
        
        public String getTipo () {
            return tipo;
        }
        
        public void setTipo (String Tipo) {
            this.tipo = Tipo;
        }
        
        public String getEstado () {
            return estado;
        }
        
        public void setEstado (String Estado) {
            this.estado = Estado;
        }
        
        public double setValor () {
            return valor;
        }
        
        public void getvalor (double valor) {
            this.valor = valor;
        }
}
