package Vc;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements kotlin.coroutines.e<L0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Result<L0> f76442a;

    public final void a() {
        synchronized (this) {
            while (true) {
                try {
                    Result<L0> result = this.f76442a;
                    if (result == null) {
                        wait();
                    } else {
                        C4885d0.n(result.f217470a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Nullable
    public final Result<L0> b() {
        return this.f76442a;
    }

    public final void c(@Nullable Result<L0> result) {
        this.f76442a = result;
    }

    @Override // kotlin.coroutines.e
    @NotNull
    public kotlin.coroutines.i getContext() {
        return EmptyCoroutineContext.f217673a;
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.f76442a = new Result<>(obj);
            notifyAll();
        }
    }
}
