package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C1979x1;
import androidx.core.view.M1;

/* JADX INFO: loaded from: classes2.dex */
public final class M1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f111561b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111562c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f111563d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f111564e = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f111565a;

    @e.T(20)
    public static class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final Window f111566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final C2474m0 f111567c;

        public a(@NonNull Window window, @NonNull C2474m0 c2474m0) {
            this.f111566b = window;
            this.f111567c = c2474m0;
        }

        @Override // androidx.core.view.M1.g
        public void a(h hVar) {
        }

        @Override // androidx.core.view.M1.g
        public void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, InterfaceC2445c1 interfaceC2445c1) {
        }

        @Override // androidx.core.view.M1.g
        public int c() {
            Object tag = this.f111566b.getDecorView().getTag(g.f111576a);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.M1.g
        public void d(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    l(i11);
                }
            }
        }

        @Override // androidx.core.view.M1.g
        public void g(@NonNull h hVar) {
        }

        @Override // androidx.core.view.M1.g
        public void j(int i10) {
            this.f111566b.getDecorView().setTag(g.f111576a, Integer.valueOf(i10));
            if (i10 == 0) {
                p(6144);
                return;
            }
            if (i10 == 1) {
                p(4096);
                m(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                p(2048);
                m(4096);
            }
        }

        @Override // androidx.core.view.M1.g
        public void k(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    o(i11);
                }
            }
        }

        public final void l(int i10) {
            if (i10 == 1) {
                m(4);
            } else if (i10 == 2) {
                m(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f111567c.a();
            }
        }

        public void m(int i10) {
            View decorView = this.f111566b.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void n(int i10) {
            this.f111566b.addFlags(i10);
        }

        public final void o(int i10) {
            if (i10 == 1) {
                p(4);
                q(1024);
            } else if (i10 == 2) {
                p(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f111567c.b();
            }
        }

        public void p(int i10) {
            View decorView = this.f111566b.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void q(int i10) {
            this.f111566b.clearFlags(i10);
        }
    }

    @e.T(23)
    public static class b extends a {
        public b(@NonNull Window window, @NonNull C2474m0 c2474m0) {
            super(window, c2474m0);
        }

        @Override // androidx.core.view.M1.g
        public boolean f() {
            return (this.f111566b.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.M1.g
        public void i(boolean z10) {
            if (!z10) {
                p(8192);
                return;
            }
            q(67108864);
            n(Integer.MIN_VALUE);
            m(8192);
        }
    }

    @e.T(26)
    public static class c extends b {
        public c(@NonNull Window window, @NonNull C2474m0 c2474m0) {
            super(window, c2474m0);
        }

        @Override // androidx.core.view.M1.g
        public boolean e() {
            return (this.f111566b.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.M1.g
        public void h(boolean z10) {
            if (!z10) {
                p(16);
                return;
            }
            q(C1979x1.f100279m);
            n(Integer.MIN_VALUE);
            m(16);
        }
    }

    @e.T(31)
    public static class e extends d {
        public e(@NonNull Window window, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            super(window, m12, c2474m0);
        }

        @Override // androidx.core.view.M1.d, androidx.core.view.M1.g
        @SuppressLint({"WrongConstant"})
        public int c() {
            return this.f111569c.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.M1.d, androidx.core.view.M1.g
        public void j(int i10) {
            this.f111569c.setSystemBarsBehavior(i10);
        }

        public e(@NonNull WindowInsetsController windowInsetsController, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            super(windowInsetsController, m12, c2474m0);
        }
    }

    @e.T(35)
    public static class f extends e {
        public f(@NonNull Window window, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            super(window, m12, c2474m0);
        }

        @Override // androidx.core.view.M1.d, androidx.core.view.M1.g
        public boolean e() {
            return (this.f111569c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.M1.d, androidx.core.view.M1.g
        public boolean f() {
            return (this.f111569c.getSystemBarsAppearance() & 8) != 0;
        }

        public f(@NonNull WindowInsetsController windowInsetsController, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            super(windowInsetsController, m12, c2474m0);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f111576a = 356039078;

        public void a(h hVar) {
        }

        public void b(int i10, long j10, Interpolator interpolator, CancellationSignal cancellationSignal, InterfaceC2445c1 interfaceC2445c1) {
        }

        public int c() {
            return 1;
        }

        public void d(int i10) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void g(@NonNull h hVar) {
        }

        public void h(boolean z10) {
        }

        public void i(boolean z10) {
        }

        public void j(int i10) {
        }

        public void k(int i10) {
        }
    }

    public interface h {
        void a(@NonNull M1 m12, int i10);
    }

    @e.T(30)
    @Deprecated
    public M1(@NonNull WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f111565a = new f(windowInsetsController, this, new C2474m0(windowInsetsController));
        } else {
            this.f111565a = new d(windowInsetsController, this, new C2474m0(windowInsetsController));
        }
    }

    @NonNull
    @e.T(30)
    @Deprecated
    public static M1 l(@NonNull WindowInsetsController windowInsetsController) {
        return new M1(windowInsetsController);
    }

    public void a(@NonNull h hVar) {
        this.f111565a.a(hVar);
    }

    public void b(int i10, long j10, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull InterfaceC2445c1 interfaceC2445c1) {
        this.f111565a.b(i10, j10, interpolator, cancellationSignal, interfaceC2445c1);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.f111565a.c();
    }

    public void d(int i10) {
        this.f111565a.d(i10);
    }

    public boolean e() {
        return this.f111565a.e();
    }

    public boolean f() {
        return this.f111565a.f();
    }

    public void g(@NonNull h hVar) {
        this.f111565a.g(hVar);
    }

    public void h(boolean z10) {
        this.f111565a.h(z10);
    }

    public void i(boolean z10) {
        this.f111565a.i(z10);
    }

    public void j(int i10) {
        this.f111565a.j(i10);
    }

    public void k(int i10) {
        this.f111565a.k(i10);
    }

    @e.T(30)
    public static class d extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final M1 f111568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsetsController f111569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2474m0 f111570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.collection.U0<h, WindowInsetsController.OnControllableInsetsChangedListener> f111571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Window f111572f;

        public class a implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public C2463i1 f111573a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2445c1 f111574b;

            public a(InterfaceC2445c1 interfaceC2445c1) {
                this.f111574b = interfaceC2445c1;
            }

            public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f111574b.a(windowInsetsAnimationController == null ? null : this.f111573a);
            }

            public void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f111574b.c(this.f111573a);
            }

            public void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i10) {
                C2463i1 c2463i1 = new C2463i1(windowInsetsAnimationController);
                this.f111573a = c2463i1;
                this.f111574b.b(c2463i1, i10);
            }
        }

        public d(@NonNull WindowInsetsController windowInsetsController, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            this.f111571e = new androidx.collection.U0<>();
            this.f111569c = windowInsetsController;
            this.f111568b = m12;
            this.f111570d = c2474m0;
        }

        public static /* synthetic */ void l(d dVar, h hVar, WindowInsetsController windowInsetsController, int i10) {
            if (dVar.f111569c == windowInsetsController) {
                hVar.a(dVar.f111568b, i10);
            }
        }

        @Override // androidx.core.view.M1.g
        public void a(@NonNull final h hVar) {
            if (this.f111571e.containsKey(hVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.T1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
                    M1.d.l(this.f111635a, hVar, windowInsetsController, i10);
                }
            };
            this.f111571e.put(hVar, onControllableInsetsChangedListener);
            this.f111569c.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // androidx.core.view.M1.g
        public void b(int i10, long j10, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull InterfaceC2445c1 interfaceC2445c1) {
            this.f111569c.controlWindowInsetsAnimation(i10, j10, interpolator, cancellationSignal, new a(interfaceC2445c1));
        }

        @Override // androidx.core.view.M1.g
        @SuppressLint({"WrongConstant"})
        public int c() {
            Window window = this.f111572f;
            if (window == null) {
                return this.f111569c.getSystemBarsBehavior();
            }
            Object tag = window.getDecorView().getTag(g.f111576a);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.M1.g
        public void d(int i10) {
            if ((i10 & 8) != 0) {
                this.f111570d.a();
            }
            this.f111569c.hide(i10 & (-9));
        }

        @Override // androidx.core.view.M1.g
        public boolean e() {
            this.f111569c.setSystemBarsAppearance(0, 0);
            return (this.f111569c.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.M1.g
        public boolean f() {
            this.f111569c.setSystemBarsAppearance(0, 0);
            return (this.f111569c.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.M1.g
        public void g(@NonNull h hVar) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerA = R1.a(this.f111571e.remove(hVar));
            if (onControllableInsetsChangedListenerA != null) {
                this.f111569c.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerA);
            }
        }

        @Override // androidx.core.view.M1.g
        public void h(boolean z10) {
            if (z10) {
                if (this.f111572f != null) {
                    m(16);
                }
                this.f111569c.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f111572f != null) {
                    n(16);
                }
                this.f111569c.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.M1.g
        public void i(boolean z10) {
            if (z10) {
                if (this.f111572f != null) {
                    m(8192);
                }
                this.f111569c.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f111572f != null) {
                    n(8192);
                }
                this.f111569c.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.M1.g
        public void j(int i10) {
            Window window = this.f111572f;
            if (window == null) {
                this.f111569c.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(g.f111576a, Integer.valueOf(i10));
            if (i10 == 0) {
                n(6144);
                return;
            }
            if (i10 == 1) {
                n(4096);
                m(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                n(2048);
                m(4096);
            }
        }

        @Override // androidx.core.view.M1.g
        public void k(int i10) {
            if ((i10 & 8) != 0) {
                this.f111570d.b();
            }
            this.f111569c.show(i10 & (-9));
        }

        public void m(int i10) {
            View decorView = this.f111572f.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void n(int i10) {
            View decorView = this.f111572f.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(@NonNull Window window, @NonNull M1 m12, @NonNull C2474m0 c2474m0) {
            this(window.getInsetsController(), m12, c2474m0);
            this.f111572f = window;
        }
    }

    public M1(@NonNull Window window, @NonNull View view) {
        C2474m0 c2474m0 = new C2474m0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f111565a = new f(window, this, c2474m0);
            return;
        }
        if (i10 >= 30) {
            this.f111565a = new d(window, this, c2474m0);
        } else if (i10 >= 26) {
            this.f111565a = new c(window, c2474m0);
        } else {
            this.f111565a = new b(window, c2474m0);
        }
    }
}
