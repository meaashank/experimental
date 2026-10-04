package kotlin.random;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final class KotlinRandom extends java.util.Random {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f218002c = new a();
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Random f218003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f218004b;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public KotlinRandom(@NotNull Random impl) {
        G.p(impl, "impl");
        this.f218003a = impl;
    }

    @NotNull
    public final Random d() {
        return this.f218003a;
    }

    @Override // java.util.Random
    public int next(int i10) {
        return this.f218003a.e(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f218003a.g();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bytes) {
        G.p(bytes, "bytes");
        this.f218003a.i(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f218003a.l();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f218003a.o();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f218003a.p();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f218003a.s();
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f218004b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f218004b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return this.f218003a.q(i10);
    }
}
