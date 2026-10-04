package com.bytedance.sdk.openadsdk.om;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class TFq {
    public static int FA = 2;
    public static int Ht = 0;
    public static int Mm = 1;
    protected static String NOt = null;
    protected static long TFq = 15360;
    public static int Vor = 4;
    public static int ZH = 16;
    protected static String ZRu = "images";
    public static int aT = 8;
    public static int lp = 32;
    protected static int mZ = 1;
    protected static int uR = 30;

    public static boolean NOt(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean ZRu(Context context, String str) {
        return false;
    }

    public static float NOt(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap ZRu(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean ZRu(Context context, int i10) {
        boolean zZRu;
        boolean zZRu2;
        if (Ht == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zZRu = ZRu(context, "android.permission.READ_MEDIA_IMAGES");
                zZRu2 = true;
            } else {
                zZRu = ZRu(context, "android.permission.READ_EXTERNAL_STORAGE");
                zZRu2 = ZRu(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zZRu3 = ZRu(context, "android.permission.CAMERA");
            boolean zZRu4 = ZRu(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zZRu && zZRu2) {
                Ht |= Mm;
            }
            if (zZRu3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                Ht |= FA;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                Ht |= Vor;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                Ht |= aT;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                Ht |= ZH;
            }
            if (zZRu4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                Ht |= lp;
            }
        }
        return (Ht & i10) != 0;
    }

    public static boolean ZRu(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }
}
