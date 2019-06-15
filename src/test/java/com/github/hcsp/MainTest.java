package com.github.hcsp;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("1+1=2"));
        capture.expect(Matchers.containsStringIgnoringCase("2+1=3"));
        capture.expect(Matchers.containsStringIgnoringCase("3+1=4"));
        Main.main(null);
    }

    @Test
    public void hasAddOneMethod() throws Exception {
        Main.class.getDeclaredMethod("addOne", int.class);
    }
}
