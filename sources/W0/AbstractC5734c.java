package w0;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: w0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5734c extends s0.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f240049i = "ViewOscillator";

    /* JADX INFO: renamed from: w0.c$a */
    public static class a extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setAlpha(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$b */
    public static class b extends AbstractC5734c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f240050j = new float[1];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ConstraintAttribute f240051k;

        @Override // s0.i
        public void e(Object custom) {
            this.f240051k = (ConstraintAttribute) custom;
        }

        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            this.f240050j[0] = a(t10);
            C5732a.b(this.f240051k, view, this.f240050j);
        }
    }

    /* JADX INFO: renamed from: w0.c$c, reason: collision with other inner class name */
    public static class C0896c extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setElevation(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$e */
    public static class e extends AbstractC5734c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f240052j = false;

        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).V0(a(t10));
                return;
            }
            if (this.f240052j) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f240052j = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(t10)));
                } catch (IllegalAccessException e10) {
                    Log.e(AbstractC5734c.f240049i, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(AbstractC5734c.f240049i, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w0.c$f */
    public static class f extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setRotation(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$g */
    public static class g extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setRotationX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$h */
    public static class h extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setRotationY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$i */
    public static class i extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setScaleX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$j */
    public static class j extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setScaleY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$k */
    public static class k extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setTranslationX(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$l */
    public static class l extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setTranslationY(a(t10));
        }
    }

    /* JADX INFO: renamed from: w0.c$m */
    public static class m extends AbstractC5734c {
        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
            view.setTranslationZ(a(t10));
        }
    }

    public static AbstractC5734c l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
            case "elevation":
                return new C0896c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float t10);

    /* JADX INFO: renamed from: w0.c$d */
    public static class d extends AbstractC5734c {
        public void n(View view, float t10, double dx, double dy) {
            view.setRotation(a(t10) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // w0.AbstractC5734c
        public void m(View view, float t10) {
        }
    }
}
