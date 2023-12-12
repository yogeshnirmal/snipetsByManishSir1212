package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String s = "I am ^ IronnorI Ma, i";
        s = s.replaceAll("[^a-zA-Z]", "").toUpperCase(Locale.ROOT);
        
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println("output  " + s.equals(String.valueOf(stringBuffer.reverse())));

    }
}