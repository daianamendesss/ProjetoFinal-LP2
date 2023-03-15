/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psf;

import java.util.Scanner;

/**
 *
 * @author 15385404608
 */
public class Psf {

   
    public static void main(String[] args) {
                            
            Paciente p = new Paciente();
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Digite o nome do Paciente: ");
            p.setNome(entrada.nextLine());
        System.out.println("Nome do paciente: "+p.getNome());
        System.out.println("Digite a idade do Paciente: ");
            p.setIdade(entrada.nextInt());
        System.out.println("Idade do Paciente: "+p.getIdade());
        System.out.println("Data da Consulta: ");
            p.setDataEntrada(entrada.next());
        System.out.println("A data da Consulta é: "+p.getDataEntrada());
        //cadastrando pacientes
        //-----------------------------------------------------
        
            Medicos m = new Medicos();
        
        System.out.println("Digite o nome do Médico: ");
            m.setNome(entrada.next());
        System.out.println("Nome do médico: "+m.getNome());
        System.out.println("Digite o CRM do Médico: ");
            m.setCrm(entrada.next());
        System.out.println("CRM do Médico: "+m.getCrm());
        
        //cadastrando medicos
        //------------------------------------------------------
        
            Receitas  r = new Receitas();
            r.setObjMedico(m);
        System.out.println("Nome do Remédio: ");
            r.setNomeRemedio(entrada.next());
        System.out.println("Nome do Remédio: "+r.getNomeRemedio());
        System.out.println("Data de Entrega: ");
            r.setNomeRemedio(entrada.next());
        
        //cadastrando receitas
        //-------------------------------------------------------
            Consultas c = new Consultas();
            c.setObjPaciente(p);
            c.setObjMedico(m);
        System.out.println("Digite a data da consulta: ");
            c.setDataEntrada(entrada.next());
        System.out.println("A data da consulta será: "+c.getDataEntrada());
        
        // cadastrando consultas
        //--------------------------------------------------------
            
        
        
           
        
        
        
        
    }
    
}
