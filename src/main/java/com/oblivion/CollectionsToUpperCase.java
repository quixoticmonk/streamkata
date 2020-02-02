package com.oblivion;

import java.util.ArrayList;
import java.util.List;

public class CollectionsToUpperCase {

    public static List<String> covertToUpperCase(List<String> input) {

        List <String> output = new ArrayList<>();
        for(String e : input){
            output.add(e.toUpperCase());
        }
        return output;


    }

}
