/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author GuiGu
 */
public class AdministradorDAO {
    
    
    Administrador[] administradores = new Administrador[5];
    
    public AdministradorDAO() {
    Administrador a1 = new Administrador();
    a1.setNome("Macao");
        this.adiciona(a1);
    }
    
     
    boolean adiciona(Administrador a) {
        int proximaPosicaoLivre = this.proximaPosicaoLivre();
        if (proximaPosicaoLivre != -1) {
            administradores[proximaPosicaoLivre] = a;
            return true;
        } else {
            return false;
        }

    }
     private int proximaPosicaoLivre() {
        for (int i = 0; i < administradores.length; i++) {
            if (administradores[i] == null) {
                return i;
            }

        }
        return -1;

    }
    
}


