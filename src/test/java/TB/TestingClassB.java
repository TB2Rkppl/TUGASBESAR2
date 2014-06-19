/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB;

/**
 *
 * @author ryan
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestingClassB {
     private static B BMath ;
    
    @Before
    public void awalTest()
    {
        
        BMath = new B();
        System.out.println("Awal Test");
    }
    @Test
    public void Test1()
    {
  
   assertSame("Harusnya", 1,BMath.div(2,2));
    }
    @Test
    public void Test2()
    {
  
   assertSame("Harusnya", 250,BMath.mul(5,50));
    }
    @After
    public void akhirTest()
    {
        System.out.println("Akhir Test");
    }
}
