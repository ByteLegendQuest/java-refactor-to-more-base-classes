package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    @CaptureSystemOutput
    public void testGirl(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I'm a girl\nmy name is: Alice\nmy age is: 8"));
        new Girl("Alice", 8).sayGirl();
    }
}
