package trab;

import java.util.Date;
import java.util.Objects;


/**
 *
 * @author Matheus
 */
public class Plantoes {
    
           private static long serial;
        private int id;
        private String hospital;
        private String dataI;
        private String dataT;
        private String periodo;
        String tipoPlantao;
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
       
        
        public void setTipo (String TipoP) {
            this.tipoPlantao = TipoP;
        }
        
        public String getMedicoAlocado () {
            return medicoAlocado;
        }
        
        public void setMedicoAlocado (String medicoAlocado) {
            this.medicoAlocado = medicoAlocado;
        }
        
         public String getMedicoR () {
            return medicoRealizou;
        }
        
        public void setMedicoR (String medicoR) {
            this.medicoRealizou = medicoR;
        }
        
        public double getValorB () {
            return valorB;
        }
        
        public void setValorB (double ValorB) {
            this.valorB = ValorB;
        }
        public String getDataI () {
            return dataI;
        }
        public void setDataI (String DataI) {
            this.dataI = DataI;
        }
        
        public String getDataT () {
            return dataT;
           
        }
        
        public void setDataT (String DataT) {
            this.dataT = DataT;
        }

        @Override
        public String toString() {
            return "\nHospital: " + this.hospital + 
                    "\nMédico alocado: " + this.medicoAlocado + 
                    "\nData inicial: " + this.dataI +
                    "\nPeriodo: " + this.periodo +
                    "\nTipo: " + this.tipoPlantao;
                   
        }

    }
   
        
      
