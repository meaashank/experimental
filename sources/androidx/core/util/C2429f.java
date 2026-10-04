package androidx.core.util;

import e.T;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(24)
@dd.j(name = "ConsumerKt")
public final class C2429f {
    @T(24)
    @NotNull
    public static final <T> Consumer<T> a(@NotNull kotlin.coroutines.e<? super T> eVar) {
        return C2428e.a(new ContinuationConsumer(eVar));
    }
}
