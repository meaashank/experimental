package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.V1;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.g;
import androidx.core.view.InterfaceC2441b0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.ads.AdError;
import e.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s0.C5566h;
import u0.C5634b;
import u0.InterfaceC5633a;
import w0.C5733b;
import w0.C5736e;

/* JADX INFO: loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements InterfaceC2441b0 {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final int f106685E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final int f106686F0 = 1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final int f106687G0 = 2;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final int f106688H0 = 3;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final int f106689I0 = 4;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final int f106690J0 = 5;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final int f106691K0 = 6;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final int f106692L0 = 7;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final String f106693M0 = "MotionLayout";

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final boolean f106694N0 = false;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static boolean f106695O0 = false;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final int f106696P0 = 0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final int f106697Q0 = 1;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final int f106698R0 = 2;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final int f106699S0 = 50;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final int f106700T0 = 0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final int f106701U0 = 1;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int f106702V0 = 2;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final int f106703W0 = 3;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final float f106704X0 = 1.0E-5f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C5733b f106705A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public RectF f106706A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f106707B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public View f106708B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.d f106709C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Matrix f106710C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f106711D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList<Integer> f106712D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f106713E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f106714F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f106715G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f106716H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f106717I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f106718J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f106719K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f106720L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f106721M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f106722N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList<MotionHelper> f106723O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ArrayList<MotionHelper> f106724P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList<MotionHelper> f106725Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public CopyOnWriteArrayList<l> f106726R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f106727S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f106728T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f106729U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f106730V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f106731W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f106732a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f106733a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f106734b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f106735b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f106736c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f106737c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f106738d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f106739d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106740e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f106741e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106742f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f106743f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106744g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f106745g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f106746h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f106747h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f106748i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f106749i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f106750j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public C5566h f106751j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<View, o> f106752k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f106753k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f106754l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public k f106755l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f106756m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Runnable f106757m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f106758n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int[] f106759n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f106760o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f106761o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f106762p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f106763p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f106764q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f106765q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f106766r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public HashMap<View, C5736e> f106767r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f106768s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f106769s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f106770t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f106771t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f106772u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f106773u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f106774v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Rect f106775v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f106776w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f106777w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f106778x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TransitionState f106779x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f106780y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public h f106781y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f106782z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f106783z0;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f106755l0.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f106763p0 = false;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f106786a;

        public c(final MotionLayout this$0, final View val$target) {
            this.f106786a = val$target;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f106786a.setNestedScrollingEnabled(true);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f106755l0.a();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106788a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f106788a = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f106788a[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f106788a[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f106788a[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class f extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f106789a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f106790b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f106791c;

        public f() {
        }

        @Override // androidx.constraintlayout.motion.widget.q
        public float a() {
            return MotionLayout.this.f106738d;
        }

        public void b(float velocity, float position, float maxAcceleration) {
            this.f106789a = velocity;
            this.f106790b = position;
            this.f106791c = maxAcceleration;
        }

        @Override // androidx.constraintlayout.motion.widget.q, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f10 = this.f106789a;
            if (f10 > 0.0f) {
                float f11 = this.f106791c;
                if (f10 / f11 < time) {
                    time = f10 / f11;
                }
                MotionLayout.this.f106738d = f10 - (f11 * time);
                return ((f10 * time) - (((f11 * time) * time) / 2.0f)) + this.f106790b;
            }
            float f12 = this.f106791c;
            if ((-f10) / f12 < time) {
                time = (-f10) / f12;
            }
            MotionLayout.this.f106738d = (f12 * time) + f10;
            return (((f12 * time) * time) / 2.0f) + (f10 * time) + this.f106790b;
        }
    }

    public class g {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f106793v = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f106794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f106795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f106796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f106797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f106798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Paint f106799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Paint f106800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Paint f106801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Paint f106802i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f106803j;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DashPathEffect f106809p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f106810q;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f106813t;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f106804k = -21965;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f106805l = -2067046;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f106806m = -13391360;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f106807n = 1996488704;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f106808o = 10;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Rect f106811r = new Rect();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f106812s = false;

        public g() {
            this.f106813t = 1;
            Paint paint = new Paint();
            this.f106798e = paint;
            paint.setAntiAlias(true);
            this.f106798e.setColor(-21965);
            this.f106798e.setStrokeWidth(2.0f);
            Paint paint2 = this.f106798e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f106799f = paint3;
            paint3.setAntiAlias(true);
            this.f106799f.setColor(-2067046);
            this.f106799f.setStrokeWidth(2.0f);
            this.f106799f.setStyle(style);
            Paint paint4 = new Paint();
            this.f106800g = paint4;
            paint4.setAntiAlias(true);
            this.f106800g.setColor(-13391360);
            this.f106800g.setStrokeWidth(2.0f);
            this.f106800g.setStyle(style);
            Paint paint5 = new Paint();
            this.f106801h = paint5;
            paint5.setAntiAlias(true);
            this.f106801h.setColor(-13391360);
            this.f106801h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f106803j = new float[8];
            Paint paint6 = new Paint();
            this.f106802i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f106809p = dashPathEffect;
            this.f106800g.setPathEffect(dashPathEffect);
            this.f106796c = new float[100];
            this.f106795b = new int[50];
            if (this.f106812s) {
                this.f106798e.setStrokeWidth(8.0f);
                this.f106802i.setStrokeWidth(8.0f);
                this.f106799f.setStrokeWidth(8.0f);
                this.f106813t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, o> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (debugPath & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f106744g) + com.prism.gaia.server.accounts.b.f166434b0 + MotionLayout.this.q0();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f106801h);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f106798e);
            }
            for (o oVar : frameArrayList.values()) {
                int iQ = oVar.q();
                if (debugPath > 0 && iQ == 0) {
                    iQ = 1;
                }
                if (iQ != 0) {
                    this.f106810q = oVar.e(this.f106796c, this.f106795b);
                    if (iQ >= 1) {
                        int i10 = duration / 16;
                        float[] fArr = this.f106794a;
                        if (fArr == null || fArr.length != i10 * 2) {
                            this.f106794a = new float[i10 * 2];
                            this.f106797d = new Path();
                        }
                        float f10 = this.f106813t;
                        canvas.translate(f10, f10);
                        this.f106798e.setColor(1996488704);
                        this.f106802i.setColor(1996488704);
                        this.f106799f.setColor(1996488704);
                        this.f106800g.setColor(1996488704);
                        oVar.f(this.f106794a, i10);
                        b(canvas, iQ, this.f106810q, oVar);
                        this.f106798e.setColor(-21965);
                        this.f106799f.setColor(-2067046);
                        this.f106802i.setColor(-2067046);
                        this.f106800g.setColor(-13391360);
                        float f11 = -this.f106813t;
                        canvas.translate(f11, f11);
                        b(canvas, iQ, this.f106810q, oVar);
                        if (iQ == 5) {
                            j(canvas, oVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int mode, int keyFrames, o motionController) {
            if (mode == 4) {
                d(canvas);
            }
            if (mode == 2) {
                g(canvas);
            }
            if (mode == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, mode, keyFrames, motionController);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f106794a, this.f106798e);
        }

        public final void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f106810q; i10++) {
                int i11 = this.f106795b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 0) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f106794a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f106800g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f106800g);
        }

        public final void f(Canvas canvas, float x10, float y10) {
            float[] fArr = this.f106794a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float fMin = Math.min(f10, f12);
            float fMax = Math.max(f11, f13);
            float fMin2 = x10 - Math.min(f10, f12);
            float fMax2 = Math.max(f11, f13) - y10;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f12 - f10))) + 0.5d)) / 100.0f);
            m(str, this.f106801h);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f106811r.width() / 2)) + fMin, y10 - 20.0f, this.f106801h);
            canvas.drawLine(x10, y10, Math.min(f10, f12), y10, this.f106800g);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f13 - f11))) + 0.5d)) / 100.0f);
            m(str2, this.f106801h);
            canvas.drawText(str2, x10 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f106811r.height() / 2)), this.f106801h);
            canvas.drawLine(x10, y10, x10, Math.max(f11, f13), this.f106800g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f106794a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f106800g);
        }

        public final void h(Canvas canvas, float x10, float y10) {
            float[] fArr = this.f106794a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f10 - f12, f11 - f13);
            float f14 = f12 - f10;
            float f15 = f13 - f11;
            float f16 = (((y10 - f11) * f15) + ((x10 - f10) * f14)) / (fHypot * fHypot);
            float f17 = f10 + (f14 * f16);
            float f18 = (f16 * f15) + f11;
            Path path = new Path();
            path.moveTo(x10, y10);
            path.lineTo(f17, f18);
            float fHypot2 = (float) Math.hypot(f17 - x10, f18 - y10);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            m(str, this.f106801h);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f106811r.width() / 2), -20.0f, this.f106801h);
            canvas.drawLine(x10, y10, f17, f18, this.f106800g);
        }

        public final void i(Canvas canvas, float x10, float y10, int viewWidth, int viewHeight) {
            String str = "" + (((int) (((double) (((x10 - (viewWidth / 2)) * 100.0f) / (MotionLayout.this.getWidth() - viewWidth))) + 0.5d)) / 100.0f);
            m(str, this.f106801h);
            canvas.drawText(str, ((x10 / 2.0f) - (this.f106811r.width() / 2)) + 0.0f, y10 - 20.0f, this.f106801h);
            canvas.drawLine(x10, y10, Math.min(0.0f, 1.0f), y10, this.f106800g);
            String str2 = "" + (((int) (((double) (((y10 - (viewHeight / 2)) * 100.0f) / (MotionLayout.this.getHeight() - viewHeight))) + 0.5d)) / 100.0f);
            m(str2, this.f106801h);
            canvas.drawText(str2, 5.0f + x10, 0.0f - ((y10 / 2.0f) - (this.f106811r.height() / 2)), this.f106801h);
            canvas.drawLine(x10, y10, x10, Math.max(0.0f, 1.0f), this.f106800g);
        }

        public final void j(Canvas canvas, o motionController) {
            this.f106797d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                motionController.g(i10 / 50, this.f106803j, 0);
                Path path = this.f106797d;
                float[] fArr = this.f106803j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f106797d;
                float[] fArr2 = this.f106803j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f106797d;
                float[] fArr3 = this.f106803j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f106797d;
                float[] fArr4 = this.f106803j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f106797d.close();
            }
            this.f106798e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f106797d, this.f106798e);
            canvas.translate(-2.0f, -2.0f);
            this.f106798e.setColor(-65536);
            canvas.drawPath(this.f106797d, this.f106798e);
        }

        public final void k(Canvas canvas, int mode, int keyFrames, o motionController) {
            int width;
            int height;
            View view = motionController.f107190b;
            if (view != null) {
                width = view.getWidth();
                height = motionController.f107190b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i10 = 1; i10 < keyFrames - 1; i10++) {
                if (mode != 4 || this.f106795b[i10 - 1] != 0) {
                    float[] fArr = this.f106796c;
                    int i11 = i10 * 2;
                    float f10 = fArr[i11];
                    float f11 = fArr[i11 + 1];
                    this.f106797d.reset();
                    this.f106797d.moveTo(f10, f11 + 10.0f);
                    this.f106797d.lineTo(f10 + 10.0f, f11);
                    this.f106797d.lineTo(f10, f11 - 10.0f);
                    this.f106797d.lineTo(f10 - 10.0f, f11);
                    this.f106797d.close();
                    int i12 = i10 - 1;
                    motionController.w(i12);
                    if (mode == 4) {
                        int i13 = this.f106795b[i12];
                        if (i13 == 1) {
                            h(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i13 == 0) {
                            f(canvas, f10 - 0.0f, f11 - 0.0f);
                        } else if (i13 == 2) {
                            i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.f106797d, this.f106802i);
                    }
                    if (mode == 2) {
                        h(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (mode == 3) {
                        f(canvas, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (mode == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f106797d, this.f106802i);
                }
            }
            float[] fArr2 = this.f106794a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f106799f);
                float[] fArr3 = this.f106794a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f106799f);
            }
        }

        public final void l(Canvas canvas, float x12, float y12, float x22, float y22) {
            canvas.drawRect(x12, y12, x22, y22, this.f106800g);
            canvas.drawLine(x12, y12, x22, y22, this.f106800g);
        }

        public void m(String text, Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.f106811r);
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f106815a = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.d f106816b = new androidx.constraintlayout.core.widgets.d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f106817c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f106818d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f106819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f106820f;

        public h() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x012e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.h.a():void");
        }

        public final void b(int widthMeasureSpec, int heightMeasureSpec) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f106742f == motionLayout.s0()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f106816b;
                androidx.constraintlayout.widget.d dVar2 = this.f106818d;
                motionLayout2.resolveSystem(dVar, optimizationLevel, (dVar2 == null || dVar2.f107976d == 0) ? widthMeasureSpec : heightMeasureSpec, (dVar2 == null || dVar2.f107976d == 0) ? heightMeasureSpec : widthMeasureSpec);
                androidx.constraintlayout.widget.d dVar3 = this.f106817c;
                if (dVar3 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar4 = this.f106815a;
                    int i10 = dVar3.f107976d;
                    int i11 = i10 == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (i10 == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    motionLayout3.resolveSystem(dVar4, optimizationLevel, i11, widthMeasureSpec);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.d dVar5 = this.f106817c;
            if (dVar5 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar6 = this.f106815a;
                int i12 = dVar5.f107976d;
                motionLayout4.resolveSystem(dVar6, optimizationLevel, i12 == 0 ? widthMeasureSpec : heightMeasureSpec, i12 == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar7 = this.f106816b;
            androidx.constraintlayout.widget.d dVar8 = this.f106818d;
            int i13 = (dVar8 == null || dVar8.f107976d == 0) ? widthMeasureSpec : heightMeasureSpec;
            if (dVar8 == null || dVar8.f107976d == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            motionLayout5.resolveSystem(dVar7, optimizationLevel, i13, widthMeasureSpec);
        }

        public void c(androidx.constraintlayout.core.widgets.d src, androidx.constraintlayout.core.widgets.d dest) {
            ArrayList<ConstraintWidget> arrayListL2 = src.l2();
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(src, dest);
            dest.l2().clear();
            dest.n(src, map);
            int size = arrayListL2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                ConstraintWidget constraintWidget = arrayListL2.get(i11);
                i11++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                ConstraintWidget aVar = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f ? new androidx.constraintlayout.core.widgets.f() : constraintWidget2 instanceof androidx.constraintlayout.core.widgets.e ? new androidx.constraintlayout.core.widgets.e() : constraintWidget2 instanceof androidx.constraintlayout.core.widgets.h ? new androidx.constraintlayout.core.widgets.h() : constraintWidget2 instanceof InterfaceC5633a ? new C5634b() : new ConstraintWidget();
                dest.a(aVar);
                map.put(constraintWidget2, aVar);
            }
            int size2 = arrayListL2.size();
            while (i10 < size2) {
                ConstraintWidget constraintWidget3 = arrayListL2.get(i10);
                i10++;
                ConstraintWidget constraintWidget4 = constraintWidget3;
                map.get(constraintWidget4).n(constraintWidget4, map);
            }
        }

        @SuppressLint({"LogConditional"})
        public final void d(String title, androidx.constraintlayout.core.widgets.d c10) {
            View view = (View) c10.w();
            StringBuilder sbA = android.support.v4.media.f.a(title, C4.q.f17581a);
            sbA.append(C2377c.k(view));
            String string = sbA.toString();
            Log.v(MotionLayout.f106693M0, string + "  ========= " + c10);
            int size = c10.l2().size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = string + "[" + i10 + "] ";
                ConstraintWidget constraintWidget = c10.l2().get(i10);
                StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a((constraintWidget.f106177R.f106106f != null ? "T" : "_").concat(constraintWidget.f106181T.f106106f != null ? "B" : "_"));
                sbA2.append(constraintWidget.f106175Q.f106106f != null ? "L" : "_");
                StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(sbA2.toString());
                sbA3.append(constraintWidget.f106179S.f106106f != null ? "R" : "_");
                String string2 = sbA3.toString();
                View view2 = (View) constraintWidget.w();
                String strK = C2377c.k(view2);
                if (view2 instanceof TextView) {
                    StringBuilder sbA4 = android.support.v4.media.f.a(strK, "(");
                    sbA4.append((Object) ((TextView) view2).getText());
                    sbA4.append(")");
                    strK = sbA4.toString();
                }
                Log.v(MotionLayout.f106693M0, str + GlideException.a.f139488d + strK + C4.q.f17581a + constraintWidget + C4.q.f17581a + string2);
            }
            Log.v(MotionLayout.f106693M0, string + " done. ");
        }

        @SuppressLint({"LogConditional"})
        public final void e(String str, ConstraintLayout.LayoutParams params) {
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(C4.q.f17581a.concat(params.f107687t != -1 ? "SS" : "__"));
            sbA.append(params.f107685s != -1 ? "|SE" : "|__");
            StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(sbA.toString());
            sbA2.append(params.f107689u != -1 ? "|ES" : "|__");
            StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(sbA2.toString());
            sbA3.append(params.f107691v != -1 ? "|EE" : "|__");
            StringBuilder sbA4 = androidx.compose.runtime.changelist.a.a(sbA3.toString());
            sbA4.append(params.f107657e != -1 ? "|LL" : "|__");
            StringBuilder sbA5 = androidx.compose.runtime.changelist.a.a(sbA4.toString());
            sbA5.append(params.f107659f != -1 ? "|LR" : "|__");
            StringBuilder sbA6 = androidx.compose.runtime.changelist.a.a(sbA5.toString());
            sbA6.append(params.f107661g != -1 ? "|RL" : "|__");
            StringBuilder sbA7 = androidx.compose.runtime.changelist.a.a(sbA6.toString());
            sbA7.append(params.f107663h != -1 ? "|RR" : "|__");
            StringBuilder sbA8 = androidx.compose.runtime.changelist.a.a(sbA7.toString());
            sbA8.append(params.f107665i != -1 ? "|TT" : "|__");
            StringBuilder sbA9 = androidx.compose.runtime.changelist.a.a(sbA8.toString());
            sbA9.append(params.f107667j != -1 ? "|TB" : "|__");
            StringBuilder sbA10 = androidx.compose.runtime.changelist.a.a(sbA9.toString());
            sbA10.append(params.f107669k != -1 ? "|BT" : "|__");
            StringBuilder sbA11 = androidx.compose.runtime.changelist.a.a(sbA10.toString());
            sbA11.append(params.f107671l != -1 ? "|BB" : "|__");
            Log.v(MotionLayout.f106693M0, str + sbA11.toString());
        }

        @SuppressLint({"LogConditional"})
        public final void f(String str, ConstraintWidget child) {
            String strConcat;
            String strConcat2;
            String strConcat3;
            StringBuilder sb2 = new StringBuilder(C4.q.f17581a);
            ConstraintAnchor constraintAnchor = child.f106177R.f106106f;
            String strConcat4 = "__";
            if (constraintAnchor != null) {
                strConcat = "T".concat(constraintAnchor.f106105e == ConstraintAnchor.Type.TOP ? "T" : "B");
            } else {
                strConcat = "__";
            }
            sb2.append(strConcat);
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(sb2.toString());
            ConstraintAnchor constraintAnchor2 = child.f106181T.f106106f;
            if (constraintAnchor2 != null) {
                strConcat2 = "B".concat(constraintAnchor2.f106105e != ConstraintAnchor.Type.TOP ? "B" : "T");
            } else {
                strConcat2 = "__";
            }
            sbA.append(strConcat2);
            StringBuilder sbA2 = androidx.compose.runtime.changelist.a.a(sbA.toString());
            ConstraintAnchor constraintAnchor3 = child.f106175Q.f106106f;
            if (constraintAnchor3 != null) {
                strConcat3 = "L".concat(constraintAnchor3.f106105e == ConstraintAnchor.Type.LEFT ? "L" : "R");
            } else {
                strConcat3 = "__";
            }
            sbA2.append(strConcat3);
            StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(sbA2.toString());
            ConstraintAnchor constraintAnchor4 = child.f106179S.f106106f;
            if (constraintAnchor4 != null) {
                strConcat4 = "R".concat(constraintAnchor4.f106105e != ConstraintAnchor.Type.LEFT ? "R" : "L");
            }
            sbA3.append(strConcat4);
            Log.v(MotionLayout.f106693M0, str + sbA3.toString() + " ---  " + child);
        }

        public ConstraintWidget g(androidx.constraintlayout.core.widgets.d container, View view) {
            if (container.w() == view) {
                return container;
            }
            ArrayList<ConstraintWidget> arrayListL2 = container.l2();
            int size = arrayListL2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = arrayListL2.get(i10);
                if (constraintWidget.w() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void h(androidx.constraintlayout.core.widgets.d baseLayout, androidx.constraintlayout.widget.d start, androidx.constraintlayout.widget.d end) {
            this.f106817c = start;
            this.f106818d = end;
            this.f106815a = new androidx.constraintlayout.core.widgets.d();
            this.f106816b = new androidx.constraintlayout.core.widgets.d();
            this.f106815a.U2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.G2());
            this.f106816b.U2(((ConstraintLayout) MotionLayout.this).mLayoutWidget.G2());
            this.f106815a.p2();
            this.f106816b.p2();
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f106815a);
            c(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f106816b);
            if (MotionLayout.this.f106760o > 0.5d) {
                if (start != null) {
                    m(this.f106815a, start);
                }
                m(this.f106816b, end);
            } else {
                m(this.f106816b, end);
                if (start != null) {
                    m(this.f106815a, start);
                }
            }
            this.f106815a.Y2(MotionLayout.this.isRtl());
            this.f106815a.a3();
            this.f106816b.Y2(MotionLayout.this.isRtl());
            this.f106816b.a3();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar = this.f106815a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar.D1(dimensionBehaviour);
                    this.f106816b.D1(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f106815a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.Y1(dimensionBehaviour2);
                    this.f106816b.Y1(dimensionBehaviour2);
                }
            }
        }

        public boolean i(int startId, int endId) {
            return (startId == this.f106819e && endId == this.f106820f) ? false : true;
        }

        public void j(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f106745g0 = mode;
            motionLayout.f106747h0 = mode2;
            motionLayout.getOptimizationLevel();
            b(widthMeasureSpec, heightMeasureSpec);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(widthMeasureSpec, heightMeasureSpec);
                MotionLayout.this.f106737c0 = this.f106815a.m0();
                MotionLayout.this.f106739d0 = this.f106815a.D();
                MotionLayout.this.f106741e0 = this.f106816b.m0();
                MotionLayout.this.f106743f0 = this.f106816b.D();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f106735b0 = (motionLayout2.f106737c0 == motionLayout2.f106741e0 && motionLayout2.f106739d0 == motionLayout2.f106743f0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i10 = motionLayout3.f106737c0;
            int i11 = motionLayout3.f106739d0;
            int i12 = motionLayout3.f106745g0;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                i10 = (int) ((motionLayout3.f106749i0 * (motionLayout3.f106741e0 - i10)) + i10);
            }
            int i13 = i10;
            int i14 = motionLayout3.f106747h0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i11 = (int) ((motionLayout3.f106749i0 * (motionLayout3.f106743f0 - i11)) + i11);
            }
            MotionLayout.this.resolveMeasuredDimension(widthMeasureSpec, heightMeasureSpec, i13, i11, this.f106815a.P2() || this.f106816b.P2(), this.f106815a.N2() || this.f106816b.N2());
        }

        public void k() {
            j(MotionLayout.this.f106746h, MotionLayout.this.f106748i);
            MotionLayout.this.g1();
        }

        public void l(int startId, int endId) {
            this.f106819e = startId;
            this.f106820f = endId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void m(androidx.constraintlayout.core.widgets.d base, androidx.constraintlayout.widget.d cSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            int i10 = 0;
            sparseArray.put(0, base);
            sparseArray.put(MotionLayout.this.getId(), base);
            if (cSet != null && cSet.f107976d != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f106816b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            ArrayList<ConstraintWidget> arrayListL2 = base.l2();
            int size = arrayListL2.size();
            int i11 = 0;
            while (i11 < size) {
                ConstraintWidget constraintWidget = arrayListL2.get(i11);
                i11++;
                ConstraintWidget constraintWidget2 = constraintWidget;
                constraintWidget2.f1(true);
                sparseArray.put(((View) constraintWidget2.w()).getId(), constraintWidget2);
            }
            ArrayList<ConstraintWidget> arrayListL22 = base.l2();
            int size2 = arrayListL22.size();
            int i12 = 0;
            while (i12 < size2) {
                int i13 = i12 + 1;
                ConstraintWidget constraintWidget3 = arrayListL22.get(i12);
                View view = (View) constraintWidget3.w();
                cSet.u(view.getId(), layoutParams);
                constraintWidget3.c2(cSet.u0(view.getId()));
                constraintWidget3.y1(cSet.n0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cSet.s((ConstraintHelper) view, constraintWidget3, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).N();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, constraintWidget3, layoutParams, sparseArray);
                if (cSet.t0(view.getId()) == 1) {
                    constraintWidget3.b2(view.getVisibility());
                } else {
                    constraintWidget3.b2(cSet.s0(view.getId()));
                }
                i12 = i13;
            }
            ArrayList<ConstraintWidget> arrayListL23 = base.l2();
            int size3 = arrayListL23.size();
            while (i10 < size3) {
                ConstraintWidget constraintWidget4 = arrayListL23.get(i10);
                i10++;
                ConstraintWidget constraintWidget5 = constraintWidget4;
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.i) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) constraintWidget5.w();
                    InterfaceC5633a interfaceC5633a = (InterfaceC5633a) constraintWidget5;
                    constraintHelper.L(base, interfaceC5633a, sparseArray);
                    ((androidx.constraintlayout.core.widgets.i) interfaceC5633a).n2();
                }
            }
        }
    }

    public interface i {
        void a();

        float b(int id2);

        void c(MotionEvent event);

        void clear();

        float d();

        void e(int units, float maxVelocity);

        void f(int units);

        float g();

        float h(int id2);
    }

    public static class j implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static j f106822b = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f106823a;

        public static j i() {
            f106822b.f106823a = VelocityTracker.obtain();
            return f106822b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void a() {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f106823a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float b(int id2) {
            if (this.f106823a != null) {
                return b(id2);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void c(MotionEvent event) {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void clear() {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float d() {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void e(int units, float maxVelocity) {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public void f(int units) {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float g() {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
        public float h(int id2) {
            VelocityTracker velocityTracker = this.f106823a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id2);
            }
            return 0.0f;
        }
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f106824a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f106825b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f106826c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f106827d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f106828e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f106829f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f106830g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f106831h = "motion.EndState";

        public k() {
        }

        public void a() {
            int i10 = this.f106826c;
            if (i10 != -1 || this.f106827d != -1) {
                if (i10 == -1) {
                    MotionLayout.this.n1(this.f106827d);
                } else {
                    int i11 = this.f106827d;
                    if (i11 == -1) {
                        MotionLayout.this.setState(i10, -1, -1);
                    } else {
                        MotionLayout.this.b1(i10, i11);
                    }
                }
                MotionLayout.this.Z0(TransitionState.SETUP);
            }
            if (Float.isNaN(this.f106825b)) {
                if (Float.isNaN(this.f106824a)) {
                    return;
                }
                MotionLayout.this.V0(this.f106824a);
            } else {
                MotionLayout.this.W0(this.f106824a, this.f106825b);
                this.f106824a = Float.NaN;
                this.f106825b = Float.NaN;
                this.f106826c = -1;
                this.f106827d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f106824a);
            bundle.putFloat("motion.velocity", this.f106825b);
            bundle.putInt("motion.StartState", this.f106826c);
            bundle.putInt("motion.EndState", this.f106827d);
            return bundle;
        }

        public void c() {
            this.f106827d = MotionLayout.this.f106744g;
            MotionLayout motionLayout = MotionLayout.this;
            this.f106826c = motionLayout.f106740e;
            this.f106825b = motionLayout.x0();
            this.f106824a = MotionLayout.this.q0();
        }

        public void d(int endState) {
            this.f106827d = endState;
        }

        public void e(float progress) {
            this.f106824a = progress;
        }

        public void f(int startState) {
            this.f106826c = startState;
        }

        public void g(Bundle bundle) {
            this.f106824a = bundle.getFloat("motion.progress");
            this.f106825b = bundle.getFloat("motion.velocity");
            this.f106826c = bundle.getInt("motion.StartState");
            this.f106827d = bundle.getInt("motion.EndState");
        }

        public void h(float mVelocity) {
            this.f106825b = mVelocity;
        }
    }

    public interface l {
        void g(MotionLayout motionLayout, int startId, int endId, float progress);

        void j(MotionLayout motionLayout, int currentId);

        void k(MotionLayout motionLayout, int startId, int endId);

        void l(MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f106736c = null;
        this.f106738d = 0.0f;
        this.f106740e = -1;
        this.f106742f = -1;
        this.f106744g = -1;
        this.f106746h = 0;
        this.f106748i = 0;
        this.f106750j = true;
        this.f106752k = new HashMap<>();
        this.f106754l = 0L;
        this.f106756m = 1.0f;
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        this.f106764q = 0.0f;
        this.f106768s = false;
        this.f106770t = false;
        this.f106778x = 0;
        this.f106782z = false;
        this.f106705A = new C5733b();
        this.f106707B = new f();
        this.f106711D = true;
        this.f106717I = false;
        this.f106722N = false;
        this.f106723O = null;
        this.f106724P = null;
        this.f106725Q = null;
        this.f106726R = null;
        this.f106727S = 0;
        this.f106728T = -1L;
        this.f106729U = 0.0f;
        this.f106730V = 0;
        this.f106731W = 0.0f;
        this.f106733a0 = false;
        this.f106735b0 = false;
        this.f106751j0 = new C5566h();
        this.f106753k0 = false;
        this.f106757m0 = null;
        this.f106759n0 = null;
        this.f106761o0 = 0;
        this.f106763p0 = false;
        this.f106765q0 = 0;
        this.f106767r0 = new HashMap<>();
        this.f106775v0 = new Rect();
        this.f106777w0 = false;
        this.f106779x0 = TransitionState.UNDEFINED;
        this.f106781y0 = new h();
        this.f106783z0 = false;
        this.f106706A0 = new RectF();
        this.f106708B0 = null;
        this.f106710C0 = null;
        this.f106712D0 = new ArrayList<>();
        A0(null);
    }

    public static boolean v1(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f10 = velocity / maxAcceleration;
            return ((velocity * f10) - (((maxAcceleration * f10) * f10) / 2.0f)) + position > 1.0f;
        }
        float f11 = (-velocity) / maxAcceleration;
        return ((((maxAcceleration * f11) * f11) / 2.0f) + (velocity * f11)) + position < 0.0f;
    }

    public final void A0(AttributeSet attrs) {
        u uVar;
        f106695O0 = isInEditMode();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, g.m.lk);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.ok) {
                    this.f106732a = new u(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == g.m.nk) {
                    this.f106742f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == g.m.qk) {
                    this.f106764q = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f106768s = true;
                } else if (index == g.m.mk) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == g.m.rk) {
                    if (this.f106778x == 0) {
                        this.f106778x = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == g.m.pk) {
                    this.f106778x = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f106732a == null) {
                Log.e(f106693M0, "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f106732a = null;
            }
        }
        if (this.f106778x != 0) {
            P();
        }
        if (this.f106742f != -1 || (uVar = this.f106732a) == null) {
            return;
        }
        this.f106742f = uVar.N();
        this.f106740e = this.f106732a.N();
        this.f106744g = this.f106732a.u();
    }

    public boolean B0() {
        return this.f106777w0;
    }

    public boolean C0() {
        return this.f106763p0;
    }

    public boolean D0() {
        return this.f106750j;
    }

    public boolean E0(int viewTransitionId) {
        u uVar = this.f106732a;
        if (uVar != null) {
            return uVar.U(viewTransitionId);
        }
        return false;
    }

    public void F0(int id2) {
        if (!isAttachedToWindow()) {
            this.f106742f = id2;
        }
        if (this.f106740e == id2) {
            V0(0.0f);
        } else if (this.f106744g == id2) {
            V0(1.0f);
        } else {
            b1(id2, id2);
        }
    }

    public int G0(String id2) {
        u uVar = this.f106732a;
        if (uVar == null) {
            return 0;
        }
        return uVar.W(id2);
    }

    public i H0() {
        return j.i();
    }

    public void I0() {
        u uVar = this.f106732a;
        if (uVar == null) {
            return;
        }
        if (uVar.i(this, this.f106742f)) {
            requestLayout();
            return;
        }
        int i10 = this.f106742f;
        if (i10 != -1) {
            this.f106732a.f(this, i10);
        }
        if (this.f106732a.r0()) {
            this.f106732a.p0();
        }
    }

    public final void J0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if (this.f106772u == null && ((copyOnWriteArrayList = this.f106726R) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        int i10 = 0;
        this.f106733a0 = false;
        ArrayList<Integer> arrayList = this.f106712D0;
        int size = arrayList.size();
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            Integer num2 = num;
            l lVar = this.f106772u;
            if (lVar != null) {
                lVar.j(this, num2.intValue());
            }
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f106726R;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().j(this, num2.intValue());
                }
            }
        }
        this.f106712D0.clear();
    }

    @Deprecated
    public void K0() {
        Log.e(f106693M0, "This method is deprecated. Please call rebuildScene() instead.");
        L0();
    }

    public void L(l listener) {
        if (this.f106726R == null) {
            this.f106726R = new CopyOnWriteArrayList<>();
        }
        this.f106726R.add(listener);
    }

    public void L0() {
        this.f106781y0.k();
        invalidate();
    }

    public void M(float position) {
        if (this.f106732a == null) {
            return;
        }
        float f10 = this.f106760o;
        float f11 = this.f106758n;
        if (f10 != f11 && this.f106766r) {
            this.f106760o = f11;
        }
        float f12 = this.f106760o;
        if (f12 == position) {
            return;
        }
        this.f106782z = false;
        this.f106764q = position;
        this.f106756m = r0.t() / 1000.0f;
        V0(this.f106764q);
        this.f106734b = null;
        this.f106736c = this.f106732a.x();
        this.f106766r = false;
        this.f106754l = p0();
        this.f106768s = true;
        this.f106758n = f12;
        this.f106760o = f12;
        invalidate();
    }

    public boolean M0(l listener) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f106726R;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    public boolean N(int viewTransitionId, o motionController) {
        u uVar = this.f106732a;
        if (uVar != null) {
            return uVar.h(viewTransitionId, motionController);
        }
        return false;
    }

    @T(api = 17)
    public void N0(int id2, int duration) {
        this.f106763p0 = true;
        this.f106769s0 = getWidth();
        this.f106771t0 = getHeight();
        int rotation = getDisplay().getRotation();
        this.f106765q0 = (rotation + 1) % 4 <= (this.f106773u0 + 1) % 4 ? 2 : 1;
        this.f106773u0 = rotation;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C5736e c5736e = this.f106767r0.get(childAt);
            if (c5736e == null) {
                c5736e = new C5736e();
                this.f106767r0.put(childAt, c5736e);
            }
            c5736e.a(childAt);
        }
        this.f106740e = -1;
        this.f106744g = id2;
        this.f106732a.n0(-1, id2);
        this.f106781y0.h(this.mLayoutWidget, null, this.f106732a.o(this.f106744g));
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        invalidate();
        l1(new b());
        if (duration > 0) {
            this.f106756m = duration / 1000.0f;
        }
    }

    public final boolean O(View view, MotionEvent event, float offsetX, float offsetY) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean zOnTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        motionEventObtain.offsetLocation(offsetX, offsetY);
        if (this.f106710C0 == null) {
            this.f106710C0 = new Matrix();
        }
        matrix.invert(this.f106710C0);
        motionEventObtain.transform(this.f106710C0);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    public void O0(int id2) {
        if (j0() == -1) {
            n1(id2);
            return;
        }
        int[] iArr = this.f106759n0;
        if (iArr == null) {
            this.f106759n0 = new int[4];
        } else if (iArr.length <= this.f106761o0) {
            this.f106759n0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f106759n0;
        int i10 = this.f106761o0;
        this.f106761o0 = i10 + 1;
        iArr2[i10] = id2;
    }

    public final void P() {
        u uVar = this.f106732a;
        if (uVar == null) {
            Log.e(f106693M0, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iN = uVar.N();
        u uVar2 = this.f106732a;
        Q(iN, uVar2.o(uVar2.N()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ArrayList<u.b> arrayListS = this.f106732a.s();
        int size = arrayListS.size();
        int i10 = 0;
        while (i10 < size) {
            u.b bVar = arrayListS.get(i10);
            i10++;
            u.b bVar2 = bVar;
            if (bVar2 == this.f106732a.f107278c) {
                Log.v(f106693M0, "CHECK: CURRENT");
            }
            R(bVar2);
            int I10 = bVar2.I();
            int iB = bVar2.B();
            String strI = C2377c.i(getContext(), I10);
            String strI2 = C2377c.i(getContext(), iB);
            if (sparseIntArray.get(I10) == iB) {
                Log.e(f106693M0, "CHECK: two transitions with the same start and end " + strI + "->" + strI2);
            }
            if (sparseIntArray2.get(iB) == I10) {
                Log.e(f106693M0, "CHECK: you can't have reverse transitions" + strI + "->" + strI2);
            }
            sparseIntArray.put(I10, iB);
            sparseIntArray2.put(iB, I10);
            if (this.f106732a.o(I10) == null) {
                Log.e(f106693M0, " no such constraintSetStart " + strI);
            }
            if (this.f106732a.o(iB) == null) {
                Log.e(f106693M0, " no such constraintSetEnd " + strI);
            }
        }
    }

    public void P0(int debugMode) {
        this.f106778x = debugMode;
        invalidate();
    }

    public final void Q(int csetId, androidx.constraintlayout.widget.d set) {
        String strI = C2377c.i(getContext(), csetId);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            if (id2 == -1) {
                StringBuilder sbA = androidx.activity.result.i.a("CHECK: ", strI, " ALL VIEWS SHOULD HAVE ID's ");
                sbA.append(childAt.getClass().getName());
                sbA.append(" does not!");
                Log.w(f106693M0, sbA.toString());
            }
            if (set.k0(id2) == null) {
                StringBuilder sbA2 = androidx.activity.result.i.a("CHECK: ", strI, " NO CONSTRAINTS for ");
                sbA2.append(C2377c.k(childAt));
                Log.w(f106693M0, sbA2.toString());
            }
        }
        int[] iArrO0 = set.o0();
        for (int i11 = 0; i11 < iArrO0.length; i11++) {
            int i12 = iArrO0[i11];
            String strI2 = C2377c.i(getContext(), i12);
            if (findViewById(iArrO0[i11]) == null) {
                Log.w(f106693M0, "CHECK: " + strI + " NO View matches id " + strI2);
            }
            if (set.n0(i12) == -1) {
                Log.w(f106693M0, s.a("CHECK: ", strI, "(", strI2, ") no LAYOUT_HEIGHT"));
            }
            if (set.u0(i12) == -1) {
                Log.w(f106693M0, s.a("CHECK: ", strI, "(", strI2, ") no LAYOUT_HEIGHT"));
            }
        }
    }

    public void Q0(boolean delayedApply) {
        this.f106777w0 = delayedApply;
    }

    public final void R(u.b transition) {
        if (transition.I() == transition.B()) {
            Log.e(f106693M0, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void R0(boolean enabled) {
        this.f106750j = enabled;
    }

    public androidx.constraintlayout.widget.d S(int id2) {
        u uVar = this.f106732a;
        if (uVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.d dVarO = uVar.o(id2);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.I(dVarO);
        return dVar;
    }

    public void S0(float pos) {
        if (this.f106732a != null) {
            Z0(TransitionState.MOVING);
            Interpolator interpolatorX = this.f106732a.x();
            if (interpolatorX != null) {
                V0(interpolatorX.getInterpolation(pos));
                return;
            }
        }
        V0(pos);
    }

    public final void T() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.f106752k.get(childAt);
            if (oVar != null) {
                oVar.V(childAt);
            }
        }
    }

    public void T0(float progress) {
        ArrayList<MotionHelper> arrayList = this.f106724P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f106724P.get(i10).h(progress);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    public final void U() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.v(f106693M0, C4.q.f17581a + C2377c.g() + C4.q.f17581a + C2377c.k(this) + C4.q.f17581a + C2377c.i(getContext(), this.f106742f) + C4.q.f17581a + C2377c.k(childAt) + childAt.getLeft() + C4.q.f17581a + childAt.getTop());
        }
    }

    public void U0(float progress) {
        ArrayList<MotionHelper> arrayList = this.f106723O;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f106723O.get(i10).h(progress);
            }
        }
    }

    public void V(boolean disable) {
        u uVar = this.f106732a;
        if (uVar == null) {
            return;
        }
        uVar.k(disable);
    }

    public void V0(float pos) {
        if (pos < 0.0f || pos > 1.0f) {
            Log.w(f106693M0, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f106755l0 == null) {
                this.f106755l0 = new k();
            }
            this.f106755l0.e(pos);
            return;
        }
        if (pos <= 0.0f) {
            if (this.f106760o == 1.0f && this.f106742f == this.f106744g) {
                Z0(TransitionState.MOVING);
            }
            this.f106742f = this.f106740e;
            if (this.f106760o == 0.0f) {
                Z0(TransitionState.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.f106760o == 0.0f && this.f106742f == this.f106740e) {
                Z0(TransitionState.MOVING);
            }
            this.f106742f = this.f106744g;
            if (this.f106760o == 1.0f) {
                Z0(TransitionState.FINISHED);
            }
        } else {
            this.f106742f = -1;
            Z0(TransitionState.MOVING);
        }
        if (this.f106732a == null) {
            return;
        }
        this.f106766r = true;
        this.f106764q = pos;
        this.f106758n = pos;
        this.f106762p = -1L;
        this.f106754l = -1L;
        this.f106734b = null;
        this.f106768s = true;
        invalidate();
    }

    public void W(int transitionID, boolean enable) {
        u.b bVarU0 = u0(transitionID);
        if (enable) {
            bVarU0.Q(true);
            return;
        }
        u uVar = this.f106732a;
        if (bVarU0 == uVar.f107278c) {
            ArrayList arrayList = (ArrayList) uVar.Q(this.f106742f);
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                u.b bVar = (u.b) obj;
                if (bVar.K()) {
                    this.f106732a.f107278c = bVar;
                    break;
                }
            }
        }
        bVarU0.Q(false);
    }

    public void W0(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.f106755l0 == null) {
                this.f106755l0 = new k();
            }
            this.f106755l0.e(pos);
            this.f106755l0.h(velocity);
            return;
        }
        V0(pos);
        Z0(TransitionState.MOVING);
        this.f106738d = velocity;
        if (velocity != 0.0f) {
            M(velocity > 0.0f ? 1.0f : 0.0f);
        } else {
            if (pos == 0.0f || pos == 1.0f) {
                return;
            }
            M(pos > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void X(int viewTransitionId, boolean enable) {
        u uVar = this.f106732a;
        if (uVar != null) {
            uVar.l(viewTransitionId, enable);
        }
    }

    public void X0(u scene) {
        this.f106732a = scene;
        scene.m0(isRtl());
        L0();
    }

    public void Y(boolean start) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o oVar = this.f106752k.get(getChildAt(i10));
            if (oVar != null) {
                oVar.i(start);
            }
        }
    }

    public void Y0(int beginId) {
        if (isAttachedToWindow()) {
            this.f106742f = beginId;
            return;
        }
        if (this.f106755l0 == null) {
            this.f106755l0 = new k();
        }
        this.f106755l0.f(beginId);
        this.f106755l0.d(beginId);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ae, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Z(boolean r21) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Z(boolean):void");
    }

    public void Z0(TransitionState newState) {
        TransitionState transitionState = TransitionState.FINISHED;
        if (newState == transitionState && this.f106742f == -1) {
            return;
        }
        TransitionState transitionState2 = this.f106779x0;
        this.f106779x0 = newState;
        TransitionState transitionState3 = TransitionState.MOVING;
        if (transitionState2 == transitionState3 && newState == transitionState3) {
            b0();
        }
        int i10 = e.f106788a[transitionState2.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 && newState == transitionState) {
                c0();
                return;
            }
            return;
        }
        if (newState == transitionState3) {
            b0();
        }
        if (newState == transitionState) {
            c0();
        }
    }

    public final void a0() {
        boolean z10;
        float fSignum = Math.signum(this.f106764q - this.f106760o);
        long jP0 = p0();
        Interpolator interpolator = this.f106734b;
        float interpolation = this.f106760o + (!(interpolator instanceof C5733b) ? (((jP0 - this.f106762p) * fSignum) * 1.0E-9f) / this.f106756m : 0.0f);
        if (this.f106766r) {
            interpolation = this.f106764q;
        }
        if ((fSignum <= 0.0f || interpolation < this.f106764q) && (fSignum > 0.0f || interpolation > this.f106764q)) {
            z10 = false;
        } else {
            interpolation = this.f106764q;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            interpolation = this.f106782z ? interpolator.getInterpolation((jP0 - this.f106754l) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f106764q) || (fSignum <= 0.0f && interpolation <= this.f106764q)) {
            interpolation = this.f106764q;
        }
        this.f106749i0 = interpolation;
        int childCount = getChildCount();
        long jP02 = p0();
        Interpolator interpolator2 = this.f106736c;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            o oVar = this.f106752k.get(childAt);
            if (oVar != null) {
                oVar.L(childAt, f10, jP02, this.f106751j0);
            }
        }
        if (this.f106735b0) {
            requestLayout();
        }
    }

    public void a1(int transitionId) {
        if (this.f106732a != null) {
            u.b bVarU0 = u0(transitionId);
            this.f106740e = bVarU0.I();
            this.f106744g = bVarU0.B();
            if (!isAttachedToWindow()) {
                if (this.f106755l0 == null) {
                    this.f106755l0 = new k();
                }
                this.f106755l0.f(this.f106740e);
                this.f106755l0.d(this.f106744g);
                return;
            }
            int i10 = this.f106742f;
            float f10 = i10 == this.f106740e ? 0.0f : i10 == this.f106744g ? 1.0f : Float.NaN;
            this.f106732a.o0(bVarU0);
            this.f106781y0.h(this.mLayoutWidget, this.f106732a.o(this.f106740e), this.f106732a.o(this.f106744g));
            L0();
            if (this.f106760o != f10) {
                if (f10 == 0.0f) {
                    Y(true);
                    this.f106732a.o(this.f106740e).r(this);
                } else if (f10 == 1.0f) {
                    Y(false);
                    this.f106732a.o(this.f106744g).r(this);
                }
            }
            this.f106760o = Float.isNaN(f10) ? 0.0f : f10;
            if (!Float.isNaN(f10)) {
                V0(f10);
                return;
            }
            Log.v(f106693M0, C2377c.g() + " transitionToStart ");
            m1();
        }
    }

    public final void b0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f106772u == null && ((copyOnWriteArrayList = this.f106726R) == null || copyOnWriteArrayList.isEmpty())) || this.f106731W == this.f106758n) {
            return;
        }
        if (this.f106730V != -1) {
            CopyOnWriteArrayList<l> copyOnWriteArrayList2 = this.f106726R;
            if (copyOnWriteArrayList2 != null) {
                Iterator<l> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            this.f106733a0 = true;
        }
        this.f106730V = -1;
        float f10 = this.f106758n;
        this.f106731W = f10;
        l lVar = this.f106772u;
        if (lVar != null) {
            lVar.g(this, this.f106740e, this.f106744g, f10);
        }
        CopyOnWriteArrayList<l> copyOnWriteArrayList3 = this.f106726R;
        if (copyOnWriteArrayList3 != null) {
            Iterator<l> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().g(this, this.f106740e, this.f106744g, this.f106758n);
            }
        }
        this.f106733a0 = true;
    }

    public void b1(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.f106755l0 == null) {
                this.f106755l0 = new k();
            }
            this.f106755l0.f(beginId);
            this.f106755l0.d(endId);
            return;
        }
        u uVar = this.f106732a;
        if (uVar != null) {
            this.f106740e = beginId;
            this.f106744g = endId;
            uVar.n0(beginId, endId);
            this.f106781y0.h(this.mLayoutWidget, this.f106732a.o(beginId), this.f106732a.o(endId));
            L0();
            this.f106760o = 0.0f;
            m1();
        }
    }

    public void c0() {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        if ((this.f106772u != null || ((copyOnWriteArrayList = this.f106726R) != null && !copyOnWriteArrayList.isEmpty())) && this.f106730V == -1) {
            this.f106730V = this.f106742f;
            int iIntValue = !this.f106712D0.isEmpty() ? ((Integer) V1.a(this.f106712D0, 1)).intValue() : -1;
            int i10 = this.f106742f;
            if (iIntValue != i10 && i10 != -1) {
                this.f106712D0.add(Integer.valueOf(i10));
            }
        }
        J0();
        Runnable runnable = this.f106757m0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f106759n0;
        if (iArr == null || this.f106761o0 <= 0) {
            return;
        }
        n1(iArr[0]);
        int[] iArr2 = this.f106759n0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f106761o0--;
    }

    public void c1(u.b transition) {
        this.f106732a.o0(transition);
        Z0(TransitionState.SETUP);
        if (this.f106742f == this.f106732a.u()) {
            this.f106760o = 1.0f;
            this.f106758n = 1.0f;
            this.f106764q = 1.0f;
        } else {
            this.f106760o = 0.0f;
            this.f106758n = 0.0f;
            this.f106764q = 0.0f;
        }
        this.f106762p = transition.L(1) ? -1L : p0();
        int iN = this.f106732a.N();
        int iU = this.f106732a.u();
        if (iN == this.f106740e && iU == this.f106744g) {
            return;
        }
        this.f106740e = iN;
        this.f106744g = iU;
        this.f106732a.n0(iN, iU);
        this.f106781y0.h(this.mLayoutWidget, this.f106732a.o(this.f106740e), this.f106732a.o(this.f106744g));
        this.f106781y0.l(this.f106740e, this.f106744g);
        this.f106781y0.k();
        L0();
    }

    public final void d0(MotionLayout motionLayout, int mBeginState, int mEndState) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f106726R;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }

    public void d1(int milliseconds) {
        u uVar = this.f106732a;
        if (uVar == null) {
            Log.e(f106693M0, "MotionScene not defined");
        } else {
            uVar.k0(milliseconds);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C c10;
        ArrayList<MotionHelper> arrayList = this.f106725Q;
        int i10 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                MotionHelper motionHelper = arrayList.get(i11);
                i11++;
                motionHelper.getClass();
            }
        }
        Z(false);
        u uVar = this.f106732a;
        if (uVar != null && (c10 = uVar.f107294s) != null) {
            c10.d();
        }
        super.dispatchDraw(canvas);
        if (this.f106732a == null) {
            return;
        }
        if ((this.f106778x & 1) == 1 && !isInEditMode()) {
            this.f106727S++;
            long jP0 = p0();
            long j10 = this.f106728T;
            if (j10 != -1) {
                if (jP0 - j10 > 200000000) {
                    this.f106729U = ((int) ((this.f106727S / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f106727S = 0;
                    this.f106728T = jP0;
                }
            } else {
                this.f106728T = jP0;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sbA = androidx.compose.runtime.changelist.a.a(this.f106729U + " fps " + C2377c.m(this, this.f106740e, -1) + " -> ");
            sbA.append(C2377c.m(this, this.f106744g, -1));
            sbA.append(" (progress: ");
            sbA.append(((int) (q0() * 1000.0f)) / 10.0f);
            sbA.append(" ) state=");
            int i12 = this.f106742f;
            sbA.append(i12 == -1 ? AdError.UNDEFINED_DOMAIN : C2377c.m(this, i12, -1));
            String string = sbA.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f106778x > 1) {
            if (this.f106780y == null) {
                this.f106780y = new g();
            }
            this.f106780y.a(canvas, this.f106752k, this.f106732a.t(), this.f106778x);
        }
        ArrayList<MotionHelper> arrayList2 = this.f106725Q;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                MotionHelper motionHelper2 = arrayList2.get(i10);
                i10++;
                motionHelper2.getClass();
            }
        }
    }

    public void e0(int triggerId, boolean positive, float progress) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.f106726R;
        if (copyOnWriteArrayList != null) {
            Iterator<l> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }

    public void e1(l listener) {
        this.f106772u = listener;
    }

    public void f0(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        HashMap<View, o> map = this.f106752k;
        View viewById = getViewById(mTouchAnchorId);
        o oVar = map.get(viewById);
        if (oVar == null) {
            r.a("WARNING could not find view id ", viewById == null ? android.support.v4.media.c.a("", mTouchAnchorId) : viewById.getContext().getResources().getResourceName(mTouchAnchorId), f106693M0);
            return;
        }
        oVar.p(pos, locationX, locationY, mAnchorDpDt);
        float y10 = viewById.getY();
        this.f106774v = pos;
        this.f106776w = y10;
    }

    public void f1(Bundle bundle) {
        if (this.f106755l0 == null) {
            this.f106755l0 = new k();
        }
        this.f106755l0.g(bundle);
        if (isAttachedToWindow()) {
            this.f106755l0.a();
        }
    }

    public androidx.constraintlayout.widget.d g0(int id2) {
        u uVar = this.f106732a;
        if (uVar == null) {
            return null;
        }
        return uVar.o(id2);
    }

    public final void g1() {
        int childCount = getChildCount();
        this.f106781y0.a();
        this.f106768s = true;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            sparseArray.put(childAt.getId(), this.f106752k.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iM = this.f106732a.m();
        if (iM != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar = this.f106752k.get(getChildAt(i12));
                if (oVar != null) {
                    oVar.U(iM);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f106752k.size()];
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            o oVar2 = this.f106752k.get(getChildAt(i14));
            if (oVar2.k() != -1) {
                sparseBooleanArray.put(oVar2.k(), true);
                iArr[i13] = oVar2.k();
                i13++;
            }
        }
        if (this.f106725Q != null) {
            for (int i15 = 0; i15 < i13; i15++) {
                o oVar3 = this.f106752k.get(findViewById(iArr[i15]));
                if (oVar3 != null) {
                    this.f106732a.z(oVar3);
                }
            }
            ArrayList<MotionHelper> arrayList = this.f106725Q;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                MotionHelper motionHelper = arrayList.get(i16);
                i16++;
                motionHelper.b(this, this.f106752k);
            }
            for (int i17 = 0; i17 < i13; i17++) {
                o oVar4 = this.f106752k.get(findViewById(iArr[i17]));
                if (oVar4 != null) {
                    oVar4.a0(width, height, this.f106756m, p0());
                }
            }
        } else {
            for (int i18 = 0; i18 < i13; i18++) {
                o oVar5 = this.f106752k.get(findViewById(iArr[i18]));
                if (oVar5 != null) {
                    this.f106732a.z(oVar5);
                    oVar5.a0(width, height, this.f106756m, p0());
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            o oVar6 = this.f106752k.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && oVar6 != null) {
                this.f106732a.z(oVar6);
                oVar6.a0(width, height, this.f106756m, p0());
            }
        }
        float fM = this.f106732a.M();
        if (fM != 0.0f) {
            boolean z10 = ((double) fM) < 0.0d;
            float fAbs = Math.abs(fM);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i20 = 0; i20 < childCount; i20++) {
                o oVar7 = this.f106752k.get(getChildAt(i20));
                if (!Float.isNaN(oVar7.f107201m)) {
                    for (int i21 = 0; i21 < childCount; i21++) {
                        o oVar8 = this.f106752k.get(getChildAt(i21));
                        if (!Float.isNaN(oVar8.f107201m)) {
                            fMin = Math.min(fMin, oVar8.f107201m);
                            fMax = Math.max(fMax, oVar8.f107201m);
                        }
                    }
                    while (i10 < childCount) {
                        o oVar9 = this.f106752k.get(getChildAt(i10));
                        if (!Float.isNaN(oVar9.f107201m)) {
                            oVar9.f107203o = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                oVar9.f107202n = fAbs - (((fMax - oVar9.f107201m) / (fMax - fMin)) * fAbs);
                            } else {
                                oVar9.f107202n = fAbs - (((oVar9.f107201m - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i10++;
                    }
                    return;
                }
                float fT = oVar7.t();
                float fU = oVar7.u();
                float f10 = z10 ? fU - fT : fU + fT;
                fMin2 = Math.min(fMin2, f10);
                fMax2 = Math.max(fMax2, f10);
            }
            while (i10 < childCount) {
                o oVar10 = this.f106752k.get(getChildAt(i10));
                float fT2 = oVar10.t();
                float fU2 = oVar10.u();
                float f11 = z10 ? fU2 - fT2 : fU2 + fT2;
                oVar10.f107203o = 1.0f / (1.0f - fAbs);
                oVar10.f107202n = fAbs - (((f11 - fMin2) * fAbs) / (fMax2 - fMin2));
                i10++;
            }
        }
    }

    public int[] h0() {
        u uVar = this.f106732a;
        if (uVar == null) {
            return null;
        }
        return uVar.r();
    }

    public final Rect h1(ConstraintWidget cw) {
        this.f106775v0.top = cw.p0();
        this.f106775v0.left = cw.o0();
        Rect rect = this.f106775v0;
        int iM0 = cw.m0();
        Rect rect2 = this.f106775v0;
        rect.right = iM0 + rect2.left;
        int iD = cw.D();
        Rect rect3 = this.f106775v0;
        rect2.bottom = iD + rect3.top;
        return rect3;
    }

    public String i0(int id2) {
        u uVar = this.f106732a;
        if (uVar == null) {
            return null;
        }
        return uVar.X(id2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i1(int r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.i1(int, float, float):void");
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public int j0() {
        return this.f106742f;
    }

    public void j1(float position, float currentVelocity) {
        if (this.f106732a == null || this.f106760o == position) {
            return;
        }
        this.f106782z = true;
        this.f106754l = p0();
        this.f106756m = this.f106732a.t() / 1000.0f;
        this.f106764q = position;
        this.f106768s = true;
        this.f106705A.f(this.f106760o, position, currentVelocity, this.f106732a.J(), this.f106732a.K(), this.f106732a.I(), this.f106732a.L(), this.f106732a.H());
        int i10 = this.f106742f;
        this.f106764q = position;
        this.f106742f = i10;
        this.f106734b = this.f106705A;
        this.f106766r = false;
        this.f106754l = p0();
        invalidate();
    }

    public void k0(boolean showPaths) {
        this.f106778x = showPaths ? 2 : 1;
        invalidate();
    }

    public void k1() {
        M(1.0f);
        this.f106757m0 = null;
    }

    public ArrayList<u.b> l0() {
        u uVar = this.f106732a;
        if (uVar == null) {
            return null;
        }
        return uVar.s();
    }

    public void l1(Runnable onComplete) {
        M(1.0f);
        this.f106757m0 = onComplete;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int motionScene) {
        u.b bVar;
        if (motionScene == 0) {
            this.f106732a = null;
            return;
        }
        try {
            u uVar = new u(getContext(), this, motionScene);
            this.f106732a = uVar;
            if (this.f106742f == -1) {
                this.f106742f = uVar.N();
                this.f106740e = this.f106732a.N();
                this.f106744g = this.f106732a.u();
            }
            if (!isAttachedToWindow()) {
                this.f106732a = null;
                return;
            }
            try {
                Display display = getDisplay();
                int i10 = 0;
                this.f106773u0 = display == null ? 0 : display.getRotation();
                u uVar2 = this.f106732a;
                if (uVar2 != null) {
                    androidx.constraintlayout.widget.d dVarO = uVar2.o(this.f106742f);
                    this.f106732a.h0(this);
                    ArrayList<MotionHelper> arrayList = this.f106725Q;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            MotionHelper motionHelper = arrayList.get(i10);
                            i10++;
                            motionHelper.getClass();
                        }
                    }
                    if (dVarO != null) {
                        dVarO.r(this);
                    }
                    this.f106740e = this.f106742f;
                }
                I0();
                k kVar = this.f106755l0;
                if (kVar != null) {
                    if (this.f106777w0) {
                        post(new a());
                        return;
                    } else {
                        kVar.a();
                        return;
                    }
                }
                u uVar3 = this.f106732a;
                if (uVar3 == null || (bVar = uVar3.f107278c) == null || bVar.z() != 4) {
                    return;
                }
                k1();
                Z0(TransitionState.SETUP);
                Z0(TransitionState.MOVING);
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    public androidx.constraintlayout.motion.widget.d m0() {
        if (this.f106709C == null) {
            this.f106709C = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.f106709C;
    }

    public void m1() {
        M(0.0f);
    }

    public int n0() {
        return this.f106744g;
    }

    public void n1(int id2) {
        if (isAttachedToWindow()) {
            p1(id2, -1, -1);
            return;
        }
        if (this.f106755l0 == null) {
            this.f106755l0 = new k();
        }
        this.f106755l0.d(id2);
    }

    public o o0(int mTouchAnchorId) {
        return this.f106752k.get(findViewById(mTouchAnchorId));
    }

    public void o1(int id2, int duration) {
        if (isAttachedToWindow()) {
            q1(id2, -1, -1, duration);
            return;
        }
        if (this.f106755l0 == null) {
            this.f106755l0 = new k();
        }
        this.f106755l0.d(id2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        u.b bVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f106773u0 = display.getRotation();
        }
        u uVar = this.f106732a;
        if (uVar != null && (i10 = this.f106742f) != -1) {
            androidx.constraintlayout.widget.d dVarO = uVar.o(i10);
            this.f106732a.h0(this);
            ArrayList<MotionHelper> arrayList = this.f106725Q;
            if (arrayList != null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    MotionHelper motionHelper = arrayList.get(i11);
                    i11++;
                    motionHelper.getClass();
                }
            }
            if (dVarO != null) {
                dVarO.r(this);
            }
            this.f106740e = this.f106742f;
        }
        I0();
        k kVar = this.f106755l0;
        if (kVar != null) {
            if (this.f106777w0) {
                post(new d());
                return;
            } else {
                kVar.a();
                return;
            }
        }
        u uVar2 = this.f106732a;
        if (uVar2 == null || (bVar = uVar2.f107278c) == null || bVar.z() != 4) {
            return;
        }
        k1();
        Z0(TransitionState.SETUP);
        Z0(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        x xVarJ;
        int iS;
        RectF rectFR;
        u uVar = this.f106732a;
        if (uVar == null || !this.f106750j) {
            return false;
        }
        C c10 = uVar.f107294s;
        if (c10 != null) {
            c10.l(event);
        }
        u.b bVar = this.f106732a.f107278c;
        if (bVar == null || !bVar.K() || (xVarJ = bVar.J()) == null) {
            return false;
        }
        if ((event.getAction() == 0 && (rectFR = xVarJ.r(this, new RectF())) != null && !rectFR.contains(event.getX(), event.getY())) || (iS = xVarJ.s()) == -1) {
            return false;
        }
        View view = this.f106708B0;
        if (view == null || view.getId() != iS) {
            this.f106708B0 = findViewById(iS);
        }
        if (this.f106708B0 == null) {
            return false;
        }
        this.f106706A0.set(r0.getLeft(), this.f106708B0.getTop(), this.f106708B0.getRight(), this.f106708B0.getBottom());
        if (!this.f106706A0.contains(event.getX(), event.getY()) || z0(this.f106708B0.getLeft(), this.f106708B0.getTop(), this.f106708B0, event)) {
            return false;
        }
        return onTouchEvent(event);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) throws Throwable {
        MotionLayout motionLayout;
        this.f106753k0 = true;
        try {
            if (this.f106732a == null) {
                super.onLayout(changed, left, top, right, bottom);
                this.f106753k0 = false;
                return;
            }
            motionLayout = this;
            int i10 = right - left;
            int i11 = bottom - top;
            try {
                if (motionLayout.f106715G != i10 || motionLayout.f106716H != i11) {
                    L0();
                    Z(true);
                }
                motionLayout.f106715G = i10;
                motionLayout.f106716H = i11;
                motionLayout.f106713E = i10;
                motionLayout.f106714F = i11;
                motionLayout.f106753k0 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.f106753k0 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f106732a == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.f106746h == widthMeasureSpec && this.f106748i == heightMeasureSpec) ? false : true;
        if (this.f106783z0) {
            this.f106783z0 = false;
            I0();
            J0();
            z11 = true;
        }
        if (this.mDirtyHierarchy) {
            z11 = true;
        }
        this.f106746h = widthMeasureSpec;
        this.f106748i = heightMeasureSpec;
        int iN = this.f106732a.N();
        int iU = this.f106732a.u();
        if ((z11 || this.f106781y0.i(iN, iU)) && this.f106740e != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.f106781y0.h(this.mLayoutWidget, this.f106732a.o(iN), this.f106732a.o(iU));
            this.f106781y0.k();
            this.f106781y0.l(iN, iU);
        } else {
            if (z11) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z10 = true;
        }
        if (this.f106735b0 || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iM0 = this.mLayoutWidget.m0() + getPaddingRight() + getPaddingLeft();
            int iD = this.mLayoutWidget.D() + paddingBottom;
            int i10 = this.f106745g0;
            if (i10 == Integer.MIN_VALUE || i10 == 0) {
                iM0 = (int) ((this.f106749i0 * (this.f106741e0 - r8)) + this.f106737c0);
                requestLayout();
            }
            int i11 = this.f106747h0;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                iD = (int) ((this.f106749i0 * (this.f106743f0 - r9)) + this.f106739d0);
                requestLayout();
            }
            setMeasuredDimension(iM0, iD);
        }
        a0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public boolean onNestedFling(@NonNull View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC2444c0
    public boolean onNestedPreFling(@NonNull View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedPreScroll(@NonNull View target, int dx, int dy, @NonNull int[] consumed, int type) {
        u.b bVar;
        x xVarJ;
        int iS;
        u uVar = this.f106732a;
        if (uVar == null || (bVar = uVar.f107278c) == null || !bVar.K()) {
            return;
        }
        int i10 = -1;
        if (!bVar.K() || (xVarJ = bVar.J()) == null || (iS = xVarJ.s()) == -1 || target.getId() == iS) {
            if (uVar.D()) {
                x xVarJ2 = bVar.J();
                if (xVarJ2 != null && (xVarJ2.f() & 4) != 0) {
                    i10 = dy;
                }
                float f10 = this.f106758n;
                if ((f10 == 1.0f || f10 == 0.0f) && target.canScrollVertically(i10)) {
                    return;
                }
            }
            if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                float F10 = uVar.F(dx, dy);
                float f11 = this.f106760o;
                if ((f11 <= 0.0f && F10 < 0.0f) || (f11 >= 1.0f && F10 > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new c(this, target));
                    return;
                }
            }
            float f12 = this.f106758n;
            long jP0 = p0();
            float f13 = dx;
            this.f106718J = f13;
            float f14 = dy;
            this.f106719K = f14;
            this.f106721M = (float) ((jP0 - this.f106720L) * 1.0E-9d);
            this.f106720L = jP0;
            uVar.d0(f13, f14);
            if (f12 != this.f106758n) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            Z(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.f106717I = true;
        }
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onNestedScrollAccepted(@NonNull View child, @NonNull View target, int axes, int type) {
        this.f106720L = p0();
        this.f106721M = 0.0f;
        this.f106718J = 0.0f;
        this.f106719K = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        u uVar = this.f106732a;
        if (uVar != null) {
            uVar.m0(isRtl());
        }
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public boolean onStartNestedScroll(@NonNull View child, @NonNull View target, int axes, int type) {
        u.b bVar;
        u uVar = this.f106732a;
        return (uVar == null || (bVar = uVar.f107278c) == null || bVar.J() == null || (this.f106732a.f107278c.J().f() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC2438a0
    public void onStopNestedScroll(@NonNull View target, int type) {
        u uVar = this.f106732a;
        if (uVar != null) {
            float f10 = this.f106721M;
            if (f10 == 0.0f) {
                return;
            }
            uVar.e0(this.f106718J / f10, this.f106719K / f10);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        u uVar = this.f106732a;
        if (uVar == null || !this.f106750j || !uVar.r0()) {
            return super.onTouchEvent(event);
        }
        u.b bVar = this.f106732a.f107278c;
        if (bVar != null && !bVar.K()) {
            return super.onTouchEvent(event);
        }
        this.f106732a.f0(event, j0(), this);
        if (this.f106732a.f107278c.L(4)) {
            return this.f106732a.f107278c.J().t();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f106726R == null) {
                this.f106726R = new CopyOnWriteArrayList<>();
            }
            this.f106726R.add(motionHelper);
            if (motionHelper.d()) {
                if (this.f106723O == null) {
                    this.f106723O = new ArrayList<>();
                }
                this.f106723O.add(motionHelper);
            }
            if (motionHelper.e()) {
                if (this.f106724P == null) {
                    this.f106724P = new ArrayList<>();
                }
                this.f106724P.add(motionHelper);
            }
            if (motionHelper.f()) {
                if (this.f106725Q == null) {
                    this.f106725Q = new ArrayList<>();
                }
                this.f106725Q.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f106723O;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f106724P;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public long p0() {
        return System.nanoTime();
    }

    public void p1(int id2, int screenWidth, int screenHeight) {
        q1(id2, screenWidth, screenHeight, -1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int id2) {
        this.mConstraintLayoutSpec = null;
    }

    public float q0() {
        return this.f106760o;
    }

    public void q1(int id2, int screenWidth, int screenHeight, int duration) {
        androidx.constraintlayout.widget.i iVar;
        int iA;
        u uVar = this.f106732a;
        if (uVar != null && (iVar = uVar.f107277b) != null && (iA = iVar.a(this.f106742f, id2, screenWidth, screenHeight)) != -1) {
            id2 = iA;
        }
        int i10 = this.f106742f;
        if (i10 == id2) {
            return;
        }
        if (this.f106740e == id2) {
            M(0.0f);
            if (duration > 0) {
                this.f106756m = duration / 1000.0f;
                return;
            }
            return;
        }
        if (this.f106744g == id2) {
            M(1.0f);
            if (duration > 0) {
                this.f106756m = duration / 1000.0f;
                return;
            }
            return;
        }
        this.f106744g = id2;
        if (i10 != -1) {
            b1(i10, id2);
            M(1.0f);
            this.f106760o = 0.0f;
            k1();
            if (duration > 0) {
                this.f106756m = duration / 1000.0f;
                return;
            }
            return;
        }
        this.f106782z = false;
        this.f106764q = 1.0f;
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        this.f106762p = p0();
        this.f106754l = p0();
        this.f106766r = false;
        this.f106734b = null;
        if (duration == -1) {
            this.f106756m = this.f106732a.t() / 1000.0f;
        }
        this.f106740e = -1;
        this.f106732a.n0(-1, this.f106744g);
        SparseArray sparseArray = new SparseArray();
        if (duration == 0) {
            this.f106756m = this.f106732a.t() / 1000.0f;
        } else if (duration > 0) {
            this.f106756m = duration / 1000.0f;
        }
        int childCount = getChildCount();
        this.f106752k.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            this.f106752k.put(childAt, new o(childAt));
            sparseArray.put(childAt.getId(), this.f106752k.get(childAt));
        }
        this.f106768s = true;
        this.f106781y0.h(this.mLayoutWidget, null, this.f106732a.o(id2));
        L0();
        this.f106781y0.a();
        T();
        int width = getWidth();
        int height = getHeight();
        if (this.f106725Q != null) {
            for (int i12 = 0; i12 < childCount; i12++) {
                o oVar = this.f106752k.get(getChildAt(i12));
                if (oVar != null) {
                    this.f106732a.z(oVar);
                }
            }
            ArrayList<MotionHelper> arrayList = this.f106725Q;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                MotionHelper motionHelper = arrayList.get(i13);
                i13++;
                motionHelper.b(this, this.f106752k);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                o oVar2 = this.f106752k.get(getChildAt(i14));
                if (oVar2 != null) {
                    oVar2.a0(width, height, this.f106756m, p0());
                }
            }
        } else {
            for (int i15 = 0; i15 < childCount; i15++) {
                o oVar3 = this.f106752k.get(getChildAt(i15));
                if (oVar3 != null) {
                    this.f106732a.z(oVar3);
                    oVar3.a0(width, height, this.f106756m, p0());
                }
            }
        }
        float fM = this.f106732a.M();
        if (fM != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i16 = 0; i16 < childCount; i16++) {
                o oVar4 = this.f106752k.get(getChildAt(i16));
                float fU = oVar4.u() + oVar4.t();
                fMin = Math.min(fMin, fU);
                fMax = Math.max(fMax, fU);
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                o oVar5 = this.f106752k.get(getChildAt(i17));
                float fT = oVar5.t();
                float fU2 = oVar5.u();
                oVar5.f107203o = 1.0f / (1.0f - fM);
                oVar5.f107202n = fM - ((((fT + fU2) - fMin) * fM) / (fMax - fMin));
            }
        }
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        this.f106768s = true;
        invalidate();
    }

    public u r0() {
        return this.f106732a;
    }

    public void r1() {
        this.f106781y0.h(this.mLayoutWidget, this.f106732a.o(this.f106740e), this.f106732a.o(this.f106744g));
        L0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        u uVar;
        u.b bVar;
        if (!this.f106735b0 && this.f106742f == -1 && (uVar = this.f106732a) != null && (bVar = uVar.f107278c) != null) {
            int iE = bVar.E();
            if (iE == 0) {
                return;
            }
            if (iE == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    this.f106752k.get(getChildAt(i10)).P();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public int s0() {
        return this.f106740e;
    }

    public void s1(int stateId, androidx.constraintlayout.widget.d set) {
        u uVar = this.f106732a;
        if (uVar != null) {
            uVar.j0(stateId, set);
        }
        r1();
        if (this.f106742f == stateId) {
            set.r(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int id2, int screenWidth, int screenHeight) {
        Z0(TransitionState.SETUP);
        this.f106742f = id2;
        this.f106740e = -1;
        this.f106744g = -1;
        androidx.constraintlayout.widget.a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.e(id2, screenWidth, screenHeight);
            return;
        }
        u uVar = this.f106732a;
        if (uVar != null) {
            uVar.o(id2).r(this);
        }
    }

    public float t0() {
        return this.f106764q;
    }

    public void t1(int stateId, androidx.constraintlayout.widget.d set, int duration) {
        if (this.f106732a != null && this.f106742f == stateId) {
            int i10 = g.C0275g.f109179N3;
            s1(i10, g0(stateId));
            setState(i10, -1, -1);
            s1(stateId, set);
            u.b bVar = new u.b(-1, this.f106732a, i10, stateId);
            bVar.O(duration);
            c1(bVar);
            k1();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return C2377c.i(context, this.f106740e) + "->" + C2377c.i(context, this.f106744g) + " (pos:" + this.f106760o + " Dpos/Dt:" + this.f106738d;
    }

    public u.b u0(int id2) {
        return this.f106732a.O(id2);
    }

    public void u1(int viewTransitionId, View... view) {
        u uVar = this.f106732a;
        if (uVar != null) {
            uVar.t0(viewTransitionId, view);
        } else {
            Log.e(f106693M0, " no motionScene");
        }
    }

    public Bundle v0() {
        if (this.f106755l0 == null) {
            this.f106755l0 = new k();
        }
        this.f106755l0.c();
        return this.f106755l0.b();
    }

    public long w0() {
        if (this.f106732a != null) {
            this.f106756m = r0.t() / 1000.0f;
        }
        return (long) (this.f106756m * 1000.0f);
    }

    public float x0() {
        return this.f106738d;
    }

    public void y0(View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float interpolation;
        float[] fArr;
        float fA = this.f106738d;
        float f10 = this.f106760o;
        if (this.f106734b != null) {
            float fSignum = Math.signum(this.f106764q - f10);
            float interpolation2 = this.f106734b.getInterpolation(this.f106760o + 1.0E-5f);
            interpolation = this.f106734b.getInterpolation(this.f106760o);
            fA = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / this.f106756m;
        } else {
            interpolation = f10;
        }
        Interpolator interpolator = this.f106734b;
        if (interpolator instanceof q) {
            fA = ((q) interpolator).a();
        }
        o oVar = this.f106752k.get(view);
        if ((type & 1) == 0) {
            fArr = returnVelocity;
            oVar.C(interpolation, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, fArr);
        } else {
            fArr = returnVelocity;
            oVar.p(interpolation, posOnViewX, posOnViewY, fArr);
        }
        if (type < 2) {
            fArr[0] = fArr[0] * fA;
            fArr[1] = fArr[1] * fA;
        }
    }

    public final boolean z0(float x10, float y10, View view, MotionEvent event) {
        boolean z10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (z0((r3.getLeft() + x10) - view.getScrollX(), (r3.getTop() + y10) - view.getScrollY(), viewGroup.getChildAt(childCount), event)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f106706A0.set(x10, y10, (view.getRight() + x10) - view.getLeft(), (view.getBottom() + y10) - view.getTop());
            if ((event.getAction() != 0 || this.f106706A0.contains(event.getX(), event.getY())) && O(view, event, -x10, -y10)) {
                return true;
            }
        }
        return z10;
    }

    @Override // androidx.core.view.InterfaceC2441b0
    public void onNestedScroll(@NonNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.f106717I || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.f106717I = false;
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f106736c = null;
        this.f106738d = 0.0f;
        this.f106740e = -1;
        this.f106742f = -1;
        this.f106744g = -1;
        this.f106746h = 0;
        this.f106748i = 0;
        this.f106750j = true;
        this.f106752k = new HashMap<>();
        this.f106754l = 0L;
        this.f106756m = 1.0f;
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        this.f106764q = 0.0f;
        this.f106768s = false;
        this.f106770t = false;
        this.f106778x = 0;
        this.f106782z = false;
        this.f106705A = new C5733b();
        this.f106707B = new f();
        this.f106711D = true;
        this.f106717I = false;
        this.f106722N = false;
        this.f106723O = null;
        this.f106724P = null;
        this.f106725Q = null;
        this.f106726R = null;
        this.f106727S = 0;
        this.f106728T = -1L;
        this.f106729U = 0.0f;
        this.f106730V = 0;
        this.f106731W = 0.0f;
        this.f106733a0 = false;
        this.f106735b0 = false;
        this.f106751j0 = new C5566h();
        this.f106753k0 = false;
        this.f106757m0 = null;
        this.f106759n0 = null;
        this.f106761o0 = 0;
        this.f106763p0 = false;
        this.f106765q0 = 0;
        this.f106767r0 = new HashMap<>();
        this.f106775v0 = new Rect();
        this.f106777w0 = false;
        this.f106779x0 = TransitionState.UNDEFINED;
        this.f106781y0 = new h();
        this.f106783z0 = false;
        this.f106706A0 = new RectF();
        this.f106708B0 = null;
        this.f106710C0 = null;
        this.f106712D0 = new ArrayList<>();
        A0(attrs);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f106736c = null;
        this.f106738d = 0.0f;
        this.f106740e = -1;
        this.f106742f = -1;
        this.f106744g = -1;
        this.f106746h = 0;
        this.f106748i = 0;
        this.f106750j = true;
        this.f106752k = new HashMap<>();
        this.f106754l = 0L;
        this.f106756m = 1.0f;
        this.f106758n = 0.0f;
        this.f106760o = 0.0f;
        this.f106764q = 0.0f;
        this.f106768s = false;
        this.f106770t = false;
        this.f106778x = 0;
        this.f106782z = false;
        this.f106705A = new C5733b();
        this.f106707B = new f();
        this.f106711D = true;
        this.f106717I = false;
        this.f106722N = false;
        this.f106723O = null;
        this.f106724P = null;
        this.f106725Q = null;
        this.f106726R = null;
        this.f106727S = 0;
        this.f106728T = -1L;
        this.f106729U = 0.0f;
        this.f106730V = 0;
        this.f106731W = 0.0f;
        this.f106733a0 = false;
        this.f106735b0 = false;
        this.f106751j0 = new C5566h();
        this.f106753k0 = false;
        this.f106757m0 = null;
        this.f106759n0 = null;
        this.f106761o0 = 0;
        this.f106763p0 = false;
        this.f106765q0 = 0;
        this.f106767r0 = new HashMap<>();
        this.f106775v0 = new Rect();
        this.f106777w0 = false;
        this.f106779x0 = TransitionState.UNDEFINED;
        this.f106781y0 = new h();
        this.f106783z0 = false;
        this.f106706A0 = new RectF();
        this.f106708B0 = null;
        this.f106710C0 = null;
        this.f106712D0 = new ArrayList<>();
        A0(attrs);
    }
}
