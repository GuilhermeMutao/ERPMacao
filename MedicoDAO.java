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
public class MedicoDAO {
     
    Medico [] medicos = new Medico[5];
     MultiplicadorDAO multiplicador = new MultiplicadorDAO ();
    
    public MedicoDAO() {
    Medico m1 = new Medico();
    m1.setNome("Ana Laura Bahia Mutão");
    m1.setCPF("020.271.908-32");
    m1.setEspec("Psicanalista");
    m1.setSalarioM(500);
    m1.setEndereco("Rua 8 casa 27, Condominio Dhamma II");
    m1.setTelefone("(00)98765-4321");
    m1.setLogin("AnaBahia");
    m1.setSenha("mutaolindo");
         if (Plantoes.tipoPlantao == "PS") {
         m1.setSalarioM(500);
    }
    else {
        if (Plantoes.tipoPlantao == "PS FDS") {
            m1.setSalarioM(500 * 1.2 * 1.5 );
        }
        else {
            if (Plantoes.tipoPlantao == "UTI GERAL" ) {
                m1.setSalarioM(500 * 1.3 * 1.5);
            }
            else {
                if (Plantoes.tipoPlantao == "UTI GERAL FDS") {
                    m1.setSalarioM(500 * 1.4 * 1.5);
                }
                else {
                    if (Plantoes.tipoPlantao == ("UTI COVID")) {
                        m1.setSalarioM(500 * 1.5 * 1.5);
                    }
                    else {
                        if (Plantoes.tipoPlantao == "UTI COVID FDS") {
                            m1.setSalarioM(500 * 1.6 * 1.5);
                        }
                        else
                        {
                            m1.setSalarioM(0);
                        }
                    }
                }
            }
        }
    }
        this.adiciona(m1);
        
    m1.setDataCriacao(LocalDate.now());
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
    
    public void listar() {
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] != null) {
                System.out.println(medicos[i]);
            }
        }
    }
    
    public boolean buscaPorLogin(String login) {
        for (Medico mdc : medicos) {
            if (mdc != null && mdc.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }
     
    public int buscaSenhaPorLogin(String login, String senha){
        for (int i = 0; i < medicos.length; i++) {
            if (medicos[i] != null && medicos[i].getLogin().equals(login) && medicos[i].getSenha().equals(senha)) {
                return i;
            }
        }
        return -1;
    }
}
