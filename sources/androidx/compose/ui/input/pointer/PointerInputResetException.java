package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class PointerInputResetException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f102212a = 0;

    public PointerInputResetException() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(U.f102277a);
        return this;
    }
}
