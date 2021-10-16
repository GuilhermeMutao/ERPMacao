/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import java.util.Scanner;


import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
import java.math.BigDecimal;
import java.util.Scanner;


/**
 *
 * @author GuiGu
 */
public class Menu {
   
   AdministradorDAO administradorDAO = new AdministradorDAO();
   MedicoDAO medicoDAO = new MedicoDAO();
   HospitalDAO hospitalDAO = new HospitalDAO();
   Scanner s = new Scanner(System.in);
    

     
   public Menu(){
     int opcaoMenu = 10;
        while (opcaoMenu != 4) {
            
        
            opcaoMenu = this.menu();
            
            switch (opcaoMenu) {
                case 1:
                    Administrador a = this.criaAdministrador();
                    if (administradorDAO.adiciona(a)) {
                        System.out.println("Admnistrador inserido com sucesso");
                    } else {
                        System.out.println("Array cheio");
                    }
                    break;

                case 2:
                    Medico m = this.criaMedico();
                    if (medicoDAO.adiciona(m)) {
                        System.out.println("Medico inserido com sucesso");
                    } else {
                        System.out.println("Array cheio");
                    }
                    break;
                    
                case 3:
                    Hospital h = this.criaHospital();
                    if (hospitalDAO.adiciona(h)) {
                        System.out.println("medico inserido com sucesso");
                    } else {
                        System.out.println("Array cheio");
                    }
                    break;
    
            }
          }
   }

  public static void main(String[] args){
        new Menu();
    } 
    
    private int menu(){
        System.out.println("======================================");
        System.out.println(" ERP PARA HOSPITAIS MACÃO - Cadastro" );
        System.out.println("======================================");
        System.out.println("Você ira cadastrar um: ");
        System.out.println("1 - Administrador");
        System.out.println("2 - Médico");
        System.out.println("3 - Hospital");
        System.out.println("4 - Sair");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
}
   
    
    
    public Administrador criaAdministrador() {
        Administrador a = new Administrador();

        System.out.println("nome: ");
        a.setNome(s.nextLine());
        
        System.out.println("CPF: ");
        a.setCPF(s.nextLine());
        
        System.out.println("Endereco: ");
        a.setEndereco(s.nextLine());
        
        System.out.println("Login: ");
        a.setLogin(s.nextLine());
        
        System.out.println("Senha: ");
        a.setSenha(s.nextLine());
        
        return a;
    }
   
    public Medico criaMedico() {
        Medico m = new Medico();

        System.out.println("nome: ");
        m.setNome(s.nextLine());
        
        System.out.println("CPF: ");
        m.setCPF(s.nextLine());
        
        System.out.println("Endereco: ");
        m.setEndereco(s.nextLine());
        
        System.out.println("Login: ");
        m.setLogin(s.nextLine());
        
        System.out.println("Senha: ");
        m.setSenha(s.nextLine());
        
        return m;
    }
    
    public Hospital criaHospital() {
        Hospital m = new Hospital();

        System.out.println("nome: ");
        m.setNome(s.nextLine());
        
        System.out.println("Endereco: ");
        m.setEndereco(s.nextLine());
       
        
        return m;
    }
    
}
    



