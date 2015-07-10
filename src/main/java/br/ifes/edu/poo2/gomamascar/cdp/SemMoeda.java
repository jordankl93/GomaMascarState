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
public class SemMoeda implements MaquinaState{
        
    public SemMoeda() {
        System.out.println("Insira uma moeda.");
    }  

    @Override
    public MaquinaState InserirMoeda(int moeda) {
        System.out.println("Verificando moeda...");
        return new RecebeMoeda(moeda);
    }

    @Override
    public MaquinaState EjetarMoeda() {
        System.out.println("Insira uma moeda");
        return this;
    }

    @Override
    public MaquinaState AcionaAlavanca() {
        System.out.println("Insira uma moeda.");
        return this;
    }

    @Override
    public MaquinaState RetirarGoma() {
        System.out.println("Insira uma moeda.");
        return this;
    }
    
}
