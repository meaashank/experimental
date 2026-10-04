package androidx.core.util;

import e.T;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@T(24)
final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<T> f111370a;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(@NotNull kotlin.coroutines.e<? super T> eVar) {
        super(false);
        this.f111370a = eVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            this.f111370a.resumeWith(t10);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
