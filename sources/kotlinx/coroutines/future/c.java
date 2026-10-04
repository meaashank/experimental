package kotlinx.coroutines.future;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import kotlin.L0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.AbstractC5049a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T> extends AbstractC5049a<T> implements BiFunction<T, Throwable, L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CompletableFuture<T> f220254d;

    public c(@NotNull kotlin.coroutines.i iVar, @NotNull CompletableFuture<T> completableFuture) {
        super(iVar, true, true);
        this.f220254d = completableFuture;
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void P1(@NotNull Throwable th, boolean z10) {
        this.f220254d.completeExceptionally(th);
    }

    @Override // kotlinx.coroutines.AbstractC5049a
    public void Q1(T t10) {
        this.f220254d.complete(t10);
    }

    public void S1(@Nullable T t10, @Nullable Throwable th) {
        A0.a.b(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ L0 apply(Object obj, Throwable th) {
        S1(obj, th);
        return L0.f217464a;
    }
}
