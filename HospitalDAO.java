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
public class HospitalDAO {
     Hospital[] hospitais = new Hospital[5];
    
    public HospitalDAO() {
    Hospital h1 = new Hospital();
    h1.setNome("Macao");
    h1.setAbrv("MAC");
    h1.setCidade("Uberaba");
    h1.setCNPJ("10000000");
    h1.setTelefone("(34)99764-3232");
    h1.setEndereco("Rua x, Bairro Y");
    h1.setDataCriacao(LocalDate.now());
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
     
    public void listar() {
        for (int i = 0; i < hospitais.length; i++) {
            if (hospitais[i] != null) {
                System.out.println(hospitais[i]);
            }
        }
    }
    
    public boolean exclui(long idASerExcluido) {
        for (int i = 0; i < hospitais.length; i++) {

            if (hospitais[i].getId() == idASerExcluido) {
                hospitais[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean altera(long idASerAlterado, String novoNome) {
        for (int i = 0; i < hospitais.length; i++) {

            if (hospitais[i].getId() == idASerAlterado) {
                hospitais[i].setNome(novoNome);
               
                return true;
            }
        }
        return false;
    }
}
