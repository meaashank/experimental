package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2381d {
    @e.S(expression = "activityManager.isLowRamDevice()")
    @Deprecated
    public static boolean a(@NonNull ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
