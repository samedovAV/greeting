package com.company;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            numbers.add(num);
        }

        int sum = 0;
        int comp = 1;
        for (int num : numbers) {
            sum+=num;
            comp*=num;
        }

        System.out.println(sum);
        System.out.println(comp);
    }
}
