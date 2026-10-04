package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.b1;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(30)
public interface I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f90525a = a.f90526a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f90526a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f90527b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final d f90528c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final c f90529d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final C0198a f90530e = new C0198a();

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.I0$a$a, reason: collision with other inner class name */
        public static final class C0198a implements I0 {
            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float a(float f10, float f11) {
                return G0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float b(float f10, float f11) {
                return G0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public long c(long j10) {
                return P.h.a(0.0f, P.g.r(j10));
            }

            @Override // androidx.compose.foundation.layout.I0
            public float d(float f10, float f11) {
                return -f11;
            }

            @Override // androidx.compose.foundation.layout.I0
            @NotNull
            public Insets e(@NotNull Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, insets.right, i10);
            }

            @Override // androidx.compose.foundation.layout.I0
            public int f(@NotNull Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.I0
            public long g(long j10, float f10) {
                return k0.F.a(0.0f, k0.E.n(j10) + f10);
            }
        }

        public static final class b implements I0 {
            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float a(float f10, float f11) {
                return G0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float b(float f10, float f11) {
                return G0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public long c(long j10) {
                return P.h.a(P.g.p(j10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.I0
            public float d(float f10, float f11) {
                return f10;
            }

            @Override // androidx.compose.foundation.layout.I0
            @NotNull
            public Insets e(@NotNull Insets insets, int i10) {
                return Insets.of(i10, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.I0
            public int f(@NotNull Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.I0
            public long g(long j10, float f10) {
                return k0.F.a(k0.E.l(j10) - f10, 0.0f);
            }
        }

        public static final class c implements I0 {
            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float a(float f10, float f11) {
                return G0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float b(float f10, float f11) {
                return G0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public long c(long j10) {
                return P.h.a(P.g.p(j10), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.I0
            public float d(float f10, float f11) {
                return -f10;
            }

            @Override // androidx.compose.foundation.layout.I0
            @NotNull
            public Insets e(@NotNull Insets insets, int i10) {
                return Insets.of(insets.left, insets.top, i10, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.I0
            public int f(@NotNull Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.I0
            public long g(long j10, float f10) {
                return k0.F.a(k0.E.l(j10) + f10, 0.0f);
            }
        }

        public static final class d implements I0 {
            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float a(float f10, float f11) {
                return G0.b(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public /* synthetic */ float b(float f10, float f11) {
                return G0.a(this, f10, f11);
            }

            @Override // androidx.compose.foundation.layout.I0
            public long c(long j10) {
                return P.h.a(0.0f, P.g.r(j10));
            }

            @Override // androidx.compose.foundation.layout.I0
            public float d(float f10, float f11) {
                return f11;
            }

            @Override // androidx.compose.foundation.layout.I0
            @NotNull
            public Insets e(@NotNull Insets insets, int i10) {
                return Insets.of(insets.left, i10, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.I0
            public int f(@NotNull Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.I0
            public long g(long j10, float f10) {
                return k0.F.a(0.0f, k0.E.n(j10) - f10);
            }
        }

        @NotNull
        public final I0 a(int i10, @NotNull LayoutDirection layoutDirection) {
            b1.a aVar = b1.f90872b;
            aVar.getClass();
            if (i10 == b1.f90881k) {
                return f90527b;
            }
            aVar.getClass();
            if (i10 == b1.f90879i) {
                return f90528c;
            }
            aVar.getClass();
            if (i10 == b1.f90882l) {
                return f90529d;
            }
            aVar.getClass();
            if (i10 == b1.f90880j) {
                return f90530e;
            }
            aVar.getClass();
            if (i10 == b1.f90877g) {
                return layoutDirection == LayoutDirection.Ltr ? f90527b : f90529d;
            }
            aVar.getClass();
            if (i10 == b1.f90878h) {
                return layoutDirection == LayoutDirection.Ltr ? f90529d : f90527b;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    float a(float f10, float f11);

    float b(float f10, float f11);

    long c(long j10);

    float d(float f10, float f11);

    @NotNull
    Insets e(@NotNull Insets insets, int i10);

    int f(@NotNull Insets insets);

    long g(long j10, float f10);
}
