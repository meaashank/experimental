package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends androidx.compose.ui.node.W<C1685j> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f90254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<C2278s0, kotlin.L0> f90256e;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@NotNull androidx.compose.ui.c cVar, boolean z10, @NotNull ed.l<? super C2278s0, kotlin.L0> lVar) {
        this.f90254c = cVar;
        this.f90255d = z10;
        this.f90256e = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && kotlin.jvm.internal.G.g(this.f90254c, boxChildDataElement.f90254c) && this.f90255d == boxChildDataElement.f90255d;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        this.f90256e.invoke(c2278s0);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return C1635o.a(this.f90255d) + (this.f90254c.hashCode() * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1685j c() {
        return new C1685j(this.f90254c, this.f90255d);
    }

    @NotNull
    public final androidx.compose.ui.c j() {
        return this.f90254c;
    }

    @NotNull
    public final ed.l<C2278s0, kotlin.L0> k() {
        return this.f90256e;
    }

    public final boolean l() {
        return this.f90255d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull C1685j c1685j) {
        c1685j.f90921o = this.f90254c;
        c1685j.f90922p = this.f90255d;
    }
}
