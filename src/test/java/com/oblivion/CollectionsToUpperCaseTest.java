package com.oblivion;

import org.junit.Test;

import java.util.List;

import static com.oblivion.CollectionsToUpperCase.covertToUpperCase;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CollectionsToUpperCaseTest {

    @Test
    public void shouldReturnUpperCase() {
        List<String> input = asList("My", "name", "is", "John", "Doe");
        List<String> output = asList("MY", "NAME", "IS", "JOHN", "DOE");

        assertEquals(covertToUpperCase(input),output);

    }

}
