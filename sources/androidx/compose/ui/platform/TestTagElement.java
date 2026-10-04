package androidx.compose.ui.platform;

import Y6.d;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class TestTagElement extends androidx.compose.ui.node.W<w1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f103653c;

    public TestTagElement(@NotNull String str) {
        this.f103653c = str;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return kotlin.jvm.internal.G.g(this.f103653c, ((TestTagElement) obj).f103653c);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "testTag";
        c2278s0.f103929c.c(d.C0152d.f79310d, this.f103653c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((w1) dVar).f103945o = this.f103653c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f103653c.hashCode();
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w1 c() {
        return new w1(this.f103653c);
    }

    public void j(@NotNull w1 w1Var) {
        w1Var.f103945o = this.f103653c;
    }
}
