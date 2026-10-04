package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends androidx.compose.ui.node.W<C1678f0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntrinsicSize f90538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<C2278s0, kotlin.L0> f90540e;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(@NotNull IntrinsicSize intrinsicSize, boolean z10, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        this.f90538c = intrinsicSize;
        this.f90539d = z10;
        this.f90540e = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.f90538c == intrinsicHeightElement.f90538c && this.f90539d == intrinsicHeightElement.f90539d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        this.f90540e.invoke(c2278s0);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f90539d) + (this.f90538c.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1678f0 c() {
        return new C1678f0(this.f90538c, this.f90539d);
    }

    public final boolean j() {
        return this.f90539d;
    }

    @NotNull
    public final IntrinsicSize k() {
        return this.f90538c;
    }

    @NotNull
    public final ed.l<C2278s0, kotlin.L0> l() {
        return this.f90540e;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull C1678f0 c1678f0) {
        c1678f0.f90915o = this.f90538c;
        c1678f0.f90916p = this.f90539d;
    }
}
