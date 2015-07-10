/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.gomamascar.cdp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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

    /**
     * Test of InserirMoeda method, of class Maquina.
     */
    @Test
    public void testInserirMoeda() {
        System.out.println("InserirMoeda");
        int moeda = 0;
        Maquina instance = new Maquina();
        instance.InserirMoeda(moeda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EjetarMoeda method, of class Maquina.
     */
    @Test
    public void testEjetarMoeda() {
        System.out.println("EjetarMoeda");
        Maquina instance = new Maquina();
        instance.EjetarMoeda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RetirarGoma method, of class Maquina.
     */
    @Test
    public void testRetirarGoma() {
        System.out.println("RetirarGoma");
        Maquina instance = new Maquina();
        instance.RetirarGoma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AcionarAlavanca method, of class Maquina.
     */
    @Test
    public void testAcionarAlavanca() {
        System.out.println("AcionarAlavanca");
        Maquina instance = new Maquina();
        instance.AcionarAlavanca();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetState method, of class Maquina.
     */
    @Test
    public void testSetState() {
        System.out.println("SetState");
        MaquinaState state = null;
        Maquina instance = new Maquina();
        instance.SetState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
