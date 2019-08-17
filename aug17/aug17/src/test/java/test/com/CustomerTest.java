/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ShraddhaGanesh
 */
public class CustomerTest {
    Customer cust;
    
    public CustomerTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
        cust = new Customer();
    
    }
    
    @After
    public void tearDown() {//cleaning for entire test case
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testName() {
        cust.setName("tom");
        assertEquals("tom", cust.getName());
       // cust.setId(101);
       // assertEquals("101", cust.getId());
       // cust.setEmail("abc@123.com");
       // assertEquals(cust, cust);
    
    
    }


}
