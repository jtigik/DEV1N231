/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author jtsilva
 */
public class Crud_Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String opcao = sc.next();
        
        while(isOpcaoValida(opcao)){
            
        }
    }
    
    private static void cadastrar(String dados){
        String [] dadosSeparados = dados.split(",");
        
//        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6], dadosSeparados[7], dadosSeparados[8]);
    }
    
    private static Boolean isCadastrar(String opcao){
        if("1".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }
    
    private static Boolean isConsultar(String opcao){
        if("2".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }
    
    private static Boolean isAlterar(String opcao){
        if("3".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }
    
    private static Boolean isExcluir(String opcao){
        if("4".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }
    
    private static Boolean isOpcaoValida(String opcao){
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao)){
            return true;
        }else{
            return false;
        }
    }
    
    private static void sair(){
        System.out.println("Programa encerrado!");
    }
}
