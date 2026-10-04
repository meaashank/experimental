package com.unity3d.services.core.request.metrics;

import com.bytedance.sdk.openadsdk.activity.b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - _uploadStartTime);
    }

    public static Metric hbSignalsFetchFailure(boolean z10, String str) {
        return new Metric(String.format(HB_SIGNALS_FETCH_FAILURE, z10 ? ASYNC_PREFIX : SYNC_PREFIX), Long.valueOf(getTotalFetchTime()), b.a("reason", str));
    }

    public static Metric hbSignalsFetchStart(boolean z10) {
        _fetchStartTime = System.nanoTime();
        return new Metric(String.format(HB_SIGNALS_FETCH_START, z10 ? ASYNC_PREFIX : SYNC_PREFIX), null, null);
    }

    public static Metric hbSignalsFetchSuccess(boolean z10) {
        return new Metric(String.format(HB_SIGNALS_FETCH_SUCCESS, z10 ? ASYNC_PREFIX : SYNC_PREFIX), Long.valueOf(getTotalFetchTime()), null);
    }

    public static Metric hbSignalsUploadFailure(boolean z10, String str) {
        return new Metric(String.format(HB_SIGNALS_UPLOAD_FAILURE, z10 ? ASYNC_PREFIX : SYNC_PREFIX), Long.valueOf(getTotalUploadTime()), b.a("reason", str));
    }

    public static Metric hbSignalsUploadStart(boolean z10) {
        _uploadStartTime = System.nanoTime();
        return new Metric(String.format(HB_SIGNALS_UPLOAD_START, z10 ? ASYNC_PREFIX : SYNC_PREFIX), null, null);
    }

    public static Metric hbSignalsUploadSuccess(boolean z10) {
        return new Metric(String.format(HB_SIGNALS_UPLOAD_SUCCESS, z10 ? ASYNC_PREFIX : SYNC_PREFIX), Long.valueOf(getTotalUploadTime()), null);
    }
}
