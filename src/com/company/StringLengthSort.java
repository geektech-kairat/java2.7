package com.company;

import java.util.Comparator;

public class StringLengthSort implements Comparator<String> {
    @Override
    public int compare(String list1, String list2) {
        return list1.length() - list2.length() ;
    }
}
