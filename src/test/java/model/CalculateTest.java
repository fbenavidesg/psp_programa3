/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author fbenavides
 */
public class CalculateTest extends TestCase {
    
    public CalculateTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    /**
     * prueba unitaria metodo calculateB1 clase Calculate
     */
    public void testCalculateB1(){
        System.out.println("calculateB1");
        Calculate instance = new Calculate();
        int n = 10;
        double sumXY = 4303108.0;
        double averageX = 382.8;
        double averageY = 638.9;
        double sumX2 = 2540284.0;
        double expResult = 1.727932426206986;
        double result = instance.calculateB1(n,sumXY,averageX,averageY,sumX2);
        assertEquals(expResult, result);
    }
    /**
     * prueba unitaria metodo calculateB0 clase Calculate
     */
    public void testCalculateB0(){
        System.out.println("calculateB0");
        Calculate instance = new Calculate();
        double averageY = 638.9;
        double b1 = 1.727932426206986;
        double averageX = 382.8;
        double expResult = -22.552532752034267;
        double result = instance.calculateB0(averageY, b1, averageX);
        assertEquals(expResult, result);
    }
    /**
     * prueba unitaria metodo calculateR clase Calculate
     */
    public void testCalculateR(){
        System.out.println("calculateR");
        Calculate instance = new Calculate();
        int n = 10;
        double sumXY = 4303108.0;
        double sumX = 3828.0;
        double sumY = 6389.0;
        double sumX2 = 2540284.0;
        double sumY2 = 7604693.0;
        double expResult = 0.9544965741046826;
        double result = instance.calculateR(n,sumXY,sumX,sumY,sumX2,sumY2);
        assertEquals(expResult, result);
    }
}
