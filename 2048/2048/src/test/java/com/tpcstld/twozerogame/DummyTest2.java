package com.tpcstld.twozerogame;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tingshi on 2/2/16.
 */
public class DummyTest2 {
    @Test
    public void thisWillNotPass() {
        assertThat(false, is(true));
    }

    @Test
    public void thisShallPass() {
        assertThat(true, is(true));
    }
}
