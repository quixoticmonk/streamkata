package com.oblivion;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class CollectionsTransformation {

    static List<String> covertToUpperCase(List<String> input) {

        return input.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    static List<String> convertToListWithElementsOfLength(List<String> input) {

        return input.stream()
                .filter(e -> e.length() < 4)
                .collect(toList());

    }

    static List<String> shouldFlattenCollection(List<List<String>> input) {

        return input.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    static Person getOldestPerson(List<Person> input) {
        return input.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
    }

    static int sumOfElements(List<Integer> input){
       return input.stream()
               .reduce(0,(e1,e2)->e1+e2);
    }

    static List<String> getKidNames(List<Person> input){
        return input.stream()
                .filter(p->p.age<=18)
                .map(Person::getName)
                .collect(toList());
    }


}
