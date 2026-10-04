package com.bytedance.sdk.component.FA;

import android.os.SystemClock;
import androidx.appcompat.widget.e0;
import androidx.constraintlayout.core.parser.b;
import com.bytedance.sdk.component.utils.lp;

/* JADX INFO: loaded from: classes2.dex */
class NOt implements Comparable, Runnable {
    private ZRu NOt;
    private FA ZRu;
    private long mZ;
    private Thread uR = null;

    public NOt(FA fa2, ZRu zRu) {
        this.mZ = 0L;
        this.ZRu = fa2;
        this.NOt = zRu;
        this.mZ = SystemClock.uptimeMillis();
    }

    private void ZRu(String str, String str2, long j10) {
        StringBuilder sbA = b.a("pool is ", str, "  name is ", str2, "is timeout,cost ");
        sbA.append(j10);
        lp.ZRu("DelegateRunnable", sbA.toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof NOt) {
            return this.ZRu.compareTo(((NOt) obj).ZRu());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        FA fa2;
        return (obj instanceof NOt) && (fa2 = this.ZRu) != null && fa2.equals(((NOt) obj).ZRu());
    }

    public int hashCode() {
        return this.ZRu.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.uR = Thread.currentThread();
        FA fa2 = this.ZRu;
        if (fa2 != null) {
            fa2.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.NOt != null) {
            uR.ZRu();
        }
        if (lp.ZRu()) {
            ZRu zRu = this.NOt;
            if (zRu != null) {
                zRu.ZRu();
            }
            FA fa3 = this.ZRu;
            if (fa3 != null) {
                fa3.getName();
            }
            String strZRu = this.NOt.ZRu();
            strZRu.getClass();
            byte b10 = -1;
            switch (strZRu.hashCode()) {
                case 3107:
                    if (strZRu.equals("ad")) {
                        b10 = 0;
                    }
                    break;
                case 3366:
                    if (strZRu.equals("io")) {
                        b10 = 1;
                    }
                    break;
                case 107332:
                    if (strZRu.equals("log")) {
                        b10 = 2;
                    }
                    break;
                case 3237136:
                    if (strZRu.equals("init")) {
                        b10 = 3;
                    }
                    break;
                case 212371911:
                    if (strZRu.equals("computation")) {
                        b10 = 4;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        ZRu zRu2 = this.NOt;
                        String strZRu2 = zRu2 != null ? zRu2.ZRu() : "null";
                        FA fa4 = this.ZRu;
                        ZRu(strZRu2, fa4 != null ? fa4.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        ZRu zRu3 = this.NOt;
                        String strZRu3 = zRu3 != null ? zRu3.ZRu() : "null";
                        FA fa5 = this.ZRu;
                        ZRu(strZRu3, fa5 != null ? fa5.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > e0.f86341n) {
                        ZRu zRu4 = this.NOt;
                        String strZRu4 = zRu4 != null ? zRu4.ZRu() : "null";
                        FA fa6 = this.ZRu;
                        ZRu(strZRu4, fa6 != null ? fa6.getName() : "null", jUptimeMillis2);
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        ZRu zRu5 = this.NOt;
                        String strZRu5 = zRu5 != null ? zRu5.ZRu() : "null";
                        FA fa7 = this.ZRu;
                        ZRu(strZRu5, fa7 != null ? fa7.getName() : "null", jUptimeMillis2);
                    }
                    break;
            }
        }
    }

    public FA ZRu() {
        return this.ZRu;
    }
}
