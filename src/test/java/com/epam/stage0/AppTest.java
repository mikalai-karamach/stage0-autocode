package com.epam.stage0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class AppTest {
    private App app = new App();

    @Test
    void testJuly () {
        String input = "JUL";

        int actual = app.getMonthNumber(input);

        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void testDecember () {
        String input = "DEC";

        int actual = app.getMonthNumber(input);

        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void noSuchMonth() {
        String input = "Abrokadabr'";

        int actual = app.getMonthNumber(input);

        int expected = 0;
        assertEquals(expected, actual);
    }
}
