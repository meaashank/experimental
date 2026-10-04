package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final LockFreeLinkedListNode f220292a;

    public K(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f220292a = lockFreeLinkedListNode;
    }

    @NotNull
    public String toString() {
        return "Removed[" + this.f220292a + ']';
    }
}
