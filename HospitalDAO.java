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
public class HospitalDAO {
     Hospital[] hospitais = new Hospital[5];
    
    public HospitalDAO() {
    Hospital h1 = new Hospital();
    h1.setNome("Macao");
        this.adiciona(h1);
    }
    
     
    boolean adiciona(Hospital h) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            hospitais[proximaPosicaoLivre] = h;
            return true;
        } else {
            return false;
        }

    }
     private int proximaPosicaoLivre() {
        for (int i = 0; i < hospitais.length; i++) {
            if (hospitais[i] == null) {
                return i;
            }

        }
        return -1;

    }
}
