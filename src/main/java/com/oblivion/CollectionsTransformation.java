package com.oblivion;

import java.util.List;

import static java.util.stream.Collectors.toList;

class CollectionsTransformation {

    static List<String> covertToUpperCase(List<String> input) {

        return input.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    static List<String> convertToListWithElementsOfLength(List<String> input) {

        return  input.stream()
                .filter(e->e.length()<4)
                .collect(toList());

    }

}
