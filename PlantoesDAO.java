/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import trab.PlantoesDAO;

/**
 *
 * @author Matheus
 */
public class PlantoesDAO {
    Plantoes [] plantao = new Plantoes[30];//Cada posição representa 1 dia do Mês
    
    public PlantoesDAO(){
        
        Plantoes p1 = new Plantoes();
        p1.setDataI("01/10/2021");
        p1.setDataT("02/10/2021");
        this.adiciona(p1);

        Plantoes p2 = new Plantoes();
        p2.setDataI("02/10/2021");
        p2.setDataT("03/10/2021");
        this.adiciona(p2);

        Plantoes p3 = new Plantoes();
        p3.setDataI("03/10/2021");
        p3.setDataT("04/10/2021");
        this.adiciona(p3);
        
        Plantoes p4 = new Plantoes();
        p4.setDataI("04/10/2021");
        p4.setDataT("05/10/2021");
        this.adiciona(p4);

        Plantoes p5 = new Plantoes();
        p5.setDataI("05/10/2021");
        p5.setDataT("06/10/2021");
        this.adiciona(p5);

        Plantoes p6 = new Plantoes();
        p6.setDataI("06/10/2021");
        p6.setDataT("07/10/2021");
        this.adiciona(p6);

        Plantoes p7 = new Plantoes();
        p7.setDataI("07/10/2021");
        p7.setDataT("08/10/2021");
        this.adiciona(p7);

        Plantoes p8 = new Plantoes();
        p8.setDataI("08/10/2021");
        p8.setDataT("09/10/2021");
        this.adiciona(p8);

        Plantoes p9 = new Plantoes();
        p9.setDataI("09/10/2021");
        p9.setDataT("10/10/2021");
        this.adiciona(p9);

        Plantoes p10= new Plantoes();
        p10.setDataI("10/10/2021");
        p10.setDataT("11/10/2021");
        this.adiciona(p10);

        Plantoes p11 = new Plantoes();
        p11.setDataI("11/10/2021");
        p11.setDataT("12/10/2021");
        this.adiciona(p11);

        Plantoes p12 = new Plantoes();
        p12.setDataI("12/10/2021");
        p12.setDataT("13/10/2021");
        this.adiciona(p12);

        Plantoes p13 = new Plantoes();
        p13.setDataI("13/10/2021");
        p13.setDataT("14/10/2021");
        this.adiciona(p13);

        Plantoes p14 = new Plantoes();
        p14.setDataI("14/10/2021");
        p14.setDataT("15/10/2021");
        this.adiciona(p14);

        Plantoes p15 = new Plantoes();
        p15.setDataI("15/10/2021");
        p15.setDataT("16/10/2021");
        this.adiciona(p15);
    
    }   
 
    boolean adiciona(Plantoes p) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            plantao[proximaPosicaoLivre] = p;
            return true;
        } else {
            return false;
        }

    }
     private int proximaPosicaoLivre() {
        for (int i = 0; i < plantao.length; i++) {
            if (plantao[i] == null) {
                return i;
            }

        }
        return -1;

    }
}
