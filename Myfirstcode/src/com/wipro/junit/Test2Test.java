package com.wipro.junit;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test2Test {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMainMethodOutput() {
        Test2.main(new String[]{});

        // Normalize newlines to prevent Windows/Linux differences
        String actualOutput = outputStream.toString().replace("\r\n", "\n").trim();
        String expectedOutput = "10\n20\n30";

        assertEquals(expectedOutput, actualOutput, "Main method output should match expected output");
    }
}
