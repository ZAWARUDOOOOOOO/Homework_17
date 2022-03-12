package com.sava;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder {

    private List<Boolean> schedule = new ArrayList<>();

    public List<Boolean> build() {
        return schedule;
    }

    public void setSize(int size) {
        if (schedule.size() < size) {
            dayOffs(size - schedule.size());
        } else {
            for (int i = size; i <= schedule.size(); i++) {
                schedule.remove(size);
            }
        }
    }

    public void dayOff() {
        schedule.add(false);
    }

    public void dayOffs(int count) {
        for (int i = 0; i < count; i++) {
            dayOff();
        }
    }

    public void workDay() {
        schedule.add(true);
    }

    public void workDays(int count) {
        for (int i = 0; i < count; i++) {
            workDay();
        }
    }
}
