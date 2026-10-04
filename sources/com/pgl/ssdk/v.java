package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f161929a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f161930b = -1;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            v.f161930b = v.b(x.b());
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", v.f161930b).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i10 = f161930b;
        if (i10 != -1) {
            return i10;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f161930b = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f161930b = -1;
            }
        } else {
            f161930b = -2;
        }
        return f161930b;
    }

    public static int c(Context context) {
        TelephonyManager telephonyManager;
        if (f161929a == -1 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            f161929a = telephonyManager.getSimState();
        }
        return f161929a;
    }

    public static int a() {
        int i10;
        int i11 = f161930b;
        if (i11 != -1) {
            return i11;
        }
        SharedPreferences sharedPreferencesA = u0.a(x.b());
        if (sharedPreferencesA == null || (i10 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            o0.b(new a());
            return -1;
        }
        f161930b = i10;
        return i10;
    }
}
