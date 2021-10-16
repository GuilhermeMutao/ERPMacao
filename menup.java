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
 * @author Matheus
 */
public class menup {
    
    public menup () {
        int opcao = 0;
        do {
            System.out.println("=================");
            System.out.println("|      MENU     |");
            System.out.println("|               |");
            System.out.println("| 1 - Login     |");
            System.out.println("| 2 - Sair      |");
            System.out.println("=================");
            System.out.println ("Escolha uma das opcoes acima: \n");
            do {   
                Scanner scanner = new Scanner(System.in);
                opcao = Integer.parseInt(scanner.nextLine());
                
                if (opcao <= 0 || opcao >= 3) {
                    System.out.println("\n Opcao incorreta....Digite novamente...:");
                }
            }while (opcao <= 0 || opcao >= 3);
            
            if (opcao == 1) {
                  //puxa menu
            }
            else {
                System.out.println (" Obrigado por utilizar");
            }
        }while (opcao != 2);
    }
}
