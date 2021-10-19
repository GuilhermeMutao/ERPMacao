/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Matheus
 */
public class PlantoesDAO {
    Plantoes [] plantao = new Plantoes[30];//Cada posição representa 1 dia do Mês
    
    public PlantoesDAO(){
        
        Plantoes p1 = new Plantoes();
        p1.dataI("01/10/2021");
        p1.dataT("02/10/2021");
        this.adiciona(p1);

        Plantoes p2 = new Plantoes();
        p2.dataI("02/10/2021");
        p2.dataT("03/10/2021");
        this.adiciona(p2);

        Plantoes p3 = new Plantoes();
        p3.dataI("03/10/2021");
        p3.dataT("04/10/2021");
        this.adiciona(p3);
        
        Plantoes p4 = new Plantoes();
        p4.dataI("04/10/2021");
        p4.dataT("05/10/2021");
        this.adiciona(p4);

        Plantoes p5 = new Plantoes();
        p5.dataI("05/10/2021");
        p5.dataT("06/10/2021");
        this.adiciona(p5);

        Plantoes p6 = new Plantoes();
        p6.dataI("06/10/2021");
        p6.dataT("07/10/2021");
        this.adiciona(p6);

        Plantoes p7 = new Plantoes();
        p7.dataI("07/10/2021");
        p7.dataT("08/10/2021");
        this.adiciona(p7);

        Plantoes p8 = new Plantoes();
        p8.dataI("08/10/2021");
        p8.dataT("09/10/2021");
        this.adiciona(p8);

        Plantoes p9 = new Plantoes();
        p9.dataI("09/10/2021");
        p9.dataT("10/10/2021");
        this.adiciona(p9);

        Plantoes p10= new Plantoes();
        p10.dataI("10/10/2021");
        p10.dataT("11/10/2021");
        this.adiciona(p10);

        Plantoes p11 = new Plantoes();
        p11.dataI("11/10/2021");
        p11.dataT("12/10/2021");
        this.adiciona(p11);

        Plantoes p12 = new Plantoes();
        p12.dataI("12/10/2021");
        p12.dataT("13/10/2021");
        this.adiciona(p12);

        Plantoes p13 = new Plantoes();
        p13.dataI("13/10/2021");
        p13.dataT("14/10/2021");
        this.adiciona(p13);

        Plantoes p14 = new Plantoes();
        p14.dataI("14/10/2021");
        p14.dataT("15/10/2021");
        this.adiciona(p14);

        Plantoes p15 = new Plantoes();
        p15.dataI("15/10/2021");
        p15.dataT("16/10/2021");
        this.adiciona(p15);
    
    }   
     private void adiciona(Plantoes m1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
