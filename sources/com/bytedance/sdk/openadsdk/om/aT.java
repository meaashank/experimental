package com.bytedance.sdk.openadsdk.om;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    public static WeakReference<ZRu> ZRu;
    protected static final float[] NOt = new float[3];
    protected static final float[] mZ = new float[3];
    protected static final float[] uR = new float[9];
    protected static final float[] TFq = new float[3];

    public static void NOt(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ZRu> weakReference = ZRu;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            Mm.ZRu("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void ZRu(Context context, SensorEventListener sensorEventListener) {
    }

    public static void mZ(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ZRu> weakReference = ZRu;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            Mm.ZRu("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void uR(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ZRu> weakReference = ZRu;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            Mm.ZRu("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void ZRu(ZRu zRu) {
        ZRu = new WeakReference<>(zRu);
    }

    public static void ZRu(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<ZRu> weakReference = ZRu;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            Mm.ZRu("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void ZRu(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
