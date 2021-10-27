/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author GuiGu
 */
public class AdministradorDAO {
    
    
    public Administrador[] administradores = new Administrador[5];
    
    public AdministradorDAO() {
    Administrador a1 = new Administrador();
    a1.setNome("Macao");
    a1.setCPF("027.128.132-51");
    a1.setEndereco("Rua Macao 228, Bairro Macão");
    a1.setLogin("Macao");
    a1.setSenha("macao123");
    a1.setDataCriacao(LocalDate.now());
    a1.setDataModificacao(LocalDate.now());
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
    
     public void listar() {
        for (int i = 0; i < administradores.length; i++) {
            if (administradores[i] != null) {
                System.out.println(administradores[i]);
            }
        }
    }
     
     public boolean buscaPorLogin(String login) {
        for (Administrador adm : administradores) {
            if (adm != null && adm.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
     
    public int buscaSenhaPorLogin(String login, String senha){
        for (int i = 0; i < administradores.length; i++) {
            if (administradores[i] != null && administradores[i].getLogin().equals(login) && administradores[i].getSenha().equals(senha)) {
                return i;
            }
        }
        return -1;
    }
    public boolean exclui(long idASerExcluido) {
        for (int i = 0; i < administradores.length; i++) {

            if (administradores[i].getId() == idASerExcluido) {
                administradores[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean altera(long idASerAlterado, String novoNome, String novoCPF, String novoLogin, String novaSenha, String novoEndereco, LocalDate dataModificacao) {
        for (int i = 0; i < administradores.length; i++) {

            if (administradores[i].getId() == idASerAlterado) {
                administradores[i].setNome(novoNome);
                administradores[i].setCPF(novoCPF);
                administradores[i].setLogin(novoLogin);
                administradores[i].setSenha(novaSenha);
                administradores[i].setEndereco(novoEndereco);
                administradores[i].setDataModificacao(dataModificacao);
                return true;
            }
        }
        return false;

    }

    boolean altera(long idASerAlterado, String novoNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
   


