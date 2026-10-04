package androidx.compose.foundation.lazy.layout;

import androidx.collection.H0;
import androidx.collection.Q0;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@V({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n+ 2 LazyLayoutPrefetchState.jvm.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState_jvmKt\n+ 3 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,506:1\n20#2:507\n20#2:514\n31#3,6:508\n31#3,6:515\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/PrefetchMetrics\n*L\n176#1:507\n192#1:514\n176#1:508,6\n192#1:515,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class L {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91552e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final H0<Object> f91553a = Q0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final H0<Object> f91554b = Q0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f91555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91556d;

    public final long d(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return (j10 / j12) + ((j11 / j12) * ((long) 3));
    }

    public final long e() {
        return this.f91555c;
    }

    @NotNull
    public final H0<Object> f() {
        return this.f91553a;
    }

    public final long g() {
        return this.f91556d;
    }

    @NotNull
    public final H0<Object> h() {
        return this.f91554b;
    }

    public final void i(@Nullable Object obj, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        long jNanoTime = System.nanoTime();
        interfaceC4376a.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            this.f91553a.l0(obj, d(jNanoTime2, this.f91553a.r(obj, 0L)));
        }
        this.f91555c = d(jNanoTime2, this.f91555c);
    }

    public final void j(@Nullable Object obj, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        long jNanoTime = System.nanoTime();
        interfaceC4376a.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (obj != null) {
            this.f91554b.l0(obj, d(jNanoTime2, this.f91554b.r(obj, 0L)));
        }
        this.f91556d = d(jNanoTime2, this.f91556d);
    }
}
