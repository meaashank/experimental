package kotlin.time;

import kotlin.InterfaceC4887e0;
import kotlin.time.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
public final class C implements F.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C f218376b = new C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f218377c = System.nanoTime();

    private final long f() {
        return System.nanoTime() - f218377c;
    }

    @Override // kotlin.time.F.c, kotlin.time.F
    public InterfaceC5040g a() {
        return new F.b.a(f());
    }

    public final long b(long j10, long j11) {
        return z.d(j10, DurationUnit.NANOSECONDS, j11);
    }

    public final long c(long j10, long j11) {
        return z.h(j10, j11, DurationUnit.NANOSECONDS);
    }

    public final long d(long j10) {
        return z.f(f(), j10, DurationUnit.NANOSECONDS);
    }

    public long e() {
        return f();
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.F
    public E a() {
        return new F.b.a(f());
    }
}
