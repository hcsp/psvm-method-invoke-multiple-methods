package com.github.hcsp;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.matchesRegex("(?s).*a\\s+b\\s+c\\s+d\\s+.*"));
        Main.main(null);
    }
}
