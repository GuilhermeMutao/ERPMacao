/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author matheus.freitas
 */
public class CadastroPlantoes {
    
      CadastroPlantoes[] cadasttro = new CadastroPlantoes [30];
    
    public CadastroPlantoes() {
    
        System.out.println("Digite o nome do hospital...: ");
        Scanner hospital = new Scanner(System.in);
        System.out.println("Digite um medico para alocar ao "
                + "plantao...: ");
        Scanner medicoA = new Scanner(System.in);
        System.out.println("Digite uma data...: ");
        Scanner data = new Scanner(System.in);
        System.out.println("Digite um tipo de plantao...: ");
        Scanner tipo = new Scanner(System.in);
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
}
