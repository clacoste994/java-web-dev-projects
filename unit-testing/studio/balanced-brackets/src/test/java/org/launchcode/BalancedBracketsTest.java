package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void WrongBracketsCurly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}"));
    }

    @Test
    public void WrongNumber() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void WrongBracketsSmooth() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("()"));
    }



}

