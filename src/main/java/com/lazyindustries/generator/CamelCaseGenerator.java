package com.lazyindustries.generator;

import java.util.*;

public class CamelCaseGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        if (scanner.hasNextLine()) {
             String str = scanner.nextLine();

             String[] first = ((str.split(" ")));

             sb.append(first[0].toLowerCase());

             for (int i = 1; i < first.length; i++){
                 sb.append(first[i].substring(0,1).toUpperCase()).append(first[i].substring(1));
             }
        }

        String returnedString = sb.toString();

        System.out.println(returnedString);


    }
}
