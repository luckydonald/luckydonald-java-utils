package de.luckydonald.utils.interactions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;



class BootupTest {
    @Test
    void prepareString() {
    }

    @Test
    void centerText1() {
        String result = Bootup.centerText("A", 5);
        String expected = "  A  ";
        assertEquals("Centered 1 in 5", expected, result);
    }
    @Test
    void centerText2() {
        String result = Bootup.centerText("AB", 5);
        String expected = "  AB ";
        assertEquals("Centered 2 in 5", expected, result);
    }

    @Test
    void centerText_invalid() throws IllegalArgumentException {
        // https://github.com/junit-team/junit4/wiki/Exception-testing

        try {
            String result = Bootup.centerText("ABC", 2);
            fail("should raise exception but returned: " + result);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Text length > 2.");
        }
    }


}