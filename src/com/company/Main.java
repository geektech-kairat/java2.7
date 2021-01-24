package com.company;

import java.util.*;

public class Main {
        public static  ArrayList<String> arrayList3 = new ArrayList<>();

    public static void main(String[] args) {
        ForLIst forLIst = new ForLIst();


        System.out.println("add new list1 ");
        ArrayList<String> arrayList1 = new ArrayList<>();
        forLIst.addList(arrayList1);
        Collections.sort(arrayList1);
        System.out.println("Первый лист: " + arrayList1);
        System.out.println("add new list1 ");

        ArrayList<String> arrayList2 = new ArrayList<>();
        forLIst.addList(arrayList2);
        Collections.sort(arrayList2);
        System.out.println("Второй лист: " + arrayList2);
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);

        forLIst.getList(arrayList1, arrayList2);
        Comparator<String> stringLengthComparator = new StringLengthSort();

        arrayList3.sort(stringLengthComparator);
        System.out.println(arrayList3);

//            for (int i = 0; i <size ; i++) {
//                arrayList3.add(arrayList1.get(i)  +" "+ arrayList2.get(i));
//            }

            }
    }




