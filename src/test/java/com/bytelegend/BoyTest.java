package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class BoyTest {
    @Test
    @CaptureSystemOutput
    public void testBoy(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("I'm a boy\nmy name is: Bob\nmy age is: 10"));
        new Boy("Bob", 10).sayBoy();
    }
}
