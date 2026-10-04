package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import e.f0;
import i.C4541d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m extends RecyclerView.n implements RecyclerView.o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f116791E = 1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f116792F = 2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f116793G = 4;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f116794H = 8;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f116795I = 16;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f116796J = 32;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f116797K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f116798L = 1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f116799M = 2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f116800N = 2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f116801O = 4;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f116802P = 8;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f116803Q = "ItemTouchHelper";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final boolean f116804R = false;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f116805S = -1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f116806T = 8;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f116807U = 255;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f116808V = 65280;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f116809W = 16711680;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f116810X = 1000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public g f116811A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Rect f116813C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f116814D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f116818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f116819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f116820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f116821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f116822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f116823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f116824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f116825k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public f f116827m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f116829o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f116831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f116832r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f116834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<RecyclerView.C> f116835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<Integer> f116836v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.core.view.D f116840z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<View> f116815a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f116816b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.C f116817c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f116826l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f116828n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @f0
    public List<h> f116830p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f116833s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecyclerView.j f116837w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f116838x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f116839y = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RecyclerView.q f116812B = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            if (mVar.f116817c == null || !mVar.v()) {
                return;
            }
            m mVar2 = m.this;
            RecyclerView.C c10 = mVar2.f116817c;
            if (c10 != null) {
                mVar2.q(c10);
            }
            m mVar3 = m.this;
            mVar3.f116832r.removeCallbacks(mVar3.f116833s);
            C2507z0.u1(m.this.f116832r, this);
        }
    }

    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            h hVarJ;
            m.this.f116840z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m.this.f116826l = motionEvent.getPointerId(0);
                m.this.f116818d = motionEvent.getX();
                m.this.f116819e = motionEvent.getY();
                m.this.r();
                m mVar = m.this;
                if (mVar.f116817c == null && (hVarJ = mVar.j(motionEvent)) != null) {
                    m mVar2 = m.this;
                    mVar2.f116818d -= hVarJ.f116869j;
                    mVar2.f116819e -= hVarJ.f116870k;
                    mVar2.i(hVarJ.f116864e, true);
                    if (m.this.f116815a.remove(hVarJ.f116864e.itemView)) {
                        m mVar3 = m.this;
                        mVar3.f116827m.c(mVar3.f116832r, hVarJ.f116864e);
                    }
                    m.this.w(hVarJ.f116864e, hVarJ.f116865f);
                    m mVar4 = m.this;
                    mVar4.D(motionEvent, mVar4.f116829o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                m mVar5 = m.this;
                mVar5.f116826l = -1;
                mVar5.w(null, 0);
            } else {
                int i10 = m.this.f116826l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    m.this.f(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = m.this.f116834t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return m.this.f116817c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void onRequestDisallowInterceptTouchEvent(boolean z10) {
            if (z10) {
                m.this.w(null, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            m.this.f116840z.b(motionEvent);
            VelocityTracker velocityTracker = m.this.f116834t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (m.this.f116826l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(m.this.f116826l);
            if (iFindPointerIndex >= 0) {
                m.this.f(actionMasked, motionEvent, iFindPointerIndex);
            }
            m mVar = m.this;
            RecyclerView.C c10 = mVar.f116817c;
            if (c10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        mVar.D(motionEvent, mVar.f116829o, iFindPointerIndex);
                        m.this.q(c10);
                        m mVar2 = m.this;
                        mVar2.f116832r.removeCallbacks(mVar2.f116833s);
                        m.this.f116833s.run();
                        m.this.f116832r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    m mVar3 = m.this;
                    if (pointerId == mVar3.f116826l) {
                        mVar3.f116826l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        m mVar4 = m.this;
                        mVar4.D(motionEvent, mVar4.f116829o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = mVar.f116834t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            m.this.w(null, 0);
            m.this.f116826l = -1;
        }
    }

    public class c extends h {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f116843o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f116844p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.C c10, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.C c11) {
            super(c10, i10, i11, f10, f11, f12, f13);
            this.f116843o = i12;
            this.f116844p = c11;
        }

        @Override // androidx.recyclerview.widget.m.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f116871l) {
                return;
            }
            if (this.f116843o <= 0) {
                m mVar = m.this;
                mVar.f116827m.c(mVar.f116832r, this.f116844p);
            } else {
                m.this.f116815a.add(this.f116844p.itemView);
                this.f116868i = true;
                int i10 = this.f116843o;
                if (i10 > 0) {
                    m.this.s(this, i10);
                }
            }
            m mVar2 = m.this;
            View view = mVar2.f116838x;
            View view2 = this.f116844p.itemView;
            if (view == view2) {
                mVar2.u(view2);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f116846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f116847b;

        public d(h hVar, int i10) {
            this.f116846a = hVar;
            this.f116847b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = m.this.f116832r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f116846a;
            if (hVar.f116871l || hVar.f116864e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = m.this.f116832r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q()) && !m.this.o()) {
                m.this.f116827m.D(this.f116846a.f116864e, this.f116847b);
            } else {
                m.this.f116832r.post(this);
            }
        }
    }

    public class e implements RecyclerView.j {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public int a(int i10, int i11) {
            m mVar = m.this;
            View view = mVar.f116838x;
            if (view != null) {
                int iIndexOfChild = mVar.f116839y;
                if (iIndexOfChild == -1) {
                    iIndexOfChild = mVar.f116832r.indexOfChild(view);
                    m.this.f116839y = iIndexOfChild;
                }
                if (i11 == i10 - 1) {
                    return iIndexOfChild;
                }
                if (i11 >= iIndexOfChild) {
                    return i11 + 1;
                }
            }
            return i11;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f116850b = 200;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116851c = 250;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f116852d = 3158064;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f116853e = 789516;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Interpolator f116854f = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Interpolator f116855g = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final long f116856h = 2000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116857a = -1;

        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & f116853e;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & f116853e) << 2;
            }
            return i14 | i12;
        }

        @NonNull
        public static n i() {
            return o.f116877a;
        }

        public static int u(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int v(int i10, int i11) {
            return u(2, i10) | u(1, i11) | u(0, i11 | i10);
        }

        public abstract boolean A(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10, @NonNull RecyclerView.C c11);

        /* JADX WARN: Multi-variable type inference failed */
        public void B(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10, int i10, @NonNull RecyclerView.C c11, int i11, int i12, int i13) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).prepareForDrop(c10.itemView, c11.itemView, i12, i13);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(c11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedRight(c11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(c11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i11);
                }
                if (layoutManager.getDecoratedBottom(c11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i11);
                }
            }
        }

        public void C(@Nullable RecyclerView.C c10, int i10) {
            if (c10 != null) {
                o.f116877a.getClass();
            }
        }

        public abstract void D(@NonNull RecyclerView.C c10, int i10);

        public boolean a(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10, @NonNull RecyclerView.C c11) {
            return true;
        }

        public RecyclerView.C b(@NonNull RecyclerView.C c10, @NonNull List<RecyclerView.C> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = c10.itemView.getWidth() + i10;
            int height = c10.itemView.getHeight() + i11;
            int left2 = i10 - c10.itemView.getLeft();
            int top2 = i11 - c10.itemView.getTop();
            int size = list.size();
            RecyclerView.C c11 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.C c12 = list.get(i13);
                if (left2 > 0 && (right = c12.itemView.getRight() - width) < 0 && c12.itemView.getRight() > c10.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    c11 = c12;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = c12.itemView.getLeft() - i10) > 0 && c12.itemView.getLeft() < c10.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    c11 = c12;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = c12.itemView.getTop() - i11) > 0 && c12.itemView.getTop() < c10.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    c11 = c12;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = c12.itemView.getBottom() - height) < 0 && c12.itemView.getBottom() > c10.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    c11 = c12;
                    i12 = iAbs;
                }
            }
            return c11;
        }

        public void c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10) {
            o.f116877a.c(c10.itemView);
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & f116852d;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & f116852d) >> 2;
            }
            return i14 | i12;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.C c10) {
            return d(l(recyclerView, c10), C2507z0.c0(recyclerView));
        }

        public long g(@NonNull RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i10 == 8 ? 200L : 250L : i10 == 8 ? itemAnimator.o() : itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public final int j(RecyclerView recyclerView) {
            if (this.f116857a == -1) {
                this.f116857a = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f116857a;
        }

        public float k(@NonNull RecyclerView.C c10) {
            return 0.5f;
        }

        public abstract int l(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10);

        public float m(float f10) {
            return f10;
        }

        public float n(@NonNull RecyclerView.C c10) {
            return 0.5f;
        }

        public float o(float f10) {
            return f10;
        }

        public boolean p(RecyclerView recyclerView, RecyclerView.C c10) {
            return (f(recyclerView, c10) & m.f116809W) != 0;
        }

        public boolean q(RecyclerView recyclerView, RecyclerView.C c10) {
            return (f(recyclerView, c10) & 65280) != 0;
        }

        public int r(@NonNull RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int interpolation = (int) (f116854f.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f) * ((int) (f116855g.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * j(recyclerView))));
            return interpolation == 0 ? i11 > 0 ? 1 : -1 : interpolation;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10, float f10, float f11, int i10, boolean z10) {
            o.f116877a.b(canvas, recyclerView, c10.itemView, f10, f11, i10, z10);
        }

        public void x(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.C c10, float f10, float f11, int i10, boolean z10) {
            n nVar = o.f116877a;
            View view = c10.itemView;
            nVar.getClass();
        }

        public void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                hVar.e();
                int iSave = canvas.save();
                w(canvas, recyclerView, hVar.f116864e, hVar.f116869j, hVar.f116870k, hVar.f116865f, false);
                canvas.restoreToCount(iSave);
            }
            if (c10 != null) {
                int iSave2 = canvas.save();
                w(canvas, recyclerView, c10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                int iSave = canvas.save();
                x(canvas, recyclerView, hVar.f116864e, hVar.f116869j, hVar.f116870k, hVar.f116865f, false);
                canvas.restoreToCount(iSave);
            }
            if (c10 != null) {
                int iSave2 = canvas.save();
                x(canvas, recyclerView, c10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                h hVar2 = list.get(i12);
                boolean z11 = hVar2.f116872m;
                if (z11 && !hVar2.f116868i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }
    }

    public class g extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f116858a = true;

        public g() {
        }

        public void a() {
            this.f116858a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewK;
            RecyclerView.C childViewHolder;
            if (!this.f116858a || (viewK = m.this.k(motionEvent)) == null || (childViewHolder = m.this.f116832r.getChildViewHolder(viewK)) == null) {
                return;
            }
            m mVar = m.this;
            if (mVar.f116827m.p(mVar.f116832r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = m.this.f116826l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    m mVar2 = m.this;
                    mVar2.f116818d = x10;
                    mVar2.f116819e = y10;
                    mVar2.f116823i = 0.0f;
                    mVar2.f116822h = 0.0f;
                    mVar2.f116827m.getClass();
                    m.this.w(childViewHolder, 2);
                }
            }
        }
    }

    @f0
    public static class h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f116860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f116861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f116862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f116863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RecyclerView.C f116864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f116865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @f0
        public final ValueAnimator f116866g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f116867h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f116868i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f116869j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f116870k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f116871l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f116872m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f116873n;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public h(RecyclerView.C c10, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f116865f = i11;
            this.f116867h = i10;
            this.f116864e = c10;
            this.f116860a = f10;
            this.f116861b = f11;
            this.f116862c = f12;
            this.f116863d = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f116866g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(c10.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f116866g.cancel();
        }

        public void b(long j10) {
            this.f116866g.setDuration(j10);
        }

        public void c(float f10) {
            this.f116873n = f10;
        }

        public void d() {
            this.f116864e.setIsRecyclable(false);
            this.f116866g.start();
        }

        public void e() {
            float f10 = this.f116860a;
            float f11 = this.f116862c;
            if (f10 == f11) {
                this.f116869j = this.f116864e.itemView.getTranslationX();
            } else {
                this.f116869j = C4541d.a(f11, f10, this.f116873n, f10);
            }
            float f12 = this.f116861b;
            float f13 = this.f116863d;
            if (f12 == f13) {
                this.f116870k = this.f116864e.itemView.getTranslationY();
            } else {
                this.f116870k = C4541d.a(f13, f12, this.f116873n, f12);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f116872m) {
                this.f116864e.setIsRecyclable(true);
            }
            this.f116872m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class i extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f116875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f116876j;

        public i(int i10, int i11) {
            this.f116875i = i11;
            this.f116876j = i10;
        }

        public int E(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10) {
            return this.f116876j;
        }

        public int F(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10) {
            return this.f116875i;
        }

        public void G(int i10) {
            this.f116876j = i10;
        }

        public void H(int i10) {
            this.f116875i = i10;
        }

        @Override // androidx.recyclerview.widget.m.f
        public int l(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.C c10) {
            return f.v(E(recyclerView, c10), F(recyclerView, c10));
        }
    }

    public interface j {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i10, int i11);
    }

    public m(@NonNull f fVar) {
        this.f116827m = fVar;
    }

    private void h() {
        this.f116832r.removeItemDecoration(this);
        this.f116832r.removeOnItemTouchListener(this.f116812B);
        this.f116832r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f116830p.size() - 1; size >= 0; size--) {
            h hVar = this.f116830p.get(0);
            hVar.a();
            this.f116827m.c(this.f116832r, hVar.f116864e);
        }
        this.f116830p.clear();
        this.f116838x = null;
        this.f116839y = -1;
        t();
        B();
    }

    public static boolean p(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void x() {
        this.f116831q = ViewConfiguration.get(this.f116832r.getContext()).getScaledTouchSlop();
        this.f116832r.addItemDecoration(this);
        this.f116832r.addOnItemTouchListener(this.f116812B);
        this.f116832r.addOnChildAttachStateChangeListener(this);
        z();
    }

    public void A(@NonNull RecyclerView.C c10) {
        if (!this.f116827m.q(this.f116832r, c10)) {
            Log.e(f116803Q, "Start swipe has been called but swiping is not enabled");
            return;
        }
        if (c10.itemView.getParent() != this.f116832r) {
            Log.e(f116803Q, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
            return;
        }
        r();
        this.f116823i = 0.0f;
        this.f116822h = 0.0f;
        w(c10, 1);
    }

    public final void B() {
        g gVar = this.f116811A;
        if (gVar != null) {
            gVar.a();
            this.f116811A = null;
        }
        if (this.f116840z != null) {
            this.f116840z = null;
        }
    }

    public final int C(RecyclerView.C c10) {
        if (this.f116828n == 2) {
            return 0;
        }
        int iL = this.f116827m.l(this.f116832r, c10);
        int iD = (this.f116827m.d(iL, C2507z0.c0(this.f116832r)) & 65280) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i10 = (iL & 65280) >> 8;
        if (Math.abs(this.f116822h) > Math.abs(this.f116823i)) {
            int iE = e(c10, iD);
            if (iE > 0) {
                return (i10 & iE) == 0 ? f.e(iE, this.f116832r.getLayoutDirection()) : iE;
            }
            int iG = g(c10, iD);
            if (iG > 0) {
                return iG;
            }
            return 0;
        }
        int iG2 = g(c10, iD);
        if (iG2 > 0) {
            return iG2;
        }
        int iE2 = e(c10, iD);
        if (iE2 > 0) {
            return (i10 & iE2) == 0 ? f.e(iE2, this.f116832r.getLayoutDirection()) : iE2;
        }
        return 0;
    }

    public void D(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f116818d;
        this.f116822h = f10;
        this.f116823i = y10 - this.f116819e;
        if ((i10 & 4) == 0) {
            this.f116822h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f116822h = Math.min(0.0f, this.f116822h);
        }
        if ((i10 & 1) == 0) {
            this.f116823i = Math.max(0.0f, this.f116823i);
        }
        if ((i10 & 2) == 0) {
            this.f116823i = Math.min(0.0f, this.f116823i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(@NonNull View view) {
        u(view);
        RecyclerView.C childViewHolder = this.f116832r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.C c10 = this.f116817c;
        if (c10 != null && childViewHolder == c10) {
            w(null, 0);
            return;
        }
        i(childViewHolder, false);
        if (this.f116815a.remove(childViewHolder.itemView)) {
            this.f116827m.c(this.f116832r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(@NonNull View view) {
    }

    public final void c() {
    }

    public void d(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f116832r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f116832r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f116820f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f116821g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            x();
        }
    }

    public final int e(RecyclerView.C c10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f116822h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f116834t;
        if (velocityTracker != null && this.f116826l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f116827m.o(this.f116821g));
            float xVelocity = this.f116834t.getXVelocity(this.f116826l);
            float yVelocity = this.f116834t.getYVelocity(this.f116826l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= this.f116827m.m(this.f116820f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float width = this.f116832r.getWidth();
        this.f116827m.getClass();
        float f10 = 0.5f * width;
        if ((i10 & i11) == 0 || Math.abs(this.f116822h) <= f10) {
            return 0;
        }
        return i11;
    }

    public void f(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.C cM;
        int iF;
        if (this.f116817c == null && i10 == 2 && this.f116828n != 2) {
            this.f116827m.getClass();
            if (this.f116832r.getScrollState() == 1 || (cM = m(motionEvent)) == null || (iF = (this.f116827m.f(this.f116832r, cM) & 65280) >> 8) == 0) {
                return;
            }
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f10 = x10 - this.f116818d;
            float f11 = y10 - this.f116819e;
            float fAbs = Math.abs(f10);
            float fAbs2 = Math.abs(f11);
            float f12 = this.f116831q;
            if (fAbs >= f12 || fAbs2 >= f12) {
                if (fAbs > fAbs2) {
                    if (f10 < 0.0f && (iF & 4) == 0) {
                        return;
                    }
                    if (f10 > 0.0f && (iF & 8) == 0) {
                        return;
                    }
                } else {
                    if (f11 < 0.0f && (iF & 1) == 0) {
                        return;
                    }
                    if (f11 > 0.0f && (iF & 2) == 0) {
                        return;
                    }
                }
                this.f116823i = 0.0f;
                this.f116822h = 0.0f;
                this.f116826l = motionEvent.getPointerId(0);
                w(cM, 1);
            }
        }
    }

    public final int g(RecyclerView.C c10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f116823i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f116834t;
        if (velocityTracker != null && this.f116826l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f116827m.o(this.f116821g));
            float xVelocity = this.f116834t.getXVelocity(this.f116826l);
            float yVelocity = this.f116834t.getYVelocity(this.f116826l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.f116827m.m(this.f116820f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f116832r.getHeight();
        this.f116827m.getClass();
        float f10 = 0.5f * height;
        if ((i10 & i11) == 0 || Math.abs(this.f116823i) <= f10) {
            return 0;
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    public void i(RecyclerView.C c10, boolean z10) {
        for (int size = this.f116830p.size() - 1; size >= 0; size--) {
            h hVar = this.f116830p.get(size);
            if (hVar.f116864e == c10) {
                hVar.f116871l |= z10;
                if (!hVar.f116872m) {
                    hVar.a();
                }
                this.f116830p.remove(size);
                return;
            }
        }
    }

    public h j(MotionEvent motionEvent) {
        if (this.f116830p.isEmpty()) {
            return null;
        }
        View viewK = k(motionEvent);
        for (int size = this.f116830p.size() - 1; size >= 0; size--) {
            h hVar = this.f116830p.get(size);
            if (hVar.f116864e.itemView == viewK) {
                return hVar;
            }
        }
        return null;
    }

    public View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.C c10 = this.f116817c;
        if (c10 != null) {
            View view = c10.itemView;
            if (p(view, x10, y10, this.f116824j + this.f116822h, this.f116825k + this.f116823i)) {
                return view;
            }
        }
        for (int size = this.f116830p.size() - 1; size >= 0; size--) {
            h hVar = this.f116830p.get(size);
            View view2 = hVar.f116864e.itemView;
            if (p(view2, x10, y10, hVar.f116869j, hVar.f116870k)) {
                return view2;
            }
        }
        return this.f116832r.findChildViewUnder(x10, y10);
    }

    public final List<RecyclerView.C> l(RecyclerView.C c10) {
        RecyclerView.C c11 = c10;
        List<RecyclerView.C> list = this.f116835u;
        if (list == null) {
            this.f116835u = new ArrayList();
            this.f116836v = new ArrayList();
        } else {
            list.clear();
            this.f116836v.clear();
        }
        this.f116827m.getClass();
        int iRound = Math.round(this.f116824j + this.f116822h);
        int iRound2 = Math.round(this.f116825k + this.f116823i);
        int width = c11.itemView.getWidth() + iRound;
        int height = c11.itemView.getHeight() + iRound2;
        int i10 = (iRound + width) / 2;
        int i11 = (iRound2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f116832r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = layoutManager.getChildAt(i12);
            if (childAt != c11.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.C childViewHolder = this.f116832r.getChildViewHolder(childAt);
                this.f116827m.getClass();
                int iAbs = Math.abs(i10 - ((childAt.getRight() + childAt.getLeft()) / 2));
                int iAbs2 = Math.abs(i11 - ((childAt.getBottom() + childAt.getTop()) / 2));
                int i13 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                int size = this.f116835u.size();
                int i14 = 0;
                for (int i15 = 0; i15 < size && i13 > this.f116836v.get(i15).intValue(); i15++) {
                    i14++;
                }
                this.f116835u.add(i14, childViewHolder);
                this.f116836v.add(i14, Integer.valueOf(i13));
            }
            i12++;
            c11 = c10;
        }
        return this.f116835u;
    }

    public final RecyclerView.C m(MotionEvent motionEvent) {
        View viewK;
        RecyclerView.LayoutManager layoutManager = this.f116832r.getLayoutManager();
        int i10 = this.f116826l;
        if (i10 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(iFindPointerIndex) - this.f116818d;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.f116819e;
        float fAbs = Math.abs(x10);
        float fAbs2 = Math.abs(y10);
        float f10 = this.f116831q;
        if (fAbs < f10 && fAbs2 < f10) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewK = k(motionEvent)) != null) {
            return this.f116832r.getChildViewHolder(viewK);
        }
        return null;
    }

    public final void n(float[] fArr) {
        if ((this.f116829o & 12) != 0) {
            fArr[0] = (this.f116824j + this.f116822h) - this.f116817c.itemView.getLeft();
        } else {
            fArr[0] = this.f116817c.itemView.getTranslationX();
        }
        if ((this.f116829o & 3) != 0) {
            fArr[1] = (this.f116825k + this.f116823i) - this.f116817c.itemView.getTop();
        } else {
            fArr[1] = this.f116817c.itemView.getTranslationY();
        }
    }

    public boolean o() {
        int size = this.f116830p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f116830p.get(i10).f116872m) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f10;
        float f11;
        this.f116839y = -1;
        if (this.f116817c != null) {
            n(this.f116816b);
            float[] fArr = this.f116816b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f116827m.y(canvas, recyclerView, this.f116817c, this.f116830p, this.f116828n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f10;
        float f11;
        if (this.f116817c != null) {
            n(this.f116816b);
            float[] fArr = this.f116816b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f116827m.z(canvas, recyclerView, this.f116817c, this.f116830p, this.f116828n, f10, f11);
    }

    public void q(RecyclerView.C c10) {
        if (!this.f116832r.isLayoutRequested() && this.f116828n == 2) {
            this.f116827m.getClass();
            int i10 = (int) (this.f116824j + this.f116822h);
            int i11 = (int) (this.f116825k + this.f116823i);
            if (Math.abs(i11 - c10.itemView.getTop()) >= c10.itemView.getHeight() * 0.5f || Math.abs(i10 - c10.itemView.getLeft()) >= c10.itemView.getWidth() * 0.5f) {
                List<RecyclerView.C> listL = l(c10);
                if (listL.size() == 0) {
                    return;
                }
                RecyclerView.C cB = this.f116827m.b(c10, listL, i10, i11);
                if (cB == null) {
                    this.f116835u.clear();
                    this.f116836v.clear();
                } else {
                    int absoluteAdapterPosition = cB.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = c10.getAbsoluteAdapterPosition();
                    this.f116827m.A(this.f116832r, c10, cB);
                    this.f116827m.B(this.f116832r, c10, absoluteAdapterPosition2, cB, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    public void r() {
        VelocityTracker velocityTracker = this.f116834t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f116834t = VelocityTracker.obtain();
    }

    public void s(h hVar, int i10) {
        this.f116832r.post(new d(hVar, i10));
    }

    public final void t() {
        VelocityTracker velocityTracker = this.f116834t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f116834t = null;
        }
    }

    public void u(View view) {
        if (view == this.f116838x) {
            this.f116838x = null;
            if (this.f116837w != null) {
                this.f116832r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean v() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.v():boolean");
    }

    public void w(@Nullable RecyclerView.C c10, int i10) {
        boolean z10;
        float fSignum;
        float fSignum2;
        if (c10 == this.f116817c && i10 == this.f116828n) {
            return;
        }
        this.f116814D = Long.MIN_VALUE;
        int i11 = this.f116828n;
        i(c10, true);
        this.f116828n = i10;
        if (i10 == 2) {
            if (c10 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f116838x = c10.itemView;
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.C c11 = this.f116817c;
        boolean z11 = false;
        if (c11 != null) {
            if (c11.itemView.getParent() != null) {
                int iC = i11 == 2 ? 0 : C(c11);
                t();
                int i13 = 4;
                if (iC == 1 || iC == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f116823i) * this.f116832r.getHeight();
                } else if (iC == 4 || iC == 8 || iC == 16 || iC == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f116822h) * this.f116832r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i11 == 2) {
                    i13 = 8;
                } else if (iC > 0) {
                    i13 = 2;
                }
                n(this.f116816b);
                float[] fArr = this.f116816b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                z10 = false;
                c cVar = new c(c11, i13, i11, f10, f11, fSignum, fSignum2, iC, c11);
                cVar.b(this.f116827m.g(this.f116832r, i13, fSignum - f10, fSignum2 - f11));
                this.f116830p.add(cVar);
                cVar.d();
                z11 = true;
            } else {
                z10 = false;
                u(c11.itemView);
                this.f116827m.c(this.f116832r, c11);
                z11 = false;
            }
            this.f116817c = null;
        } else {
            z10 = false;
        }
        if (c10 != null) {
            this.f116829o = (this.f116827m.f(this.f116832r, c10) & i12) >> (this.f116828n * 8);
            this.f116824j = c10.itemView.getLeft();
            this.f116825k = c10.itemView.getTop();
            this.f116817c = c10;
            if (i10 == 2) {
                c10.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f116832r.getParent();
        if (parent != null) {
            if (this.f116817c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f116832r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.f116827m.C(this.f116817c, this.f116828n);
        this.f116832r.invalidate();
    }

    public void y(@NonNull RecyclerView.C c10) {
        if (!this.f116827m.p(this.f116832r, c10)) {
            Log.e(f116803Q, "Start drag has been called but dragging is not enabled");
            return;
        }
        if (c10.itemView.getParent() != this.f116832r) {
            Log.e(f116803Q, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        r();
        this.f116823i = 0.0f;
        this.f116822h = 0.0f;
        w(c10, 2);
    }

    public final void z() {
        this.f116811A = new g();
        this.f116840z = new androidx.core.view.D(this.f116832r.getContext(), this.f116811A, null);
    }
}
