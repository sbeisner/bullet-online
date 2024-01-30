package com.bullet.journal.entries;

import com.bullet.journal.entries.Entry;
import com.bullet.journal.ranges.Range;

public class ToDo extends Entry {
    private boolean isComplete ;
    public ToDo(Range range) {
        super(range);
        isComplete = false ;
    }

    public void Resolve() {
        isComplete = true ;

    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
