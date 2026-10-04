package androidx.compose.foundation.layout;

import androidx.compose.ui.c;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class HorizontalAlignElement extends androidx.compose.ui.node.W<C1668a0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90523d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c.b f90524c;

    public HorizontalAlignElement(@NotNull c.b bVar) {
        this.f90524c = bVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.G.g(this.f90524c, horizontalAlignElement.f90524c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "align";
        c2278s0.f103928b = this.f90524c;
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((C1668a0) dVar).f90867o = this.f90524c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f90524c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1668a0 c() {
        return new C1668a0(this.f90524c);
    }

    @NotNull
    public final c.b j() {
        return this.f90524c;
    }

    public void k(@NotNull C1668a0 c1668a0) {
        c1668a0.f90867o = this.f90524c;
    }
}
