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
        
    Administrador a2 = new Administrador();
    a2.setNome("Mucedo");
    a2.setCPF("000.000.000-00");
    a2.setEndereco("Rua Macao 228, Bairro Macão");
    a2.setLogin("Mucedo");
    a2.setSenha("mucedo123");
    a2.setDataCriacao(LocalDate.now());
    a2.setDataModificacao(LocalDate.now());
        this.adiciona(a2);
    
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
    
    public boolean altera(long idASerAlterado, String novoNome) {
        for (int i = 0; i < administradores.length; i++) {

            if (administradores[i].getId() == idASerAlterado) {
                administradores[i].setNome(novoNome);
               
                return true;
            }
        }
        return false;

    }



} 
   


