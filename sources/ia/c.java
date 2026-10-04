package Ia;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes7.dex */
@TargetApi(8)
public class c extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScaleGestureDetector f52985k;

    public c(Context context) {
        super(context);
        this.f52985k = new ScaleGestureDetector(context, new a());
    }

    @Override // Ia.b, Ia.a, Ia.d
    public boolean b(MotionEvent motionEvent) {
        try {
            this.f52985k.onTouchEvent(motionEvent);
            super.b(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    @Override // Ia.a, Ia.d
    public boolean d() {
        return this.f52985k.isInProgress();
    }

    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            c.this.f52975a.A(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
