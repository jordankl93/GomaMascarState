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
public class RecebeMoeda implements MaquinaState{
    private int moedaInserida;
    private boolean moedaValida;
    
    public RecebeMoeda(int moeda) {
        this.moedaInserida = moeda;
        moedaValida = ValidaMoeda(this.moedaInserida);
    }   
    
    @Override
    public MaquinaState InserirMoeda(int moeda) {
        System.out.println("Moeda já inserida");
        return this;
    }
    @Override
    public MaquinaState EjetarMoeda() {
        System.out.println("Moeda ejetada");
        return new SemMoeda();
    }

    @Override
    public MaquinaState AcionaAlavanca() {
        if(moedaValida){
            System.out.println("Alavanca acionada!");
            return new GomaVendida();
        }
        else{
            System.out.println("Moeda Invalida. Retire!");
            return this;
        }            
    }

    @Override
    public MaquinaState RetirarGoma() {
        System.out.println("Puxe a alavanca para retirar a Goma");
        return this;
    }
    
    private static boolean ValidaMoeda(int moeda){
        if(moeda == 1){
            System.out.println("Puxe a alavanca para retirar a Goma");
            return true;
        }
        else{
            System.out.println("Moeda inválida... Acione o botão de ejetar a moeda");
            return false;
        }
    }
}
