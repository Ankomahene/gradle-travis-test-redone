package io.turntabl;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RegisterTest {
    @Test
    public void getNamesOfGoldClients() {
        Register register = new Register(Arrays.asList(
                new CorporateClient("John Smith", 100,Level.Gold),
                new PrivateClient("Eva Queen", 101,Level.Premium),
                new PrivateClient("Sarah Reeves", 102,Level.Gold),
                new CorporateClient("Edith Simer", 103,Level.Platinum),
                new CorporateClient("Esther Cemeron", 104,Level.Gold)

        ));

        assertEquals(Arrays.asList("John Smith", "Sarah Reeves", "Esther Cemeron"), register.getNamesOfGoldClients());
    }

    @Test
    public void getClientNameById() {
        Register register = new Register(Arrays.asList(
                new CorporateClient("John Smith", 100,Level.Gold),
                new PrivateClient("Eva Queen", 101,Level.Premium),
                new PrivateClient("Sarah Reeves", 102,Level.Gold),
                new CorporateClient("Edith Simer", 103,Level.Platinum),
                new CorporateClient("Esther Cemeron", 104,Level.Gold)
        ));

        assertTrue(register.getClientNameById(100).isPresent());
    }

    @Test
    public void getClientNameByIdNotPresent() {
        Register register = new Register(Arrays.asList(
                new CorporateClient("John Smith", 100,Level.Gold),
                new PrivateClient("Eva Queen", 101,Level.Premium),
                new PrivateClient("Sarah Reeves", 102,Level.Gold),
                new CorporateClient("Edith Simer", 103,Level.Platinum),
                new CorporateClient("Esther Cemeron", 104,Level.Gold)
        ));

        assertFalse(register.getClientNameById(10).isPresent());
    }


    @Test
    public void countClientsAtEveryServiceLevel(){
        Register register = new Register(Arrays.asList(
                new CorporateClient("John Smith", 100,Level.Gold),
                new PrivateClient("Eva Queen", 101,Level.Premium),
                new PrivateClient("Sarah Reeves", 102,Level.Gold),
                new CorporateClient("Edith Simer", 103,Level.Platinum),
                new CorporateClient("Esther Cemeron", 104,Level.Gold)

        ));

        assertEquals(5, register.countClientsAtEveryServiceLevel());
    }

}
