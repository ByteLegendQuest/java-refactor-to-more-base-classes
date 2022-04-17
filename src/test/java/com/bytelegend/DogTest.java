package com.bytelegend;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class DogTest {
    @Test
    @CaptureSystemOutput
    public void testWoof(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("my name is: ABC"));
        capture.expect(Matchers.containsString("woof"));
        new Dog("ABC").sayMyName();
        new Dog("ABC").animalSound();
    }
}
