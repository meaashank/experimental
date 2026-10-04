package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2496u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2498v f111946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f111947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f111948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public VelocityTracker f111949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f111950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f111951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f111952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f111953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f111954j;

    /* JADX INFO: renamed from: androidx.core.view.u$a */
    @e.f0
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: androidx.core.view.u$b */
    @e.f0
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C2496u(@NonNull Context context, @NonNull InterfaceC2498v interfaceC2498v) {
        this(context, interfaceC2498v, new C2490s(), new C2493t());
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = D0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = D0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        C2499v0.a(velocityTracker, motionEvent);
        C2499v0.d(velocityTracker, 1000, Float.MAX_VALUE);
        return C2499v0.e(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f111952h == source && this.f111953i == deviceId && this.f111951g == i10) {
            return false;
        }
        this.f111947c.a(this.f111945a, this.f111954j, motionEvent, i10);
        this.f111952h = source;
        this.f111953i = deviceId;
        this.f111951g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f111949e == null) {
            this.f111949e = VelocityTracker.obtain();
        }
        return this.f111948d.a(this.f111949e, motionEvent, i10);
    }

    public void g(@NonNull MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f111954j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f111949e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f111949e = null;
                return;
            }
            return;
        }
        float fA = this.f111946b.a() * e(motionEvent, i10);
        float fSignum = Math.signum(fA);
        if (zD || (fSignum != Math.signum(this.f111950f) && fSignum != 0.0f)) {
            this.f111946b.c();
        }
        float fAbs = Math.abs(fA);
        int[] iArr = this.f111954j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r5, Math.min(fA, iArr[1]));
        this.f111950f = this.f111946b.b(fMax) ? fMax : 0.0f;
    }

    @e.f0
    public C2496u(Context context, InterfaceC2498v interfaceC2498v, b bVar, a aVar) {
        this.f111951g = -1;
        this.f111952h = -1;
        this.f111953i = -1;
        this.f111954j = new int[]{Integer.MAX_VALUE, 0};
        this.f111945a = context;
        this.f111946b = interfaceC2498v;
        this.f111947c = bVar;
        this.f111948d = aVar;
    }
}
