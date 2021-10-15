/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;


import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
import java.util.Scanner;

/**
 *
 * @author GuiGu
 */
public class Menu {
    Administrador[] administradores = new Administrador[5];
    
    Scanner s = new Scanner(System.in);
    
    public Menu(){
     int opcaoMenu;
        do{
        opcaoMenu = menu();
            switch (opcaoMenu) {
                case 1:
                    Administrador a = criaAdministrador();

                    boolean jogadorFoiInserido = adiciona(a);
                    if (jogadorFoiInserido) {
                        System.out.println("Admnistrador inserido com sucesso");
                    } else {
                        System.out.println("Admnistrador nao inserido");

                    }
                    break;

                
            }
        }while (opcaoMenu != 4);
    
}
    public static void main(String[] args){
        new Menu();    
    }
    private int menu(){
        System.out.println("==========================");
        System.out.println(" ERP PARA HOSPITAIS MACÃO - Cadastro");
        System.out.println("==========================");
        System.out.println("Você é");
        System.out.println("1 - Administrador");
        System.out.println("2 - Médico");
        System.out.println("3 - Hospital");
        System.out.println("4 - Sair");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
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
    private Administrador criaAdministrador() {
        Administrador a = new Administrador();
        System.out.println("CPF: ");
        String CPF = s.nextLine();
        a.setCPF(CPF);
        System.out.println("Nome: ");
        String nome = s.nextLine();
        a.setNome(nome);
        return a;
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



