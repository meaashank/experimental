package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
final class TraversablePrefetchStateModifierElement extends W<S> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C f91801c;

    public TraversablePrefetchStateModifierElement(@NotNull C c10) {
        this.f91801c = c10;
    }

    public static TraversablePrefetchStateModifierElement k(TraversablePrefetchStateModifierElement traversablePrefetchStateModifierElement, C c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10 = traversablePrefetchStateModifierElement.f91801c;
        }
        traversablePrefetchStateModifierElement.getClass();
        return new TraversablePrefetchStateModifierElement(c10);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && kotlin.jvm.internal.G.g(this.f91801c, ((TraversablePrefetchStateModifierElement) obj).f91801c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "traversablePrefetchState";
        c2278s0.f103928b = this.f91801c;
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((S) dVar).f91799o = this.f91801c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f91801c.hashCode();
    }

    public final C i() {
        return this.f91801c;
    }

    @NotNull
    public final TraversablePrefetchStateModifierElement j(@NotNull C c10) {
        return new TraversablePrefetchStateModifierElement(c10);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public S c() {
        return new S(this.f91801c);
    }

    public void m(@NotNull S s10) {
        s10.f91799o = this.f91801c;
    }

    @NotNull
    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f91801c + ')';
    }
}
