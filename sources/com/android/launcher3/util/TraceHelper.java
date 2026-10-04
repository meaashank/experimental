package com.android.launcher3.util;

import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.Log;
import android.util.MutableLong;

/* JADX INFO: loaded from: classes2.dex */
public class TraceHelper {
    private static final boolean ENABLED = true;
    private static final boolean SYSTEM_TRACE = false;
    private static final ArrayMap<String, MutableLong> sUpTimes = new ArrayMap<>();

    public static void beginSection(String str) {
        ArrayMap<String, MutableLong> arrayMap = sUpTimes;
        MutableLong mutableLong = arrayMap.get(str);
        if (mutableLong == null) {
            mutableLong = new MutableLong(Log.isLoggable(str, 2) ? 0L : -1L);
            arrayMap.put(str, mutableLong);
        }
        if (mutableLong.value >= 0) {
            mutableLong.value = SystemClock.uptimeMillis();
        }
        Log.d(str, "Begin");
    }

    public static void endSection(String str) {
        endSection(str, "End");
    }

    public static void partitionSection(String str, String str2) {
        MutableLong mutableLong = sUpTimes.get(str);
        if (mutableLong == null || mutableLong.value < 0) {
            Log.d(str, str2);
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sbA = android.support.v4.media.f.a(str2, " : ");
        sbA.append(jUptimeMillis - mutableLong.value);
        Log.d(str, sbA.toString());
        mutableLong.value = jUptimeMillis;
    }

    public static void endSection(String str, String str2) {
        MutableLong mutableLong = sUpTimes.get(str);
        if (mutableLong == null || mutableLong.value < 0) {
            Log.d(str, str2);
            return;
        }
        StringBuilder sbA = android.support.v4.media.f.a(str2, " : ");
        sbA.append(SystemClock.uptimeMillis() - mutableLong.value);
        Log.d(str, sbA.toString());
    }
}
