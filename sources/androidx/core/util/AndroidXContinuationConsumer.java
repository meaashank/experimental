package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements InterfaceC2427d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<T> f111368a;

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(@NotNull kotlin.coroutines.e<? super T> eVar) {
        super(false);
        this.f111368a = eVar;
    }

    @Override // androidx.core.util.InterfaceC2427d
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            this.f111368a.resumeWith(t10);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
