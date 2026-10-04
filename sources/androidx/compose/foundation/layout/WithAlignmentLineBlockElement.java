package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.F0;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class WithAlignmentLineBlockElement extends androidx.compose.ui.node.W<F0.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90840d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ed.l<androidx.compose.ui.layout.Y, Integer> f90841c;

    /* JADX WARN: Multi-variable type inference failed */
    public WithAlignmentLineBlockElement(@NotNull ed.l<? super androidx.compose.ui.layout.Y, Integer> lVar) {
        this.f90841c = lVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.f90841c == withAlignmentLineBlockElement.f90841c;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "alignBy";
        c2278s0.f103928b = this.f90841c;
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((F0.a) dVar).f90369p = this.f90841c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f90841c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public F0.a c() {
        return new F0.a(this.f90841c);
    }

    @NotNull
    public final ed.l<androidx.compose.ui.layout.Y, Integer> j() {
        return this.f90841c;
    }

    public void k(@NotNull F0.a aVar) {
        aVar.f90369p = this.f90841c;
    }
}
