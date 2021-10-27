/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author Matheus
 */
public class Relatorio {
    
    public Relatorio() {
        
        Medico medico = new Medico();
        Hospital hospital = new Hospital();
        Plantoes plantao = new Plantoes();
        
        System.out.println("           RELATORIO        ");
        System.out.println("============================");
        System.out.println("O médico " + medico.getNome());
        System.out.println("Trabalhou no hospital" + hospital.getNome() + "Por 12 horas"
            + "No turno da " + plantao.getPeriodo());
        System.out.println("Fazendo plantao do tipo: " + plantao.getTipo());
        System.out.println("Recebendo um total de" + medico.getSalarioM());
        
    }
    
}
