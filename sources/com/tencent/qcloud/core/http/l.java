package com.tencent.qcloud.core.http;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class l {
    private long calculateMD5STookTime;
    private long calculateMD5StartTime;

    @Nullable
    InetAddress connectAddress;
    long connectStartTimestamp;
    long connectTookTime;
    long dnsLookupTookTime;
    long dnsStartTimestamp;

    @Nullable
    String domainName;
    private long fullTaskStartTime;
    private long fullTaskTookTime;
    private long httpTaskStartTime;
    private long httpTaskTookTime;
    private boolean isClockSkewedRetry;
    long readResponseBodyStartTimestamp;
    long readResponseBodyTookTime;
    long readResponseHeaderStartTimestamp;
    long readResponseHeaderTookTime;

    @Nullable
    List<InetAddress> remoteAddress;
    long requestBodyByteCount;
    long responseBodyByteCount;
    private int retryCount;
    long secureConnectStartTimestamp;
    long secureConnectTookTime;
    private long signRequestStartTime;
    private long signRequestTookTime;
    long writeRequestBodyStartTimestamp;
    long writeRequestBodyTookTime;
    long writeRequestHeaderStartTimestamp;
    long writeRequestHeaderTookTime;

    public static l createMetricsWithHost(String str) {
        l lVar = new l();
        lVar.domainName = str;
        return lVar;
    }

    public final double a(long j10) {
        return j10 / 1.0E9d;
    }

    public double calculateMD5STookTime() {
        return this.calculateMD5STookTime / 1.0E9d;
    }

    public double connectTookTime() {
        return this.connectTookTime / 1.0E9d;
    }

    public double dnsLookupTookTime() {
        return this.dnsLookupTookTime / 1.0E9d;
    }

    public double fullTaskTookTime() {
        return this.fullTaskTookTime / 1.0E9d;
    }

    @Nullable
    public InetAddress getConnectAddress() {
        return this.connectAddress;
    }

    @Nullable
    public String getDomainName() {
        return this.domainName;
    }

    @Nullable
    public List<InetAddress> getRemoteAddress() {
        return this.remoteAddress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public double httpTaskFullTime() {
        return this.httpTaskTookTime / 1.0E9d;
    }

    public boolean isClockSkewedRetry() {
        return this.isClockSkewedRetry;
    }

    public synchronized l merge(l lVar) {
        String str;
        if (!TextUtils.isEmpty(this.domainName) && !TextUtils.isEmpty(lVar.domainName) && !this.domainName.equals(lVar.domainName)) {
            return this;
        }
        if (TextUtils.isEmpty(this.domainName) && (str = lVar.domainName) != null) {
            this.domainName = str;
        }
        this.dnsLookupTookTime = Math.max(lVar.dnsLookupTookTime, this.dnsLookupTookTime);
        this.connectTookTime = Math.max(lVar.connectTookTime, this.connectTookTime);
        this.secureConnectTookTime = Math.max(lVar.secureConnectTookTime, this.secureConnectTookTime);
        this.writeRequestHeaderTookTime += lVar.writeRequestHeaderTookTime;
        this.writeRequestBodyTookTime += lVar.writeRequestBodyTookTime;
        this.readResponseHeaderTookTime += lVar.readResponseHeaderTookTime;
        this.readResponseBodyTookTime += lVar.readResponseBodyTookTime;
        this.requestBodyByteCount += lVar.requestBodyByteCount;
        this.responseBodyByteCount += lVar.responseBodyByteCount;
        this.fullTaskTookTime += lVar.fullTaskTookTime;
        this.httpTaskTookTime += lVar.httpTaskTookTime;
        this.calculateMD5STookTime += lVar.calculateMD5STookTime;
        this.signRequestTookTime += lVar.signRequestTookTime;
        if (lVar.getRemoteAddress() != null) {
            this.remoteAddress = lVar.getRemoteAddress();
        }
        if (lVar.connectAddress != null) {
            this.connectAddress = lVar.getConnectAddress();
        }
        this.retryCount += lVar.retryCount;
        if (!this.isClockSkewedRetry) {
            this.isClockSkewedRetry = lVar.isClockSkewedRetry;
        }
        return this;
    }

    public void onCalculateMD5End() {
        this.calculateMD5STookTime = (System.nanoTime() - this.calculateMD5StartTime) + this.calculateMD5STookTime;
    }

    public void onCalculateMD5Start() {
        this.calculateMD5StartTime = System.nanoTime();
    }

    public void onDataReady() {
    }

    public void onHttpTaskEnd() {
        this.httpTaskTookTime = System.nanoTime() - this.httpTaskStartTime;
    }

    public void onHttpTaskStart() {
        this.httpTaskStartTime = System.nanoTime();
    }

    public void onSignRequestEnd() {
        this.signRequestTookTime = (System.nanoTime() - this.signRequestStartTime) + this.signRequestTookTime;
    }

    public void onSignRequestStart() {
        this.signRequestStartTime = System.nanoTime();
    }

    public void onTaskEnd() {
        this.fullTaskTookTime = System.nanoTime() - this.fullTaskStartTime;
        onDataReady();
    }

    public void onTaskStart() {
        this.fullTaskStartTime = System.nanoTime();
    }

    public double readResponseBodyTookTime() {
        return this.readResponseBodyTookTime / 1.0E9d;
    }

    public double readResponseHeaderTookTime() {
        return this.readResponseHeaderTookTime / 1.0E9d;
    }

    public void recordConnectAddress(InetAddress inetAddress) {
        if (inetAddress != null) {
            this.domainName = inetAddress.getHostName();
            this.connectAddress = inetAddress;
        }
    }

    public long requestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public long responseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public double secureConnectTookTime() {
        return this.secureConnectTookTime / 1.0E9d;
    }

    public void setClockSkewedRetry(boolean z10) {
        this.isClockSkewedRetry = z10;
    }

    public void setDomainName(@Nullable String str) {
        this.domainName = str;
    }

    public void setRetryCount(int i10) {
        this.retryCount = i10;
    }

    public double signRequestTookTime() {
        return this.signRequestTookTime / 1.0E9d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Http Metrics: \ndomain : ");
        sb2.append(this.domainName);
        sb2.append("\nretryCount : ");
        sb2.append(this.retryCount);
        sb2.append("\nisClockSkewedRetry : ");
        sb2.append(this.isClockSkewedRetry);
        sb2.append("\ndns : ");
        InetAddress inetAddress = this.connectAddress;
        sb2.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb2.append("\nfullTaskTookTime : ");
        sb2.append(fullTaskTookTime());
        sb2.append("\ncalculateMD5STookTime : ");
        sb2.append(calculateMD5STookTime());
        sb2.append("\nsignRequestTookTime : ");
        sb2.append(signRequestTookTime());
        sb2.append("\ndnsStartTimestamp : ");
        sb2.append(this.dnsStartTimestamp);
        sb2.append("\ndnsLookupTookTime : ");
        sb2.append(dnsLookupTookTime());
        sb2.append("\nconnectStartTimestamp : ");
        sb2.append(this.connectStartTimestamp);
        sb2.append("\nconnectTookTime : ");
        sb2.append(connectTookTime());
        sb2.append("\nsecureConnectStartTimestamp : ");
        sb2.append(this.secureConnectStartTimestamp);
        sb2.append("\nsecureConnectTookTime : ");
        sb2.append(secureConnectTookTime());
        sb2.append("\nwriteRequestHeaderStartTimestamp : ");
        sb2.append(this.writeRequestHeaderStartTimestamp);
        sb2.append("\nwriteRequestHeaderTookTime : ");
        sb2.append(writeRequestHeaderTookTime());
        sb2.append("\nwriteRequestBodyStartTimestamp : ");
        sb2.append(this.writeRequestBodyStartTimestamp);
        sb2.append("\nwriteRequestBodyTookTime : ");
        sb2.append(writeRequestBodyTookTime());
        sb2.append("\nreadResponseHeaderStartTimestamp : ");
        sb2.append(this.readResponseHeaderStartTimestamp);
        sb2.append("\nreadResponseHeaderTookTime : ");
        sb2.append(readResponseHeaderTookTime());
        sb2.append("\nreadResponseBodyStartTimestamp : ");
        sb2.append(this.readResponseBodyStartTimestamp);
        sb2.append("readResponseBodyTookTime : ");
        sb2.append(readResponseBodyTookTime());
        return sb2.toString();
    }

    public double writeRequestBodyTookTime() {
        return this.writeRequestBodyTookTime / 1.0E9d;
    }

    public double writeRequestHeaderTookTime() {
        return this.writeRequestHeaderTookTime / 1.0E9d;
    }
}
