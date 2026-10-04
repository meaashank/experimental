package androidx.compose.ui;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class ModifierNodeDetachedCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f100365a = 0;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(r.f103966a);
        return this;
    }
}
