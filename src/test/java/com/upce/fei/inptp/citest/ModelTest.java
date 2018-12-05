package com.upce.fei.inptp.citest;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModelTest {
    
    public ModelTest() {
    }

    @Test
    public void testRespond() {
        Model m = new Model();
        
        String result = m.respond("test");
        
        assertEquals("Hello test", result);
    }
}
