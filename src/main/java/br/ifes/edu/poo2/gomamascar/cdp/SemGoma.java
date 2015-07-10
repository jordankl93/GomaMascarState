/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomamascar.cdp;

/**
 *
 * @author Jordan
 */
public class SemGoma implements MaquinaState{

    public SemGoma() {
    }
        
    @Override
    public MaquinaState InserirMoeda(int moeda) {
        System.out.println("Sem Gomas...");
        return this;
    }

    @Override
    public MaquinaState EjetarMoeda() {
        System.out.println("Sem Gomas...");
        return this;
    }

    @Override
    public MaquinaState AcionaAlavanca() {
        System.out.println("Sem Gomas...");
        return this;
    }

    @Override
    public MaquinaState RetirarGoma() {
        System.out.println("Sem Gomas...");
        return this;
    }
    
    public static MaquinaState AddGomas(int gomas){
        GomaVendida.SetQuantidadeGomas(gomas);
        System.out.println("Gomas adicionadas. Maquina pronta para uso");
        return new SemMoeda();
    }
}
