package de.luckydonald.utils.interactions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;



class BootupTest {
    @Test
    void prepareString() {
    }

    @Test
    void centerText_equal() {
        String result = Bootup.centerText("A", 5);
        String expected = "  A  ";
        assertEquals("Centered 1 in 5", expected, result);
    }
    @Test
    void centerText_unequal() {
        String result = Bootup.centerText("AB", 5);
        String expected = " AB  ";
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

    @Test
    void centerText_same() {
        String result = Bootup.centerText("12345", 5);
        String expected = "12345";
        assertEquals("Centered 5 in 5", expected, result);

    }

    @Test
    void centerText_spaces() {
        String result = Bootup.centerText("Hello World", 12);
        String expected = "Hello World ";
        assertEquals("Centered Hello World", expected, result);
    }

    @Test
    void centerText_spaces_fill() {
        String result = Bootup.centerText("Hello World", 12, '!');
        String expected = "Hello!World!";
        assertEquals("Centered Hello World with custom fill.", expected, result);
    }

    @Test
    void centerText_only_spaces_fill() {
        String result = Bootup.centerText("  ", 10, '.');
        String expected = "..........";
        assertEquals("Centered Dots with custom fill.", expected, result);
    }
}
