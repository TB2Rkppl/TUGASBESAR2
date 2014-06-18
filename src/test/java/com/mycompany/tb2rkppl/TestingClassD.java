/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tb2rkppl;

/**
 *
 * @author VENOM-HCK
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TestingClassD {
    @Before
    {
        D Math = new D();
        System.out.println("Awal Test");
    }
    @Test
    {
  
   AssertEquals("Harusnya", 4,Math.D(2,2));
    }
    @Test
    {
        Math.toString("44");
        AssertSame("HArusnya",44,Math.toString);
        
    }
    @After
    {
        System.out.println("Akhir Test");
    }
}
