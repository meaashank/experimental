package androidx.compose.foundation;

import androidx.compose.ui.platform.C2278s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends androidx.compose.ui.node.W<HoverableNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.interaction.g f88709c;

    public HoverableElement(@NotNull androidx.compose.foundation.interaction.g gVar) {
        this.f88709c = gVar;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && kotlin.jvm.internal.G.g(((HoverableElement) obj).f88709c, this.f88709c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "hoverable";
        c2278s0.f103929c.c("interactionSource", this.f88709c);
        c2278s0.f103929c.c(com.prism.gaia.server.content.j.f167238E, Boolean.TRUE);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f88709c.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public HoverableNode c() {
        return new HoverableNode(this.f88709c);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull HoverableNode hoverableNode) {
        hoverableNode.j3(this.f88709c);
    }
}
