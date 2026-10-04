package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C5087v {
    public static final int a(@NotNull AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void b(@NotNull AtomicInteger atomicInteger, int i10) {
        atomicInteger.set(i10);
    }
}
