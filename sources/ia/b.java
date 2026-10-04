package Ia;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(5)
public class b extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f52982j = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f52984i;

    public b(Context context) {
        super(context);
        this.f52983h = -1;
        this.f52984i = 0;
    }

    @Override // Ia.a, Ia.d
    public boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f52983h = motionEvent.getPointerId(0);
        } else if (action == 1 || action == 3) {
            this.f52983h = -1;
        } else if (action == 6) {
            int iA = Ha.a.a(motionEvent.getAction());
            if (motionEvent.getPointerId(iA) == this.f52983h) {
                int i10 = iA == 0 ? 1 : 0;
                this.f52983h = motionEvent.getPointerId(i10);
                this.f52976b = motionEvent.getX(i10);
                this.f52977c = motionEvent.getY(i10);
            }
        }
        int i11 = this.f52983h;
        this.f52984i = motionEvent.findPointerIndex(i11 != -1 ? i11 : 0);
        try {
            super.b(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    @Override // Ia.a
    public float e(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f52984i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // Ia.a
    public float f(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f52984i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
