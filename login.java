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
     
     public login(){
     int opcaoLogin = 10;
        while (opcaoLogin != 0){
        
            opcaoLogin = this.login();
            
            switch (opcaoLogin) {
                case 1:
                    System.out.println("Informe seu Login");
                    String loginaux = s.nextLine();
                    System.out.println("Bem vindo " + loginaux + "!");
                    new Menu();
                    
                break;
                
                case 2:
                    System.out.println("Informe seu Login");
                    String loginaux2 = s.nextLine();
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
        Scanner scanner = new Scanner(System.in);
        int  opcao = Integer.parseInt(scanner.nextLine());
        return opcao;
        
    }
}
        

