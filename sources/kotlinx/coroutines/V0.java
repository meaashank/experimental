package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class V0 extends AbstractC5049a<kotlin.L0> {
    public V0(@NotNull kotlin.coroutines.i iVar, boolean z10) {
        super(iVar, true, z10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean P0(@NotNull Throwable th) {
        I.b(this.f218811c, th);
        return true;
    }
}
