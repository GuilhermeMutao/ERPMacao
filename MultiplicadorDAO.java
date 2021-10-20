package trab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class MultiplicadorDAO {
  
     
    Multiplicador [] mult = new Multiplicador[5];
    
    public MultiplicadorDAO() {
    Multiplicador m1 = new Multiplicador();
     m1.setTipo("PS");
     m1.valor = 1;
     
     this.adiciona(m1);
     
    Multiplicador m2 = new Multiplicador();
        m2.setTipo("PS FDS");
        m2.valor = 1.2;
        
        this.adiciona(m2);
        
    Multiplicador m3 = new Multiplicador();    
        m3.setTipo("UTI GERAL");
        m3.valor = 1.3;
        this.adiciona(m3);
    Multiplicador m4 = new Multiplicador();        
    m4.setTipo("UTI GERAL FDS");
    m4.valor = 1.4;
    this.adiciona(m4);
    Multiplicador m5 = new Multiplicador();    
    m5.setTipo("UTI COVID");
    m5.valor = 1.5;
    this.adiciona(m5);
    Multiplicador m6 = new Multiplicador();    
    m6.setTipo("UTI COVID FDS");
    m6.valor = 1.6;
    this.adiciona(m6);
        
    
   

}

   boolean adiciona(Multiplicador m) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            mult[proximaPosicaoLivre] = m;
            return true;
        } else {
            return false;
        }

    }
     private int proximaPosicaoLivre() {
        for (int i = 0; i < mult.length; i++) {
            if (mult[i] == null) {
                return i;
            }

        }
        return -1;
    }
}

