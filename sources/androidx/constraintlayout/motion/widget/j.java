package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.colorspace.C2016d;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;
import s0.C5563e;
import w0.AbstractC5735d;

/* JADX INFO: loaded from: classes2.dex */
public class j extends k {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f106974R = "KeyPosition";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f106975S = "KeyPosition";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f106976T = 2;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f106977U = 1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f106978V = 0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f106979W = "transitionEasing";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final String f106980X = "drawPath";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f106981Y = "percentWidth";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f106982Z = "percentHeight";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f106983a0 = "sizePercent";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f106984b0 = "percentX";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f106985c0 = "percentY";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f106986d0 = 2;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f106987F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f106988G = f.f106846f;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f106989H = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f106990I = Float.NaN;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f106991J = Float.NaN;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f106992K = Float.NaN;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f106993L = Float.NaN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f106994M = Float.NaN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f106995N = Float.NaN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f106996O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f106997P = Float.NaN;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f106998Q = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f106999a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f107000b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f107001c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f107002d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f107003e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f107004f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f107005g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f107006h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f107007i = 9;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f107008j = 10;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f107009k = 11;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f107010l = 12;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static SparseIntArray f107011m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f107011m = sparseIntArray;
            sparseIntArray.append(g.m.Jf, 1);
            f107011m.append(g.m.Hf, 2);
            f107011m.append(g.m.Qf, 3);
            f107011m.append(g.m.Ff, 4);
            f107011m.append(g.m.Gf, 5);
            f107011m.append(g.m.Nf, 6);
            f107011m.append(g.m.Of, 7);
            f107011m.append(g.m.If, 9);
            f107011m.append(g.m.Pf, 8);
            f107011m.append(g.m.Mf, 11);
            f107011m.append(g.m.Lf, 12);
            f107011m.append(g.m.Kf, 10);
        }

        public static void b(j c10, TypedArray a10) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                switch (f107011m.get(index)) {
                    case 1:
                        if (MotionLayout.f106695O0) {
                            int resourceId = a10.getResourceId(index, c10.f106868b);
                            c10.f106868b = resourceId;
                            if (resourceId == -1) {
                                c10.f106869c = a10.getString(index);
                            }
                        } else if (a10.peekValue(index).type == 3) {
                            c10.f106869c = a10.getString(index);
                        } else {
                            c10.f106868b = a10.getResourceId(index, c10.f106868b);
                        }
                        break;
                    case 2:
                        c10.f106867a = a10.getInt(index, c10.f106867a);
                        break;
                    case 3:
                        if (a10.peekValue(index).type == 3) {
                            c10.f106987F = a10.getString(index);
                        } else {
                            c10.f106987F = C5563e.f238019o[a10.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        c10.f107013D = a10.getInteger(index, c10.f107013D);
                        break;
                    case 5:
                        c10.f106989H = a10.getInt(index, c10.f106989H);
                        break;
                    case 6:
                        c10.f106992K = a10.getFloat(index, c10.f106992K);
                        break;
                    case 7:
                        c10.f106993L = a10.getFloat(index, c10.f106993L);
                        break;
                    case 8:
                        float f10 = a10.getFloat(index, c10.f106991J);
                        c10.f106990I = f10;
                        c10.f106991J = f10;
                        break;
                    case 9:
                        c10.f106996O = a10.getInt(index, c10.f106996O);
                        break;
                    case 10:
                        c10.f106988G = a10.getInt(index, c10.f106988G);
                        break;
                    case 11:
                        c10.f106990I = a10.getFloat(index, c10.f106990I);
                        break;
                    case 12:
                        c10.f106991J = a10.getFloat(index, c10.f106991J);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f107011m.get(index));
                        break;
                }
            }
            if (c10.f106867a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public j() {
        this.f106870d = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, AbstractC5735d> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        j jVar = new j();
        jVar.c(this);
        return jVar;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        j jVar = (j) src;
        this.f106987F = jVar.f106987F;
        this.f106988G = jVar.f106988G;
        this.f106989H = jVar.f106989H;
        this.f106990I = jVar.f106990I;
        this.f106991J = Float.NaN;
        this.f106992K = jVar.f106992K;
        this.f106993L = jVar.f106993L;
        this.f106994M = jVar.f106994M;
        this.f106995N = jVar.f106995N;
        this.f106997P = jVar.f106997P;
        this.f106998Q = jVar.f106998Q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, g.m.Ef));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        switch (tag) {
            case "transitionEasing":
                this.f106987F = value.toString();
                break;
            case "percentWidth":
                this.f106990I = m(value);
                break;
            case "percentHeight":
                this.f106991J = m(value);
                break;
            case "drawPath":
                this.f106989H = n(value);
                break;
            case "sizePercent":
                float fM = m(value);
                this.f106990I = fM;
                this.f106991J = fM;
                break;
            case "percentX":
                this.f106992K = m(value);
                break;
            case "percentY":
                this.f106993L = m(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i10 = this.f106996O;
        if (i10 == 1) {
            u(start_x, start_y, end_x, end_y);
        } else if (i10 != 2) {
            t(start_x, start_y, end_x, end_y);
        } else {
            v(layoutWidth, layoutHeight);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public float p() {
        return this.f106997P;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public float q() {
        return this.f106998Q;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x10, float y10) {
        o(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x10 - this.f106997P) < 20.0f && Math.abs(y10 - this.f106998Q) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void s(View view, RectF start, RectF end, float x10, float y10, String[] attribute, float[] value) {
        int i10 = this.f106996O;
        if (i10 == 1) {
            x(start, end, x10, y10, attribute, value);
        } else if (i10 != 2) {
            w(start, end, x10, y10, attribute, value);
        } else {
            y(view, start, end, x10, y10, attribute, value);
        }
    }

    public final void t(float start_x, float start_y, float end_x, float end_y) {
        float f10 = end_x - start_x;
        float f11 = end_y - start_y;
        float f12 = Float.isNaN(this.f106992K) ? 0.0f : this.f106992K;
        float f13 = Float.isNaN(this.f106995N) ? 0.0f : this.f106995N;
        float f14 = Float.isNaN(this.f106993L) ? 0.0f : this.f106993L;
        this.f106997P = (int) (((Float.isNaN(this.f106994M) ? 0.0f : this.f106994M) * f11) + (f12 * f10) + start_x);
        this.f106998Q = (int) ((f11 * f14) + (f10 * f13) + start_y);
    }

    public final void u(float start_x, float start_y, float end_x, float end_y) {
        float f10 = end_x - start_x;
        float f11 = end_y - start_y;
        float f12 = this.f106992K;
        float f13 = (f10 * f12) + start_x;
        float f14 = this.f106993L;
        this.f106997P = ((-f11) * f14) + f13;
        this.f106998Q = (f10 * f14) + (f11 * f12) + start_y;
    }

    public final void v(int layoutWidth, int layoutHeight) {
        float f10 = this.f106992K;
        float f11 = 0;
        this.f106997P = (layoutWidth * f10) + f11;
        this.f106998Q = (layoutHeight * f10) + f11;
    }

    public void w(RectF start, RectF end, float x10, float y10, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = (x10 - fCenterX) / fCenterX2;
            attribute[1] = "percentY";
            value[1] = (y10 - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = (x10 - fCenterX) / fCenterX2;
            value[1] = (y10 - fCenterY) / fCenterY2;
        } else {
            value[1] = (x10 - fCenterX) / fCenterX2;
            value[0] = (y10 - fCenterY) / fCenterY2;
        }
    }

    public void x(RectF start, RectF end, float x10, float y10, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f10 = fCenterX2 / fHypot;
        float f11 = fCenterY2 / fHypot;
        float f12 = y10 - fCenterY;
        float f13 = x10 - fCenterX;
        float fA = C2016d.a(f13, f11, f10 * f12, fHypot);
        float f14 = ((f11 * f12) + (f10 * f13)) / fHypot;
        String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f14;
                value[1] = fA;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f14;
        value[1] = fA;
    }

    public void y(View view, RectF start, RectF end, float x10, float y10, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = x10 / width;
            attribute[1] = "percentY";
            value[1] = y10 / height;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = x10 / width;
            value[1] = y10 / height;
        } else {
            value[1] = x10 / width;
            value[0] = y10 / height;
        }
    }

    public void z(int type) {
        this.f106996O = type;
    }
}
