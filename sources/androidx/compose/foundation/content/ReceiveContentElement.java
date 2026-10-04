package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class ReceiveContentElement extends W<ReceiveContentNode> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88920d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f88921c;

    public ReceiveContentElement(@NotNull e eVar) {
        this.f88921c = eVar;
    }

    public static ReceiveContentElement k(ReceiveContentElement receiveContentElement, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = receiveContentElement.f88921c;
        }
        receiveContentElement.getClass();
        return new ReceiveContentElement(eVar);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && G.g(this.f88921c, ((ReceiveContentElement) obj).f88921c);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "receiveContent";
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((ReceiveContentNode) dVar).f88923r = this.f88921c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f88921c.hashCode();
    }

    @NotNull
    public final e i() {
        return this.f88921c;
    }

    @NotNull
    public final ReceiveContentElement j(@NotNull e eVar) {
        return new ReceiveContentElement(eVar);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ReceiveContentNode c() {
        return new ReceiveContentNode(this.f88921c);
    }

    @NotNull
    public final e m() {
        return this.f88921c;
    }

    public void n(@NotNull ReceiveContentNode receiveContentNode) {
        receiveContentNode.f88923r = this.f88921c;
    }

    @NotNull
    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.f88921c + ')';
    }
}
