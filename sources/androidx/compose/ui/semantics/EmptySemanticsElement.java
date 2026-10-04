package androidx.compose.ui.semantics;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class EmptySemanticsElement extends W<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104021d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final f f104022c;

    public EmptySemanticsElement(@NotNull f fVar) {
        this.f104022c = fVar;
    }

    @Override // androidx.compose.ui.node.W
    public p.d c() {
        return this.f104022c;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
    }

    @Override // androidx.compose.ui.node.W
    public /* bridge */ /* synthetic */ void h(p.d dVar) {
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @NotNull
    public f i() {
        return this.f104022c;
    }

    public void j(@NotNull f fVar) {
    }
}
