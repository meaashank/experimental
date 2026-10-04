package S1;

import kotlin.jvm.internal.G;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements AutoCloseable, L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f68109a;

    public a(@NotNull kotlin.coroutines.i coroutineContext) {
        G.p(coroutineContext, "coroutineContext");
        this.f68109a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.i(this.f68109a, null, 1, null);
    }

    @Override // kotlinx.coroutines.L
    @NotNull
    public kotlin.coroutines.i m() {
        return this.f68109a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull L coroutineScope) {
        this(coroutineScope.m());
        G.p(coroutineScope, "coroutineScope");
    }
}
