package com.oblivion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class CollectionsToUpperCase {

    static List<String> covertToUpperCase(List<String> input) {

        /*List <String> output = new ArrayList<>();
        input.forEach(e-> output.add(e.toUpperCase()));
        return output;*/

        return input.stream()
                .map(String::toUpperCase)
                .collect(toList());


    }

}
