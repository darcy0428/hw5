package gpt;

import java.util.*;

public class gpt1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // 添加資料
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        System.out.println("Original list:");
        System.out.println(names);

        // 排序資料
        Collections.sort(names);
        System.out.println("Sorted list:");
        System.out.println(names);

        // 反轉順序
        Collections.reverse(names);
        System.out.println("Reversed list:");
        System.out.println(names);
    }
}