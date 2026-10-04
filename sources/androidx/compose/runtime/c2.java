package androidx.compose.runtime;

import android.os.Trace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c2 f99428a = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99429b = 0;

    @Nullable
    public final Object a(@NotNull String str) {
        Trace.beginSection(str);
        return null;
    }

    public final void b(@Nullable Object obj) {
        Trace.endSection();
    }
}
