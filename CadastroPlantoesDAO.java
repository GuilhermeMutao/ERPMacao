/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.time.LocalDate;

/**
 *
 * @author GuiGu
 */
public class CadastroPlantoesDAO {
    
    Plantoes[] cadastro = new Plantoes [30];
    
    public CadastroPlantoesDAO() {
    Plantoes c1 = new Plantoes();
    c1.setHospital("Macao");
    c1.setMedicoAlocado("Ana Laura Bahia Mutão");
    c1.setDataI("19/10/2021");
    c1.setPeriodo("Noturno");
    c1.setTipo("UTI");
        this.adiciona(c1);
    }
    
    boolean adiciona(Plantoes c) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
           cadastro[proximaPosicaoLivre] = c;
            return true;
        } else {
            return false;
        }

    }
    
     private int proximaPosicaoLivre() {
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] == null) {
                return i;
            }

        }
        return -1;
    }
     
    public void listar() {
        for (int i = 0; i < cadastro.length; i++) {
            if (cadastro[i] != null) {
                System.out.println(cadastro[i]);
            }
        }
    }
   
    
    
}
