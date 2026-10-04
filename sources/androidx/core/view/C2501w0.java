package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.core.view.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2501w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f111964f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f111965g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f111966h = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f111967a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f111968b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f111969c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f111970d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111971e = 0;

    public static float g(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void a(@NonNull MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f111970d != 0 && eventTime - this.f111968b[this.f111971e] > 40) {
            b();
        }
        int i10 = (this.f111971e + 1) % 20;
        this.f111971e = i10;
        int i11 = this.f111970d;
        if (i11 != 20) {
            this.f111970d = i11 + 1;
        }
        this.f111967a[i10] = motionEvent.getAxisValue(26);
        this.f111968b[this.f111971e] = eventTime;
    }

    public final void b() {
        this.f111970d = 0;
        this.f111969c = 0.0f;
    }

    public void c(int i10) {
        d(i10, Float.MAX_VALUE);
    }

    public void d(int i10, float f10) {
        float f11 = f() * i10;
        this.f111969c = f11;
        if (f11 < (-Math.abs(f10))) {
            this.f111969c = -Math.abs(f10);
        } else if (this.f111969c > Math.abs(f10)) {
            this.f111969c = Math.abs(f10);
        }
    }

    public float e(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f111969c;
    }

    public final float f() {
        long[] jArr;
        long j10;
        int i10 = this.f111970d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f111971e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f111968b[i11];
        while (true) {
            jArr = this.f111968b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f111970d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f111970d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f111967a[i14] / (r2 - j10);
        }
        float f10 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f111970d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f111968b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float fG = g(f10);
                float f11 = this.f111967a[i18] / (this.f111968b[i18] - j12);
                float fAbs = (Math.abs(f11) * (f11 - fG)) + f10;
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
                f10 = fAbs;
            }
        }
        return g(f10);
    }
}
