package com.oblivion;

import org.junit.Test;

import java.util.List;

import static com.oblivion.CollectionsTransformation.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CollectionsTransformationTest {

    @Test
    public void shouldReturnUpperCase() {
        List<String> input = asList("My", "name", "is", "John", "Doe");
        List<String> output = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertEquals(covertToUpperCase(input), output);
    }

    @Test
    public void shouldReturnUpperCase_v2() {
        List<String> input = asList("Manu Chandrasekhar");
        List<String> output = asList("MANU CHANDRASEKHAR");
        assertEquals(covertToUpperCase(input), output);
    }

    @Test
    public void shouldReturnOnlyElementsWithLessThan4Chars() {
        List<String> input = asList("My", "name", "is", "John", "Doe");
        List<String> output = asList("My", "is", "Doe");

        assertEquals(convertToListWithElementsOfLength(input), output);
    }

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> input = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> output = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertEquals(CollectionsTransformation.shouldFlattenCollection(input),(output));
    }


    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertEquals(getOldestPerson(collection),eva);
    }



}
