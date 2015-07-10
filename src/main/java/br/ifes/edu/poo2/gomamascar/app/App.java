/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomamascar.app;

import br.ifes.edu.poo2.gomamascar.cdp.GomaVendida;
import br.ifes.edu.poo2.gomamascar.cdp.Maquina;
import br.ifes.edu.poo2.gomamascar.cdp.SemGoma;

/**
 *
 * @author Jordan
 */
public class App {
    
    public static void main (String args[]){
        Maquina maquina = new Maquina();
        
        maquina.InserirMoeda(2);
        maquina.EjetarMoeda();
        maquina.InserirMoeda(1);
        maquina.AcionarAlavanca();
        maquina.RetirarGoma();
        maquina.EjetarMoeda();
                
        //adicionar Gomas
        maquina.SetState(SemGoma.AddGomas(100));
        
        maquina.InserirMoeda(1);
        maquina.AcionarAlavanca();
        maquina.RetirarGoma();
//        maquina.EjetarMoeda();              
        
    }
    
}
