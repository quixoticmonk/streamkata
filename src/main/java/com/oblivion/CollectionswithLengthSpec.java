package com.oblivion;

import java.util.List;

import static java.util.stream.Collectors.toList;

class CollectionswithLengthSpec {

    static List<String> convertToListWithElementsOfLength(List<String> input) {

        return  input.stream()
                .filter(e->e.length()<4)
                .collect(toList());

    }



}
