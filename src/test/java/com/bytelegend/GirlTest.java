package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    @CaptureSystemOutput
    public void testGirl(CaptureSystemOutput.OutputCapture capture) {
        String regex = "I'm a girl\\s+my name is: Alice\\s+my age is: 8\\s+";
        capture.expect(Matchers.matchesPattern(regex));
        new Girl("Alice", 8).sayGirl();
    }
}
