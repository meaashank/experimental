package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjuster {
    public static final long DO_NOT_OFFSET = Long.MAX_VALUE;
    private static final long MAX_PTS_PLUS_ONE = 8589934592L;
    private long firstSampleTimestampUs;
    private volatile long lastSampleTimestamp = -9223372036854775807L;
    private long timestampOffsetUs;

    public TimestampAdjuster(long j10) {
        setFirstSampleTimestampUs(j10);
    }

    public static long ptsToUs(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long usToPts(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long adjustSampleTimestamp(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestamp != -9223372036854775807L) {
            this.lastSampleTimestamp = j10;
        } else {
            long j11 = this.firstSampleTimestampUs;
            if (j11 != Long.MAX_VALUE) {
                this.timestampOffsetUs = j11 - j10;
            }
            synchronized (this) {
                this.lastSampleTimestamp = j10;
                notifyAll();
            }
        }
        return j10 + this.timestampOffsetUs;
    }

    public long adjustTsTimestamp(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.lastSampleTimestamp != -9223372036854775807L) {
            long jUsToPts = usToPts(this.lastSampleTimestamp);
            long j11 = (4294967296L + jUsToPts) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            long j13 = (j11 * 8589934592L) + j10;
            j10 = Math.abs(j12 - jUsToPts) < Math.abs(j13 - jUsToPts) ? j12 : j13;
        }
        return adjustSampleTimestamp(ptsToUs(j10));
    }

    public long getFirstSampleTimestampUs() {
        return this.firstSampleTimestampUs;
    }

    public long getLastAdjustedTimestampUs() {
        if (this.lastSampleTimestamp != -9223372036854775807L) {
            return this.lastSampleTimestamp;
        }
        long j10 = this.firstSampleTimestampUs;
        if (j10 != Long.MAX_VALUE) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public long getTimestampOffsetUs() {
        if (this.firstSampleTimestampUs == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.lastSampleTimestamp == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.timestampOffsetUs;
    }

    public void reset() {
        this.lastSampleTimestamp = -9223372036854775807L;
    }

    public synchronized void setFirstSampleTimestampUs(long j10) {
        Assertions.checkState(this.lastSampleTimestamp == -9223372036854775807L);
        this.firstSampleTimestampUs = j10;
    }

    public synchronized void waitUntilInitialized() throws InterruptedException {
        while (this.lastSampleTimestamp == -9223372036854775807L) {
            wait();
        }
    }
}
