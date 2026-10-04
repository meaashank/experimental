package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.V;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpan.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class F {
    public static final long a(@e.D(from = 1) int i10) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException("The span value should be higher than 0");
    }
}
