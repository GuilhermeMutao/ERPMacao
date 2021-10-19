package trab;

import java.util.Date;
import java.util.Objects;
import java.util.package;

/**
 *
 * @author Matheus
 */
public class Plantoes {
    
           private static long serial;
        private int id;
        String hospital;
        private Date dataI;
        private Date dataT;
        private String periodo;
        private String tipoPlantao;
        private String medicoAlocado;
        private String medicoRealizou;
        private double valorB;
        private Date dataC;
        private Date dataM;
        
        public Plantoes () {
            
            id = (int) Plantoes.serial++;
        }
        
        public long getId() {
            return id;
        }
        
           
         public String getHospital() {
         return hospital;
         
         }
         
        
        
         public void setHospital(String hospital) {
             this.hospital = hospital;
         }
         
         
        public String getPeriodo() {
            return periodo;
        }
        
        public void setPeriodo (String periodo) {
            this.periodo = periodo;
        }

        public String getTipo () {
            return tipoPlantao;
        }
       
        
        public void setTipo () {
            this.tipoPlantao = tipoPlantao;
        }
        
         public String getMedicoR () {
            return medicoRealizou;
        }
        
        public void setMedicoR (String MedicoR) {
            this.medicoRealizou = medicoRealizou;
        }
        
        public double getValorB () {
            return valorB;
        }
        
        public void setValorB (double ValorB) {
            this.valorB = valorB;
        }
        

    }
   
        
      