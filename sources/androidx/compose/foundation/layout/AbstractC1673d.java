package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AbstractC2155a;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public abstract class AbstractC1673d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f90893a = 0;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.d$a */
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a extends AbstractC1673d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f90894c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ed.l<androidx.compose.ui.layout.Y, Integer> f90895b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull ed.l<? super androidx.compose.ui.layout.Y, Integer> lVar) {
            this.f90895b = lVar;
        }

        public static a d(a aVar, ed.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = aVar.f90895b;
            }
            aVar.getClass();
            return new a(lVar);
        }

        @Override // androidx.compose.foundation.layout.AbstractC1673d
        public int a(@NotNull androidx.compose.ui.layout.v0 v0Var) {
            return this.f90895b.invoke(v0Var).intValue();
        }

        @NotNull
        public final ed.l<androidx.compose.ui.layout.Y, Integer> b() {
            return this.f90895b;
        }

        @NotNull
        public final a c(@NotNull ed.l<? super androidx.compose.ui.layout.Y, Integer> lVar) {
            return new a(lVar);
        }

        @NotNull
        public final ed.l<androidx.compose.ui.layout.Y, Integer> e() {
            return this.f90895b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.G.g(this.f90895b, ((a) obj).f90895b);
        }

        public int hashCode() {
            return this.f90895b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Block(lineProviderBlock=" + this.f90895b + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.d$b */
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b extends AbstractC1673d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f90896c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AbstractC2155a f90897b;

        public b(@NotNull AbstractC2155a abstractC2155a) {
            this.f90897b = abstractC2155a;
        }

        public static b d(b bVar, AbstractC2155a abstractC2155a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC2155a = bVar.f90897b;
            }
            bVar.getClass();
            return new b(abstractC2155a);
        }

        @Override // androidx.compose.foundation.layout.AbstractC1673d
        public int a(@NotNull androidx.compose.ui.layout.v0 v0Var) {
            return v0Var.M(this.f90897b);
        }

        @NotNull
        public final AbstractC2155a b() {
            return this.f90897b;
        }

        @NotNull
        public final b c(@NotNull AbstractC2155a abstractC2155a) {
            return new b(abstractC2155a);
        }

        @NotNull
        public final AbstractC2155a e() {
            return this.f90897b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.G.g(this.f90897b, ((b) obj).f90897b);
        }

        public int hashCode() {
            return this.f90897b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(alignmentLine=" + this.f90897b + ')';
        }
    }

    public AbstractC1673d() {
    }

    public abstract int a(@NotNull androidx.compose.ui.layout.v0 v0Var);

    public AbstractC1673d(C4969v c4969v) {
    }
}
