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
public class Maquina {
    protected MaquinaState state;
    
    public Maquina(){
        this.state = new SemMoeda();
    }
    
    public void InserirMoeda(int moeda){
        this.state = state.InserirMoeda(moeda);
    }
    
    public void EjetarMoeda(){
        this.state = state.EjetarMoeda();
    }
    
    public void RetirarGoma(){
        this.state = state.RetirarGoma();
    }
    
    public void AcionarAlavanca(){
        this.state = state.AcionaAlavanca();
    }
    
    public void SetState(MaquinaState state){
        this.state = state;
    }
    
    public MaquinaState getState(){
        return state;
    }
}
