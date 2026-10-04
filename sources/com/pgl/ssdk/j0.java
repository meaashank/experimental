package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j0 f161868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SensorManager f161869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f161870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f161871d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f161872e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f161873f = new ArrayList();

    private j0(Context context) {
        this.f161869b = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.f161869b = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    public static j0 a(Context context) {
        if (f161868a == null) {
            synchronized (j0.class) {
                try {
                    if (f161868a == null) {
                        f161868a = new j0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f161868a;
    }

    private synchronized void d() {
        try {
            SensorManager sensorManager = this.f161869b;
            if (sensorManager != null) {
                if (this.f161870c == 0) {
                    if (!this.f161869b.registerListener(this, sensorManager.getDefaultSensor(1), 3)) {
                        return;
                    }
                }
                this.f161870c++;
            }
        } catch (Exception unused) {
        }
    }

    private synchronized void e() {
        try {
            SensorManager sensorManager = this.f161869b;
            if (sensorManager != null) {
                int i10 = this.f161870c - 1;
                this.f161870c = i10;
                if (i10 == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    public synchronized String b() {
        String strSubstring = "";
        int size = this.f161873f.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.f161873f.get(0);
        }
        try {
            List<String> list = this.f161873f;
            int i10 = size - 10;
            if (i10 <= 0) {
                i10 = 0;
            }
            List<String> listSubList = list.subList(i10, size);
            for (int i11 = 0; i11 < listSubList.size(); i11++) {
                strSubstring = strSubstring + listSubList.get(i11) + "|";
            }
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        } catch (Throwable unused) {
        }
        return strSubstring;
    }

    public String c() {
        String str;
        try {
            try {
                d();
                synchronized (this) {
                    int i10 = 0;
                    while (this.f161871d == 0 && i10 < 10) {
                        try {
                            i10++;
                            wait(100L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
                str = decimalFormat.format(this.f161872e[0]) + "," + decimalFormat.format(this.f161872e[1]) + "," + decimalFormat.format(this.f161872e[2]);
            } catch (Throwable unused) {
                DecimalFormat decimalFormat2 = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
                str = decimalFormat2.format(this.f161872e[0]) + "," + decimalFormat2.format(this.f161872e[1]) + "," + decimalFormat2.format(this.f161872e[2]);
            }
        } catch (Throwable unused2) {
            str = null;
        }
        e();
        this.f161871d = 0;
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f161872e = sensorEvent.values;
        this.f161871d = 1;
    }

    public void a() {
        String strC = c();
        if (strC == null) {
            return;
        }
        this.f161873f.add(strC);
        try {
            int size = this.f161873f.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f161873f.subList(size - 10, size));
                this.f161873f.clear();
                this.f161873f = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
