package kotlinx.coroutines.internal;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5088w extends LockFreeLinkedListNode {
    public final <T extends LockFreeLinkedListNode> void G(ed.l<? super T, L0> lVar) {
        Object objL = l();
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        if (((LockFreeLinkedListNode) objL).equals(this)) {
            return;
        }
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final boolean H() {
        return l() == this;
    }

    @NotNull
    public final Void I() {
        throw new IllegalStateException("head cannot be removed");
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean u() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @Nullable
    public LockFreeLinkedListNode x() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public /* bridge */ /* synthetic */ boolean y() {
        I();
        throw null;
    }
}
