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

public class TestingClassC {
     private static C CMath ;
    
    @Before
    public void awalTest()
    {
        
        CMath = new C();
        System.out.println("Awal Test");
    }
    @Test
    public void Test1()
    {
  
   assertSame("Harusnya", 2,CMath.mod(9,7));
    }
    @Test
    public void Test2()
    {
  
   assertSame("Harusnya", 3,CMath.sqrt(9));
    }
    @After
    public void akhirTest()
    {
        System.out.println("Akhir Test");
    }
}
