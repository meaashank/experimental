package w0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s0.AbstractC5561c;
import s0.p;

/* JADX INFO: renamed from: w0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5735d extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f240053g = "ViewSpline";

    /* JADX INFO: renamed from: w0.d$a */
    public static class a extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setAlpha(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$b */
    public static class b extends AbstractC5735d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f240054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f240055i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f240056j;

        public b(String attribute, SparseArray<ConstraintAttribute> attrList) {
            this.f240054h = attribute.split(",")[1];
            this.f240055i = attrList;
        }

        @Override // s0.p
        public void g(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // s0.p
        public void j(int curveType) {
            int size = this.f240055i.size();
            int iP = this.f240055i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f240056j = new float[iP];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iP);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f240055i.keyAt(i10);
                ConstraintAttribute constraintAttributeValueAt = this.f240055i.valueAt(i10);
                dArr[i10] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.l(this.f240056j);
                int i11 = 0;
                while (true) {
                    if (i11 < this.f240056j.length) {
                        dArr2[i10][i11] = r6[i11];
                        i11++;
                    }
                }
            }
            this.f238128a = AbstractC5561c.a(curveType, dArr, dArr2);
        }

        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            this.f238128a.e(t10, this.f240056j);
            C5732a.b(this.f240055i.valueAt(0), view, this.f240056j);
        }

        public void n(int position, ConstraintAttribute value) {
            this.f240055i.append(position, value);
        }
    }

    /* JADX INFO: renamed from: w0.d$c */
    public static class c extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setElevation(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$e */
    public static class e extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setPivotX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$f */
    public static class f extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setPivotY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$g */
    public static class g extends AbstractC5735d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f240057h = false;

        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).V0(a(t10));
                return;
            }
            if (this.f240057h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f240057h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(t10)));
                } catch (IllegalAccessException e10) {
                    Log.e(AbstractC5735d.f240053g, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(AbstractC5735d.f240053g, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w0.d$h */
    public static class h extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setRotation(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$i */
    public static class i extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setRotationX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$j */
    public static class j extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setRotationY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$k */
    public static class k extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setScaleX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$l */
    public static class l extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setScaleY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$m */
    public static class m extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setTranslationX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$n */
    public static class n extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setTranslationY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.d$o */
    public static class o extends AbstractC5735d {
        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
            view.setTranslationZ(a(t10));
        }
    }

    public static AbstractC5735d k(String str, SparseArray<ConstraintAttribute> attrList) {
        return new b(str, attrList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC5735d l(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -797520672:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f106860t)) {
                    b10 = 8;
                }
                break;
            case -760884510:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f106852l)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f106853m)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f106849i)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 12;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = Ascii.SO;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = Ascii.SI;
                }
                break;
        }
        switch (b10) {
        }
        return new a();
    }

    public abstract void m(View view, float t10);

    /* JADX INFO: renamed from: w0.d$d, reason: collision with other inner class name */
    public static class C0897d extends AbstractC5735d {
        public void n(View view, float t10, double dx, double dy) {
            view.setRotation(a(t10) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // w0.AbstractC5735d
        public void m(View view, float t10) {
        }
    }
}
