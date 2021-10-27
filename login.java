/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package trab;
 
import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;
import java.util.Scanner;
import trab.Menu;
/**
 *
 * @author Matheus
 */
public class login {
    
    Scanner s = new Scanner(System.in);
    AdministradorDAO administradorDAO = new AdministradorDAO();
    MedicoDAO medicoDAO = new MedicoDAO();
     
        public login(){
        int opcaoLogin = 10;
           while (opcaoLogin != 0){

               opcaoLogin = this.login();

               switch (opcaoLogin) {
                   case 1:
                            boolean testeUsuario = true;
                   String adm;
                   do{
                       if (testeUsuario == true){
                           System.out.print("Admnistrador: ");
                           adm = s.nextLine();
                           testeUsuario = administradorDAO.buscaPorLogin(adm);
                       }else{
                           System.out.println("Admnistrador não encontrado.");
                           System.out.print("Admnistrador: ");
                           adm = s.nextLine();
                           testeUsuario = administradorDAO.buscaPorLogin(adm);
                       }
           }while(testeUsuario != true);
             int idConectado = -2;
        int tentativa = 3;
        String senha;
        do{
            if (idConectado == -2){
                System.out.print("Senha: ");
                senha = s.nextLine();
                idConectado = administradorDAO.buscaSenhaPorLogin(adm,senha);
            }else{
                do{
                    tentativa --;
                    if (tentativa < 3){
                        System.out.println("Senha incorreta. Você tem mais " + tentativa + " tentativa(s)!");
                        System.out.print("Senha: ");
                        senha = s.nextLine();
                        idConectado = administradorDAO.buscaSenhaPorLogin(adm,senha);
                    }else{
                        System.out.println("Senha incorreta 3ª tentativa.\n\n ...Sistema Encerrado.");
                        System.exit(0);
                    }
                }while(idConectado < 0);

            }
        }while(idConectado < 0);        
                 
            new Menu();
            break;
                
                case 2:
                      boolean testeUsuarioM = true;
                   String mdc;
                   do{
                       if (testeUsuarioM == true){
                           System.out.print("Médico: ");
                           mdc = s.nextLine();
                           testeUsuarioM = medicoDAO.buscaPorLogin(mdc);
                       }else{
                           System.out.println("Médico não encontrado.");
                           System.out.print("Médico: ");
                           mdc = s.nextLine();
                           testeUsuarioM = medicoDAO.buscaPorLogin(mdc);

                       }
           }while(testeUsuarioM != true);
             int idConectadoM = -2;
                int tentativaM = 3;
                String senhaM;
                do{
                    if (idConectadoM == -2){
                        System.out.print("Senha: ");
                        senhaM = s.nextLine();
                        idConectadoM = medicoDAO.buscaSenhaPorLogin(mdc,senhaM);
                    }else{
                        do{
                            tentativaM --;
                            if (tentativaM < 3){
                                System.out.println("Senha incorreta. Você tem mais " + tentativaM + " tentativa(s)!");
                                System.out.print("Senha: ");
                                senhaM = s.nextLine();
                                idConectadoM = medicoDAO.buscaSenhaPorLogin(mdc,senhaM);
                            }else{
                                System.out.println("Senha incorreta.\n\n ...Sistema Encerrado.");
                                System.exit(0);
                            }
                        }while(idConectadoM < 0);

                    }
                }while(idConectadoM < 0);        
                 
                new MenuMedico();
                break;
                               
            }
        }
    }
     
    public static void main(String[] args){
        new login();
    }
    
    public int login() {
        System.out.println("==================================================================================");
        System.out.println("|                                   LOGIN                                        |");
        System.out.println("|                             1- Admnistrador                                    |");
        System.out.println("|                                 2- Médico                                      |");
        System.out.println("|Digite sua opção                                                                |");
        System.out.println("==================================================================================");
        System.out.print("Informe seu login: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
        
    }
}
        

