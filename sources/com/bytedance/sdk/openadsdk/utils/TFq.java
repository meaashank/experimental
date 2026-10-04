package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public class TFq {
    static float NOt = 0.0f;
    static int ZRu = -1;
    private static long mZ;

    public static class ZRu {
        public final float NOt;
        public final int ZRu;

        public ZRu(int i10, float f10) {
            this.ZRu = i10;
            this.NOt = f10;
        }
    }

    private static void ZRu(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            ZRu = 1;
        } else {
            ZRu = 0;
        }
        NOt = (intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static ZRu ZRu() {
        if (mZ == 0 || SystemClock.elapsedRealtime() - mZ > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.WMI.ZRu().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                ZRu(intentRegisterReceiver);
                mZ = SystemClock.elapsedRealtime();
            }
        }
        return new ZRu(ZRu, NOt);
    }
}
