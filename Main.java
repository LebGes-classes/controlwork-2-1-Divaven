package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map m = new Map<Integer, Integer>();

        m.put(1,2);
        m.put(2,2);
        m.put(3,2);

        System.out.println(m.get(2));
        m.remove(2);

        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue(2));

        System.out.println(m.size());
    }
}
