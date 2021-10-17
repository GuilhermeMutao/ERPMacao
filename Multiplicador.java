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
public class Multiplicador {
            private static long serial;
         private int id;
         private Date dataI;
         private Date dataT;
         private String tipo;
         private String estado;
         private double valor;
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
            this.tipo = tipo;
        }
        
        public String getEstado () {
            return estado;
        }
        
        public void setEstado (String Estado) {
            this.estado = estado;
        }
        
        public double valor () {
            return valor;
        }
        
        public void valor (double valor) {
            this.valor = valor;
        }
}
