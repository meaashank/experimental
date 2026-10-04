package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.W;
import androidx.compose.ui.p;
import androidx.compose.ui.platform.C2278s0;
import ed.InterfaceC4376a;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class HandwritingDetectorElement extends W<HandwritingDetectorNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f93572c;

    public HandwritingDetectorElement(@NotNull InterfaceC4376a<L0> interfaceC4376a) {
        this.f93572c = interfaceC4376a;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        boolean z10 = false;
        boolean z11 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.f93572c == ((HandwritingDetectorElement) obj).f93572c) {
            z10 = true;
        }
        return z11 | z10;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = "handwritingDetector";
        c2278s0.f103929c.c("callback", this.f93572c);
    }

    @Override // androidx.compose.ui.node.W
    public void h(p.d dVar) {
        ((HandwritingDetectorNode) dVar).f93573r = this.f93572c;
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        return this.f93572c.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public HandwritingDetectorNode c() {
        return new HandwritingDetectorNode(this.f93572c);
    }

    public void j(@NotNull HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.f93573r = this.f93572c;
    }
}
