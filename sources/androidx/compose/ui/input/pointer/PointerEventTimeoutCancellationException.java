package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class PointerEventTimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f102199a = 0;

    public PointerEventTimeoutCancellationException(long j10) {
        super(C2151s.a("Timed out waiting for ", j10, " ms"));
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(U.f102277a);
        return this;
    }
}
