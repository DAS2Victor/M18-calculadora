/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marc
 */
public class OperacionsTest {
    
    public OperacionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Operacions.
     */
    /*@Test
    public void testSuma() {
        System.out.println("suma");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = Operacions.suma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacio method, of class Operacions.
     */
    /*@Test
    public void testMultiplicacio() {
        System.out.println("multiplicacio");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = Operacions.multiplicacio(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Operacions.
     */
    /*@Test
    public void testResta() {
        System.out.println("resta");
        int numero1 = 0;
        int numero2 = 0;
        int expResult = 0;
        int result = Operacions.resta(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Operacions.
     */
    /*@Test
    public void testDivision() {
        System.out.println("division");
        int numero1 = 0;
        int numero2 = 0;
        int expResult = 0;
        int result = Operacions.division(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esCorrecte method, of class Operacions.
     */
    @Test
    public void testEsCorrecte() {
        System.out.println("esCorrecte");
        String s = "1+1";
        boolean expResult = true;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte2() {
        System.out.println("esCorrecte");
        String s = "28-123";
        boolean expResult = true;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte3() {
        System.out.println("esCorrecte");
        String s = "1*21";
        boolean expResult = true;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte4() {
        System.out.println("esCorrecte");
        String s = "123/5";
        boolean expResult = true;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte5() {
        System.out.println("esCorrecte");
        String s = "a+8";
        boolean expResult = false;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte6() {
        System.out.println("esCorrecte");
        String s = "5=3";
        boolean expResult = false;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte7() {
        System.out.println("esCorrecte");
        String s = "53*8a1";
        boolean expResult = false;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testEsCorrecte8() {
        System.out.println("esCorrecte");
        String s = "22/+4";
        boolean expResult = false;
        boolean result = Expressions.esCorrecte(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
