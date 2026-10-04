package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ExpectKt {
    @NotNull
    public static final <T> b2<T> a() {
        return new b2<>(new InterfaceC4376a<T>() { // from class: androidx.compose.runtime.ExpectKt$ThreadLocal$1
            @Override // ed.InterfaceC4376a
            @Nullable
            public final T invoke() {
                return null;
            }
        });
    }

    public static final int b(@NotNull AtomicInt atomicInt) {
        return atomicInt.addAndGet(1) - 1;
    }
}
