package androidx.lifecycle;

import java.time.Duration;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(26)
public final class C2590c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2590c f114179a = new C2590c();

    public final long a(@NotNull Duration timeout) {
        kotlin.jvm.internal.G.p(timeout, "timeout");
        return timeout.toMillis();
    }
}
