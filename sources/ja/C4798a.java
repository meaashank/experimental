package ja;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.prism.hider.utils.HiderPreferenceUtils;
import r6.k;

/* JADX INFO: renamed from: ja.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4798a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f214231e = "asdf-".concat(C4798a.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C4798a f214232f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f214233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SensorManager f214234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Sensor f214235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SensorEventListener f214236d;

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    public static class C0812a implements SensorEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f214237a;

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            Sensor sensor = sensorEvent.sensor;
            if (sensor != null && sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float f10 = fArr[0];
                float f11 = fArr[1];
                int i10 = (int) fArr[2];
                if (i10 < -5 && !this.f214237a) {
                    C4798a.c().d();
                    this.f214237a = true;
                } else if (i10 >= 0) {
                    this.f214237a = false;
                }
            }
        }

        public C0812a() {
            this.f214237a = false;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    }

    public static C4798a c() {
        if (f214232f == null) {
            synchronized (C4798a.class) {
                try {
                    if (f214232f == null) {
                        f214232f = new C4798a();
                    }
                } finally {
                }
            }
        }
        return f214232f;
    }

    public void b() {
        try {
            this.f214234b.unregisterListener(this.f214236d);
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        if (((Boolean) ((k) HiderPreferenceUtils.f168332B.a(this.f214233a)).o()).booleanValue()) {
            com.prism.hider.variant.b.b().g(this.f214233a);
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            this.f214233a.startActivity(intent);
        }
    }

    public void e(Context context) {
        if (this.f214235c != null) {
            return;
        }
        this.f214233a = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f214234b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f214235c = defaultSensor;
        C0812a c0812a = new C0812a();
        this.f214236d = c0812a;
        this.f214234b.registerListener(c0812a, defaultSensor, 3);
    }
}
