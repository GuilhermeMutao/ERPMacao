/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author GuiGu
 */
public class MedicoDAO {
     
    Medico [] medicos = new Medico[5];
    
    public MedicoDAO() {
    Medico m1 = new Medico();
    m1.setNome("Macao");
        this.adiciona(m1);
    }
    
     
    boolean adiciona(Medico m) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            medicos[proximaPosicaoLivre] = m;
            return true;
        } else {
            return false;
        }

    }
     private int proximaPosicaoLivre() {
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] == null) {
                return i;
            }

        }
        return -1;

    }
}
