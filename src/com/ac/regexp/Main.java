package com.ac.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Phrase \"damage\" matches : " + isRegexpMatched("damage"));
        System.out.println("Phrase \"minor damage\" matches : " + isRegexpMatched("minor damage"));
        System.out.println("Phrase \"heavy damage\" matches : " + isRegexpMatched("heavy damage"));
        System.out.println("Phrase \"no damage\" matches : " + isRegexpMatched("no damage"));
    }

    public static boolean isRegexpMatched(String input) {
        Pattern pattern = Pattern.compile("^(?!no).*damage$");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
