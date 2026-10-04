package ld;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ld.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5192a extends kotlin.random.a {
    @Override // kotlin.random.Random
    public double m(double d10) {
        return ThreadLocalRandom.current().nextDouble(d10);
    }

    @Override // kotlin.random.Random
    public int r(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    @Override // kotlin.random.Random
    public long t(long j10) {
        return ThreadLocalRandom.current().nextLong(j10);
    }

    @Override // kotlin.random.Random
    public long u(long j10, long j11) {
        return ThreadLocalRandom.current().nextLong(j10, j11);
    }

    @Override // kotlin.random.a
    @NotNull
    public Random v() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        G.o(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
