package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static com.company.Main.arrayList3;

public class ForLIst {
    public void getList(List<String> list1, List<String> list2) {
        Iterator<String> iter1 = list1.iterator();
        Iterator<String> iter2 = list2.iterator();
        while (iter1.hasNext() && iter2.hasNext()){
            arrayList3.add(iter1.next());
            arrayList3.add(iter2.next());
        }
        System.out.println(arrayList3);

    }

    public  void addList(List<String> list) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
    }
}
