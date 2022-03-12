package com.sava;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListBuilder builder = new ListBuilder();

        builder.dayOff();//false - выходной
        builder.workDay();//true - работает

        builder.dayOffs(2);
        builder.workDays(2);

        builder.setSize(5);
        builder.setSize(8);

        List<Boolean> schedule = builder.build();
        schedule.forEach(System.out::println);
    }
}
