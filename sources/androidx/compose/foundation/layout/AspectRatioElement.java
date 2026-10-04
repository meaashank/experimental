package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
final class AspectRatioElement extends androidx.compose.ui.node.W<AspectRatioNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f90234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<C2278s0, kotlin.L0> f90236e;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f10, boolean z10, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        this.f90234c = f10;
        this.f90235d = z10;
        this.f90236e = lVar;
        if (f10 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f10 + " must be > 0").toString());
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.f90234c == aspectRatioElement.f90234c && this.f90235d == ((AspectRatioElement) obj).f90235d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        this.f90236e.invoke(c2278s0);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f90235d) + (Float.floatToIntBits(this.f90234c) * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AspectRatioNode c() {
        return new AspectRatioNode(this.f90234c, this.f90235d);
    }

    public final float j() {
        return this.f90234c;
    }

    @NotNull
    public final ed.l<C2278s0, kotlin.L0> k() {
        return this.f90236e;
    }

    public final boolean l() {
        return this.f90235d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull AspectRatioNode aspectRatioNode) {
        aspectRatioNode.f90239o = this.f90234c;
        aspectRatioNode.f90240p = this.f90235d;
    }
}
