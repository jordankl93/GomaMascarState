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
public interface MaquinaState {
    
    /**
     *
     * @param moeda
     * @return
     */
    public MaquinaState InserirMoeda(int moeda);
    public MaquinaState EjetarMoeda();
    public MaquinaState AcionaAlavanca();
    public MaquinaState RetirarGoma();
    
}