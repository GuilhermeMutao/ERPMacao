/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;
import java.util.Scanner;


import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author GuiGu
 */

public class Menu {
   
   AdministradorDAO administradorDAO = new AdministradorDAO();
   MedicoDAO medicoDAO = new MedicoDAO();
   HospitalDAO hospitalDAO = new HospitalDAO();
   CadastroPlantoesDAO cadastroPlantoesDAO = new CadastroPlantoesDAO();

   
   
   Scanner s = new Scanner(System.in);
    
   
   public Menu(){
     int opcaoMenu = 100;
        while (opcaoMenu != 0) {
            
        
            opcaoMenu = this.menu();
            
            switch (opcaoMenu) {
                case 1:
                    Administrador a = this.criaAdministrador();
                    if (administradorDAO.adiciona(a)) {
                        System.out.println("Admnistrador inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de admnistradores inserido!");
                    }
                    break;

                case 2:
                    Medico m = this.criaMedico();
                    if (medicoDAO.adiciona(m)) {
                        System.out.println("Medico inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de médicos inserido!");
                    }
                    break;
                    
                case 3:
                    Hospital h = this.criaHospital();
                    if (hospitalDAO.adiciona(h)) {
                        System.out.println("Hospital inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de hospitais inserido!");
                    }
                    break;
                case 4:
                    
                    administradorDAO.listar();
                    break;
                    
                case 5:
                    
                    medicoDAO.listar();
                    break;
                    
                case 6:
                    
                    hospitalDAO.listar();
                    break;
                    
                case 7:
                    Plantoes p = this.CadastroPlantoes();
                    if (cadastroPlantoesDAO.adiciona(p)) {
                        System.out.println("Admnistrador inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de admnistradores inserido!");
                    }
                   break;
                   
                case 8:
                    cadastroPlantoesDAO.listar();
                   break;
                   
                case 9:
                    
                    administradorDAO.listar();
                    
                    System.out.println("Admnistrador procurado:");
                    String nomeExclusao = s.nextLine();

                    if (administradorDAO.remover(nomeExclusao) && !"Macao".equals(nomeExclusao)) {
                        System.out.println("administrador excluído");
                    } else {
                        System.out.println("administrador não excluído");
                    }

                    
                    break;
                    
                case 10:
                    
                    medicoDAO.listar();
                    
                    System.out.println("Médico procurado: ");
                    String nomeExclusaoMedico = s.nextLine();

                    if (medicoDAO.remover(nomeExclusaoMedico) ) {
                        System.out.println("médico excluído");
                    } else {
                        System.out.println("médico não excluído");
                    }

                    
                    break;
     
            }
          }
   }

  public static void main(String[] args){
        new Menu();
    } 
    
    private int menu(){
        System.out.println("=========================================");
        System.out.println(" ERP PARA HOSPITAIS MACÃO - Admnistrador" );
        System.out.println("=========================================");
        System.out.println("Escolha um: ");
        System.out.println("1 - Cadastrar administrador");
        System.out.println("2 - Cadastrar médico");
        System.out.println("3 - Cadastrar hospital");
        System.out.println("4 - Listar administradores");
        System.out.println("5 - Listar médicos");
        System.out.println("6 - Listar hospitais");
        System.out.println("7 - Cadastrar plantão");
        System.out.println("8 - Listar administrador");
        System.out.println("9 - Remover administrador");
        System.out.println("10 - Remover médico");
        System.out.println("0 - Sair");
        System.out.print("Qual Sua opção ? R: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
}
   
    
    
    public Administrador criaAdministrador() {
        Administrador a = new Administrador();

        System.out.println("Nome: ");
        a.setNome(s.nextLine());
        
        System.out.println("CPF: ");
        a.setCPF(s.nextLine());
        
        System.out.println("Endereco: ");
        a.setEndereco(s.nextLine());
        
        System.out.println("Login: ");
        a.setLogin(s.nextLine());
        
        System.out.println("Senha: ");
        a.setSenha(s.nextLine());
        
        a.setDataCriacao(LocalDate.now());
        
        return a;
    }
   
    public Medico criaMedico() {
        Medico m = new Medico();

        System.out.println("Nome: ");
        m.setNome(s.nextLine());
        
        System.out.println("CPF: ");
        m.setCPF(s.nextLine());
        
        System.out.println("Especialização: ");
        m.setEspec(s.nextLine());
        
        System.out.println("Endereco: ");
        m.setEndereco(s.nextLine());
        
        System.out.println("Telefone: ");
        m.setTelefone(s.nextLine());
        
        System.out.println("Login: ");  
        m.setLogin(s.nextLine());
        
        System.out.println("Senha: ");
        m.setSenha(s.nextLine());
        
        m.setDataCriacao(LocalDate.now());
        
        
        return m;
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

    



