package com.bullet.journal.entries;

import com.bullet.journal.ranges.Range;

public abstract class Entry {
    private Range range ;
    private String content ;

    public Entry(Range range) {
        this.range = range;
        this.content = "";
    }
    public Entry(Range range, String content) {
        this.range = range;
        this.content = content;
    }

    public void modifyContent(String newContent) {
        this.content = newContent;
    }

    public Range getRange() {
        return range;
    }

    public String getContent() {
        return content;
    }

    public void setRange(Range range) {
        this.range = range;
    }

}
