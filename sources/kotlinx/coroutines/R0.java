package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class R0 extends F0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<kotlin.L0> f218794e;

    /* JADX WARN: Multi-variable type inference failed */
    public R0(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        this.f218794e = eVar;
    }

    @Override // kotlinx.coroutines.InterfaceC5118w0
    public void a(@Nullable Throwable th) {
        this.f218794e.resumeWith(kotlin.L0.f217464a);
    }
}
