/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author DIKDIK
 */
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestingClassA {
    
    private static A Anew;
    
   @Before
   public void awalTest(){
       Anew = new A();
       System.out.println("Mengawali Testing");
   }
   
    /**
     *
     */
    @Test
   public void Test1(){
       assertSame("Harusnya", 6,Anew.add(4,2));
   }
   
   @Test
   public void Test2(){
       assertSame("Harusnya", 10,Anew.sub(15,5));
   }
   
   @After
    public void akhirTest()
    {
        System.out.println("Akhir Test");
    }
}
