package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f111710b = "WindowInsetsCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final WindowInsetsCompat f111711c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f111712a;

    @e.T(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f111713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f111714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f111715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f111716d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f111713a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f111714b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f111715c = declaredField3;
                declaredField3.setAccessible(true);
                f111716d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w(WindowInsetsCompat.f111710b, "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            if (f111716d && view.isAttachedToWindow()) {
                try {
                    Object obj = f111713a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f111714b.get(obj);
                        Rect rect2 = (Rect) f111715c.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat windowInsetsCompatBuild = new Builder().setStableInsets(G0.D.e(rect)).setSystemWindowInsets(G0.D.e(rect2)).build();
                            windowInsetsCompatBuild.H(windowInsetsCompatBuild);
                            windowInsetsCompatBuild.d(view.getRootView());
                            return windowInsetsCompatBuild;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w(WindowInsetsCompat.f111710b, "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    @e.T(30)
    public static class d extends c {
        public d() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void d(int i10, @NonNull G0.D d10) {
            this.f111723c.setInsets(m.a(i10), d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void e(int i10, @NonNull G0.D d10) {
            this.f111723c.setInsetsIgnoringVisibility(m.a(i10), d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void k(int i10, boolean z10) {
            this.f111723c.setVisible(m.a(i10), z10);
        }

        public d(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f111724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public G0.D[] f111725b;

        public e() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public final void a() {
            G0.D[] dArr = this.f111725b;
            if (dArr != null) {
                G0.D dF = dArr[0];
                G0.D dF2 = dArr[1];
                if (dF2 == null) {
                    dF2 = this.f111724a.f(2);
                }
                if (dF == null) {
                    dF = this.f111724a.f(1);
                }
                i(G0.D.b(dF, dF2));
                G0.D d10 = this.f111725b[l.e(16)];
                if (d10 != null) {
                    h(d10);
                }
                G0.D d11 = this.f111725b[l.e(32)];
                if (d11 != null) {
                    f(d11);
                }
                G0.D d12 = this.f111725b[l.e(64)];
                if (d12 != null) {
                    j(d12);
                }
            }
        }

        @NonNull
        public WindowInsetsCompat b() {
            a();
            return this.f111724a;
        }

        public void c(@Nullable C2504y c2504y) {
        }

        public void d(int i10, @NonNull G0.D d10) {
            if (this.f111725b == null) {
                this.f111725b = new G0.D[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f111725b[l.e(i11)] = d10;
                }
            }
        }

        public void e(int i10, @NonNull G0.D d10) {
            if (i10 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        public void k(int i10, boolean z10) {
        }

        public e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f111724a = windowInsetsCompat;
        }

        public void f(@NonNull G0.D d10) {
        }

        public void g(@NonNull G0.D d10) {
        }

        public void h(@NonNull G0.D d10) {
        }

        public void i(@NonNull G0.D d10) {
        }

        public void j(@NonNull G0.D d10) {
        }
    }

    @e.T(28)
    public static class h extends g {
        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat a() {
            return WindowInsetsCompat.K(this.f111731c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f111731c, hVar.f111731c) && Objects.equals(this.f111735g, hVar.f111735g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @Nullable
        public C2504y f() {
            return C2504y.j(this.f111731c.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public int hashCode() {
            return this.f111731c.hashCode();
        }

        public h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull h hVar) {
            super(windowInsetsCompat, hVar);
        }
    }

    @e.T(30)
    public static class j extends i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f111740q = WindowInsetsCompat.K(WindowInsets.CONSUMED);

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public final void d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D g(int i10) {
            return G0.D.g(this.f111731c.getInsets(m.a(i10)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D h(int i10) {
            return G0.D.g(this.f111731c.getInsetsIgnoringVisibility(m.a(i10)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        public boolean q(int i10) {
            return this.f111731c.isVisible(m.a(i10));
        }

        public j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull j jVar) {
            super(windowInsetsCompat, jVar);
        }
    }

    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f111743a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f111744b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f111745c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f111746d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f111747e = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f111748f = 16;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f111749g = 32;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f111750h = 64;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f111751i = 128;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f111752j = 256;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f111753k = 9;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f111754l = 256;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        @SuppressLint({"WrongConstant"})
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        public static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.c.a("type needs to be >= FIRST and <= LAST, type=", i10));
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 7;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    @e.T(30)
    public static final class m {
        private m() {
        }

        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f111711c = j.f111740q;
        } else {
            f111711c = k.f111741b;
        }
    }

    @e.T(20)
    public WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f111712a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f111712a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f111712a = new h(this, windowInsets);
        } else {
            this.f111712a = new g(this, windowInsets);
        }
    }

    @NonNull
    @e.T(20)
    public static WindowInsetsCompat K(@NonNull WindowInsets windowInsets) {
        return L(windowInsets, null);
    }

    @NonNull
    @e.T(20)
    public static WindowInsetsCompat L(@NonNull WindowInsets windowInsets, @Nullable View view) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.H(C2507z0.r0(view));
            windowInsetsCompat.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public static G0.D z(@NonNull G0.D d10, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, d10.f40031a - i10);
        int iMax2 = Math.max(0, d10.f40032b - i11);
        int iMax3 = Math.max(0, d10.f40033c - i12);
        int iMax4 = Math.max(0, d10.f40034d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? d10 : G0.D.d(iMax, iMax2, iMax3, iMax4);
    }

    public boolean A() {
        return this.f111712a.o();
    }

    public boolean B() {
        return this.f111712a.p();
    }

    public boolean C(int i10) {
        return this.f111712a.q(i10);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat D(int i10, int i11, int i12, int i13) {
        return new Builder(this).setSystemWindowInsets(G0.D.d(i10, i11, i12, i13)).build();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat E(@NonNull Rect rect) {
        return new Builder(this).setSystemWindowInsets(G0.D.e(rect)).build();
    }

    public void F(G0.D[] dArr) {
        this.f111712a.r(dArr);
    }

    public void G(@NonNull G0.D d10) {
        this.f111712a.s(d10);
    }

    public void H(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.f111712a.t(windowInsetsCompat);
    }

    public void I(@Nullable G0.D d10) {
        this.f111712a.u(d10);
    }

    @Nullable
    @e.T(20)
    public WindowInsets J() {
        k kVar = this.f111712a;
        if (kVar instanceof f) {
            return ((f) kVar).f111731c;
        }
        return null;
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat a() {
        return this.f111712a.a();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat b() {
        return this.f111712a.b();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat c() {
        return this.f111712a.c();
    }

    public void d(@NonNull View view) {
        this.f111712a.d(view);
    }

    @Nullable
    public C2504y e() {
        return this.f111712a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.f111712a, ((WindowInsetsCompat) obj).f111712a);
        }
        return false;
    }

    @NonNull
    public G0.D f(int i10) {
        return this.f111712a.g(i10);
    }

    @NonNull
    public G0.D g(int i10) {
        return this.f111712a.h(i10);
    }

    @NonNull
    @Deprecated
    public G0.D h() {
        return this.f111712a.i();
    }

    public int hashCode() {
        k kVar = this.f111712a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f111712a.j().f40034d;
    }

    @Deprecated
    public int j() {
        return this.f111712a.j().f40031a;
    }

    @Deprecated
    public int k() {
        return this.f111712a.j().f40033c;
    }

    @Deprecated
    public int l() {
        return this.f111712a.j().f40032b;
    }

    @NonNull
    @Deprecated
    public G0.D m() {
        return this.f111712a.j();
    }

    @NonNull
    @Deprecated
    public G0.D n() {
        return this.f111712a.k();
    }

    @Deprecated
    public int o() {
        return this.f111712a.l().f40034d;
    }

    @Deprecated
    public int p() {
        return this.f111712a.l().f40031a;
    }

    @Deprecated
    public int q() {
        return this.f111712a.l().f40033c;
    }

    @Deprecated
    public int r() {
        return this.f111712a.l().f40032b;
    }

    @NonNull
    @Deprecated
    public G0.D s() {
        return this.f111712a.l();
    }

    @NonNull
    @Deprecated
    public G0.D t() {
        return this.f111712a.m();
    }

    public boolean u() {
        G0.D dF = f(-1);
        G0.D d10 = G0.D.f40030e;
        return (dF.equals(d10) && g(-9).equals(d10) && e() == null) ? false : true;
    }

    @Deprecated
    public boolean v() {
        return !this.f111712a.j().equals(G0.D.f40030e);
    }

    @Deprecated
    public boolean w() {
        return !this.f111712a.l().equals(G0.D.f40030e);
    }

    @NonNull
    public WindowInsetsCompat x(@e.D(from = 0) int i10, @e.D(from = 0) int i11, @e.D(from = 0) int i12, @e.D(from = 0) int i13) {
        return this.f111712a.n(i10, i11, i12, i13);
    }

    @NonNull
    public WindowInsetsCompat y(@NonNull G0.D d10) {
        return x(d10.f40031a, d10.f40032b, d10.f40033c, d10.f40034d);
    }

    @e.T(api = 20)
    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f111717e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f111718f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f111719g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f111720h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f111721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public G0.D f111722d;

        public b() {
            this.f111721c = l();
        }

        @Nullable
        private static WindowInsets l() {
            if (!f111718f) {
                try {
                    f111717e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i(WindowInsetsCompat.f111710b, "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f111718f = true;
            }
            Field field = f111717e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i(WindowInsetsCompat.f111710b, "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f111720h) {
                try {
                    f111719g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i(WindowInsetsCompat.f111710b, "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f111720h = true;
            }
            Constructor<WindowInsets> constructor = f111719g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i(WindowInsetsCompat.f111710b, "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatK = WindowInsetsCompat.K(this.f111721c);
            windowInsetsCompatK.F(this.f111725b);
            windowInsetsCompatK.I(this.f111722d);
            return windowInsetsCompatK;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void g(@Nullable G0.D d10) {
            this.f111722d = d10;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void i(@NonNull G0.D d10) {
            WindowInsets windowInsets = this.f111721c;
            if (windowInsets != null) {
                this.f111721c = windowInsets.replaceSystemWindowInsets(d10.f40031a, d10.f40032b, d10.f40033c, d10.f40034d);
            }
        }

        public b(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f111721c = windowInsetsCompat.J();
        }
    }

    @e.T(api = 29)
    public static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f111723c;

        public c() {
            this.f111723c = C2487q1.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat windowInsetsCompatK = WindowInsetsCompat.K(this.f111723c.build());
            windowInsetsCompatK.F(this.f111725b);
            return windowInsetsCompatK;
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void c(@Nullable C2504y c2504y) {
            this.f111723c.setDisplayCutout(c2504y != null ? c2504y.f111972a : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void f(@NonNull G0.D d10) {
            this.f111723c.setMandatorySystemGestureInsets(d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void g(@NonNull G0.D d10) {
            this.f111723c.setStableInsets(d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void h(@NonNull G0.D d10) {
            this.f111723c.setSystemGestureInsets(d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void i(@NonNull G0.D d10) {
            this.f111723c.setSystemWindowInsets(d10.h());
        }

        @Override // androidx.core.view.WindowInsetsCompat.e
        public void j(@NonNull G0.D d10) {
            this.f111723c.setTappableElementInsets(d10.h());
        }

        public c(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderA;
            super(windowInsetsCompat);
            WindowInsets windowInsetsJ = windowInsetsCompat.J();
            if (windowInsetsJ != null) {
                builderA = C2489r1.a(windowInsetsJ);
            } else {
                builderA = C2487q1.a();
            }
            this.f111723c = builderA;
        }
    }

    @e.T(21)
    public static class g extends f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public G0.D f111736m;

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f111736m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.K(this.f111731c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.K(this.f111731c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public final G0.D j() {
            if (this.f111736m == null) {
                this.f111736m = G0.D.d(this.f111731c.getStableInsetLeft(), this.f111731c.getStableInsetTop(), this.f111731c.getStableInsetRight(), this.f111731c.getStableInsetBottom());
            }
            return this.f111736m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean o() {
            return this.f111731c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void u(@Nullable G0.D d10) {
            this.f111736m = d10;
        }

        public g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull g gVar) {
            super(windowInsetsCompat, gVar);
            this.f111736m = null;
            this.f111736m = gVar.f111736m;
        }
    }

    @e.T(20)
    public static class f extends k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f111726h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f111727i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class<?> f111728j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f111729k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f111730l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final WindowInsets f111731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public G0.D[] f111732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public G0.D f111733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WindowInsetsCompat f111734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public G0.D f111735g;

        public f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f111733e = null;
            this.f111731c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f111727i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f111728j = cls;
                f111729k = cls.getDeclaredField("mVisibleInsets");
                f111730l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f111729k.setAccessible(true);
                f111730l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e(WindowInsetsCompat.f111710b, "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f111726h = true;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private G0.D v(int i10, boolean z10) {
            G0.D dB = G0.D.f40030e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    dB = G0.D.b(dB, w(i11, z10));
                }
            }
            return dB;
        }

        private G0.D x() {
            WindowInsetsCompat windowInsetsCompat = this.f111734f;
            return windowInsetsCompat != null ? windowInsetsCompat.m() : G0.D.f40030e;
        }

        @Nullable
        private G0.D y(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f111726h) {
                A();
            }
            Method method = f111727i;
            if (method != null && f111728j != null && f111729k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w(WindowInsetsCompat.f111710b, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f111729k.get(f111730l.get(objInvoke));
                    if (rect != null) {
                        return G0.D.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e(WindowInsetsCompat.f111710b, "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void d(@NonNull View view) {
            G0.D dY = y(view);
            if (dY == null) {
                dY = G0.D.f40030e;
            }
            s(dY);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.H(this.f111734f);
            windowInsetsCompat.G(this.f111735g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f111735g, ((f) obj).f111735g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public final G0.D l() {
            if (this.f111733e == null) {
                this.f111733e = G0.D.d(this.f111731c.getSystemWindowInsetLeft(), this.f111731c.getSystemWindowInsetTop(), this.f111731c.getSystemWindowInsetRight(), this.f111731c.getSystemWindowInsetBottom());
            }
            return this.f111733e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            Builder builder = new Builder(WindowInsetsCompat.K(this.f111731c));
            builder.setSystemWindowInsets(WindowInsetsCompat.z(l(), i10, i11, i12, i13));
            builder.setStableInsets(WindowInsetsCompat.z(j(), i10, i11, i12, i13));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public boolean p() {
            return this.f111731c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void r(G0.D[] dArr) {
            this.f111732d = dArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void s(@NonNull G0.D d10) {
            this.f111735g = d10;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        public void t(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f111734f = windowInsetsCompat;
        }

        @NonNull
        public G0.D w(int i10, boolean z10) {
            G0.D dM;
            int i11;
            if (i10 == 1) {
                return z10 ? G0.D.d(0, Math.max(x().f40032b, l().f40032b), 0, 0) : G0.D.d(0, l().f40032b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    G0.D dX = x();
                    G0.D dJ = j();
                    return G0.D.d(Math.max(dX.f40031a, dJ.f40031a), 0, Math.max(dX.f40033c, dJ.f40033c), Math.max(dX.f40034d, dJ.f40034d));
                }
                G0.D dL = l();
                WindowInsetsCompat windowInsetsCompat = this.f111734f;
                dM = windowInsetsCompat != null ? windowInsetsCompat.m() : null;
                int iMin = dL.f40034d;
                if (dM != null) {
                    iMin = Math.min(iMin, dM.f40034d);
                }
                return G0.D.d(dL.f40031a, 0, dL.f40033c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return G0.D.f40030e;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.f111734f;
                C2504y c2504yE = windowInsetsCompat2 != null ? windowInsetsCompat2.e() : f();
                return c2504yE != null ? G0.D.d(c2504yE.e(), c2504yE.g(), c2504yE.f(), c2504yE.d()) : G0.D.f40030e;
            }
            G0.D[] dArr = this.f111732d;
            dM = dArr != null ? dArr[l.e(8)] : null;
            if (dM != null) {
                return dM;
            }
            G0.D dL2 = l();
            G0.D dX2 = x();
            int i12 = dL2.f40034d;
            if (i12 > dX2.f40034d) {
                return G0.D.d(0, 0, 0, i12);
            }
            G0.D d10 = this.f111735g;
            return (d10 == null || d10.equals(G0.D.f40030e) || (i11 = this.f111735g.f40034d) <= dX2.f40034d) ? G0.D.f40030e : G0.D.d(0, 0, 0, i11);
        }

        public boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(G0.D.f40030e);
        }

        public f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull f fVar) {
            this(windowInsetsCompat, new WindowInsets(fVar.f111731c));
        }
    }

    @e.T(29)
    public static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public G0.D f111737n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public G0.D f111738o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public G0.D f111739p;

        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f111737n = null;
            this.f111738o = null;
            this.f111739p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D i() {
            if (this.f111738o == null) {
                this.f111738o = G0.D.g(this.f111731c.getMandatorySystemGestureInsets());
            }
            return this.f111738o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D k() {
            if (this.f111737n == null) {
                this.f111737n = G0.D.g(this.f111731c.getSystemGestureInsets());
            }
            return this.f111737n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public G0.D m() {
            if (this.f111739p == null) {
                this.f111739p = G0.D.g(this.f111731c.getTappableElementInsets());
            }
            return this.f111739p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.f, androidx.core.view.WindowInsetsCompat.k
        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            return WindowInsetsCompat.K(this.f111731c.inset(i10, i11, i12, i13));
        }

        public i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull i iVar) {
            super(windowInsetsCompat, iVar);
            this.f111737n = null;
            this.f111738o = null;
            this.f111739p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.g, androidx.core.view.WindowInsetsCompat.k
        public void u(@Nullable G0.D d10) {
        }
    }

    public static final class Builder {
        private final e mImpl;

        public Builder() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.mImpl = new d();
            } else if (i10 >= 29) {
                this.mImpl = new c();
            } else {
                this.mImpl = new b();
            }
        }

        @NonNull
        public WindowInsetsCompat build() {
            return this.mImpl.b();
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable C2504y c2504y) {
            this.mImpl.c(c2504y);
            return this;
        }

        @NonNull
        public Builder setInsets(int i10, @NonNull G0.D d10) {
            this.mImpl.d(i10, d10);
            return this;
        }

        @NonNull
        public Builder setInsetsIgnoringVisibility(int i10, @NonNull G0.D d10) {
            this.mImpl.e(i10, d10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setMandatorySystemGestureInsets(@NonNull G0.D d10) {
            this.mImpl.f(d10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setStableInsets(@NonNull G0.D d10) {
            this.mImpl.g(d10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemGestureInsets(@NonNull G0.D d10) {
            this.mImpl.h(d10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemWindowInsets(@NonNull G0.D d10) {
            this.mImpl.i(d10);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTappableElementInsets(@NonNull G0.D d10) {
            this.mImpl.j(d10);
            return this;
        }

        @NonNull
        public Builder setVisible(int i10, boolean z10) {
            this.mImpl.k(i10, z10);
            return this;
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.mImpl = new d(windowInsetsCompat);
            } else if (i10 >= 29) {
                this.mImpl = new c(windowInsetsCompat);
            } else {
                this.mImpl = new b(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            k kVar = windowInsetsCompat.f111712a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f111712a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f111712a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f111712a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f111712a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f111712a = new f(this, (f) kVar);
            } else {
                this.f111712a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f111712a = new k(this);
    }

    public static class k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f111741b = new Builder().build().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f111742a;

        public k(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f111742a = windowInsetsCompat;
        }

        @NonNull
        public WindowInsetsCompat a() {
            return this.f111742a;
        }

        @NonNull
        public WindowInsetsCompat b() {
            return this.f111742a;
        }

        @NonNull
        public WindowInsetsCompat c() {
            return this.f111742a;
        }

        public void d(@NonNull View view) {
        }

        public void e(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && Objects.equals(l(), kVar.l()) && Objects.equals(j(), kVar.j()) && Objects.equals(f(), kVar.f());
        }

        @Nullable
        public C2504y f() {
            return null;
        }

        @NonNull
        public G0.D g(int i10) {
            return G0.D.f40030e;
        }

        @NonNull
        public G0.D h(int i10) {
            if ((i10 & 8) == 0) {
                return G0.D.f40030e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        @NonNull
        public G0.D i() {
            return l();
        }

        @NonNull
        public G0.D j() {
            return G0.D.f40030e;
        }

        @NonNull
        public G0.D k() {
            return l();
        }

        @NonNull
        public G0.D l() {
            return G0.D.f40030e;
        }

        @NonNull
        public G0.D m() {
            return l();
        }

        @NonNull
        public WindowInsetsCompat n(int i10, int i11, int i12, int i13) {
            return f111741b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void t(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void r(G0.D[] dArr) {
        }

        public void s(@NonNull G0.D d10) {
        }

        public void u(G0.D d10) {
        }
    }
}
