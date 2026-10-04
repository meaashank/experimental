package androidx.compose.ui.node;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.layout.T f103074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LookaheadCapablePlaceable f103075b;

    public p0(@NotNull androidx.compose.ui.layout.T t10, @NotNull LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.f103074a = t10;
        this.f103075b = lookaheadCapablePlaceable;
    }

    public static p0 d(p0 p0Var, androidx.compose.ui.layout.T t10, LookaheadCapablePlaceable lookaheadCapablePlaceable, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            t10 = p0Var.f103074a;
        }
        if ((i10 & 2) != 0) {
            lookaheadCapablePlaceable = p0Var.f103075b;
        }
        p0Var.getClass();
        return new p0(t10, lookaheadCapablePlaceable);
    }

    @Override // androidx.compose.ui.node.m0
    public boolean R0() {
        return this.f103075b.T().H();
    }

    @NotNull
    public final androidx.compose.ui.layout.T a() {
        return this.f103074a;
    }

    @NotNull
    public final LookaheadCapablePlaceable b() {
        return this.f103075b;
    }

    @NotNull
    public final p0 c(@NotNull androidx.compose.ui.layout.T t10, @NotNull LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new p0(t10, lookaheadCapablePlaceable);
    }

    @NotNull
    public final LookaheadCapablePlaceable e() {
        return this.f103075b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.G.g(this.f103074a, p0Var.f103074a) && kotlin.jvm.internal.G.g(this.f103075b, p0Var.f103075b);
    }

    @NotNull
    public final androidx.compose.ui.layout.T f() {
        return this.f103074a;
    }

    public int hashCode() {
        return this.f103075b.hashCode() + (this.f103074a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlaceableResult(result=" + this.f103074a + ", placeable=" + this.f103075b + ')';
    }
}
