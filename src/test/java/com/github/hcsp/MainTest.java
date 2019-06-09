package com.github.hcsp;

import static org.hamcrest.Matchers.matchesRegex;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(matchesRegex("(?s).*a\\s+b\\s+c\\s+d\\s+.*"));
        Main.main(null);
    }
}
