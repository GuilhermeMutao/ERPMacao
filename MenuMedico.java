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
 * @author GuiGu
 */

public class MenuMedico {
    
    HospitalDAO hospitalDAO = new HospitalDAO();
    CadastroPlantoesDAO cadastroPlantoesDAO = new CadastroPlantoesDAO();
    Scanner s = new Scanner(System.in);
     
    public MenuMedico(){
     int opcaoMenu = 10;
        while (opcaoMenu != 0) {
            
        
            opcaoMenu = this.menu();
            
            switch (opcaoMenu) {         
                 
                case 1:
                    Plantoes p = this.CadastroPlantoes();
                    if (cadastroPlantoesDAO.adiciona(p)) {
                        System.out.println("Admnistrador inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de admnistradores inserido!");
                    }
                   break;
                   
                case 2:
                    cadastroPlantoesDAO.listar();
                   break;
            }
          }
   }
    private int menu(){
        System.out.println("===================================");
        System.out.println(" ERP PARA HOSPITAIS MACÃO - Médico");
        System.out.println("===================================");
        System.out.println("Escolha um: ");
        System.out.println("1 - Cadastrar plantão");
        System.out.println("2 - Listar Plantões");
        System.out.println("0 - Sair");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
}
    
    public static void main(String[] args){
        new MenuMedico();
    } 
       
    public Plantoes CadastroPlantoes() {
               
        Plantoes p = new Plantoes();
                
        System.out.println("Digite o nome do hospital: ");
        p.setHospital(s.nextLine());
        
        System.out.println("Digite um medico para alocar ao plantao: ");    
        p.setMedicoAlocado(s.nextLine());
     
        System.out.println("Digite uma data: ");
        p.setDataI(s.nextLine());
        
        System.out.println("Digite um periodo para o plantao: ");
        p.setPeriodo(s.nextLine());
        
        System.out.println("Digite um tipo de plantao: ");
        p.setTipo(s.nextLine());
            
        return p;
    }
}
