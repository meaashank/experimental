package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C4885d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@e.T(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.e<R> f111243a;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(@NotNull kotlin.coroutines.e<? super R> eVar) {
        super(false);
        this.f111243a = eVar;
    }

    public void onError(@NotNull E e10) {
        if (compareAndSet(false, true)) {
            this.f111243a.resumeWith(C4885d0.a(e10));
        }
    }

    public void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.f111243a.resumeWith(r10);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @NotNull
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
