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
public class GomaVendida implements MaquinaState{
    private static int QtdGoma = 0; // caso não set, a quantidade de gomas é igual a zero

    public GomaVendida() {
        
    }    

    @Override
    public MaquinaState InserirMoeda(int moeda) {
        System.out.println("Já inseriu a moeda!");
        return this;
    }

    @Override
    public MaquinaState EjetarMoeda() {
        System.out.println("Retire a goma...");
        return this;
    }

    @Override
    public MaquinaState AcionaAlavanca() {
        System.out.println("Já acionou a alavanca.");
        return this;
    }

    @Override
    public MaquinaState RetirarGoma() {
        if(QtdGoma == 0){
            System.out.println("Acabaram as gomas... Retire sua moeda");
            return new SemGoma();
        }
        else{
            QtdGoma--;
            System.out.println("Goma Retirada. Volte Sempre!!");
            System.out.println("\nQuantida Gomas: "+QtdGoma);
            return new SemMoeda();
        }
    }
    
    public static void SetQuantidadeGomas(int qtd){
        QtdGoma = qtd;
    }
}
