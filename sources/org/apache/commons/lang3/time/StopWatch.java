package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes6.dex */
public class StopWatch {
    private static final long NANO_2_MILLIS = 1000000;
    private static final int STATE_RUNNING = 1;
    private static final int STATE_SPLIT = 11;
    private static final int STATE_STOPPED = 2;
    private static final int STATE_SUSPENDED = 3;
    private static final int STATE_UNSPLIT = 10;
    private static final int STATE_UNSTARTED = 0;
    private int runningState = 0;
    private int splitState = 10;
    private long startTime;
    private long startTimeMillis;
    private long stopTime;

    public long getNanoTime() {
        long jNanoTime;
        long j10;
        int i10 = this.runningState;
        if (i10 == 2 || i10 == 3) {
            jNanoTime = this.stopTime;
            j10 = this.startTime;
        } else {
            if (i10 == 0) {
                return 0L;
            }
            if (i10 != 1) {
                throw new RuntimeException("Illegal running state has occured. ");
            }
            jNanoTime = System.nanoTime();
            j10 = this.startTime;
        }
        return jNanoTime - j10;
    }

    public long getSplitNanoTime() {
        if (this.splitState == 11) {
            return this.stopTime - this.startTime;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }

    public long getSplitTime() {
        return getSplitNanoTime() / 1000000;
    }

    public long getStartTime() {
        if (this.runningState != 0) {
            return this.startTimeMillis;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long getTime() {
        return getNanoTime() / 1000000;
    }

    public void reset() {
        this.runningState = 0;
        this.splitState = 10;
    }

    public void resume() {
        if (this.runningState != 3) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.startTime = (System.nanoTime() - this.stopTime) + this.startTime;
        this.runningState = 1;
    }

    public void split() {
        if (this.runningState != 1) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.stopTime = System.nanoTime();
        this.splitState = 11;
    }

    public void start() {
        int i10 = this.runningState;
        if (i10 == 2) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (i10 != 0) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.startTime = System.nanoTime();
        this.startTimeMillis = System.currentTimeMillis();
        this.runningState = 1;
    }

    public void stop() {
        int i10 = this.runningState;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (i10 == 1) {
            this.stopTime = System.nanoTime();
        }
        this.runningState = 2;
    }

    public void suspend() {
        if (this.runningState != 1) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.stopTime = System.nanoTime();
        this.runningState = 3;
    }

    public String toSplitString() {
        return DurationFormatUtils.formatDurationHMS(getSplitTime());
    }

    public String toString() {
        return DurationFormatUtils.formatDurationHMS(getTime());
    }

    public void unsplit() {
        if (this.splitState != 11) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.splitState = 10;
    }
}
