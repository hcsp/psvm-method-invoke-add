package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void importStringUtilsCorrectly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true));

        Main.main(null);

        assertTrue(new String(baos.toByteArray()).contains("1+1=2"));
        assertTrue(new String(baos.toByteArray()).contains("2+1=3"));
        assertTrue(new String(baos.toByteArray()).contains("3+1=4"));
    }

    @Test
    public void hasAddOneMethod() throws Exception {
        Main.class.getDeclaredMethod("addOne", int.class);
    }
}
