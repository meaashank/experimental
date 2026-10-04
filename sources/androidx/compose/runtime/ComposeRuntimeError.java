package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99011b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f99012a;

    public ComposeRuntimeError(@NotNull String str) {
        this.f99012a = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.f99012a;
    }
}
