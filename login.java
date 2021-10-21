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
                        System.out.println("Senha incorreta 3ª tentativa.\n\n Sistema Finalizado.");
                        System.exit(0);
                    }
                }while(idConectado < 0);

            }
        }while(idConectado < 0);        

       
                
                new Menu();
                    
            
                    
                break;
                
                case 2:
                    System.out.println("Informe seu Login:");
                    String loginaux2 = s.nextLine();
                    System.out.println("Informe sua senha:");
                    String senhaaux2 = s.nextLine();
                    System.out.println("Bem vindo " + loginaux2 + "!");
                    new MenuMedico();
     
                break;
                
               
            }
        }
    }
     
    public static void main(String[] args){
        new login();
    }
    
    public int login() {
        System.out.println("============================");
        System.out.println("|           LOGIN          |");
        System.out.println("|1- Admnistrador           |");
        System.out.println("|2- Médico                 |");
        System.out.println("|Digite sua opção          |");
        System.out.println("============================");
        System.out.print("Informe seu login: ");
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
        
    }
}
        

