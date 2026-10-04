package com.android.launcher3.util;

import android.os.Looper;
import com.android.launcher3.LauncherModel;

/* JADX INFO: loaded from: classes2.dex */
public class Preconditions {
    public static void assertNonUiThread() {
        if (isSameLooper(Looper.getMainLooper())) {
            throw new IllegalStateException();
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void assertUIThread() {
        if (!isSameLooper(Looper.getMainLooper())) {
            throw new IllegalStateException();
        }
    }

    public static void assertWorkerThread() {
        if (!isSameLooper(LauncherModel.getWorkerLooper())) {
            throw new IllegalStateException();
        }
    }

    private static boolean isSameLooper(Looper looper) {
        return Looper.myLooper() == looper;
    }
}
