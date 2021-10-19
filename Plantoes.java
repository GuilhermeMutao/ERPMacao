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
        String hospital;
        private String dataI;
        private String dataT;
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
       
        
        public void setTipo (String TipoP) {
            this.tipoPlantao = TipoP;
        }
        
         public String getMedicoR () {
            return medicoRealizou;
        }
        
        public void setMedicoR (String MedicoR) {
            this.medicoRealizou = MedicoR;
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

    void dataI(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void dataT(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
   
        
      