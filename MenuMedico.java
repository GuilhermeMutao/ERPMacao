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
    Scanner s = new Scanner(System.in);
     
    public MenuMedico(){
     int opcaoMenu = 10;
        while (opcaoMenu != 0) {
            
        
            opcaoMenu = this.menu();
            
            switch (opcaoMenu) {            
                case 1:
                    Hospital h = this.criaHospital();
                    if (hospitalDAO.adiciona(h)) {
                        System.out.println("Hospital inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de hospitais inserido!");
                    }
                    break;
                case 2:
                    hospitalDAO.listar();
                    break;
            }
          }
   }
    private int menu(){
        System.out.println("===================================");
        System.out.println(" ERP PARA HOSPITAIS MACÃO - Médico");
        System.out.println("===================================");
        System.out.println("Escolha um: ");
        System.out.println("1 - Cadastrar hospital");
        System.out.println("2 - Listar hospitais");
        System.out.println("0 - Sair");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
}
    
    public static void main(String[] args){
        new MenuMedico();
    } 
    
    public Hospital criaHospital() {
        Hospital h = new Hospital();

        System.out.println("Nome: ");
        h.setNome(s.nextLine());
        
        System.out.println("Abreviação: ");
        h.setAbrv(s.nextLine());
        
        System.out.println("Cidade: ");
        h.setCidade(s.nextLine());
        
        System.out.println("CNPJ: ");
        h.setCNPJ(s.nextLine());
        
        System.out.println("Telefone: ");
        h.setTelefone(s.nextLine());
        
        System.out.println("Endereco: ");
        h.setEndereco(s.nextLine());
        
        h.setDataCriacao(LocalDate.now());
        
        return h;
    }
}
