package com.autentia.foo;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FooFooTest {

    private static final Object FOO_FOO_MESSAGE = "FooFoo to you";
    private final FooFoo fooFooSUT = new FooFoo();

    @Test
    public void shouldReturnFooWhenSayFooFooIsCalled() {
        String actualFooFoo = fooFooSUT.sayFooFoo();

        assertThat(actualFooFoo, is(equalTo(FOO_FOO_MESSAGE)));
    }

}
