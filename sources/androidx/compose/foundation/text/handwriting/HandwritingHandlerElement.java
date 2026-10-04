package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HandwritingHandlerElement extends W<HandwritingHandlerNode> {
    @Override // androidx.compose.ui.node.W
    public p.d c() {
        return new HandwritingHandlerNode();
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        return obj instanceof HandwritingHandlerElement;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "handwritingHandler";
    }

    @Override // androidx.compose.ui.node.W
    public /* bridge */ /* synthetic */ void h(p.d dVar) {
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return 0;
    }

    @NotNull
    public HandwritingHandlerNode i() {
        return new HandwritingHandlerNode();
    }

    public void j(@NotNull HandwritingHandlerNode handwritingHandlerNode) {
    }
}
