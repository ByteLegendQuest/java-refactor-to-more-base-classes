package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    @CaptureSystemOutput
    public void testMeow(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("my name is: Tom"));
        capture.expect(Matchers.containsString("meow"));
        new Cat("Tom").sayMyName();
        new Cat("Tom").animalSound();
    }
}
