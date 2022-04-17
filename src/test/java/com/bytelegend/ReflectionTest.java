package com.bytelegend;

import com.github.hcsp.test.helper.ClassInspector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReflectionTest {
    @Test
    public void hierarchyTest() {
        Assertions.assertEquals(Animal.class, Cat.class.getSuperclass());
        Assertions.assertEquals(Animal.class, Dog.class.getSuperclass());
        Assertions.assertEquals(Person.class, Boy.class.getSuperclass());
        Assertions.assertEquals(Person.class, Girl.class.getSuperclass());
        Assertions.assertEquals(Life.class, Animal.class.getSuperclass());
        Assertions.assertEquals(Life.class, Person.class.getSuperclass());
    }

    @Test
    public void inspectFields() {
        ClassInspector.assertNoPublicFields(Cat.class, Dog.class, Boy.class, Girl.class);
        ClassInspector.assertNoDeclaredFields(Cat.class, Dog.class, Boy.class, Girl.class);
    }

    @Test
    public void inspectMethods() {
        Assertions.assertEquals(0, Cat.class.getDeclaredMethods().length);
        Assertions.assertEquals(0, Dog.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Boy.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Girl.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Life.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Animal.class.getDeclaredMethods().length);
        Assertions.assertEquals(1, Person.class.getDeclaredMethods().length);
    }
}
