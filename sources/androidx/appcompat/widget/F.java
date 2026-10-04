package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class F implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f85959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f85962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f85963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f85964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f85967i = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = F.this.f85962d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            F.this.e();
        }
    }

    public F(View view) {
        this.f85962d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f85959a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f85960b = tapTimeout;
        this.f85961c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    public final void a() {
        Runnable runnable = this.f85964f;
        if (runnable != null) {
            this.f85962d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f85963e;
        if (runnable2 != null) {
            this.f85962d.removeCallbacks(runnable2);
        }
    }

    public abstract androidx.appcompat.view.menu.r b();

    public boolean c() {
        androidx.appcompat.view.menu.r rVarB = b();
        if (rVarB == null || rVarB.a()) {
            return true;
        }
        rVarB.show();
        return true;
    }

    public boolean d() {
        androidx.appcompat.view.menu.r rVarB = b();
        if (rVarB == null || !rVarB.a()) {
            return true;
        }
        rVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f85962d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f85965g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        C c10;
        View view = this.f85962d;
        androidx.appcompat.view.menu.r rVarB = b();
        if (rVarB != null && rVarB.a() && (c10 = (C) rVarB.i()) != null && c10.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(c10, motionEventObtainNoHistory);
            boolean zF = c10.f(motionEventObtainNoHistory, this.f85966h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zF && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f85962d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f85966h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f85959a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f85966h = r6
            java.lang.Runnable r6 = r5.f85963e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.F$a r6 = new androidx.appcompat.widget.F$a
            r6.<init>()
            r5.f85963e = r6
        L52:
            java.lang.Runnable r6 = r5.f85963e
            int r1 = r5.f85960b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f85964f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.F$b r6 = new androidx.appcompat.widget.F$b
            r6.<init>()
            r5.f85964f = r6
        L65:
            java.lang.Runnable r6 = r5.f85964f
            int r1 = r5.f85961c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.F.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f85967i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f85967i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f85965g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f85962d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f85965g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f85965g = false;
        this.f85966h = -1;
        Runnable runnable = this.f85963e;
        if (runnable != null) {
            this.f85962d.removeCallbacks(runnable);
        }
    }
}
