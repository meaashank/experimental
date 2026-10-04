package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final i1 f220268c = new i1();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        m1 m1Var = (m1) iVar.get(m1.f220417c);
        if (m1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        m1Var.f220418b = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InterfaceC5107q0
    @NotNull
    public CoroutineDispatcher R2(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
