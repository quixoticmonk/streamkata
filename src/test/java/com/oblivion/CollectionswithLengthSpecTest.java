package com.oblivion;

import org.junit.Test;

import java.util.List;

import static com.oblivion.CollectionswithLengthSpec.convertToListWithElementsOfLength;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class CollectionswithLengthSpecTest {

    @Test
    public void shouldReturnOnlyElementsWithLessThan4Chars(){
        List<String> input = asList("My", "name", "is", "John", "Doe");
        List<String> output = asList("My", "is", "Doe");

        assertEquals(convertToListWithElementsOfLength(input),output);

    }


}