package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import e.D;
import e.P;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f112174A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f112175B = 2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f112176C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f112177D = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f112178E = 4;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f112179F = 8;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f112180G = 15;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f112181H = 1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f112182I = 2;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f112183J = 3;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f112184K = 20;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f112185L = 256;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f112186M = 600;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Interpolator f112187N = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f112188x = "ViewDragHelper";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f112189y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f112190z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112192b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f112194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f112195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f112196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f112197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f112198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f112199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f112200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f112201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f112202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f112203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f112204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f112205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f112206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f112207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OverScroller f112208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f112209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f112210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f112211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f112212v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112193c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f112213w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    public static abstract class c {
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int i10, int i11) {
            return 0;
        }

        public int getOrderedChildIndex(int i10) {
            return i10;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i10, int i11) {
        }

        public boolean onEdgeLock(int i10) {
            return false;
        }

        public void onEdgeTouched(int i10, int i11) {
        }

        public void onViewCaptured(@NonNull View view, int i10) {
        }

        public void onViewDragStateChanged(int i10) {
        }

        public void onViewPositionChanged(@NonNull View view, int i10, int i11, @P int i12, @P int i13) {
        }

        public void onViewReleased(@NonNull View view, float f10, float f11) {
        }

        public abstract boolean tryCaptureView(@NonNull View view, int i10);
    }

    public d(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f112212v = viewGroup;
        this.f112209s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f112206p = i10;
        this.f112205o = i10;
        this.f112192b = viewConfiguration.getScaledTouchSlop();
        this.f112203m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f112204n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f112208r = new OverScroller(context, f112187N);
    }

    public static d p(@NonNull ViewGroup viewGroup, float f10, @NonNull c cVar) {
        d dVarQ = q(viewGroup, cVar);
        dVarQ.f112192b = (int) ((1.0f / f10) * dVarQ.f112192b);
        return dVarQ;
    }

    public static d q(@NonNull ViewGroup viewGroup, @NonNull c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    @P
    public int A() {
        return this.f112206p;
    }

    @P
    public int B() {
        return this.f112205o;
    }

    public final int C(int i10, int i11) {
        int i12 = i10 < this.f112212v.getLeft() + this.f112205o ? 1 : 0;
        if (i11 < this.f112212v.getTop() + this.f112205o) {
            i12 |= 4;
        }
        if (i10 > this.f112212v.getRight() - this.f112205o) {
            i12 |= 2;
        }
        return i11 > this.f112212v.getBottom() - this.f112205o ? i12 | 8 : i12;
    }

    public float D() {
        return this.f112204n;
    }

    @P
    public int E() {
        return this.f112192b;
    }

    public int F() {
        return this.f112191a;
    }

    public boolean G(int i10, int i11) {
        return L(this.f112210t, i10, i11);
    }

    public boolean H(int i10) {
        int length = this.f112198h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (I(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i10, int i11) {
        return J(i11) && (i10 & this.f112198h[i11]) != 0;
    }

    public boolean J(int i10) {
        return ((1 << i10) & this.f112201k) != 0;
    }

    public final boolean K(int i10) {
        if (J(i10)) {
            return true;
        }
        Log.e(f112188x, "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean L(@Nullable View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void M(@NonNull MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f112202l == null) {
            this.f112202l = VelocityTracker.obtain();
        }
        this.f112202l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewV = v((int) x10, (int) y10);
            P(x10, y10, pointerId);
            Y(viewV, pointerId);
            int i12 = this.f112198h[pointerId];
            int i13 = this.f112207q;
            if ((i12 & i13) != 0) {
                this.f112209s.onEdgeTouched(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f112191a == 1) {
                N();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f112191a == 1) {
                if (K(this.f112193c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f112193c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f112196f;
                    int i14 = this.f112193c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f112197g[i14]);
                    t(this.f112210t.getLeft() + i15, this.f112210t.getTop() + i16, i15, i16);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (K(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f112194d[pointerId2];
                    float f11 = y12 - this.f112195e[pointerId2];
                    O(f10, f11, pointerId2);
                    if (this.f112191a != 1) {
                        View viewV2 = v((int) x12, (int) y12);
                        if (h(viewV2, f10, f11) && Y(viewV2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            Q(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f112191a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            P(x13, y13, pointerId3);
            if (this.f112191a != 0) {
                if (G((int) x13, (int) y13)) {
                    Y(this.f112210t, pointerId3);
                    return;
                }
                return;
            } else {
                Y(v((int) x13, (int) y13), pointerId3);
                int i17 = this.f112198h[pointerId3];
                int i18 = this.f112207q;
                if ((i17 & i18) != 0) {
                    this.f112209s.onEdgeTouched(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f112191a == 1 && pointerId4 == this.f112193c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f112193c) {
                    View viewV3 = v((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f112210t;
                    if (viewV3 == view && Y(view, pointerId5)) {
                        i10 = this.f112193c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                N();
            }
        }
        l(pointerId4);
    }

    public final void N() {
        this.f112202l.computeCurrentVelocity(1000, this.f112203m);
        r(i(this.f112202l.getXVelocity(this.f112193c), this.f112204n, this.f112203m), i(this.f112202l.getYVelocity(this.f112193c), this.f112204n, this.f112203m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void O(float f10, float f11, int i10) {
        boolean zE = e(f10, f11, i10, 1);
        ?? r02 = zE;
        if (e(f11, f10, i10, 4)) {
            r02 = (zE ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (e(f10, f11, i10, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (e(f11, f10, i10, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f112199i;
            iArr[i10] = iArr[i10] | r04;
            this.f112209s.onEdgeDragStarted(r04, i10);
        }
    }

    public final void P(float f10, float f11, int i10) {
        u(i10);
        float[] fArr = this.f112194d;
        this.f112196f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f112195e;
        this.f112197g[i10] = f11;
        fArr2[i10] = f11;
        this.f112198h[i10] = C((int) f10, (int) f11);
        this.f112201k |= 1 << i10;
    }

    public final void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (K(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f112196f[pointerId] = x10;
                this.f112197g[pointerId] = y10;
            }
        }
    }

    public void R(int i10) {
        this.f112212v.removeCallbacks(this.f112213w);
        if (this.f112191a != i10) {
            this.f112191a = i10;
            this.f112209s.onViewDragStateChanged(i10);
            if (this.f112191a == 0) {
                this.f112210t = null;
            }
        }
    }

    public void S(@D(from = 0) @P int i10) {
        this.f112205o = i10;
    }

    public void T(int i10) {
        this.f112207q = i10;
    }

    public void U(float f10) {
        this.f112204n = f10;
    }

    public boolean V(int i10, int i11) {
        if (this.f112211u) {
            return x(i10, i11, (int) this.f112202l.getXVelocity(this.f112193c), (int) this.f112202l.getYVelocity(this.f112193c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean W(@androidx.annotation.NonNull android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.W(android.view.MotionEvent):boolean");
    }

    public boolean X(@NonNull View view, int i10, int i11) {
        this.f112210t = view;
        this.f112193c = -1;
        boolean zX = x(i10, i11, 0, 0);
        if (!zX && this.f112191a == 0 && this.f112210t != null) {
            this.f112210t = null;
        }
        return zX;
    }

    public boolean Y(View view, int i10) {
        if (view == this.f112210t && this.f112193c == i10) {
            return true;
        }
        if (view == null || !this.f112209s.tryCaptureView(view, i10)) {
            return false;
        }
        this.f112193c = i10;
        d(view, i10);
        return true;
    }

    public void a() {
        c();
        if (this.f112191a == 2) {
            int currX = this.f112208r.getCurrX();
            int currY = this.f112208r.getCurrY();
            this.f112208r.abortAnimation();
            int currX2 = this.f112208r.getCurrX();
            int currY2 = this.f112208r.getCurrY();
            this.f112209s.onViewPositionChanged(this.f112210t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    public boolean b(@NonNull View view, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && b(childAt, true, i10, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10) {
            return view.canScrollHorizontally(-i10) || view.canScrollVertically(-i11);
        }
        return false;
    }

    public void c() {
        this.f112193c = -1;
        k();
        VelocityTracker velocityTracker = this.f112202l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f112202l = null;
        }
    }

    public void d(@NonNull View view, int i10) {
        if (view.getParent() != this.f112212v) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f112212v + ")");
        }
        this.f112210t = view;
        this.f112193c = i10;
        this.f112209s.onViewCaptured(view, i10);
        R(1);
    }

    public final boolean e(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f112198h[i10] & i11) == i11 && (this.f112207q & i11) != 0 && (this.f112200j[i10] & i11) != i11 && (this.f112199i[i10] & i11) != i11) {
            int i12 = this.f112192b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f112209s.onEdgeLock(i11)) {
                    int[] iArr = this.f112200j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f112199i[i10] & i11) == 0 && fAbs > this.f112192b) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(int i10) {
        int length = this.f112194d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (g(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.J(r8)
            r1 = 0
            if (r0 != 0) goto L8
            goto L55
        L8:
            r0 = r7 & 1
            r2 = 1
            if (r0 != r2) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            r3 = 2
            r7 = r7 & r3
            if (r7 != r3) goto L16
            r7 = r2
            goto L17
        L16:
            r7 = r1
        L17:
            float[] r3 = r6.f112196f
            r3 = r3[r8]
            float[] r4 = r6.f112194d
            r4 = r4[r8]
            float r3 = r3 - r4
            float[] r4 = r6.f112197g
            r4 = r4[r8]
            float[] r5 = r6.f112195e
            r8 = r5[r8]
            float r4 = r4 - r8
            if (r0 == 0) goto L39
            if (r7 == 0) goto L39
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r4 = r4 + r3
            int r7 = r6.f112192b
            int r7 = r7 * r7
            float r7 = (float) r7
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L55
            goto L54
        L39:
            if (r0 == 0) goto L47
            float r7 = java.lang.Math.abs(r3)
            int r8 = r6.f112192b
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L55
            goto L54
        L47:
            if (r7 == 0) goto L55
            float r7 = java.lang.Math.abs(r4)
            int r8 = r6.f112192b
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L55
        L54:
            return r2
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.g(int, int):boolean");
    }

    public final boolean h(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f112209s.getViewHorizontalDragRange(view) > 0;
        boolean z11 = this.f112209s.getViewVerticalDragRange(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f112192b) : z11 && Math.abs(f11) > ((float) this.f112192b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i10 = this.f112192b;
        return f12 > ((float) (i10 * i10));
    }

    public final float i(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        return fAbs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int j(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        return iAbs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void k() {
        float[] fArr = this.f112194d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f112195e, 0.0f);
        Arrays.fill(this.f112196f, 0.0f);
        Arrays.fill(this.f112197g, 0.0f);
        Arrays.fill(this.f112198h, 0);
        Arrays.fill(this.f112199i, 0);
        Arrays.fill(this.f112200j, 0);
        this.f112201k = 0;
    }

    public final void l(int i10) {
        if (this.f112194d == null || !J(i10)) {
            return;
        }
        this.f112194d[i10] = 0.0f;
        this.f112195e[i10] = 0.0f;
        this.f112196f[i10] = 0.0f;
        this.f112197g[i10] = 0.0f;
        this.f112198h[i10] = 0;
        this.f112199i[i10] = 0;
        this.f112200j[i10] = 0;
        this.f112201k = (~(1 << i10)) & this.f112201k;
    }

    public final int m(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f112212v.getWidth();
        float f10 = width / 2;
        float fS = (s(Math.min(1.0f, Math.abs(i10) / width)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fS / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final int n(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iJ = j(i12, (int) this.f112204n, (int) this.f112203m);
        int iJ2 = j(i13, (int) this.f112204n, (int) this.f112203m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iJ);
        int iAbs4 = Math.abs(iJ2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iJ != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iJ2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((m(i11, iJ2, this.f112209s.getViewVerticalDragRange(view)) * (f12 / f13)) + (m(i10, iJ, this.f112209s.getViewHorizontalDragRange(view)) * f14));
    }

    public boolean o(boolean z10) {
        if (this.f112191a == 2) {
            boolean zComputeScrollOffset = this.f112208r.computeScrollOffset();
            int currX = this.f112208r.getCurrX();
            int currY = this.f112208r.getCurrY();
            int left = currX - this.f112210t.getLeft();
            int top = currY - this.f112210t.getTop();
            if (left != 0) {
                C2507z0.h1(this.f112210t, left);
            }
            if (top != 0) {
                C2507z0.i1(this.f112210t, top);
            }
            if (left != 0 || top != 0) {
                this.f112209s.onViewPositionChanged(this.f112210t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f112208r.getFinalX() && currY == this.f112208r.getFinalY()) {
                this.f112208r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f112212v.post(this.f112213w);
                } else {
                    R(0);
                }
            }
        }
        return this.f112191a == 2;
    }

    public final void r(float f10, float f11) {
        this.f112211u = true;
        this.f112209s.onViewReleased(this.f112210t, f10, f11);
        this.f112211u = false;
        if (this.f112191a == 1) {
            R(0);
        }
    }

    public final float s(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void t(int i10, int i11, int i12, int i13) {
        int left = this.f112210t.getLeft();
        int top = this.f112210t.getTop();
        if (i12 != 0) {
            i10 = this.f112209s.clampViewPositionHorizontal(this.f112210t, i10, i12);
            C2507z0.h1(this.f112210t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f112209s.clampViewPositionVertical(this.f112210t, i11, i13);
            C2507z0.i1(this.f112210t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f112209s.onViewPositionChanged(this.f112210t, i14, i15, i14 - left, i15 - top);
    }

    public final void u(int i10) {
        float[] fArr = this.f112194d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f112195e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f112196f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f112197g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f112198h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f112199i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f112200j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f112194d = fArr2;
            this.f112195e = fArr3;
            this.f112196f = fArr4;
            this.f112197g = fArr5;
            this.f112198h = iArr;
            this.f112199i = iArr2;
            this.f112200j = iArr3;
        }
    }

    @Nullable
    public View v(int i10, int i11) {
        for (int childCount = this.f112212v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f112212v.getChildAt(this.f112209s.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i10, int i11, int i12, int i13) {
        if (!this.f112211u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f112208r.fling(this.f112210t.getLeft(), this.f112210t.getTop(), (int) this.f112202l.getXVelocity(this.f112193c), (int) this.f112202l.getYVelocity(this.f112193c), i10, i12, i11, i13);
        R(2);
    }

    public final boolean x(int i10, int i11, int i12, int i13) {
        int left = this.f112210t.getLeft();
        int top = this.f112210t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f112208r.abortAnimation();
            R(0);
            return false;
        }
        this.f112208r.startScroll(left, top, i14, i15, n(this.f112210t, i14, i15, i12, i13));
        R(2);
        return true;
    }

    public int y() {
        return this.f112193c;
    }

    @Nullable
    public View z() {
        return this.f112210t;
    }
}
