package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import i.C4541d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import s0.AbstractC5561c;
import s0.C5560b;
import s0.C5563e;
import s0.C5566h;
import s0.G;
import w0.AbstractC5734c;
import w0.AbstractC5735d;
import w0.AbstractC5737f;
import w0.C5732a;
import w0.C5736e;

/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f107149N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f107150O = 1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f107151P = 2;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f107152Q = 3;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f107153R = 4;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f107154S = 5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f107155T = 0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f107156U = 1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f107157V = 2;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f107158W = 3;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f107159X = 4;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f107160Y = 5;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f107161Z = 6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f107162a0 = 1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f107163b0 = 2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f107164c0 = "MotionController";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final boolean f107165d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final boolean f107166e0 = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f107167f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f107168g0 = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f107169h0 = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f107170i0 = 3;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f107171j0 = 4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f107172k0 = 5;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f107173l0 = -1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f107174m0 = -2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f107175n0 = -3;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HashMap<String, AbstractC5737f> f107177B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public HashMap<String, AbstractC5735d> f107178C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public HashMap<String, AbstractC5734c> f107179D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public m[] f107180E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f107181F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f107182G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f107183H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f107184I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f107185J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Interpolator f107186K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f107187L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String[] f107188M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f107190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107191c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f107193e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC5561c[] f107199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC5561c f107200l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f107204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f107205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f107206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double[] f107207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double[] f107208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f107209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f107210v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f107189a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107192d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107194f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f107195g = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f107196h = new t();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f107197i = new n();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f107198j = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f107201m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f107202n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f107203o = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f107211w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float[] f107212x = new float[4];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList<t> f107213y = new ArrayList<>();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float[] f107214z = new float[1];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList<f> f107176A = new ArrayList<>();

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5563e f107215a;

        public a(final C5563e val$easing) {
            this.f107215a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v10) {
            return (float) this.f107215a.a(v10);
        }
    }

    public o(View view) {
        int i10 = f.f106846f;
        this.f107181F = i10;
        this.f107182G = i10;
        this.f107183H = null;
        this.f107184I = i10;
        this.f107185J = Float.NaN;
        this.f107186K = null;
        this.f107187L = false;
        Z(view);
    }

    public static Interpolator v(Context context, int type, String interpolatorString, int id2) {
        if (type == -2) {
            return AnimationUtils.loadInterpolator(context, id2);
        }
        if (type == -1) {
            return new a(C5563e.c(interpolatorString));
        }
        if (type == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new AccelerateInterpolator();
        }
        if (type == 2) {
            return new DecelerateInterpolator();
        }
        if (type == 4) {
            return new BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public double[] A(double position) {
        this.f107199k[0].d(position, this.f107207s);
        AbstractC5561c abstractC5561c = this.f107200l;
        if (abstractC5561c != null) {
            double[] dArr = this.f107207s;
            if (dArr.length > 0) {
                abstractC5561c.d(position, dArr);
            }
        }
        return this.f107207s;
    }

    public k B(int layoutWidth, int layoutHeight, float x10, float y10) {
        int i10;
        int i11;
        float f10;
        float f11;
        RectF rectF = new RectF();
        t tVar = this.f107195g;
        float f12 = tVar.f107233e;
        rectF.left = f12;
        float f13 = tVar.f107234f;
        rectF.top = f13;
        rectF.right = f12 + tVar.f107235g;
        rectF.bottom = f13 + tVar.f107236h;
        RectF rectF2 = new RectF();
        t tVar2 = this.f107196h;
        float f14 = tVar2.f107233e;
        rectF2.left = f14;
        float f15 = tVar2.f107234f;
        rectF2.top = f15;
        rectF2.right = f14 + tVar2.f107235g;
        rectF2.bottom = f15 + tVar2.f107236h;
        ArrayList<f> arrayList = this.f107176A;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            f fVar = arrayList.get(i12);
            if (fVar instanceof k) {
                k kVar = (k) fVar;
                i10 = layoutWidth;
                i11 = layoutHeight;
                f10 = x10;
                f11 = y10;
                if (kVar.r(i10, i11, rectF, rectF2, f10, f11)) {
                    return kVar;
                }
            } else {
                i10 = layoutWidth;
                i11 = layoutHeight;
                f10 = x10;
                f11 = y10;
            }
            layoutWidth = i10;
            layoutHeight = i11;
            x10 = f10;
            y10 = f11;
            i12 = i13;
        }
        return null;
    }

    public void C(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float fJ = j(position, this.f107214z);
        HashMap<String, AbstractC5735d> map = this.f107178C;
        AbstractC5735d abstractC5735d = map == null ? null : map.get("translationX");
        HashMap<String, AbstractC5735d> map2 = this.f107178C;
        AbstractC5735d abstractC5735d2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, AbstractC5735d> map3 = this.f107178C;
        AbstractC5735d abstractC5735d3 = map3 == null ? null : map3.get(f.f106849i);
        HashMap<String, AbstractC5735d> map4 = this.f107178C;
        AbstractC5735d abstractC5735d4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, AbstractC5735d> map5 = this.f107178C;
        AbstractC5735d abstractC5735d5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, AbstractC5734c> map6 = this.f107179D;
        AbstractC5734c abstractC5734c = map6 == null ? null : map6.get("translationX");
        HashMap<String, AbstractC5734c> map7 = this.f107179D;
        AbstractC5734c abstractC5734c2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, AbstractC5734c> map8 = this.f107179D;
        AbstractC5734c abstractC5734c3 = map8 == null ? null : map8.get(f.f106849i);
        HashMap<String, AbstractC5734c> map9 = this.f107179D;
        AbstractC5734c abstractC5734c4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, AbstractC5734c> map10 = this.f107179D;
        AbstractC5734c abstractC5734c5 = map10 != null ? map10.get("scaleY") : null;
        G g10 = new G();
        g10.b();
        g10.d(abstractC5735d3, fJ);
        g10.h(abstractC5735d, abstractC5735d2, fJ);
        g10.f(abstractC5735d4, abstractC5735d5, fJ);
        g10.c(abstractC5734c3, fJ);
        g10.g(abstractC5734c, abstractC5734c2, fJ);
        g10.e(abstractC5734c4, abstractC5734c5, fJ);
        AbstractC5561c abstractC5561c = this.f107200l;
        if (abstractC5561c != null) {
            double[] dArr = this.f107207s;
            if (dArr.length > 0) {
                double d10 = fJ;
                abstractC5561c.d(d10, dArr);
                this.f107200l.g(d10, this.f107208t);
                this.f107195g.v(locationX, locationY, mAnchorDpDt, this.f107206r, this.f107208t, this.f107207s);
            }
            g10.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i10 = 0;
        if (this.f107199k == null) {
            t tVar = this.f107196h;
            float f10 = tVar.f107233e;
            t tVar2 = this.f107195g;
            float f11 = f10 - tVar2.f107233e;
            float f12 = tVar.f107234f - tVar2.f107234f;
            float f13 = tVar.f107235g - tVar2.f107235g;
            float f14 = f12 + (tVar.f107236h - tVar2.f107236h);
            mAnchorDpDt[0] = ((f13 + f11) * locationX) + ((1.0f - locationX) * f11);
            mAnchorDpDt[1] = (f14 * locationY) + ((1.0f - locationY) * f12);
            g10.b();
            g10.d(abstractC5735d3, fJ);
            g10.h(abstractC5735d, abstractC5735d2, fJ);
            g10.f(abstractC5735d4, abstractC5735d5, fJ);
            g10.c(abstractC5734c3, fJ);
            g10.g(abstractC5734c, abstractC5734c2, fJ);
            g10.e(abstractC5734c4, abstractC5734c5, fJ);
            g10.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        double dJ = j(fJ, this.f107214z);
        this.f107199k[0].g(dJ, this.f107208t);
        this.f107199k[0].d(dJ, this.f107207s);
        float f15 = this.f107214z[0];
        while (true) {
            double[] dArr2 = this.f107208t;
            if (i10 >= dArr2.length) {
                this.f107195g.v(locationX, locationY, mAnchorDpDt, this.f107206r, dArr2, this.f107207s);
                g10.a(locationX, locationY, width, height, mAnchorDpDt);
                return;
            } else {
                dArr2[i10] = dArr2[i10] * ((double) f15);
                i10++;
            }
        }
    }

    public final float D() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            C5563e c5563e = this.f107195g.f107229a;
            ArrayList<t> arrayList = this.f107213y;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < size) {
                t tVar = arrayList.get(i11);
                i11++;
                float f14 = f10;
                t tVar2 = tVar;
                int i12 = i10;
                C5563e c5563e2 = tVar2.f107229a;
                if (c5563e2 != null) {
                    float f15 = tVar2.f107231c;
                    if (f15 < f11) {
                        f13 = f15;
                        c5563e = c5563e2;
                    } else if (Float.isNaN(f12)) {
                        f12 = tVar2.f107231c;
                    }
                }
                i10 = i12;
                f10 = f14;
            }
            float f16 = f10;
            int i13 = i10;
            if (c5563e != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                dA = (((float) c5563e.a((f11 - f13) / r16)) * (f12 - f13)) + f13;
            }
            this.f107199k[0].d(dA, this.f107207s);
            float f17 = fHypot;
            this.f107195g.h(dA, this.f107206r, this.f107207s, fArr, 0);
            if (i13 > 0) {
                fHypot = (float) (Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0])) + ((double) f17));
            } else {
                fHypot = f17;
            }
            d10 = fArr[0];
            d11 = fArr[1];
            i10 = i13 + 1;
            f10 = f16;
        }
        return fHypot;
    }

    public float E() {
        return this.f107195g.f107236h;
    }

    public float F() {
        return this.f107195g.f107235g;
    }

    public float G() {
        return this.f107195g.f107233e;
    }

    public float H() {
        return this.f107195g.f107234f;
    }

    public int I() {
        return this.f107182G;
    }

    public View J() {
        return this.f107190b;
    }

    public final void K(t point) {
        if (Collections.binarySearch(this.f107213y, point) == 0) {
            Log.e("MotionController", " KeyPath position \"" + point.f107232d + "\" outside of range");
        }
        this.f107213y.add((-r0) - 1, point);
    }

    public boolean L(View child, float global_position, long time, C5566h keyCache) {
        AbstractC5737f.d dVar;
        boolean zK;
        View view;
        View view2;
        float f10;
        float f11;
        double d10;
        View view3 = child;
        float fJ = j(global_position, null);
        int i10 = this.f107184I;
        if (i10 != f.f106846f) {
            float f12 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fJ / f12)) * f12;
            float f13 = (fJ % f12) / f12;
            if (!Float.isNaN(this.f107185J)) {
                f13 = (f13 + this.f107185J) % 1.0f;
            }
            Interpolator interpolator = this.f107186K;
            fJ = ((interpolator != null ? interpolator.getInterpolation(f13) : ((double) f13) > 0.5d ? 1.0f : 0.0f) * f12) + fFloor;
        }
        HashMap<String, AbstractC5735d> map = this.f107178C;
        if (map != null) {
            Iterator<AbstractC5735d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().m(view3, fJ);
            }
        }
        HashMap<String, AbstractC5737f> map2 = this.f107177B;
        if (map2 != null) {
            AbstractC5737f.d dVar2 = null;
            boolean zJ = false;
            for (AbstractC5737f abstractC5737f : map2.values()) {
                if (abstractC5737f instanceof AbstractC5737f.d) {
                    dVar2 = (AbstractC5737f.d) abstractC5737f;
                } else {
                    zJ |= abstractC5737f.j(view3, fJ, time, keyCache);
                    view3 = child;
                }
            }
            zK = zJ;
            dVar = dVar2;
        } else {
            dVar = null;
            zK = false;
        }
        AbstractC5561c[] abstractC5561cArr = this.f107199k;
        if (abstractC5561cArr != null) {
            double d11 = fJ;
            abstractC5561cArr[0].d(d11, this.f107207s);
            this.f107199k[0].g(d11, this.f107208t);
            AbstractC5561c abstractC5561c = this.f107200l;
            if (abstractC5561c != null) {
                double[] dArr = this.f107207s;
                if (dArr.length > 0) {
                    abstractC5561c.d(d11, dArr);
                    this.f107200l.g(d11, this.f107208t);
                }
            }
            if (this.f107187L) {
                view2 = child;
                f10 = 1.0f;
                f11 = 0.0f;
                d10 = d11;
            } else {
                float f14 = fJ;
                f10 = 1.0f;
                d10 = d11;
                f11 = 0.0f;
                this.f107195g.w(f14, child, this.f107206r, this.f107207s, this.f107208t, null, this.f107192d);
                fJ = f14;
                view2 = child;
                this.f107192d = false;
            }
            if (this.f107182G != f.f106846f) {
                if (this.f107183H == null) {
                    this.f107183H = ((View) view2.getParent()).findViewById(this.f107182G);
                }
                if (this.f107183H != null) {
                    float bottom = (this.f107183H.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.f107183H.getRight() + this.f107183H.getLeft()) / 2.0f;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap<String, AbstractC5735d> map3 = this.f107178C;
            if (map3 != null) {
                for (AbstractC5735d abstractC5735d : map3.values()) {
                    if (abstractC5735d instanceof AbstractC5735d.C0897d) {
                        double[] dArr2 = this.f107208t;
                        if (dArr2.length > 1) {
                            ((AbstractC5735d.C0897d) abstractC5735d).n(view2, fJ, dArr2[0], dArr2[1]);
                        }
                    }
                    view2 = child;
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f107208t;
                view = child;
                float f15 = fJ;
                fJ = f15;
                zK |= dVar.k(view, keyCache, f15, time, dArr3[0], dArr3[1]);
            } else {
                view = child;
            }
            int i11 = 1;
            while (true) {
                AbstractC5561c[] abstractC5561cArr2 = this.f107199k;
                if (i11 >= abstractC5561cArr2.length) {
                    break;
                }
                abstractC5561cArr2[i11].e(d10, this.f107212x);
                C5732a.b(this.f107195g.f107243o.get(this.f107209u[i11 - 1]), view, this.f107212x);
                i11++;
            }
            n nVar = this.f107197i;
            if (nVar.f107124b == 0) {
                if (fJ <= f11) {
                    view.setVisibility(nVar.f107125c);
                } else if (fJ >= f10) {
                    view.setVisibility(this.f107198j.f107125c);
                } else if (this.f107198j.f107125c != nVar.f107125c) {
                    view.setVisibility(0);
                }
            }
            if (this.f107180E != null) {
                int i12 = 0;
                while (true) {
                    m[] mVarArr = this.f107180E;
                    if (i12 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i12].A(fJ, view);
                    i12++;
                }
            }
        } else {
            view = child;
            t tVar = this.f107195g;
            float f16 = tVar.f107233e;
            t tVar2 = this.f107196h;
            float fA = C4541d.a(tVar2.f107233e, f16, fJ, f16);
            float f17 = tVar.f107234f;
            float fA2 = C4541d.a(tVar2.f107234f, f17, fJ, f17);
            float f18 = tVar.f107235g;
            float f19 = tVar2.f107235g;
            float fA3 = C4541d.a(f19, f18, fJ, f18);
            float f20 = tVar.f107236h;
            float f21 = tVar2.f107236h;
            float f22 = fA + 0.5f;
            int i13 = (int) f22;
            float f23 = fA2 + 0.5f;
            int i14 = (int) f23;
            int i15 = (int) (f22 + fA3);
            int iA = (int) (f23 + C4541d.a(f21, f20, fJ, f20));
            int i16 = i15 - i13;
            int i17 = iA - i14;
            if (f19 != f18 || f21 != f20 || this.f107192d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
                this.f107192d = false;
            }
            view.layout(i13, i14, i15, iA);
        }
        HashMap<String, AbstractC5734c> map4 = this.f107179D;
        if (map4 != null) {
            for (AbstractC5734c abstractC5734c : map4.values()) {
                if (abstractC5734c instanceof AbstractC5734c.d) {
                    double[] dArr4 = this.f107208t;
                    ((AbstractC5734c.d) abstractC5734c).n(view, fJ, dArr4[0], dArr4[1]);
                } else {
                    abstractC5734c.m(view, fJ);
                }
            }
        }
        return zK;
    }

    public String M() {
        return this.f107190b.getContext().getResources().getResourceEntryName(this.f107190b.getId());
    }

    public void N(View view, k key, float x10, float y10, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        t tVar = this.f107195g;
        float f10 = tVar.f107233e;
        rectF.left = f10;
        float f11 = tVar.f107234f;
        rectF.top = f11;
        rectF.right = f10 + tVar.f107235g;
        rectF.bottom = f11 + tVar.f107236h;
        RectF rectF2 = new RectF();
        t tVar2 = this.f107196h;
        float f12 = tVar2.f107233e;
        rectF2.left = f12;
        float f13 = tVar2.f107234f;
        rectF2.top = f13;
        rectF2.right = f12 + tVar2.f107235g;
        rectF2.bottom = f13 + tVar2.f107236h;
        key.s(view, rectF, rectF2, x10, y10, attribute, value);
    }

    public final void O(t motionPaths) {
        motionPaths.u((int) this.f107190b.getX(), (int) this.f107190b.getY(), this.f107190b.getWidth(), this.f107190b.getHeight());
    }

    public void P() {
        this.f107192d = true;
    }

    public void Q(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i10 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((rect.height() + i10) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation == 2) {
            int i11 = rect.left + rect.right;
            out.left = preHeight - ((rect.width() + (rect.top + rect.bottom)) / 2);
            out.top = (i11 - rect.height()) / 2;
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation == 3) {
            int i12 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i12 / 2);
            out.top = preWidth - ((rect.height() + i12) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation != 4) {
            return;
        }
        int i13 = rect.left + rect.right;
        out.left = preHeight - ((rect.width() + (rect.bottom + rect.top)) / 2);
        out.top = (i13 - rect.height()) / 2;
        out.right = rect.width() + out.left;
        out.bottom = rect.height() + out.top;
    }

    public void R(View v10) {
        t tVar = this.f107195g;
        tVar.f107231c = 0.0f;
        tVar.f107232d = 0.0f;
        this.f107187L = true;
        tVar.u(v10.getX(), v10.getY(), v10.getWidth(), v10.getHeight());
        this.f107196h.u(v10.getX(), v10.getY(), v10.getWidth(), v10.getHeight());
        this.f107197i.p(v10);
        this.f107198j.p(v10);
    }

    public void S(int debugMode) {
        this.f107195g.f107230b = debugMode;
    }

    public void T(Rect cw, androidx.constraintlayout.widget.d constraintSet, int parentWidth, int parentHeight) {
        o oVar;
        int i10 = constraintSet.f107976d;
        if (i10 != 0) {
            oVar = this;
            oVar.Q(cw, this.f107189a, i10, parentWidth, parentHeight);
            cw = oVar.f107189a;
        } else {
            oVar = this;
        }
        t tVar = oVar.f107196h;
        tVar.f107231c = 1.0f;
        tVar.f107232d = 1.0f;
        O(tVar);
        oVar.f107196h.u(cw.left, cw.top, cw.width(), cw.height());
        oVar.f107196h.a(constraintSet.q0(oVar.f107191c));
        oVar.f107198j.n(cw, constraintSet, i10, oVar.f107191c);
    }

    public void U(int arc) {
        this.f107181F = arc;
    }

    public void V(View v10) {
        t tVar = this.f107195g;
        tVar.f107231c = 0.0f;
        tVar.f107232d = 0.0f;
        tVar.u(v10.getX(), v10.getY(), v10.getWidth(), v10.getHeight());
        this.f107197i.p(v10);
    }

    public void W(Rect cw, androidx.constraintlayout.widget.d constraintSet, int parentWidth, int parentHeight) {
        o oVar;
        Rect rect;
        int i10 = constraintSet.f107976d;
        if (i10 != 0) {
            oVar = this;
            rect = cw;
            oVar.Q(rect, this.f107189a, i10, parentWidth, parentHeight);
        } else {
            oVar = this;
            rect = cw;
        }
        t tVar = oVar.f107195g;
        tVar.f107231c = 0.0f;
        tVar.f107232d = 0.0f;
        O(tVar);
        oVar.f107195g.u(rect.left, rect.top, rect.width(), rect.height());
        d.a aVarQ0 = constraintSet.q0(oVar.f107191c);
        oVar.f107195g.a(aVarQ0);
        oVar.f107201m = aVarQ0.f107983d.f108164g;
        oVar.f107197i.n(rect, constraintSet, i10, oVar.f107191c);
        oVar.f107182G = aVarQ0.f107985f.f108198i;
        d.c cVar = aVarQ0.f107983d;
        oVar.f107184I = cVar.f108168k;
        oVar.f107185J = cVar.f108167j;
        Context context = oVar.f107190b.getContext();
        d.c cVar2 = aVarQ0.f107983d;
        oVar.f107186K = v(context, cVar2.f108170m, cVar2.f108169l, cVar2.f108171n);
    }

    public void X(C5736e rect, View v10, int rotation, int preWidth, int preHeight) {
        t tVar = this.f107195g;
        tVar.f107231c = 0.0f;
        tVar.f107232d = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i10 = rect.f240059b + rect.f240061d;
            rect2.left = ((rect.f240060c + rect.f240062e) - rect.c()) / 2;
            rect2.top = preWidth - ((rect.b() + i10) / 2);
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        } else if (rotation == 2) {
            int i11 = rect.f240059b + rect.f240061d;
            rect2.left = preHeight - ((rect.c() + (rect.f240060c + rect.f240062e)) / 2);
            rect2.top = (i11 - rect.b()) / 2;
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        }
        this.f107195g.u(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.f107197i.m(rect2, v10, rotation, rect.f240058a);
    }

    public void Y(int transformPivotTarget) {
        this.f107182G = transformPivotTarget;
        this.f107183H = null;
    }

    public void Z(View view) {
        this.f107190b = view;
        this.f107191c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f107193e = ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    public void a(f key) {
        this.f107176A.add(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a0(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        int i10;
        String[] strArr;
        int i11;
        int i12;
        ConstraintAttribute constraintAttribute;
        AbstractC5737f abstractC5737fI;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        int i13;
        AbstractC5735d abstractC5735dL;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i14 = this.f107181F;
        if (i14 != f.f106846f) {
            this.f107195g.f107239k = i14;
        }
        this.f107197i.f(this.f107198j, hashSet2);
        ArrayList<f> arrayList2 = this.f107176A;
        int i15 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i16 = 0;
            arrayList = null;
            while (i16 < size) {
                f fVar = arrayList2.get(i16);
                i16++;
                f fVar2 = fVar;
                if (fVar2 instanceof j) {
                    j jVar = (j) fVar2;
                    K(new t(parentWidth, parentHeight, jVar, this.f107195g, this.f107196h));
                    int i17 = jVar.f107013D;
                    if (i17 != f.f106846f) {
                        this.f107194f = i17;
                    }
                } else if (fVar2 instanceof h) {
                    fVar2.d(hashSet3);
                } else if (fVar2 instanceof l) {
                    fVar2.d(hashSet);
                } else if (fVar2 instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) fVar2);
                } else {
                    fVar2.i(map);
                    fVar2.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f107180E = (m[]) arrayList.toArray(new m[0]);
        }
        int i18 = 1;
        if (hashSet2.isEmpty()) {
            i10 = 1;
        } else {
            this.f107178C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[i18];
                    ArrayList<f> arrayList3 = this.f107176A;
                    int size2 = arrayList3.size();
                    int i19 = i15;
                    while (i19 < size2) {
                        f fVar3 = arrayList3.get(i19);
                        i19++;
                        int i20 = i18;
                        f fVar4 = fVar3;
                        HashMap<String, ConstraintAttribute> map2 = fVar4.f106871e;
                        if (map2 != null && (constraintAttribute3 = map2.get(str2)) != null) {
                            sparseArray.append(fVar4.f106867a, constraintAttribute3);
                        }
                        i18 = i20;
                    }
                    i13 = i18;
                    abstractC5735dL = new AbstractC5735d.b(str, sparseArray);
                } else {
                    i13 = i18;
                    abstractC5735dL = AbstractC5735d.l(str);
                }
                if (abstractC5735dL != null) {
                    abstractC5735dL.i(str);
                    this.f107178C.put(str, abstractC5735dL);
                }
                i18 = i13;
                i15 = 0;
            }
            i10 = i18;
            ArrayList<f> arrayList4 = this.f107176A;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    f fVar5 = arrayList4.get(i21);
                    i21++;
                    f fVar6 = fVar5;
                    if (fVar6 instanceof g) {
                        fVar6.a(this.f107178C);
                    }
                }
            }
            this.f107197i.a(this.f107178C, 0);
            this.f107198j.a(this.f107178C, 100);
            for (String str3 : this.f107178C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                AbstractC5735d abstractC5735d = this.f107178C.get(str3);
                if (abstractC5735d != null) {
                    abstractC5735d.j(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f107177B == null) {
                this.f107177B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f107177B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[i10];
                        ArrayList<f> arrayList5 = this.f107176A;
                        int size4 = arrayList5.size();
                        int i22 = 0;
                        while (i22 < size4) {
                            f fVar7 = arrayList5.get(i22);
                            i22++;
                            f fVar8 = fVar7;
                            HashMap<String, ConstraintAttribute> map3 = fVar8.f106871e;
                            if (map3 != null && (constraintAttribute2 = map3.get(str5)) != null) {
                                sparseArray2.append(fVar8.f106867a, constraintAttribute2);
                            }
                        }
                        abstractC5737fI = new AbstractC5737f.b(str4, sparseArray2);
                    } else {
                        abstractC5737fI = AbstractC5737f.i(str4, currentTime);
                    }
                    if (abstractC5737fI != null) {
                        abstractC5737fI.e(str4);
                        this.f107177B.put(str4, abstractC5737fI);
                    }
                }
            }
            ArrayList<f> arrayList6 = this.f107176A;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i23 = 0;
                while (i23 < size5) {
                    f fVar9 = arrayList6.get(i23);
                    i23++;
                    f fVar10 = fVar9;
                    if (fVar10 instanceof l) {
                        ((l) fVar10).W(this.f107177B);
                    }
                }
            }
            for (String str6 : this.f107177B.keySet()) {
                this.f107177B.get(str6).f(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size6 = this.f107213y.size();
        int i24 = size6 + 2;
        t[] tVarArr = new t[i24];
        tVarArr[0] = this.f107195g;
        tVarArr[size6 + 1] = this.f107196h;
        if (this.f107213y.size() > 0 && this.f107194f == -1) {
            this.f107194f = 0;
        }
        ArrayList<t> arrayList7 = this.f107213y;
        int size7 = arrayList7.size();
        int i25 = i10;
        int i26 = 0;
        while (i26 < size7) {
            t tVar = arrayList7.get(i26);
            i26++;
            tVarArr[i25] = tVar;
            i25++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f107196h.f107243o.keySet()) {
            if (this.f107195g.f107243o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f107209u = strArr2;
        this.f107210v = new int[strArr2.length];
        int i27 = 0;
        while (true) {
            strArr = this.f107209u;
            if (i27 >= strArr.length) {
                break;
            }
            String str8 = strArr[i27];
            this.f107210v[i27] = 0;
            int i28 = 0;
            while (true) {
                if (i28 >= i24) {
                    break;
                }
                if (tVarArr[i28].f107243o.containsKey(str8) && (constraintAttribute = tVarArr[i28].f107243o.get(str8)) != null) {
                    int[] iArr = this.f107210v;
                    iArr[i27] = constraintAttribute.p() + iArr[i27];
                    break;
                }
                i28++;
            }
            i27++;
        }
        boolean z10 = tVarArr[0].f107239k != f.f106846f ? i10 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i29 = i10; i29 < i24; i29++) {
            tVarArr[i29].e(tVarArr[i29 - 1], zArr, this.f107209u, z10);
        }
        int i30 = 0;
        for (int i31 = i10; i31 < length; i31++) {
            if (zArr[i31]) {
                i30++;
            }
        }
        this.f107206r = new int[i30];
        int i32 = 2;
        int iMax = Math.max(2, i30);
        this.f107207s = new double[iMax];
        this.f107208t = new double[iMax];
        int i33 = 0;
        for (int i34 = i10; i34 < length; i34++) {
            if (zArr[i34]) {
                this.f107206r[i33] = i34;
                i33++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i10] = this.f107206r.length;
        iArr2[0] = i24;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i24];
        for (int i35 = 0; i35 < i24; i35++) {
            tVarArr[i35].f(dArr[i35], this.f107206r);
            dArr2[i35] = tVarArr[i35].f107231c;
        }
        int i36 = 0;
        while (true) {
            int[] iArr3 = this.f107206r;
            if (i36 >= iArr3.length) {
                break;
            }
            if (iArr3[i36] < t.f107221F.length) {
                String strA = android.support.v4.media.e.a(new StringBuilder(), t.f107221F[this.f107206r[i36]], " [");
                for (int i37 = 0; i37 < i24; i37++) {
                    StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strA);
                    sbA.append(dArr[i37][i36]);
                    strA = sbA.toString();
                }
            }
            i36++;
        }
        this.f107199k = new AbstractC5561c[this.f107209u.length + 1];
        int i38 = 0;
        while (true) {
            String[] strArr3 = this.f107209u;
            if (i38 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i38];
            int i39 = 0;
            int i40 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i39 < i24) {
                if (tVarArr[i39].n(str9)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i24];
                        int[] iArr4 = new int[i32];
                        iArr4[i10] = tVarArr[i39].l(str9);
                        i12 = 0;
                        iArr4[0] = i24;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i12 = 0;
                    }
                    t tVar2 = tVarArr[i39];
                    i11 = i38;
                    dArr3[i40] = tVar2.f107231c;
                    tVar2.k(str9, dArr4[i40], i12);
                    i40++;
                } else {
                    i11 = i38;
                }
                i39++;
                i38 = i11;
                i32 = 2;
            }
            int i41 = i38 + 1;
            this.f107199k[i41] = AbstractC5561c.a(this.f107194f, Arrays.copyOf(dArr3, i40), (double[][]) Arrays.copyOf(dArr4, i40));
            i38 = i41;
            i32 = 2;
        }
        int i42 = 0;
        this.f107199k[0] = AbstractC5561c.a(this.f107194f, dArr2, dArr);
        if (tVarArr[0].f107239k != f.f106846f) {
            int[] iArr5 = new int[i24];
            double[] dArr5 = new double[i24];
            int[] iArr6 = new int[2];
            iArr6[i10] = 2;
            iArr6[0] = i24;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i43 = 0; i43 < i24; i43++) {
                iArr5[i43] = tVarArr[i43].f107239k;
                dArr5[i43] = r8.f107231c;
                double[] dArr7 = dArr6[i43];
                dArr7[0] = r8.f107233e;
                dArr7[i10] = r8.f107234f;
            }
            i42 = 0;
            this.f107200l = new C5560b(iArr5, dArr5, dArr6);
        }
        this.f107179D = new HashMap<>();
        if (this.f107176A != null) {
            float fD = Float.NaN;
            for (String str10 : hashSet3) {
                AbstractC5734c abstractC5734cL = AbstractC5734c.l(str10);
                if (abstractC5734cL != null) {
                    if (abstractC5734cL.k() && Float.isNaN(fD)) {
                        fD = D();
                    }
                    abstractC5734cL.i(str10);
                    this.f107179D.put(str10, abstractC5734cL);
                }
            }
            ArrayList<f> arrayList8 = this.f107176A;
            int size8 = arrayList8.size();
            int i44 = i42;
            while (i44 < size8) {
                f fVar11 = arrayList8.get(i44);
                i44++;
                f fVar12 = fVar11;
                if (fVar12 instanceof h) {
                    ((h) fVar12).a0(this.f107179D);
                }
            }
            Iterator<AbstractC5734c> it = this.f107179D.values().iterator();
            while (it.hasNext()) {
                it.next().j(fD);
            }
        }
    }

    public void b(ArrayList<f> list) {
        this.f107176A.addAll(list);
    }

    public void b0(o motionController) {
        this.f107195g.x(motionController, motionController.f107195g);
        this.f107196h.x(motionController, motionController.f107196h);
    }

    public void c(float[] bounds, int pointCount) {
        float f10 = 1.0f;
        float f11 = 1.0f / (pointCount - 1);
        HashMap<String, AbstractC5735d> map = this.f107178C;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, AbstractC5735d> map2 = this.f107178C;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, AbstractC5734c> map3 = this.f107179D;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, AbstractC5734c> map4 = this.f107179D;
        if (map4 != null) {
            map4.get("translationY");
        }
        int i10 = 0;
        while (i10 < pointCount) {
            float fMin = i10 * f11;
            float f12 = this.f107203o;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f107202n;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            C5563e c5563e = this.f107195g.f107229a;
            ArrayList<t> arrayList = this.f107213y;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i11 = 0;
            while (i11 < size) {
                t tVar = arrayList.get(i11);
                i11++;
                t tVar2 = tVar;
                C5563e c5563e2 = tVar2.f107229a;
                if (c5563e2 != null) {
                    float f16 = tVar2.f107231c;
                    if (f16 < fMin) {
                        c5563e = c5563e2;
                        f13 = f16;
                    } else if (Float.isNaN(f15)) {
                        f15 = tVar2.f107231c;
                    }
                }
            }
            if (c5563e != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                dA = (((float) c5563e.a((fMin - f13) / r13)) * (f15 - f13)) + f13;
            }
            this.f107199k[0].d(dA, this.f107207s);
            AbstractC5561c abstractC5561c = this.f107200l;
            if (abstractC5561c != null) {
                double[] dArr = this.f107207s;
                if (dArr.length > 0) {
                    abstractC5561c.d(dA, dArr);
                }
            }
            this.f107195g.g(this.f107206r, this.f107207s, bounds, i10 * 2);
            i10++;
            f10 = 1.0f;
        }
    }

    public int d(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] dArrH = this.f107199k[0].h();
        if (mode != null) {
            ArrayList<t> arrayList = this.f107213y;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                t tVar = arrayList.get(i11);
                i11++;
                mode[i10] = tVar.f107244p;
                i10++;
            }
        }
        int i12 = 0;
        for (double d10 : dArrH) {
            this.f107199k[0].d(d10, this.f107207s);
            this.f107195g.g(this.f107206r, this.f107207s, keyBounds, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public int e(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] dArrH = this.f107199k[0].h();
        if (mode != null) {
            ArrayList<t> arrayList = this.f107213y;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                t tVar = arrayList.get(i11);
                i11++;
                mode[i10] = tVar.f107244p;
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrH.length; i13++) {
            this.f107199k[0].d(dArrH[i13], this.f107207s);
            this.f107195g.h(dArrH[i13], this.f107206r, this.f107207s, keyFrames, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    public void f(float[] points, int pointCount) {
        int i10 = pointCount;
        float f10 = 1.0f;
        float f11 = 1.0f / (i10 - 1);
        HashMap<String, AbstractC5735d> map = this.f107178C;
        AbstractC5735d abstractC5735d = map == null ? null : map.get("translationX");
        HashMap<String, AbstractC5735d> map2 = this.f107178C;
        AbstractC5735d abstractC5735d2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, AbstractC5734c> map3 = this.f107179D;
        AbstractC5734c abstractC5734c = map3 == null ? null : map3.get("translationX");
        HashMap<String, AbstractC5734c> map4 = this.f107179D;
        AbstractC5734c abstractC5734c2 = map4 != null ? map4.get("translationY") : null;
        int i11 = 0;
        while (i11 < i10) {
            float fMin = i11 * f11;
            float f12 = this.f107203o;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f107202n;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            C5563e c5563e = this.f107195g.f107229a;
            ArrayList<t> arrayList = this.f107213y;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i12 = 0;
            while (i12 < size) {
                t tVar = arrayList.get(i12);
                i12++;
                t tVar2 = tVar;
                float f16 = f11;
                C5563e c5563e2 = tVar2.f107229a;
                if (c5563e2 != null) {
                    float f17 = tVar2.f107231c;
                    if (f17 < fMin) {
                        f13 = f17;
                        c5563e = c5563e2;
                    } else if (Float.isNaN(f15)) {
                        f15 = tVar2.f107231c;
                    }
                }
                f11 = f16;
            }
            float f18 = f11;
            if (c5563e != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                dA = (((float) c5563e.a((fMin - f13) / r17)) * (f15 - f13)) + f13;
            }
            this.f107199k[0].d(dA, this.f107207s);
            AbstractC5561c abstractC5561c = this.f107200l;
            if (abstractC5561c != null) {
                double[] dArr = this.f107207s;
                if (dArr.length > 0) {
                    abstractC5561c.d(dA, dArr);
                }
            }
            int i13 = i11 * 2;
            this.f107195g.h(dA, this.f107206r, this.f107207s, points, i13);
            if (abstractC5734c != null) {
                points[i13] = abstractC5734c.a(fMin) + points[i13];
            } else if (abstractC5735d != null) {
                points[i13] = abstractC5735d.a(fMin) + points[i13];
            }
            if (abstractC5734c2 != null) {
                int i14 = i13 + 1;
                points[i14] = abstractC5734c2.a(fMin) + points[i14];
            } else if (abstractC5735d2 != null) {
                int i15 = i13 + 1;
                points[i15] = abstractC5735d2.a(fMin) + points[i15];
            }
            i11++;
            i10 = pointCount;
            f11 = f18;
            f10 = 1.0f;
        }
    }

    public void g(float p10, float[] path, int offset) {
        this.f107199k[0].d(j(p10, null), this.f107207s);
        this.f107195g.m(this.f107206r, this.f107207s, path, offset);
    }

    public void h(float[] path, int pointCount) {
        float f10 = 1.0f / (pointCount - 1);
        for (int i10 = 0; i10 < pointCount; i10++) {
            this.f107199k[0].d(j(i10 * f10, null), this.f107207s);
            this.f107195g.m(this.f107206r, this.f107207s, path, i10 * 8);
        }
    }

    public void i(boolean start) {
        if (!"button".equals(C2377c.k(this.f107190b)) || this.f107180E == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.f107180E;
            if (i10 >= mVarArr.length) {
                return;
            }
            mVarArr[i10].A(start ? -100.0f : 100.0f, this.f107190b);
            i10++;
        }
    }

    public final float j(float position, float[] velocity) {
        float f10 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f11 = this.f107203o;
            if (f11 != 1.0d) {
                float f12 = this.f107202n;
                if (position < f12) {
                    position = 0.0f;
                }
                if (position > f12 && position < 1.0d) {
                    position = Math.min((position - f12) * f11, 1.0f);
                }
            }
        }
        C5563e c5563e = this.f107195g.f107229a;
        ArrayList<t> arrayList = this.f107213y;
        int size = arrayList.size();
        float f13 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            t tVar = arrayList.get(i10);
            i10++;
            t tVar2 = tVar;
            C5563e c5563e2 = tVar2.f107229a;
            if (c5563e2 != null) {
                float f14 = tVar2.f107231c;
                if (f14 < position) {
                    c5563e = c5563e2;
                    f10 = f14;
                } else if (Float.isNaN(f13)) {
                    f13 = tVar2.f107231c;
                }
            }
        }
        if (c5563e != null) {
            float f15 = (Float.isNaN(f13) ? 1.0f : f13) - f10;
            double d10 = (position - f10) / f15;
            position = (((float) c5563e.a(d10)) * f15) + f10;
            if (velocity != null) {
                velocity[0] = (float) c5563e.b(d10);
            }
        }
        return position;
    }

    public int k() {
        return this.f107195g.f107240l;
    }

    public int l(String attributeType, float[] points, int pointCount) {
        AbstractC5735d abstractC5735d = this.f107178C.get(attributeType);
        if (abstractC5735d == null) {
            return -1;
        }
        for (int i10 = 0; i10 < points.length; i10++) {
            points[i10] = abstractC5735d.a(i10 / (points.length - 1));
        }
        return points.length;
    }

    public void m(double p10, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f107199k[0].d(p10, dArr);
        this.f107199k[0].g(p10, dArr2);
        Arrays.fill(vel, 0.0f);
        this.f107195g.i(p10, this.f107206r, dArr, pos, dArr2, vel);
    }

    public float n() {
        return this.f107204p;
    }

    public float o() {
        return this.f107205q;
    }

    public void p(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float fJ = j(position, this.f107214z);
        AbstractC5561c[] abstractC5561cArr = this.f107199k;
        int i10 = 0;
        if (abstractC5561cArr == null) {
            t tVar = this.f107196h;
            float f10 = tVar.f107233e;
            t tVar2 = this.f107195g;
            float f11 = f10 - tVar2.f107233e;
            float f12 = tVar.f107234f - tVar2.f107234f;
            float f13 = tVar.f107235g - tVar2.f107235g;
            float f14 = (tVar.f107236h - tVar2.f107236h) + f12;
            mAnchorDpDt[0] = ((f13 + f11) * locationX) + ((1.0f - locationX) * f11);
            mAnchorDpDt[1] = (f14 * locationY) + ((1.0f - locationY) * f12);
            return;
        }
        double d10 = fJ;
        abstractC5561cArr[0].g(d10, this.f107208t);
        this.f107199k[0].d(d10, this.f107207s);
        float f15 = this.f107214z[0];
        while (true) {
            dArr = this.f107208t;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f15);
            i10++;
        }
        AbstractC5561c abstractC5561c = this.f107200l;
        if (abstractC5561c == null) {
            this.f107195g.v(locationX, locationY, mAnchorDpDt, this.f107206r, dArr, this.f107207s);
            return;
        }
        double[] dArr2 = this.f107207s;
        if (dArr2.length > 0) {
            abstractC5561c.d(d10, dArr2);
            this.f107200l.g(d10, this.f107208t);
            this.f107195g.v(locationX, locationY, mAnchorDpDt, this.f107206r, this.f107208t, this.f107207s);
        }
    }

    public int q() {
        int iMax = this.f107195g.f107230b;
        ArrayList<t> arrayList = this.f107213y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            t tVar = arrayList.get(i10);
            i10++;
            iMax = Math.max(iMax, tVar.f107230b);
        }
        return Math.max(iMax, this.f107196h.f107230b);
    }

    public float r() {
        return this.f107196h.f107236h;
    }

    public float s() {
        return this.f107196h.f107235g;
    }

    public float t() {
        return this.f107196h.f107233e;
    }

    public String toString() {
        return " start: x: " + this.f107195g.f107233e + " y: " + this.f107195g.f107234f + " end: x: " + this.f107196h.f107233e + " y: " + this.f107196h.f107234f;
    }

    public float u() {
        return this.f107196h.f107234f;
    }

    public t w(int i10) {
        return this.f107213y.get(i10);
    }

    public int x(int type, int[] info) {
        float[] fArr = new float[2];
        ArrayList<f> arrayList = this.f107176A;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < size) {
            int i13 = i10 + 1;
            f fVar = arrayList.get(i10);
            int i14 = fVar.f106870d;
            if (i14 == type || type != -1) {
                info[i12] = 0;
                info[i12 + 1] = i14;
                int i15 = fVar.f106867a;
                info[i12 + 2] = i15;
                double d10 = i15 / 100.0f;
                this.f107199k[0].d(d10, this.f107207s);
                this.f107195g.h(d10, this.f107206r, this.f107207s, fArr, 0);
                info[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i16 = i12 + 4;
                info[i16] = Float.floatToIntBits(fArr[1]);
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    info[i12 + 5] = jVar.f106996O;
                    info[i12 + 6] = Float.floatToIntBits(jVar.f106992K);
                    i16 = i12 + 7;
                    info[i16] = Float.floatToIntBits(jVar.f106993L);
                }
                int i17 = i16 + 1;
                info[i12] = i17 - i12;
                i11++;
                i12 = i17;
            }
            i10 = i13;
        }
        return i11;
    }

    public float y(int type, float x10, float y10) {
        t tVar = this.f107196h;
        float f10 = tVar.f107233e;
        t tVar2 = this.f107195g;
        float f11 = tVar2.f107233e;
        float f12 = f10 - f11;
        float f13 = tVar.f107234f;
        float f14 = tVar2.f107234f;
        float f15 = f13 - f14;
        float f16 = (tVar2.f107235g / 2.0f) + f11;
        float f17 = (tVar2.f107236h / 2.0f) + f14;
        float fHypot = (float) Math.hypot(f12, f15);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f18 = x10 - f16;
        float f19 = y10 - f17;
        if (((float) Math.hypot(f18, f19)) == 0.0f) {
            return 0.0f;
        }
        float f20 = (f19 * f15) + (f18 * f12);
        if (type == 0) {
            return f20 / fHypot;
        }
        if (type == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f20 * f20));
        }
        if (type == 2) {
            return f18 / f12;
        }
        if (type == 3) {
            return f19 / f12;
        }
        if (type == 4) {
            return f18 / f15;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f19 / f15;
    }

    public int z(int[] type, float[] pos) {
        ArrayList<f> arrayList = this.f107176A;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            f fVar = arrayList.get(i11);
            int i14 = fVar.f106867a;
            type[i10] = (fVar.f106870d * 1000) + i14;
            double d10 = i14 / 100.0f;
            this.f107199k[0].d(d10, this.f107207s);
            this.f107195g.h(d10, this.f107206r, this.f107207s, pos, i12);
            i12 += 2;
            i11 = i13;
            i10++;
        }
        return i10;
    }
}
