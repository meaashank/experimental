package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n1#2:926\n*E\n"})
public final class C1529e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0 f86953a = new C0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final long[] f86954b = new long[0];

    @NotNull
    public static final AbstractC1527d0 a() {
        return f86953a;
    }

    @NotNull
    public static final long[] b() {
        return f86954b;
    }

    public static final int c(long j10) {
        int iA = C1550p.a(j10) * S0.f86834j;
        return iA ^ (iA << 16);
    }

    @NotNull
    public static final AbstractC1527d0 d() {
        return f86953a;
    }

    @NotNull
    public static final AbstractC1527d0 e(long j10) {
        return j(j10);
    }

    @NotNull
    public static final AbstractC1527d0 f(long j10, long j11) {
        return k(j10, j11);
    }

    @NotNull
    public static final AbstractC1527d0 g(long j10, long j11, long j12) {
        return l(j10, j11, j12);
    }

    @NotNull
    public static final AbstractC1527d0 h(@NotNull long... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C0 c02 = new C0(elements.length);
        c02.W(elements);
        return c02;
    }

    @NotNull
    public static final C0 i() {
        return new C0(0, 1, null);
    }

    @NotNull
    public static final C0 j(long j10) {
        C0 c02 = new C0(1);
        c02.U(j10);
        return c02;
    }

    @NotNull
    public static final C0 k(long j10, long j11) {
        C0 c02 = new C0(2);
        c02.U(j10);
        c02.U(j11);
        return c02;
    }

    @NotNull
    public static final C0 l(long j10, long j11, long j12) {
        C0 c02 = new C0(3);
        c02.U(j10);
        c02.U(j11);
        c02.U(j12);
        return c02;
    }

    @NotNull
    public static final C0 m(@NotNull long... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C0 c02 = new C0(elements.length);
        c02.W(elements);
        return c02;
    }
}
