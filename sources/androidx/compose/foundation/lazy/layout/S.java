package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
public final class S extends p.d implements TraversableNode {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public C f91799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final String f91800p = D.f91543a;

    public S(@NotNull C c10) {
        this.f91799o = c10;
    }

    @NotNull
    public final C e3() {
        return this.f91799o;
    }

    @NotNull
    public String f3() {
        return this.f91800p;
    }

    public final void g3(@NotNull C c10) {
        this.f91799o = c10;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object v1() {
        return this.f91800p;
    }
}
