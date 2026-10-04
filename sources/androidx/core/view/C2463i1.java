package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4348w;

/* JADX INFO: renamed from: androidx.core.view.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2463i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f111937a;

    /* JADX INFO: renamed from: androidx.core.view.i1$a */
    @e.T(30)
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowInsetsAnimationController f111938a;

        public a(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f111938a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.C2463i1.b
        public void a(boolean z10) {
            this.f111938a.finish(z10);
        }

        @Override // androidx.core.view.C2463i1.b
        public float b() {
            return this.f111938a.getCurrentAlpha();
        }

        @Override // androidx.core.view.C2463i1.b
        public float c() {
            return this.f111938a.getCurrentFraction();
        }

        @Override // androidx.core.view.C2463i1.b
        @NonNull
        public G0.D d() {
            return G0.D.g(this.f111938a.getCurrentInsets());
        }

        @Override // androidx.core.view.C2463i1.b
        @NonNull
        public G0.D e() {
            return G0.D.g(this.f111938a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.C2463i1.b
        @NonNull
        public G0.D f() {
            return G0.D.g(this.f111938a.getShownStateInsets());
        }

        @Override // androidx.core.view.C2463i1.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            return this.f111938a.getTypes();
        }

        @Override // androidx.core.view.C2463i1.b
        public boolean h() {
            return this.f111938a.isCancelled();
        }

        @Override // androidx.core.view.C2463i1.b
        public boolean i() {
            return this.f111938a.isFinished();
        }

        @Override // androidx.core.view.C2463i1.b
        public void j(@Nullable G0.D d10, float f10, float f11) {
            this.f111938a.setInsetsAndAlpha(d10 == null ? null : d10.h(), f10, f11);
        }
    }

    @e.T(30)
    public C2463i1(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f111937a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z10) {
        this.f111937a.a(z10);
    }

    public float b() {
        return this.f111937a.b();
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float c() {
        return this.f111937a.c();
    }

    @NonNull
    public G0.D d() {
        return this.f111937a.d();
    }

    @NonNull
    public G0.D e() {
        return this.f111937a.e();
    }

    @NonNull
    public G0.D f() {
        return this.f111937a.f();
    }

    public int g() {
        return this.f111937a.g();
    }

    public boolean h() {
        return this.f111937a.h();
    }

    public boolean i() {
        return this.f111937a.i();
    }

    public boolean j() {
        return (this.f111937a.i() || this.f111937a.h()) ? false : true;
    }

    public void k(@Nullable G0.D d10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11) {
        this.f111937a.j(d10, f10, f11);
    }

    /* JADX INFO: renamed from: androidx.core.view.i1$b */
    public static class b {
        public void a(boolean z10) {
        }

        public float b() {
            return 0.0f;
        }

        @InterfaceC4348w(from = 0.0d, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @NonNull
        public G0.D d() {
            return G0.D.f40030e;
        }

        @NonNull
        public G0.D e() {
            return G0.D.f40030e;
        }

        @NonNull
        public G0.D f() {
            return G0.D.f40030e;
        }

        public int g() {
            return 0;
        }

        public boolean h() {
            return true;
        }

        public boolean i() {
            return false;
        }

        public void j(@Nullable G0.D d10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f11) {
        }
    }
}
