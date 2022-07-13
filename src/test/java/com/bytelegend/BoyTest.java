package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class BoyTest {
    @Test
    @CaptureSystemOutput
    public void testBoy(CaptureSystemOutput.OutputCapture capture) {
        String regex = "I'm a boy\\s+my name is: Bob\\s+my age is: 10\\s+";
        capture.expect(Matchers.matchesPattern(regex));
        new Boy("Bob", 10).sayBoy();
    }
}
