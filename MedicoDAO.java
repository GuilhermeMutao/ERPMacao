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
}
