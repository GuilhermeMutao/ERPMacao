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

public class MenuADM {
   
   AdministradorDAO administradorDAO = new AdministradorDAO();
   MedicoDAO medicoDAO = new MedicoDAO();
   HospitalDAO hospitalDAO = new HospitalDAO();
   CadastroPlantoesDAO cadastroPlantoesDAO = new CadastroPlantoesDAO();

   
   
   Scanner s = new Scanner(System.in);
    
   
   public MenuADM(){
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
                        System.out.println("Plantão inserido com sucesso");
                    } else {
                        System.out.println("Número máximo de plantões inserido!");
                    }
                   break;
                   
                case 8:
                    cadastroPlantoesDAO.listar();
                   break;
                   
                case 9:
                    
                    administradorDAO.listar();
                    
                    long idASerExcluido = menuExclusao();

                    if (administradorDAO.exclui(idASerExcluido) && idASerExcluido != 0) {
                        System.out.println("Excluido com sucesso");
                    } else {
                        System.out.println("Não foi excluido");
                    }
                    
                    break;
                    
                case 10:
                    
                    medicoDAO.listar();
                    
                    long idASerExcluidoM = menuExclusao();

                    if (medicoDAO.exclui(idASerExcluidoM) && idASerExcluidoM != 0) {
                        System.out.println("Excluido com sucesso");
                    } else {
                        System.out.println("Não foi excluido");
                    }
                    
                    break;
                    
                    
                case 11:
                    
                    hospitalDAO.listar();
                    
                    long idASerExcluidoH = menuExclusao();

                    if (hospitalDAO.exclui(idASerExcluidoH) && idASerExcluidoH != 0) {
                        System.out.println("Excluido com sucesso");
                    } else {
                        System.out.println("Não foi excluido");
                    }
                    
                    break;
                
                case 12:
                    administradorDAO.listar();
                    long idASerAlterado = menuAlteracao();
                    System.out.println("Qual é o novo nome ?");
                    String novoNome = s.nextLine();
                    

                    if (administradorDAO.altera(idASerAlterado, novoNome)) {
                        System.out.println("pessoa alterada com sucesso");
                    } else {
                        System.out.println("pessoa não encontrada");
                    }
                    break;
                    
                case 13:
                    medicoDAO.listar();
                    long idASerAlteradoM = menuAlteracao();
                    System.out.println("Qual é o novo nome ?");
                    String novoNomeM = s.nextLine();
                    

                    if (medicoDAO.altera(idASerAlteradoM, novoNomeM)) {
                        System.out.println("pessoa alterada com sucesso");
                    } else {
                        System.out.println("pessoa não encontrada");
                    }
                    break;
                    
                case 14:
                    hospitalDAO.listar();
                    long idASerAlteradoH = menuAlteracao();
                    System.out.println("Qual é o novo nome ?");
                    String novoNomeH = s.nextLine();
                    

                    if (hospitalDAO.altera(idASerAlteradoH, novoNomeH)) {
                        System.out.println("pessoa alterada com sucesso");
                    } else {
                        System.out.println("pessoa não encontrada");
                    }
                    break;
     
            }   
          }
   }

    
    private int menu(){
        System.out.println("==================================================================================");
        System.out.println("                        ERP PARA HOSPITAIS MACÃO - Admnistrador"                   );
        System.out.println("==================================================================================");
        System.out.println("Escolha um: ");
        System.out.println("1 -  Cadastrar administrador");
        System.out.println("2 -  Cadastrar médico");
        System.out.println("3 -  Cadastrar hospital");
        System.out.println("4 -  Listar administradores");
        System.out.println("5 -  Listar médicos");
        System.out.println("6 -  Listar hospitais");
        System.out.println("7 -  Cadastrar plantão");
        System.out.println("8 -  Listar plantões");
        System.out.println("9 -  Remover administrador");
        System.out.println("10 - Remover médico");
        System.out.println("11 - Remover hospital");
        System.out.println("12 - Alterar admnistrador");
        System.out.println("13 - Alterar medico");
        System.out.println("14 - Alterar hospital");
        System.out.println("0 -  Sair");
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
    
 
     private long menuExclusao() {
        System.out.print("qual administrador deseja excluir: ");
        long idASerExcluido = Long.parseLong(s.nextLine());
        return idASerExcluido;
    }
     
     private long menuAlteracao() {
        System.out.println("qual admnistrador deseja alterar: ");
        long idASerAlterado = Long.parseLong(s.nextLine());
        return idASerAlterado;
    }
}

    



