package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String s = "I am ^ IronnorI Ma, i";
        s = s.replaceAll("[^a-zA-Z]", "").toUpperCase(Locale.ROOT);

        StringBuffer stringBuffer = new StringBuffer(s);

        if(s.equals(String.valueOf(stringBuffer.reverse()))) System.out.println("YES ");
        else System.out.println("No");

    }
}