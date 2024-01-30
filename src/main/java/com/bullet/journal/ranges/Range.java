package com.bullet.journal.ranges;

import com.bullet.journal.entries.*;

import java.util.ArrayList;

public abstract class Range{

    private ArrayList<Entry> entries ;
    public Range () {
        entries = new ArrayList<Entry>();
    }

    public long getTotalBudget() {
        long budget = 0;
        for (Entry entry : entries) {
            if (entry instanceof TimedToDo) {
                budget += ((TimedToDo) entry).getBudgetMinutes();
            }
        }
        return budget;
    }
    public void removeEntry(Entry e) {
        entries.remove(e);
    }
    public void addEntry(Entry e) {
        entries.add(e);
    }
}
