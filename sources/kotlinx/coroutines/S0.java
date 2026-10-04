package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f218795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5100n<kotlin.L0> f218796b;

    /* JADX WARN: Multi-variable type inference failed */
    public S0(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC5100n<? super kotlin.L0> interfaceC5100n) {
        this.f218795a = coroutineDispatcher;
        this.f218796b = interfaceC5100n;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f218796b.l0(this.f218795a, kotlin.L0.f217464a);
    }
}
