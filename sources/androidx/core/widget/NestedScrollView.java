package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.C2403b;
import androidx.core.view.C2437a;
import androidx.core.view.C2447d0;
import androidx.core.view.C2496u;
import androidx.core.view.C2507z0;
import androidx.core.view.InterfaceC2441b0;
import androidx.core.view.InterfaceC2468k0;
import androidx.core.view.InterfaceC2498v;
import androidx.core.view.V;
import androidx.core.view.X;
import androidx.core.view.Z;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import e.T;
import e.f0;
import y0.C5809a;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC2441b0, X, InterfaceC2468k0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f112045D = 250;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float f112046E = 0.5f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f112047F = "NestedScrollView";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f112048G = 250;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final float f112049H = 0.015f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final float f112050I = 0.35f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final float f112052K = 4.0f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f112053L = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f112056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @f0
    public final d f112057B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @f0
    public C2496u f112058C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f112059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f112060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f112061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f112062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f112063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @f0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public EdgeEffect f112064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f112065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f112066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f112067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f112068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f112070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f112071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f112072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f112073o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f112074p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f112075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f112076r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f112077s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f112078t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f112079u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f112080v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SavedState f112081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2447d0 f112082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Z f112083y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f112084z;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final float f112051J = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final a f112054M = new a();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int[] f112055N = {R.attr.fillViewport};

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int scrollPosition;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return android.support.v4.media.d.a(sb2, this.scrollPosition, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.scrollPosition);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }
    }

    public static class a extends C2437a {
        @Override // androidx.core.view.C2437a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.q() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.q());
        }

        @Override // androidx.core.view.C2437a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int iQ;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.j1(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (iQ = nestedScrollView.q()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.X1(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.a.f111885s);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.a.f111851D);
            }
            if (nestedScrollView.getScrollY() < iQ) {
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.a.f111884r);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.a.f111853F);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        @Override // androidx.core.view.C2437a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                boolean r7 = super.performAccessibilityAction(r5, r6, r7)
                r0 = 1
                if (r7 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
                boolean r7 = r5.isEnabled()
                r1 = 0
                if (r7 != 0) goto L12
                goto L80
            L12:
                int r7 = r5.getHeight()
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Matrix r3 = r5.getMatrix()
                boolean r3 = r3.isIdentity()
                if (r3 == 0) goto L2f
                boolean r3 = r5.getGlobalVisibleRect(r2)
                if (r3 == 0) goto L2f
                int r7 = r2.height()
            L2f:
                r2 = 4096(0x1000, float:5.74E-42)
                if (r6 == r2) goto L5f
                r2 = 8192(0x2000, float:1.148E-41)
                if (r6 == r2) goto L42
                r2 = 16908344(0x1020038, float:2.3877386E-38)
                if (r6 == r2) goto L42
                r2 = 16908346(0x102003a, float:2.3877392E-38)
                if (r6 == r2) goto L5f
                goto L80
            L42:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 - r7
                int r6 = java.lang.Math.max(r6, r1)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L80
                r5.Y(r1, r6, r0)
                return r0
            L5f:
                int r6 = r5.getPaddingBottom()
                int r7 = r7 - r6
                int r6 = r5.getPaddingTop()
                int r7 = r7 - r6
                int r6 = r5.getScrollY()
                int r6 = r6 + r7
                int r7 = r5.q()
                int r6 = java.lang.Math.min(r6, r7)
                int r7 = r5.getScrollY()
                if (r6 == r7) goto L80
                r5.Y(r1, r6, r0)
                return r0
            L80:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
        }
    }

    @T(21)
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    @T(35)
    public static final class c {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public class d implements InterfaceC2498v {
        public d() {
        }

        @Override // androidx.core.view.InterfaceC2498v
        public float a() {
            return -NestedScrollView.this.s();
        }

        @Override // androidx.core.view.InterfaceC2498v
        public boolean b(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.n((int) f10);
            return true;
        }

        @Override // androidx.core.view.InterfaceC2498v
        public void c() {
            NestedScrollView.this.f112062d.abortAnimation();
        }
    }

    public interface e {
        void a(@NonNull NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && B((View) parent, view2);
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    public boolean A() {
        return this.f112072n;
    }

    public final boolean C(View view, int i10, int i11) {
        view.getDrawingRect(this.f112061c);
        offsetDescendantRectToMyCoords(view, this.f112061c);
        return this.f112061c.bottom + i10 >= getScrollY() && this.f112061c.top - i10 <= getScrollY() + i11;
    }

    public final void D(int i10, int i11, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f112083y.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f112076r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f112065g = (int) motionEvent.getY(i10);
            this.f112076r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f112070l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean F(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (!z12 || hasNestedScrollingParent(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f112062d.springBack(i27, i21, 0, 0, 0, q());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z11, z12);
        return z11 || z12;
    }

    public boolean G(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f112061c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f112061c;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f112061c.top = getScrollY() - height;
            Rect rect2 = this.f112061c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f112061c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return K(i10, i11, i12);
    }

    public final void H() {
        VelocityTracker velocityTracker = this.f112070l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f112070l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f112063e
            float r0 = androidx.core.widget.i.d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f112063e
            float r4 = -r4
            float r4 = androidx.core.widget.i.j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f112063e
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f112063e
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f112064f
            float r0 = androidx.core.widget.i.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f112064f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.i.j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f112064f
            float r5 = androidx.core.widget.i.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f112064f
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, float):int");
    }

    public final void J(boolean z10) {
        if (z10) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f112080v = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean K(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewM = m(z11, i11, i12);
        if (viewM == null) {
            viewM = this;
        }
        if (i11 < scrollY || i12 > i13) {
            L(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewM != findFocus()) {
            viewM.requestFocus(i10);
        }
        return z10;
    }

    public final int L(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            startNestedScroll(2, i12);
        }
        boolean z11 = false;
        if (dispatchNestedPreScroll(0, i10, this.f112078t, this.f112077s, i12)) {
            int i15 = i10 - this.f112078t[1];
            i14 = this.f112077s[1];
            i13 = i15;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int iQ = q();
        boolean z12 = d() && !z10;
        int i16 = i13;
        boolean z13 = F(0, i13, 0, scrollY, 0, iQ, 0, 0, true) && !hasNestedScrollingParent(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f112078t;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i16 - scrollY2, this.f112077s, i12, iArr);
        int i17 = i14 + this.f112077s[1];
        int i18 = i16 - this.f112078t[1];
        int i19 = scrollY + i18;
        if (i19 < 0) {
            if (z12) {
                i.j(this.f112063e, (-i18) / getHeight(), i11 / getWidth());
                if (!this.f112064f.isFinished()) {
                    this.f112064f.onRelease();
                }
            }
        } else if (i19 > iQ && z12) {
            i.j(this.f112064f, i18 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f112063e.isFinished()) {
                this.f112063e.onRelease();
            }
        }
        if (this.f112063e.isFinished() && this.f112064f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f112070l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            stopNestedScroll(i12);
            this.f112063e.onRelease();
            this.f112064f.onRelease();
        }
        return i17;
    }

    public final void M(View view) {
        view.getDrawingRect(this.f112061c);
        offsetDescendantRectToMyCoords(view, this.f112061c);
        int iG = g(this.f112061c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    public final boolean N(Rect rect, boolean z10) {
        int iG = g(rect);
        boolean z11 = iG != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
                return z11;
            }
            S(0, iG);
        }
        return z11;
    }

    public void O(boolean z10) {
        if (z10 != this.f112071m) {
            this.f112071m = z10;
            requestLayout();
        }
    }

    public void P(@Nullable e eVar) {
        this.f112056A = eVar;
    }

    public void Q(boolean z10) {
        this.f112072n = z10;
    }

    public final boolean R(@NonNull EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return r(-i10) < i.d(edgeEffect) * ((float) getHeight());
    }

    public final void S(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    public final void T(int i10, int i11, int i12) {
        U(i10, i11, i12, false);
    }

    public final void U(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f112060b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f112062d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            J(z10);
        } else {
            if (!this.f112062d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f112060b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void V(int i10, int i11) {
        X(i10, i11, 250, false);
    }

    public final void W(int i10, int i11, int i12) {
        X(i10, i11, i12, false);
    }

    public void X(int i10, int i11, int i12, boolean z10) {
        U(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    public void Y(int i10, int i11, boolean z10) {
        X(i10, i11, 250, z10);
    }

    public final boolean Z(MotionEvent motionEvent) {
        boolean z10;
        if (i.d(this.f112063e) != 0.0f) {
            i.j(this.f112063e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (i.d(this.f112064f) == 0.0f) {
            return z10;
        }
        i.j(this.f112064f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void a() {
        this.f112062d.abortAnimation();
        stopNestedScroll(1);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int iP = p();
        if (viewFindNextFocus == null || !C(viewFindNextFocus, iP, getHeight())) {
            if (i10 == 33 && getScrollY() < iP) {
                iP = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                iP = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), iP);
            }
            if (iP == 0) {
                return false;
            }
            if (i10 != 130) {
                iP = -iP;
            }
            L(iP, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f112061c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f112061c);
            L(g(this.f112061c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && z(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i10;
        if (this.f112062d.isFinished()) {
            return;
        }
        this.f112062d.computeScrollOffset();
        int currY = this.f112062d.getCurrY();
        int iH = h(currY - this.f112080v);
        this.f112080v = currY;
        int[] iArr = this.f112078t;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iH, iArr, null, 1);
        int i11 = iH - this.f112078t[1];
        int iQ = q();
        if (C2403b.m()) {
            c.a(this, Math.abs(this.f112062d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            F(0, i11, getScrollX(), scrollY, 0, iQ, 0, 0, false);
            i10 = iQ;
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f112078t;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i12, this.f112077s, 1, iArr2);
            i11 = i12 - this.f112078t[1];
        } else {
            i10 = iQ;
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i10 > 0)) {
                if (i11 < 0) {
                    if (this.f112063e.isFinished()) {
                        this.f112063e.onAbsorb((int) this.f112062d.getCurrVelocity());
                    }
                } else if (this.f112064f.isFinished()) {
                    this.f112064f.onAbsorb((int) this.f112062d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f112062d.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.InterfaceC2468k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && q() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f112083y.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f112083y.b(f10, f11);
    }

    @Override // androidx.core.view.W
    public boolean dispatchNestedPreScroll(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2, int i12) {
        return this.f112083y.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.X
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        this.f112083y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f112063e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f112063e.setSize(width, height);
            if (this.f112063e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f112064f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(q(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f112064f.setSize(width2, height2);
        if (this.f112064f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, androidx.core.view.InterfaceC2444c0
    public int getNestedScrollAxes() {
        return this.f112082x.a();
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && i.d(this.f112063e) != 0.0f) {
            int iRound = Math.round(i.j(this.f112063e, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (iRound != i10) {
                this.f112063e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || i.d(this.f112064f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round(i.j(this.f112064f, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            this.f112064f.finish();
        }
        return i10 - iRound2;
    }

    @Override // androidx.core.view.W
    public boolean hasNestedScrollingParent(int i10) {
        return this.f112083y.l(i10);
    }

    public final void i(int i10) {
        if (i10 != 0) {
            if (this.f112072n) {
                S(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean isNestedScrollingEnabled() {
        return this.f112083y.m();
    }

    public final boolean j(int i10) {
        if (i.d(this.f112063e) != 0.0f) {
            if (R(this.f112063e, i10)) {
                this.f112063e.onAbsorb(i10);
                return true;
            }
            n(-i10);
            return true;
        }
        if (i.d(this.f112064f) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (R(this.f112064f, i11)) {
            this.f112064f.onAbsorb(i11);
            return true;
        }
        n(i11);
        return true;
    }

    public final void k() {
        this.f112076r = -1;
        this.f112069k = false;
        H();
        stopNestedScroll(0);
        this.f112063e.onRelease();
        this.f112064f.onRelease();
    }

    public boolean l(@NonNull KeyEvent keyEvent) {
        this.f112061c.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? o(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? o(130) : c(130);
            }
            if (keyCode == 62) {
                G(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return o(33);
            }
            if (keyCode == 93) {
                return o(130);
            }
            if (keyCode == 122) {
                G(33);
                return false;
            }
            if (keyCode == 123) {
                G(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m(boolean, int, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(int i10) {
        if (getChildCount() > 0) {
            this.f112062d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            J(true);
            if (C2403b.m()) {
                c.a(this, Math.abs(this.f112062d.getCurrVelocity()));
            }
        }
    }

    public boolean o(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f112061c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f112061c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f112061c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f112061c;
        return K(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f112067i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f112069k) {
            if (V.l(motionEvent, 2)) {
                i10 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (V.l(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                L(-((int) (s() * axisValue)), width, 1, V.l(motionEvent, 8194));
                if (i10 != 0) {
                    this.f112058C.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f112066h = false;
        View view = this.f112068j;
        if (view != null && B(view, this)) {
            M(this.f112068j);
        }
        this.f112068j = null;
        if (!this.f112067i) {
            if (this.f112081w != null) {
                scrollTo(getScrollX(), this.f112081w.scrollPosition);
                this.f112081w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f112067i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f112071m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        n((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.InterfaceC2441b0
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        D(i13, i14, iArr);
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f112082x.c(view, view2, i10, i11);
        startNestedScroll(2, i11);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || z(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f112081w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f112056A;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !C(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f112061c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f112061c);
        i(g(this.f112061c));
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onStopNestedScroll(@NonNull View view, int i10) {
        this.f112082x.e(view, i10);
        stopNestedScroll(i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f112079u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f112079u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f112070l;
                velocityTracker.computeCurrentVelocity(1000, this.f112075q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f112076r);
                if (Math.abs(yVelocity) >= this.f112074p) {
                    if (!j(yVelocity)) {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            n(i10);
                        }
                    }
                } else if (this.f112062d.springBack(getScrollX(), getScrollY(), 0, 0, 0, q())) {
                    postInvalidateOnAnimation();
                }
                k();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f112076r);
                if (iFindPointerIndex == -1) {
                    Log.e(f112047F, "Invalid pointerId=" + this.f112076r + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f112065g - y10;
                    int I10 = i11 - I(i11, motionEvent.getX(iFindPointerIndex));
                    if (!this.f112069k && Math.abs(I10) > this.f112073o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f112069k = true;
                        I10 = I10 > 0 ? I10 - this.f112073o : I10 + this.f112073o;
                    }
                    if (this.f112069k) {
                        int iL = L(I10, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f112065g = y10 - iL;
                        this.f112079u += iL;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f112069k && getChildCount() > 0 && this.f112062d.springBack(getScrollX(), getScrollY(), 0, 0, 0, q())) {
                    postInvalidateOnAnimation();
                }
                k();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f112065g = (int) motionEvent.getY(actionIndex);
                this.f112076r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                E(motionEvent);
                this.f112065g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f112076r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f112069k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f112062d.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f112070l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public int p() {
        return (int) (getHeight() * 0.5f);
    }

    public int q() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final float r(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f112059a * 0.015f));
        float f10 = f112051J;
        return (float) (Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog) * ((double) (this.f112059a * 0.015f)));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f112066h) {
            this.f112068j = view2;
        } else {
            M(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return N(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f112066h = true;
        super.requestLayout();
    }

    @f0
    public float s() {
        if (this.f112084z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f112084z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f112084z;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    @Override // android.view.View, androidx.core.view.Y
    public void setNestedScrollingEnabled(boolean z10) {
        this.f112083y.p(z10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.W
    public boolean startNestedScroll(int i10, int i11) {
        return this.f112083y.s(i10, i11);
    }

    @Override // androidx.core.view.W
    public void stopNestedScroll(int i10) {
        this.f112083y.u(i10);
    }

    public final boolean t(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public final void u() {
        VelocityTracker velocityTracker = this.f112070l;
        if (velocityTracker == null) {
            this.f112070l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void v() {
        this.f112062d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f112073o = viewConfiguration.getScaledTouchSlop();
        this.f112074p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f112075q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void w() {
        if (this.f112070l == null) {
            this.f112070l = VelocityTracker.obtain();
        }
    }

    public final void x(int i10, int i11) {
        this.f112065g = i10;
        this.f112076r = i11;
        startNestedScroll(2, 0);
    }

    public boolean y() {
        return this.f112071m;
    }

    public final boolean z(View view) {
        return !C(view, 0, getHeight());
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C5809a.C0907a.f240672o);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean dispatchNestedPreScroll(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.W
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        return this.f112083y.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        D(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.Y
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f112061c = new Rect();
        this.f112066h = true;
        this.f112067i = false;
        this.f112068j = null;
        this.f112069k = false;
        this.f112072n = true;
        this.f112076r = -1;
        this.f112077s = new int[2];
        this.f112078t = new int[2];
        d dVar = new d();
        this.f112057B = dVar;
        this.f112058C = new C2496u(getContext(), dVar);
        this.f112063e = i.a(context, attributeSet);
        this.f112064f = i.a(context, attributeSet);
        this.f112059a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f112055N, i10, 0);
        O(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f112082x = new C2447d0();
        this.f112083y = new Z(this);
        setNestedScrollingEnabled(true);
        C2507z0.G1(this, f112054M);
    }

    @Override // android.view.View, androidx.core.view.Y
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return this.f112083y.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13) {
        D(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
