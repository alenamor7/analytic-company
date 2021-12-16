package com.ac.bonus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Boolean undefined = null;
        Boolean trueValue = true;
        Boolean falseValue = false;

        List<Boolean> booleans = new ArrayList<>();
        booleans.add(undefined);
        booleans.add(trueValue);
        booleans.add(falseValue);

        booleans.stream().forEach(aBoolean -> System.out.println(getLetterFromBoolean(aBoolean)));
    }

    /**
     * As I understand, we cannot return 3 different values just based on one primitive boolean type and not using some
     * extra random or system variables.
     * Let's consider that input parameter is a Boolean wrapper class
     * @return  String "a" if reference is null
     *                 "b" if input parameter is true
     *                 "c" if input parameter is false
     */
    public static String getLetterFromBoolean(Boolean boolValue) {
        if (boolValue == null) {
            return "a";
        }
        return boolValue ? "b" : "c";
    }
}
