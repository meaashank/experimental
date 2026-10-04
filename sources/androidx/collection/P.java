package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n1#2:926\n*E\n"})
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1564w0 f86812a = new C1564w0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final int[] f86813b = new int[0];

    @NotNull
    public static final O a() {
        return f86812a;
    }

    @NotNull
    public static final int[] b() {
        return f86813b;
    }

    public static final int c(int i10) {
        int i11 = i10 * S0.f86834j;
        return i11 ^ (i11 << 16);
    }

    @NotNull
    public static final O d() {
        return f86812a;
    }

    @NotNull
    public static final O e(int i10) {
        return j(i10);
    }

    @NotNull
    public static final O f(int i10, int i11) {
        return k(i10, i11);
    }

    @NotNull
    public static final O g(int i10, int i11, int i12) {
        return l(i10, i11, i12);
    }

    @NotNull
    public static final O h(@NotNull int... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1564w0 c1564w0 = new C1564w0(elements.length);
        c1564w0.W(elements);
        return c1564w0;
    }

    @NotNull
    public static final C1564w0 i() {
        return new C1564w0(0, 1, null);
    }

    @NotNull
    public static final C1564w0 j(int i10) {
        C1564w0 c1564w0 = new C1564w0(1);
        c1564w0.U(i10);
        return c1564w0;
    }

    @NotNull
    public static final C1564w0 k(int i10, int i11) {
        C1564w0 c1564w0 = new C1564w0(2);
        c1564w0.U(i10);
        c1564w0.U(i11);
        return c1564w0;
    }

    @NotNull
    public static final C1564w0 l(int i10, int i11, int i12) {
        C1564w0 c1564w0 = new C1564w0(3);
        c1564w0.U(i10);
        c1564w0.U(i11);
        c1564w0.U(i12);
        return c1564w0;
    }

    @NotNull
    public static final C1564w0 m(@NotNull int... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1564w0 c1564w0 = new C1564w0(elements.length);
        c1564w0.W(elements);
        return c1564w0;
    }
}
