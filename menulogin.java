
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
public class menulogin {
    
    public menulogin () {
        int opcao = 0;
        
        do {
              
            System.out.println ("====================");
            System.out.println("|    LOGIN/CADASTRO   |");
            System.out.println("|                     |");
            System.out.println("| 1 - Faca login      |");
            System.out.println("| 2 - Faca cadastro   |");
            System.out.println("| 3 - Voltar ao menu  |");
            System.out.println(" =====================");
            System.out.println("Escolha uma das opcoes acima...: ");
            do {
                 Scanner scanner = new Scanner(System.in);
                 opcao = Integer.parseInt(scanner.nextLine());
                 if (opcao <= 0 || opcao >= 4) {
                     System.out.println("Opcao incorreta...Digite novamente...: ");
                 }
            }while (opcao <= 0 || opcao >= 4);
            
            if (opcao == 1) {
                //chama login
            }
            else {
                if (opcao == 2) {
                    //chama menu
                }
                else {
                    System.out.println ("Retornando ao menu");
                    //chama menup
                }
            }
        } while (opcao != 3 );
    }
    
}
