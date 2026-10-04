package w0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s0.AbstractC5561c;
import s0.C5566h;
import s0.u;

/* JADX INFO: renamed from: w0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5737f extends u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f240063p = "ViewTimeCycle";

    /* JADX INFO: renamed from: w0.f$a */
    public static class a extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setAlpha(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$b */
    public static class b extends AbstractC5737f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public String f240064q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f240065r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public SparseArray<float[]> f240066s = new SparseArray<>();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float[] f240067t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float[] f240068u;

        public b(String attribute, SparseArray<ConstraintAttribute> attrList) {
            this.f240064q = attribute.split(",")[1];
            this.f240065r = attrList;
        }

        @Override // s0.u
        public void c(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // s0.u
        public void f(int curveType) {
            int size = this.f240065r.size();
            int iP = this.f240065r.valueAt(0).p();
            double[] dArr = new double[size];
            int i10 = iP + 2;
            this.f240067t = new float[i10];
            this.f240068u = new float[iP];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i10);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f240065r.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = this.f240065r.valueAt(i11);
                float[] fArrValueAt = this.f240066s.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.l(this.f240067t);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f240067t.length) {
                        dArr2[i11][i12] = r8[i12];
                        i12++;
                    }
                }
                double[] dArr3 = dArr2[i11];
                dArr3[iP] = fArrValueAt[0];
                dArr3[iP + 1] = fArrValueAt[1];
            }
            this.f238176a = AbstractC5561c.a(curveType, dArr, dArr2);
        }

        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            this.f238176a.e(t10, this.f240067t);
            float[] fArr = this.f240067t;
            float f10 = fArr[fArr.length - 2];
            float f11 = fArr[fArr.length - 1];
            long j10 = time - this.f238184i;
            if (Float.isNaN(this.f238185j)) {
                float fA = cache.a(view, this.f240064q, 0);
                this.f238185j = fA;
                if (Float.isNaN(fA)) {
                    this.f238185j = 0.0f;
                }
            }
            float f12 = (float) ((((j10 * 1.0E-9d) * ((double) f10)) + ((double) this.f238185j)) % 1.0d);
            this.f238185j = f12;
            this.f238184i = time;
            float fA2 = a(f12);
            this.f238183h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f240068u;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f238183h;
                float f13 = this.f240067t[i10];
                this.f238183h = z10 | (((double) f13) != 0.0d);
                fArr2[i10] = (f13 * fA2) + f11;
                i10++;
            }
            C5732a.b(this.f240065r.valueAt(0), view, this.f240068u);
            if (f10 != 0.0f) {
                this.f238183h = true;
            }
            return this.f238183h;
        }

        public void k(int position, ConstraintAttribute value, float period, int shape, float offset) {
            this.f240065r.append(position, value);
            this.f240066s.append(position, new float[]{period, offset});
            this.f238177b = Math.max(this.f238177b, shape);
        }
    }

    /* JADX INFO: renamed from: w0.f$c */
    public static class c extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setElevation(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$d */
    public static class d extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            return this.f238183h;
        }

        public boolean k(View view, C5566h cache, float t10, long time, double dx, double dy) {
            view.setRotation(g(t10, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$e */
    public static class e extends AbstractC5737f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f240069q = false;

        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            e eVar;
            Method method;
            if (view instanceof MotionLayout) {
                eVar = this;
                ((MotionLayout) view).V0(g(t10, time, view, cache));
            } else {
                eVar = this;
                if (eVar.f240069q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    eVar.f240069q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(eVar.g(t10, time, view, cache)));
                    } catch (IllegalAccessException e10) {
                        Log.e(AbstractC5737f.f240063p, "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e(AbstractC5737f.f240063p, "unable to setProgress", e11);
                    }
                }
            }
            return eVar.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$f, reason: collision with other inner class name */
    public static class C0898f extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setRotation(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$g */
    public static class g extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setRotationX(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$h */
    public static class h extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setRotationY(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$i */
    public static class i extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setScaleX(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$j */
    public static class j extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setScaleY(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$k */
    public static class k extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setTranslationX(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$l */
    public static class l extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setTranslationY(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    /* JADX INFO: renamed from: w0.f$m */
    public static class m extends AbstractC5737f {
        @Override // w0.AbstractC5737f
        public boolean j(View view, float t10, long time, C5566h cache) {
            view.setTranslationZ(g(t10, time, view, cache));
            return this.f238183h;
        }
    }

    public static AbstractC5737f h(String str, SparseArray<ConstraintAttribute> attrList) {
        return new b(str, attrList);
    }

    public static AbstractC5737f i(String str, long currentTime) {
        AbstractC5737f gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C0898f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(currentTime);
        return gVar;
    }

    public float g(float pos, long time, View view, C5566h cache) {
        this.f238176a.e(pos, this.f238182g);
        float[] fArr = this.f238182g;
        float f10 = fArr[1];
        if (f10 == 0.0f) {
            this.f238183h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f238185j)) {
            float fA = cache.a(view, this.f238181f, 0);
            this.f238185j = fA;
            if (Float.isNaN(fA)) {
                this.f238185j = 0.0f;
            }
        }
        float f11 = (float) (((((time - this.f238184i) * 1.0E-9d) * ((double) f10)) + ((double) this.f238185j)) % 1.0d);
        this.f238185j = f11;
        cache.b(view, this.f238181f, 0, f11);
        this.f238184i = time;
        float f12 = this.f238182g[0];
        float fA2 = (a(this.f238185j) * f12) + this.f238182g[2];
        this.f238183h = (f12 == 0.0f && f10 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean j(View view, float t10, long time, C5566h cache);
}
