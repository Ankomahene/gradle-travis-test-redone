package io.turntabl;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrivateClientTest {

    @Test
    public void getName(){
        PrivateClient p = new PrivateClient("Franklin", 6985, Level.Platinum);
        assertEquals("Franklin", p.getName());
    }

}