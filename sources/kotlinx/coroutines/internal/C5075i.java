package kotlinx.coroutines.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5075i implements kotlinx.coroutines.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f220342a;

    public C5075i(@NotNull kotlin.coroutines.i iVar) {
        this.f220342a = iVar;
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f220342a;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + this.f220342a + ')';
    }
}
