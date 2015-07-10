/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomamascar.cdp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan-Not
 */
public class MaquinaTest {
    Maquina maquina;
    
    @Before
    public void before(){
        maquina = new Maquina();
    }
    
    @Test
    public void testFirstInstance(){
        assertEquals(SemMoeda.class, maquina.getState().getClass());
    }

    /**
     * Test of InserirMoeda method, of class Maquina.
     */
    @Test
    public void testInserirMoeda() {
        System.out.println("InserirMoeda");
        int moeda = 1;
        maquina.InserirMoeda(moeda);
        assertEquals(RecebeMoeda.class, maquina.getState().getClass());
    }

    /**
     * Test of EjetarMoeda method, of class Maquina.
     */
    @Test
    public void testEjetarMoeda() {
        System.out.println("EjetarMoeda");
        maquina.EjetarMoeda();
        assertEquals(SemMoeda.class, maquina.getState().getClass());
    }
    
    /**
     * Test of AcionarAlavanca method, of class Maquina.
     */
    @Test
    public void testAcionarAlavanca() {
        System.out.println("AcionarAlavanca");
        int moeda = 1;
        maquina.InserirMoeda(moeda);
        maquina.AcionarAlavanca();
        assertEquals(GomaVendida.class, maquina.getState().getClass());
    }

    /**
     * Test of RetirarGoma method, of class Maquina.
     */
    @Test
    public void testRetirarGoma() {
        System.out.println("RetirarGoma");        
        maquina.RetirarGoma();
        assertEquals(SemMoeda.class, maquina.getState().getClass());
    }    

    /**
     * Test of SetState method, of class Maquina.
     */
    @Test
    public void testSetState() {
        System.out.println("SetState");
        MaquinaState state = null;
        maquina.SetState(state);
    }
    
}
