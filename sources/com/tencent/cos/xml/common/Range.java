package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes7.dex */
public class Range {
    private long end;
    private long start;

    public Range(long j10, long j11) {
        this.start = j10;
        this.end = j11;
    }

    public long getEnd() {
        return this.end;
    }

    public String getRange() {
        Long lValueOf = Long.valueOf(this.start);
        long j10 = this.end;
        return String.format("bytes=%s-%s", lValueOf, j10 == -1 ? "" : String.valueOf(j10));
    }

    public long getStart() {
        return this.start;
    }

    public Range(long j10) {
        this(j10, -1L);
    }
}
