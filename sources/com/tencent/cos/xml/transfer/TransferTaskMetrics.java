package com.tencent.cos.xml.transfer;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes7.dex */
public class TransferTaskMetrics {
    InetAddress connectAddress;
    String domain;
    private long firstProgressTookTime;
    long size;
    private long tookTime;
    private long waitTookTime;
    private long startTime = 0;
    private long progressTime = 0;
    private long firstProgressCallbackTime = 0;
    private long completeTime = 0;

    public TransferTaskMetrics(String str, InetAddress inetAddress, long j10, long j11, long j12) {
        this.domain = str;
        this.connectAddress = inetAddress;
        this.size = j10;
        this.tookTime = j11;
        this.firstProgressTookTime = j12;
    }

    private long tookTime(long j10) {
        return Math.max(-1L, j10 - this.startTime) / 1000000;
    }

    public InetAddress getConnectAddress() {
        return this.connectAddress;
    }

    public String getDomain() {
        return this.domain;
    }

    public long getFirstProgressTookTime() {
        return this.firstProgressTookTime;
    }

    public long getSize() {
        return this.size;
    }

    public long getTookTime() {
        return this.tookTime;
    }

    public long getWaitTookTime() {
        return this.waitTookTime;
    }

    public void onComplete() {
        long jNanoTime = System.nanoTime();
        this.completeTime = jNanoTime;
        this.tookTime = tookTime(jNanoTime);
        this.waitTookTime = tookTime(this.progressTime);
        this.firstProgressTookTime = tookTime(this.firstProgressCallbackTime);
    }

    public void onFirstProgressCallback() {
        if (this.firstProgressCallbackTime <= this.progressTime) {
            this.firstProgressCallbackTime = System.nanoTime();
        }
    }

    public void onInProgress() {
        long jNanoTime = System.nanoTime();
        this.progressTime = jNanoTime;
        this.firstProgressCallbackTime = jNanoTime;
    }

    public void onStart() {
        this.startTime = System.nanoTime();
    }

    public String toString() {
        return "TransferTaskMetrics{domain='" + this.domain + "', connectAddress=" + this.connectAddress + ", size=" + this.size + ", tookTime=" + this.tookTime + ", waitTookTime=" + this.waitTookTime + ", firstProgressTookTime=" + this.firstProgressTookTime + '}';
    }

    public TransferTaskMetrics() {
    }
}
