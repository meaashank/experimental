package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import e.InterfaceC4348w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final float f113179A = 1.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final float f113180B = 0.1f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final float f113181C = 0.00390625f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final float f113182D = 0.002f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float f113183E = Float.MAX_VALUE;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float f113184F = 0.75f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f113185m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f113186n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f113187o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f113188p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f113189q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f113190r = new l(androidx.constraintlayout.motion.widget.f.f106849i);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f113191s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f113192t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f113193u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f113194v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f113195w = new C0296b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f113196x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f113197y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f113198z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f113199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f113200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f113201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f113202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.dynamicanimation.animation.g f113203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f113204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f113205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f113206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f113207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f113208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f113209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f113210l;

    public static class a extends s {
        public a(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getY();
        }

        public void b(View view, float f10) {
            view.setY(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    public static class C0296b extends s {
        public C0296b(String str) {
            super(str);
        }

        public float a(View view) {
            return C2507z0.I0(view);
        }

        public void b(View view, float f10) {
            C2507z0.J2(view, f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return C2507z0.I0(view);
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            C2507z0.J2(view, f10);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getAlpha();
        }

        public void b(View view, float f10) {
            view.setAlpha(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getScrollX();
        }

        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getScrollY();
        }

        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    public class f extends androidx.dynamicanimation.animation.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.dynamicanimation.animation.h f113211a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, androidx.dynamicanimation.animation.h hVar) {
            super(str);
            this.f113211a = hVar;
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(Object obj) {
            return this.f113211a.f113222a;
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(Object obj, float f10) {
            this.f113211a.f113222a = f10;
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getTranslationX();
        }

        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getTranslationY();
        }

        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str);
        }

        public float a(View view) {
            return C2507z0.D0(view);
        }

        public void b(View view, float f10) {
            C2507z0.F2(view, f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return C2507z0.D0(view);
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            C2507z0.F2(view, f10);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getScaleX();
        }

        public void b(View view, float f10) {
            view.setScaleX(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getScaleY();
        }

        public void b(View view, float f10) {
            view.setScaleY(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getRotation();
        }

        public void b(View view, float f10) {
            view.setRotation(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setRotation(f10);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getRotationX();
        }

        public void b(View view, float f10) {
            view.setRotationX(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getRotationY();
        }

        public void b(View view, float f10) {
            view.setRotationY(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str);
        }

        public float a(View view) {
            return view.getX();
        }

        public void b(View view, float f10) {
            view.setX(f10);
        }

        @Override // androidx.dynamicanimation.animation.g
        public float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.g
        public void setValue(View view, float f10) {
            view.setX(f10);
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f113213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f113214b;
    }

    public interface q {
        void onAnimationEnd(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void a(b bVar, float f10, float f11);
    }

    public static abstract class s extends androidx.dynamicanimation.animation.g<View> {
        public s(String str) {
            super(str);
        }

        public s(String str, g gVar) {
            super(str);
        }
    }

    public b(androidx.dynamicanimation.animation.h hVar) {
        this.f113199a = 0.0f;
        this.f113200b = Float.MAX_VALUE;
        this.f113201c = false;
        this.f113204f = false;
        this.f113205g = Float.MAX_VALUE;
        this.f113206h = -Float.MAX_VALUE;
        this.f113207i = 0L;
        this.f113209k = new ArrayList<>();
        this.f113210l = new ArrayList<>();
        this.f113202d = null;
        this.f113203e = new f("FloatValueHolder", hVar);
        this.f113208j = 1.0f;
    }

    public static <T> void m(ArrayList<T> arrayList, T t10) {
        int iIndexOf = arrayList.indexOf(t10);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean a(long j10) {
        long j11 = this.f113207i;
        if (j11 == 0) {
            this.f113207i = j10;
            s(this.f113200b);
            return false;
        }
        this.f113207i = j10;
        boolean zY = y(j10 - j11);
        float fMin = Math.min(this.f113200b, this.f113205g);
        this.f113200b = fMin;
        float fMax = Math.max(fMin, this.f113206h);
        this.f113200b = fMax;
        s(fMax);
        if (zY) {
            e(false);
        }
        return zY;
    }

    public T b(q qVar) {
        if (!this.f113209k.contains(qVar)) {
            this.f113209k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f113210l.contains(rVar)) {
            this.f113210l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f113204f) {
            e(true);
        }
    }

    public final void e(boolean z10) {
        this.f113204f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f113207i = 0L;
        this.f113201c = false;
        for (int i10 = 0; i10 < this.f113209k.size(); i10++) {
            if (this.f113209k.get(i10) != null) {
                this.f113209k.get(i10).onAnimationEnd(this, z10, this.f113200b, this.f113199a);
            }
        }
        n(this.f113209k);
    }

    public abstract float f(float f10, float f11);

    public float g() {
        return this.f113208j;
    }

    public final float h() {
        return this.f113203e.getValue(this.f113202d);
    }

    public float i() {
        return this.f113208j * 0.75f;
    }

    public abstract boolean j(float f10, float f11);

    public boolean k() {
        return this.f113204f;
    }

    public void l(q qVar) {
        m(this.f113209k, qVar);
    }

    public void o(r rVar) {
        m(this.f113210l, rVar);
    }

    public T p(float f10) {
        this.f113205g = f10;
        return this;
    }

    public T q(float f10) {
        this.f113206h = f10;
        return this;
    }

    public T r(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f113208j = f10;
        v(f10 * 0.75f);
        return this;
    }

    public void s(float f10) {
        this.f113203e.setValue(this.f113202d, f10);
        for (int i10 = 0; i10 < this.f113210l.size(); i10++) {
            if (this.f113210l.get(i10) != null) {
                this.f113210l.get(i10).a(this, this.f113200b, this.f113199a);
            }
        }
        n(this.f113210l);
    }

    public T t(float f10) {
        this.f113200b = f10;
        this.f113201c = true;
        return this;
    }

    public T u(float f10) {
        this.f113199a = f10;
        return this;
    }

    public abstract void v(float f10);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f113204f) {
            return;
        }
        x();
    }

    public final void x() {
        if (this.f113204f) {
            return;
        }
        this.f113204f = true;
        if (!this.f113201c) {
            this.f113200b = h();
        }
        float f10 = this.f113200b;
        if (f10 > this.f113205g || f10 < this.f113206h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    public abstract boolean y(long j10);

    public <K> b(K k10, androidx.dynamicanimation.animation.g<K> gVar) {
        this.f113199a = 0.0f;
        this.f113200b = Float.MAX_VALUE;
        this.f113201c = false;
        this.f113204f = false;
        this.f113205g = Float.MAX_VALUE;
        this.f113206h = -Float.MAX_VALUE;
        this.f113207i = 0L;
        this.f113209k = new ArrayList<>();
        this.f113210l = new ArrayList<>();
        this.f113202d = k10;
        this.f113203e = gVar;
        if (gVar != f113190r && gVar != f113191s && gVar != f113192t) {
            if (gVar == f113196x) {
                this.f113208j = 0.00390625f;
                return;
            } else if (gVar != f113188p && gVar != f113189q) {
                this.f113208j = 1.0f;
                return;
            } else {
                this.f113208j = 0.00390625f;
                return;
            }
        }
        this.f113208j = 0.1f;
    }
}
