package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<L0> f111371a;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(@NotNull kotlin.coroutines.e<? super L0> eVar) {
        super(false);
        this.f111371a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.f111371a.resumeWith(L0.f217464a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
