/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.util.Date;
import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
/**
 *
 * @author Matheus
 */
public class plantoesI {
       
      Plantoes [] plantao = new Plantoes[5]; 
       
       public plantoesI(String Hospital, String medicoRealizou,
               String tipoPlantao, String periodo, Double valorB ) {
         
         
         System.out.println("Plantao no hospita..: " + Hospital);
         System.out.println("Medico que realizou...: " + medicoRealizou);
         System.out.println("Plantao do tipo...: " + tipoPlantao);
         System.out.println("No periodo...: " + periodo);
         System.out.println("Recebeu um total de...: " + valorB);
         
}
        

   public void listar() {
        for (int i = 0; i < plantao.length; i++) {
            if (plantao[i] != null) {
                System.out.println(plantao[i]);
            }
        }
    }
    
}
