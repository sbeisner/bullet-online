package com.bullet.journal.entries;

import com.bullet.journal.ranges.Range;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimedToDo extends ToDo{

    private long budgetMinutes;
    private long timeSpentMinutes;
    private LocalDateTime startTimeStamp;
    private boolean isRunning ;
    public TimedToDo(Range range) {
        super(range);
        timeSpentMinutes = 0;
        isRunning = false;
    }

    public long getBudgetMinutes() {
        return budgetMinutes;
    }

    public void start() {
        isRunning = true;
        startTimeStamp = LocalDateTime.now();
    }

    public void stop() {
        LocalDateTime endTimeStamp = LocalDateTime.now();
        timeSpentMinutes += startTimeStamp.until(endTimeStamp, ChronoUnit.MINUTES);
    }
    public long getRemainingTime() {
        return budgetMinutes - timeSpentMinutes;
    }

    public boolean isOverTime() {
        return getRemainingTime() < 0;
    }
}
