package androidx.drawerlayout.widget;

import B0.C0920d;
import G0.D;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Z;
import androidx.core.view.C2437a;
import androidx.core.view.C2507z0;
import androidx.core.view.E;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.a;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.d;
import e.InterfaceC4337k;
import e.InterfaceC4345t;
import e.InterfaceC4346u;
import e.T;
import e.f0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n1.C5240a;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f113086N = "DrawerLayout";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f113088P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f113089Q = 1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f113090R = 2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f113091S = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f113092T = 1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f113093U = 2;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f113094V = 3;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f113095W = 64;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f113096a0 = -1728053248;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f113097b0 = 160;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f113098c0 = 400;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final boolean f113099d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final boolean f113100e0 = true;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final float f113101f0 = 1.0f;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final boolean f113103h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final boolean f113104i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f113105j0 = "androidx.drawerlayout.widget.DrawerLayout";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f113106k0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f113107A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f113108B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f113109C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public WindowInsetsCompat f113110D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f113111E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f113112F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f113113G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Drawable f113114H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Drawable f113115I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList<View> f113116J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Rect f113117K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Matrix f113118L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final androidx.core.view.accessibility.a f113119M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f113120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f113121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f113124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f113125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.customview.widget.d f113126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.customview.widget.d f113127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f113128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f113129j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f113130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OnBackInvokedCallback f113133n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnBackInvokedDispatcher f113134o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f113135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f113136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f113137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f113138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f113139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public d f113140u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<d> f113141v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f113142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f113143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f113144y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f113145z;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f113087O = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int[] f113102g0 = {R.attr.layout_gravity};

    public class a extends C2437a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f113153a = new Rect();

        public a() {
        }

        public final void c(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.E(childAt)) {
                    accessibilityNodeInfoCompat.c(childAt);
                }
            }
        }

        public final void d(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f113153a;
            accessibilityNodeInfoCompat2.t(rect);
            accessibilityNodeInfoCompat.e1(rect);
            accessibilityNodeInfoCompat.p2(accessibilityNodeInfoCompat2.M0());
            accessibilityNodeInfoCompat.N1(accessibilityNodeInfoCompat2.S());
            accessibilityNodeInfoCompat.j1(accessibilityNodeInfoCompat2.y());
            accessibilityNodeInfoCompat.o1(accessibilityNodeInfoCompat2.D());
            accessibilityNodeInfoCompat.u1(accessibilityNodeInfoCompat2.x0());
            accessibilityNodeInfoCompat.x1(accessibilityNodeInfoCompat2.z0());
            accessibilityNodeInfoCompat.a1(accessibilityNodeInfoCompat2.p0());
            accessibilityNodeInfoCompat.Y1(accessibilityNodeInfoCompat2.I0());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoCompat2.p());
        }

        @Override // androidx.core.view.C2437a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewR = DrawerLayout.this.r();
            if (viewR == null) {
                return true;
            }
            CharSequence charSequenceV = DrawerLayout.this.v(DrawerLayout.this.w(viewR));
            if (charSequenceV == null) {
                return true;
            }
            text.add(charSequenceV);
            return true;
        }

        @Override // androidx.core.view.C2437a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.f113105j0);
        }

        @Override // androidx.core.view.C2437a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.f113103h0) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatQ0 = AccessibilityNodeInfoCompat.Q0(accessibilityNodeInfoCompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompatQ0);
                accessibilityNodeInfoCompat.a2(view);
                Object objO0 = C2507z0.o0(view);
                if (objO0 instanceof View) {
                    accessibilityNodeInfoCompat.P1((View) objO0);
                }
                d(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatQ0);
                c(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.j1(DrawerLayout.f113105j0);
            accessibilityNodeInfoCompat.w1(false);
            accessibilityNodeInfoCompat.x1(false);
            accessibilityNodeInfoCompat.V0(AccessibilityNodeInfoCompat.a.f111872f);
            accessibilityNodeInfoCompat.V0(AccessibilityNodeInfoCompat.a.f111873g);
        }

        @Override // androidx.core.view.C2437a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f113103h0 || DrawerLayout.E(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    @T(33)
    public static class b {
        @Nullable
        @InterfaceC4345t
        public static OnBackInvokedDispatcher a(@NonNull DrawerLayout drawerLayout) {
            return drawerLayout.findOnBackInvokedDispatcher();
        }

        @NonNull
        @InterfaceC4345t
        public static OnBackInvokedCallback b(@NonNull Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new Z(runnable);
        }

        @InterfaceC4345t
        public static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @InterfaceC4345t
        public static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class c extends C2437a {
        @Override // androidx.core.view.C2437a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (DrawerLayout.E(view)) {
                return;
            }
            accessibilityNodeInfoCompat.P1(null);
        }
    }

    public interface d {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f10);

        void onDrawerStateChanged(int i10);
    }

    public static abstract class e implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerClosed(@NonNull View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerOpened(@NonNull View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerSlide(@NonNull View view, float f10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void onDrawerStateChanged(int i10) {
        }
    }

    public class f extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f113155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.customview.widget.d f113156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f113157c = new Runnable() { // from class: androidx.drawerlayout.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f113161a.b();
            }
        };

        public f(int i10) {
            this.f113155a = i10;
        }

        public final void a() {
            View viewP = DrawerLayout.this.p(this.f113155a == 3 ? 5 : 3);
            if (viewP != null) {
                DrawerLayout.this.h(viewP);
            }
        }

        public void b() {
            View viewP;
            int width;
            int iB = this.f113156b.B();
            boolean z10 = this.f113155a == 3;
            if (z10) {
                viewP = DrawerLayout.this.p(3);
                width = (viewP != null ? -viewP.getWidth() : 0) + iB;
            } else {
                viewP = DrawerLayout.this.p(5);
                width = DrawerLayout.this.getWidth() - iB;
            }
            if (viewP != null) {
                if (((!z10 || viewP.getLeft() >= width) && (z10 || viewP.getLeft() <= width)) || DrawerLayout.this.u(viewP) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewP.getLayoutParams();
                this.f113156b.X(viewP, width, viewP.getTop());
                layoutParams.f113151c = true;
                DrawerLayout.this.invalidate();
                a();
                DrawerLayout.this.d();
            }
        }

        public void c() {
            DrawerLayout.this.removeCallbacks(this.f113157c);
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionHorizontal(@NonNull View view, int i10, int i11) {
            if (DrawerLayout.this.e(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // androidx.customview.widget.d.c
        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        public void d(androidx.customview.widget.d dVar) {
            this.f113156b = dVar;
        }

        @Override // androidx.customview.widget.d.c
        public int getViewHorizontalDragRange(@NonNull View view) {
            if (DrawerLayout.this.J(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeDragStarted(int i10, int i11) {
            View viewP = (i10 & 1) == 1 ? DrawerLayout.this.p(3) : DrawerLayout.this.p(5);
            if (viewP == null || DrawerLayout.this.u(viewP) != 0) {
                return;
            }
            this.f113156b.d(viewP, i11);
        }

        @Override // androidx.customview.widget.d.c
        public boolean onEdgeLock(int i10) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void onEdgeTouched(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f113157c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void onViewCaptured(View view, int i10) {
            ((LayoutParams) view.getLayoutParams()).f113151c = false;
            a();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewDragStateChanged(int i10) {
            DrawerLayout.this.o0(i10, this.f113156b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            float width = (DrawerLayout.this.e(view, 3) ? i10 + r3 : DrawerLayout.this.getWidth() - i10) / view.getWidth();
            DrawerLayout.this.g0(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void onViewReleased(@NonNull View view, float f10, float f11) {
            int i10;
            float fX = DrawerLayout.this.x(view);
            int width = view.getWidth();
            if (DrawerLayout.this.e(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fX > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fX > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f113156b.V(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean tryCaptureView(@NonNull View view, int i10) {
            return DrawerLayout.this.J(view) && DrawerLayout.this.e(view, this.f113155a) && DrawerLayout.this.u(view) == 0;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f113103h0 = true;
        f113104i0 = true;
        f113106k0 = i10 >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static String A(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean B(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public static boolean E(View view) {
        return (C2507z0.X(view) == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static /* synthetic */ WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        ((DrawerLayout) view).X(windowInsetsCompat, windowInsetsCompat.s().f40032b > 0);
        return windowInsetsCompat.c();
    }

    public static /* synthetic */ boolean b(DrawerLayout drawerLayout, View view, a.AbstractC0286a abstractC0286a) {
        if (!drawerLayout.I(view) || drawerLayout.u(view) == 2) {
            return false;
        }
        drawerLayout.h(view);
        return true;
    }

    public final boolean C() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((LayoutParams) getChildAt(i10).getLayoutParams()).f113151c) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        return r() != null;
    }

    @f0
    public boolean F() {
        return this.f113134o != null;
    }

    public boolean G(View view) {
        return ((LayoutParams) view.getLayoutParams()).f113149a == 0;
    }

    public boolean H(int i10) {
        View viewP = p(i10);
        if (viewP != null) {
            return I(viewP);
        }
        return false;
    }

    public boolean I(@NonNull View view) {
        if (J(view)) {
            return (((LayoutParams) view.getLayoutParams()).f113152d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean J(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f113149a, C2507z0.c0(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean K(int i10) {
        View viewP = p(i10);
        if (viewP != null) {
            return L(viewP);
        }
        return false;
    }

    public boolean L(@NonNull View view) {
        if (J(view)) {
            return ((LayoutParams) view.getLayoutParams()).f113150b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean M(float f10, float f11, View view) {
        if (this.f113117K == null) {
            this.f113117K = new Rect();
        }
        view.getHitRect(this.f113117K);
        return this.f113117K.contains((int) f10, (int) f11);
    }

    public final void N(@Nullable Drawable drawable, int i10) {
        if (drawable == null || !drawable.isAutoMirrored()) {
            return;
        }
        drawable.setLayoutDirection(i10);
    }

    public void O(View view, float f10) {
        float fX = x(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fX * width));
        if (!e(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        g0(view, f10);
    }

    public void P(int i10) {
        Q(i10, true);
    }

    public void Q(int i10, boolean z10) {
        View viewP = p(i10);
        if (viewP != null) {
            S(viewP, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + A(i10));
        }
    }

    public void R(@NonNull View view) {
        S(view, true);
    }

    public void S(@NonNull View view, boolean z10) {
        if (!J(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f113132m) {
            layoutParams.f113150b = 1.0f;
            layoutParams.f113152d = 1;
            n0(view, true);
            m0(view);
            l0();
        } else if (z10) {
            layoutParams.f113152d |= 2;
            if (e(view, 3)) {
                this.f113126g.X(view, 0, view.getTop());
            } else {
                this.f113127h.X(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            O(view, 1.0f);
            o0(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void T(@NonNull d dVar) {
        List<d> list = this.f113141v;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public final Drawable U() {
        int iC0 = C2507z0.c0(this);
        if (iC0 == 0) {
            Drawable drawable = this.f113112F;
            if (drawable != null) {
                N(drawable, iC0);
                return this.f113112F;
            }
        } else {
            Drawable drawable2 = this.f113113G;
            if (drawable2 != null) {
                N(drawable2, iC0);
                return this.f113113G;
            }
        }
        return this.f113114H;
    }

    public final Drawable V() {
        int iC0 = C2507z0.c0(this);
        if (iC0 == 0) {
            Drawable drawable = this.f113113G;
            if (drawable != null) {
                N(drawable, iC0);
                return this.f113113G;
            }
        } else {
            Drawable drawable2 = this.f113112F;
            if (drawable2 != null) {
                N(drawable2, iC0);
                return this.f113112F;
            }
        }
        return this.f113115I;
    }

    public final void W() {
        if (f113104i0) {
            return;
        }
        this.f113145z = U();
        this.f113107A = V();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void X(@Nullable WindowInsetsCompat windowInsetsCompat, boolean z10) {
        this.f113110D = windowInsetsCompat;
        this.f113111E = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void Y(float f10) {
        this.f113121b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (J(childAt)) {
                C2507z0.U1(childAt, this.f113121b);
            }
        }
    }

    @Deprecated
    public void Z(d dVar) {
        d dVar2 = this.f113140u;
        if (dVar2 != null) {
            T(dVar2);
        }
        if (dVar != null) {
            c(dVar);
        }
        this.f113140u = dVar;
    }

    public void a0(int i10) {
        b0(i10, 3);
        b0(i10, 5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!J(childAt)) {
                this.f113116J.add(childAt);
            } else if (I(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.f113116J.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.f113116J.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f113116J.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (q() != null || J(view)) {
            C2507z0.Y1(view, 4);
        } else {
            C2507z0.Y1(view, 1);
        }
        if (f113103h0) {
            return;
        }
        C2507z0.G1(view, this.f113120a);
    }

    public void b0(int i10, int i11) {
        View viewP;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, C2507z0.c0(this));
        if (i11 == 3) {
            this.f113135p = i10;
        } else if (i11 == 5) {
            this.f113136q = i10;
        } else if (i11 == 8388611) {
            this.f113137r = i10;
        } else if (i11 == 8388613) {
            this.f113138s = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f113126g : this.f113127h).c();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewP = p(absoluteGravity)) != null) {
                R(viewP);
                return;
            }
            return;
        }
        View viewP2 = p(absoluteGravity);
        if (viewP2 != null) {
            h(viewP2);
        }
    }

    public void c(@NonNull d dVar) {
        if (this.f113141v == null) {
            this.f113141v = new ArrayList();
        }
        this.f113141v.add(dVar);
    }

    public void c0(int i10, @NonNull View view) {
        if (J(view)) {
            b0(i10, ((LayoutParams) view.getLayoutParams()).f113149a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        f(E.f111493b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i10).getLayoutParams()).f113150b);
        }
        this.f113124e = fMax;
        boolean zO = this.f113126g.o(true);
        boolean zO2 = this.f113127h.o(true);
        if (zO || zO2) {
            C2507z0.s1(this);
        }
    }

    public void d() {
        if (this.f113139t) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f113139t = true;
    }

    public void d0(@InterfaceC4346u int i10, int i11) {
        e0(C0920d.getDrawable(getContext(), i10), i11);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f113124e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (M(x10, y10, childAt) && !G(childAt) && o(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zG = G(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zG) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && B(childAt) && J(childAt) && childAt.getHeight() >= height) {
                    if (e(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f113124e;
        if (f10 > 0.0f && zG) {
            this.f113125f.setColor((this.f113123d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f113125f);
            return zDrawChild;
        }
        if (this.f113145z != null && e(view, 3)) {
            int intrinsicWidth = this.f113145z.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f113126g.B(), 1.0f));
            this.f113145z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f113145z.setAlpha((int) (fMax * 255.0f));
            this.f113145z.draw(canvas);
            return zDrawChild;
        }
        if (this.f113107A != null && e(view, 5)) {
            int intrinsicWidth2 = this.f113107A.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f113127h.B(), 1.0f));
            this.f113107A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f113107A.setAlpha((int) (fMax2 * 255.0f));
            this.f113107A.draw(canvas);
        }
        return zDrawChild;
    }

    public boolean e(View view, int i10) {
        return (w(view) & i10) == i10;
    }

    public void e0(@Nullable Drawable drawable, int i10) {
        if (f113104i0) {
            return;
        }
        if ((i10 & E.f111493b) == 8388611) {
            this.f113112F = drawable;
        } else if ((i10 & 8388613) == 8388613) {
            this.f113113G = drawable;
        } else if ((i10 & 3) == 3) {
            this.f113114H = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.f113115I = drawable;
        }
        W();
        invalidate();
    }

    public void f(int i10) {
        g(i10, true);
    }

    public void f0(int i10, @Nullable CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, C2507z0.c0(this));
        if (absoluteGravity == 3) {
            this.f113108B = charSequence;
        } else if (absoluteGravity == 5) {
            this.f113109C = charSequence;
        }
    }

    public void g(int i10, boolean z10) {
        View viewP = p(i10);
        if (viewP != null) {
            i(viewP, z10);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + A(i10));
        }
    }

    public void g0(View view, float f10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 == layoutParams.f113150b) {
            return;
        }
        layoutParams.f113150b = f10;
        n(view, f10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void h(@NonNull View view) {
        i(view, true);
    }

    public void h0(@InterfaceC4337k int i10) {
        this.f113123d = i10;
        invalidate();
    }

    public void i(@NonNull View view, boolean z10) {
        if (!J(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f113132m) {
            layoutParams.f113150b = 0.0f;
            layoutParams.f113152d = 0;
        } else if (z10) {
            layoutParams.f113152d |= 4;
            if (e(view, 3)) {
                this.f113126g.X(view, -view.getWidth(), view.getTop());
            } else {
                this.f113127h.X(view, getWidth(), view.getTop());
            }
        } else {
            O(view, 0.0f);
            o0(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void i0(int i10) {
        this.f113144y = i10 != 0 ? C0920d.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return H(E.f111493b);
    }

    public void j() {
        k(false);
    }

    public void j0(@Nullable Drawable drawable) {
        this.f113144y = drawable;
        invalidate();
    }

    public void k(boolean z10) {
        int childCount = getChildCount();
        boolean zX = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (J(childAt) && (!z10 || layoutParams.f113151c)) {
                zX |= e(childAt, 3) ? this.f113126g.X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f113127h.X(childAt, getWidth(), childAt.getTop());
                layoutParams.f113151c = false;
            }
        }
        this.f113128i.c();
        this.f113129j.c();
        if (zX) {
            invalidate();
        }
    }

    public void k0(@InterfaceC4337k int i10) {
        this.f113144y = new ColorDrawable(i10);
        invalidate();
    }

    public void l(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f113152d & 1) == 1) {
            layoutParams.f113152d = 0;
            List<d> list = this.f113141v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f113141v.get(size).onDrawerClosed(view);
                }
            }
            n0(view, false);
            m0(view);
            l0();
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void l0() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View viewR = r();
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b.a(this);
            boolean z10 = viewR != null && onBackInvokedDispatcherA != null && u(viewR) == 0 && C2507z0.R0(this);
            if (z10 && this.f113134o == null) {
                if (this.f113133n == null) {
                    this.f113133n = b.b(new androidx.drawerlayout.widget.a(this));
                }
                b.c(onBackInvokedDispatcherA, this.f113133n);
                this.f113134o = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f113134o) == null) {
                return;
            }
            b.d(onBackInvokedDispatcher, this.f113133n);
            this.f113134o = null;
        }
    }

    public void m(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f113152d & 1) == 0) {
            layoutParams.f113152d = 1;
            List<d> list = this.f113141v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f113141v.get(size).onDrawerOpened(view);
                }
            }
            n0(view, true);
            m0(view);
            l0();
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public final void m0(View view) {
        AccessibilityNodeInfoCompat.a aVar = AccessibilityNodeInfoCompat.a.f111892z;
        C2507z0.w1(view, aVar.b());
        if (!I(view) || u(view) == 2) {
            return;
        }
        C2507z0.z1(view, aVar, null, this.f113119M);
    }

    public void n(View view, float f10) {
        List<d> list = this.f113141v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f113141v.get(size).onDrawerSlide(view, f10);
            }
        }
    }

    public final void n0(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || J(childAt)) && !(z10 && childAt == view)) {
                C2507z0.Y1(childAt, 4);
            } else {
                C2507z0.Y1(childAt, 1);
            }
        }
    }

    public final boolean o(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventZ = z(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventZ);
            motionEventZ.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    public void o0(int i10, View view) {
        int i11;
        int iF = this.f113126g.F();
        int iF2 = this.f113127h.F();
        if (iF == 1 || iF2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iF != 2 && iF2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((LayoutParams) view.getLayoutParams()).f113150b;
            if (f10 == 0.0f) {
                l(view);
            } else if (f10 == 1.0f) {
                m(view);
            }
        }
        if (i11 != this.f113130k) {
            this.f113130k = i11;
            List<d> list = this.f113141v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f113141v.get(size).onDrawerStateChanged(i11);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f113132m = true;
        l0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f113132m = true;
        l0();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f113111E || this.f113144y == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f113110D;
        int iR = windowInsetsCompat != null ? windowInsetsCompat.r() : 0;
        if (iR > 0) {
            this.f113144y.setBounds(0, 0, getWidth(), iR);
            this.f113144y.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.d r1 = r6.f113126g
            boolean r1 = r1.W(r7)
            androidx.customview.widget.d r2 = r6.f113127h
            boolean r2 = r2.W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            androidx.customview.widget.d r7 = r6.f113126g
            boolean r7 = r7.f(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f113128i
            r7.c()
            androidx.drawerlayout.widget.DrawerLayout$f r7 = r6.f113129j
            r7.c()
            goto L36
        L31:
            r6.k(r2)
            r6.f113139t = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f113142w = r0
            r6.f113143x = r7
            float r4 = r6.f113124e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            androidx.customview.widget.d r4 = r6.f113126g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.v(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.G(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f113139t = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.C()
            if (r7 != 0) goto L70
            boolean r7 = r6.f113139t
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !D()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewR = r();
        if (viewR != null && u(viewR) == 0) {
            j();
        }
        return viewR != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsetsCompat windowInsetsCompatR0;
        float f10;
        int i14;
        boolean z11 = true;
        this.f113131l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (G(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (e(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (layoutParams.f113150b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (layoutParams.f113150b * f12));
                    }
                    boolean z12 = f10 != layoutParams.f113150b ? z11 : false;
                    int i18 = layoutParams.f113149a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = i19 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z12) {
                        g0(childAt, f10);
                    }
                    int i26 = layoutParams.f113150b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f113106k0 && (windowInsetsCompatR0 = C2507z0.r0(this)) != null) {
            D dN = windowInsetsCompatR0.n();
            androidx.customview.widget.d dVar = this.f113126g;
            dVar.S(Math.max(dVar.A(), dN.f40031a));
            androidx.customview.widget.d dVar2 = this.f113127h;
            dVar2.S(Math.max(dVar2.A(), dN.f40033c));
        }
        this.f113131l = false;
        this.f113132m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f113110D != null && C2507z0.W(this);
        int iC0 = C2507z0.c0(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f113149a, iC0);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsetsCompat windowInsetsCompatD = this.f113110D;
                        if (absoluteGravity == 3) {
                            windowInsetsCompatD = windowInsetsCompatD.D(windowInsetsCompatD.p(), windowInsetsCompatD.r(), 0, windowInsetsCompatD.o());
                        } else if (absoluteGravity == 5) {
                            windowInsetsCompatD = windowInsetsCompatD.D(0, windowInsetsCompatD.r(), windowInsetsCompatD.q(), windowInsetsCompatD.o());
                        }
                        C2507z0.p(childAt, windowInsetsCompatD);
                    } else {
                        WindowInsetsCompat windowInsetsCompatD2 = this.f113110D;
                        if (absoluteGravity == 3) {
                            windowInsetsCompatD2 = windowInsetsCompatD2.D(windowInsetsCompatD2.p(), windowInsetsCompatD2.r(), 0, windowInsetsCompatD2.o());
                        } else if (absoluteGravity == 5) {
                            windowInsetsCompatD2 = windowInsetsCompatD2.D(0, windowInsetsCompatD2.r(), windowInsetsCompatD2.q(), windowInsetsCompatD2.o());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsCompatD2.p();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsCompatD2.r();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsCompatD2.q();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsCompatD2.o();
                    }
                }
                if (G(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!J(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f113104i0) {
                        float fI = C2507z0.h.i(childAt);
                        float f10 = this.f113121b;
                        if (fI != f10) {
                            C2507z0.h.s(childAt, f10);
                        }
                    }
                    int iW = w(childAt) & 7;
                    boolean z13 = iW == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + A(iW) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f113122c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewP;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.openDrawerGravity;
        if (i10 != 0 && (viewP = p(i10)) != null) {
            R(viewP);
        }
        int i11 = savedState.lockModeLeft;
        if (i11 != 3) {
            b0(i11, 3);
        }
        int i12 = savedState.lockModeRight;
        if (i12 != 3) {
            b0(i12, 5);
        }
        int i13 = savedState.lockModeStart;
        if (i13 != 3) {
            b0(i13, E.f111493b);
        }
        int i14 = savedState.lockModeEnd;
        if (i14 != 3) {
            b0(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        W();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            int i11 = layoutParams.f113152d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                savedState.openDrawerGravity = layoutParams.f113149a;
                break;
            }
        }
        savedState.lockModeLeft = this.f113135p;
        savedState.lockModeRight = this.f113136q;
        savedState.lockModeStart = this.f113137r;
        savedState.lockModeEnd = this.f113138s;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.d r0 = r6.f113126g
            r0.M(r7)
            androidx.customview.widget.d r0 = r6.f113127h
            r0.M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            return r2
        L1a:
            r6.k(r2)
            r6.f113139t = r1
            return r2
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.d r3 = r6.f113126g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.v(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.G(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f113142w
            float r0 = r0 - r3
            float r3 = r6.f113143x
            float r7 = r7 - r3
            androidx.customview.widget.d r3 = r6.f113126g
            int r3 = r3.E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.q()
            if (r7 == 0) goto L5a
            int r7 = r6.u(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.k(r1)
            return r2
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f113142w = r0
            r6.f113143x = r7
            r6.f113139t = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.customview.widget.c
    public void open() {
        P(E.f111493b);
    }

    public View p(int i10) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, C2507z0.c0(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((w(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public View q() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((LayoutParams) childAt.getLayoutParams()).f113152d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View r() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (J(childAt) && L(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            k(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f113131l) {
            return;
        }
        super.requestLayout();
    }

    public float s() {
        if (f113104i0) {
            return this.f113121b;
        }
        return 0.0f;
    }

    public int t(int i10) {
        int iC0 = C2507z0.c0(this);
        if (i10 == 3) {
            int i11 = this.f113135p;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iC0 == 0 ? this.f113137r : this.f113138s;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f113136q;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iC0 == 0 ? this.f113138s : this.f113137r;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f113137r;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iC0 == 0 ? this.f113135p : this.f113136q;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f113138s;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iC0 == 0 ? this.f113136q : this.f113135p;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int u(@NonNull View view) {
        if (J(view)) {
            return t(((LayoutParams) view.getLayoutParams()).f113149a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Nullable
    public CharSequence v(int i10) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, C2507z0.c0(this));
        if (absoluteGravity == 3) {
            return this.f113108B;
        }
        if (absoluteGravity == 5) {
            return this.f113109C;
        }
        return null;
    }

    public int w(View view) {
        return Gravity.getAbsoluteGravity(((LayoutParams) view.getLayoutParams()).f113149a, C2507z0.c0(this));
    }

    public float x(View view) {
        return ((LayoutParams) view.getLayoutParams()).f113150b;
    }

    @Nullable
    public Drawable y() {
        return this.f113144y;
    }

    public final MotionEvent z(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f113118L == null) {
                this.f113118L = new Matrix();
            }
            matrix.invert(this.f113118L);
            motionEventObtain.transform(this.f113118L);
        }
        return motionEventObtain;
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5240a.C0840a.f221209a);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f113120a = new c();
        this.f113123d = f113096a0;
        this.f113125f = new Paint();
        this.f113132m = true;
        this.f113135p = 3;
        this.f113136q = 3;
        this.f113137r = 3;
        this.f113138s = 3;
        this.f113112F = null;
        this.f113113G = null;
        this.f113114H = null;
        this.f113115I = null;
        this.f113119M = new androidx.core.view.accessibility.a() { // from class: androidx.drawerlayout.widget.b
            @Override // androidx.core.view.accessibility.a
            public final boolean perform(View view, a.AbstractC0286a abstractC0286a) {
                return DrawerLayout.b(this.f113160a, view, abstractC0286a);
            }
        };
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f113122c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        f fVar = new f(3);
        this.f113128i = fVar;
        f fVar2 = new f(5);
        this.f113129j = fVar2;
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 1.0f, fVar);
        this.f113126g = dVarP;
        dVarP.f112207q = 1;
        dVarP.f112204n = f11;
        fVar.f113156b = dVarP;
        androidx.customview.widget.d dVarP2 = androidx.customview.widget.d.p(this, 1.0f, fVar2);
        this.f113127h = dVarP2;
        dVarP2.f112207q = 2;
        dVarP2.f112204n = f11;
        fVar2.f113156b = dVarP2;
        setFocusableInTouchMode(true);
        C2507z0.Y1(this, 1);
        C2507z0.G1(this, new a());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            C2507z0.h.u(this, new androidx.drawerlayout.widget.c());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f113087O);
            try {
                this.f113144y = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C5240a.c.f221212a, i10, 0);
        try {
            int i11 = C5240a.c.f221213b;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f113121b = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f113121b = getResources().getDimension(C5240a.b.f221211a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f113116J = new ArrayList<>();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f113146e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f113147f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f113148g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f113150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f113151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f113152d;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f113149a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f113102g0);
            this.f113149a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f113149a = 0;
        }

        public LayoutParams(int i10, int i11, int i12) {
            this(i10, i11);
            this.f113149a = i12;
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f113149a = 0;
            this.f113149a = layoutParams.f113149a;
        }

        public LayoutParams(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f113149a = 0;
        }

        public LayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f113149a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = 0;
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.openDrawerGravity = 0;
        }
    }
}
