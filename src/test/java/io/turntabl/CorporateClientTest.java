package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateClientTest {

    @Test
    public void getClientName(){
        CorporateClient cop = new CorporateClient( "Shadrack", 2566, Level.Gold);
        assertEquals("Shadrack", cop.getName());
    }

}
