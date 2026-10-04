package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends androidx.compose.ui.node.W<C1682h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntrinsicSize f90546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<C2278s0, kotlin.L0> f90548e;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(@NotNull IntrinsicSize intrinsicSize, boolean z10, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        this.f90546c = intrinsicSize;
        this.f90547d = z10;
        this.f90548e = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f90546c == intrinsicWidthElement.f90546c && this.f90547d == intrinsicWidthElement.f90547d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        this.f90548e.invoke(c2278s0);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f90547d) + (this.f90546c.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1682h0 c() {
        return new C1682h0(this.f90546c, this.f90547d);
    }

    public final boolean j() {
        return this.f90547d;
    }

    @NotNull
    public final ed.l<C2278s0, kotlin.L0> k() {
        return this.f90548e;
    }

    @NotNull
    public final IntrinsicSize l() {
        return this.f90546c;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull C1682h0 c1682h0) {
        c1682h0.f90919o = this.f90546c;
        c1682h0.f90920p = this.f90547d;
    }
}
