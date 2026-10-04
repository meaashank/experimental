package kotlinx.coroutines.internal;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class C5085t {
    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Expected positive parallelism level, but got ", i10).toString());
        }
    }
}
