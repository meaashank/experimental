package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class W0<T> extends kotlinx.coroutines.internal.M<T> {
    public W0(@NotNull kotlin.coroutines.i iVar, @NotNull kotlin.coroutines.e<? super T> eVar) {
        super(iVar, eVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean i0(@NotNull Throwable th) {
        return false;
    }
}
