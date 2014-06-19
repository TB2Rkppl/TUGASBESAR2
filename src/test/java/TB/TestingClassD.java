/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TB;

/**
 *
 * @author VENOM-HCK
 */
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestingClassD {
     private static D Math ;
    
    @Before
    public void awalTest()
    {
        
        Math = new D();
        System.out.println("Awal Test");
    }
    @Test
    public void Test1()
    {
  
   assertSame("Harusnya", 4,Math.pow(2,2));
    }
    @Test
    public void Test2()
    {
  
   assertSame("Harusnya", 6,Math.mul(2,3));
    }
    @After
    public void akhirTest()
    {
        System.out.println("Akhir Test");
    }
}
