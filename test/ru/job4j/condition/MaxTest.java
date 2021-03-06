package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax10To5Then10() {
        int result = Max.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax7To8Then8() {
        int result = Max.max(7, 8);
        assertThat(result, is(8));
    }
}