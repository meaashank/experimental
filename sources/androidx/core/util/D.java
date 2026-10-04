package androidx.core.util;

import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class D {
    @NotNull
    public static final Runnable a(@NotNull kotlin.coroutines.e<? super L0> eVar) {
        return new ContinuationRunnable(eVar);
    }
}
