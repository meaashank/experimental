package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class CancelTimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CancelTimeoutCancellationException f102168a = new CancelTimeoutCancellationException();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102169b = 0;

    private CancelTimeoutCancellationException() {
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(U.f102277a);
        return this;
    }
}
