package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AbstractC1673d;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.AbstractC2155a;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f90243b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f90242a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final B f90244c = b.f90248f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final B f90245d = f.f90251f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final B f90246e = d.f90249f;

    public static final class a extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final AbstractC1673d f90247f;

        public a(@NotNull AbstractC1673d abstractC1673d) {
            this.f90247f = abstractC1673d;
        }

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            int iA = this.f90247f.a(v0Var);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i12 = i11 - iA;
            return layoutDirection == LayoutDirection.Rtl ? i10 - i12 : i12;
        }

        @Override // androidx.compose.foundation.layout.B
        @NotNull
        public Integer e(@NotNull androidx.compose.ui.layout.v0 v0Var) {
            return Integer.valueOf(this.f90247f.a(v0Var));
        }

        @NotNull
        public final AbstractC1673d g() {
            return this.f90247f;
        }
    }

    public static final class b extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f90248f = new b();

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            return i10 / 2;
        }
    }

    public static final class c {
        public c() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @T1
        public static /* synthetic */ void f() {
        }

        @T1
        public static /* synthetic */ void h() {
        }

        @NotNull
        public final B a(@NotNull AbstractC2155a abstractC2155a) {
            return new a(new AbstractC1673d.b(abstractC2155a));
        }

        @NotNull
        public final B b(@NotNull AbstractC1673d abstractC1673d) {
            return new a(abstractC1673d);
        }

        @NotNull
        public final B c() {
            return B.f90244c;
        }

        @NotNull
        public final B e() {
            return B.f90246e;
        }

        @NotNull
        public final B g() {
            return B.f90245d;
        }

        @NotNull
        public final B i(@NotNull c.b bVar) {
            return new e(bVar);
        }

        @NotNull
        public final B j(@NotNull c.InterfaceC0245c interfaceC0245c) {
            return new g(interfaceC0245c);
        }

        public c(C4969v c4969v) {
        }
    }

    public static final class d extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final d f90249f = new d();

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return i10;
            }
            return 0;
        }
    }

    public static final class e extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final c.b f90250f;

        public e(@NotNull c.b bVar) {
            this.f90250f = bVar;
        }

        public static e i(e eVar, c.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = eVar.f90250f;
            }
            eVar.getClass();
            return new e(bVar);
        }

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            return this.f90250f.a(0, i10, layoutDirection);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.G.g(this.f90250f, ((e) obj).f90250f);
        }

        @NotNull
        public final c.b g() {
            return this.f90250f;
        }

        @NotNull
        public final e h(@NotNull c.b bVar) {
            return new e(bVar);
        }

        public int hashCode() {
            return this.f90250f.hashCode();
        }

        @NotNull
        public final c.b j() {
            return this.f90250f;
        }

        @NotNull
        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f90250f + ')';
        }
    }

    public static final class f extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f90251f = new f();

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            if (layoutDirection == LayoutDirection.Ltr) {
                return 0;
            }
            return i10;
        }
    }

    public static final class g extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final c.InterfaceC0245c f90252f;

        public g(@NotNull c.InterfaceC0245c interfaceC0245c) {
            this.f90252f = interfaceC0245c;
        }

        public static g i(g gVar, c.InterfaceC0245c interfaceC0245c, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC0245c = gVar.f90252f;
            }
            gVar.getClass();
            return new g(interfaceC0245c);
        }

        @Override // androidx.compose.foundation.layout.B
        public int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11) {
            return this.f90252f.a(0, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.G.g(this.f90252f, ((g) obj).f90252f);
        }

        @NotNull
        public final c.InterfaceC0245c g() {
            return this.f90252f;
        }

        @NotNull
        public final g h(@NotNull c.InterfaceC0245c interfaceC0245c) {
            return new g(interfaceC0245c);
        }

        public int hashCode() {
            return this.f90252f.hashCode();
        }

        @NotNull
        public final c.InterfaceC0245c j() {
            return this.f90252f;
        }

        @NotNull
        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f90252f + ')';
        }
    }

    public B() {
    }

    public abstract int d(int i10, @NotNull LayoutDirection layoutDirection, @NotNull androidx.compose.ui.layout.v0 v0Var, int i11);

    @Nullable
    public Integer e(@NotNull androidx.compose.ui.layout.v0 v0Var) {
        return null;
    }

    public boolean f() {
        return this instanceof a;
    }

    public B(C4969v c4969v) {
    }
}
