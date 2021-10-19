/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import trab.Plantoes;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author matheus.freitas
 */
public class CadastroPlantoes {
    
      CadastroPlantoes[] cadastro = new CadastroPlantoes [30];
    
    public CadastroPlantoes() {
    
        int flag = 0;
        System.out.println("Digite o nome do hospital...: ");
        Scanner hospital = new Scanner(System.in);
        System.out.println("Digite um medico para alocar ao "
                + "plantao...: ");
        Scanner medicoA = new Scanner(System.in);
        System.out.println("Digite uma data...: ");
        Scanner data = new Scanner(System.in);
        System.out.println("Digite um periodo para o plantao...: ");
        Scanner periodo = new Scanner (System.in);
        System.out.println("Digite um tipo de plantao...: ");
        Scanner tipo = new Scanner(System.in);
        System.out.println("O medico " + medicoA + "do hospital " 
                + hospital + "devera estar de plantao na data"
                    + data + "No periodo...:" + periodo + "Para o " + tipo);
    }
    
     
    boolean adiciona(CadastroPlantoes c) {
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
