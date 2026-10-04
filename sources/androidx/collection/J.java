package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,958:1\n1#2:959\n704#3,2:960\n704#3,2:962\n704#3,2:964\n704#3,2:966\n704#3,2:968\n704#3,2:970\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n927#1:960,2\n936#1:962,2\n937#1:964,2\n947#1:966,2\n948#1:968,2\n949#1:970,2\n*E\n"})
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I f86715a = new C1558t0(0);

    @NotNull
    public static final I a() {
        return f86715a;
    }

    @NotNull
    public static final I b() {
        return f86715a;
    }

    @NotNull
    public static final I c(int i10) {
        return h(i10);
    }

    @NotNull
    public static final I d(int i10, int i11) {
        return i(i10, i11);
    }

    @NotNull
    public static final I e(int i10, int i11, int i12) {
        return j(i10, i11, i12);
    }

    @NotNull
    public static final I f(@NotNull int... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1558t0 c1558t0 = new C1558t0(elements.length);
        c1558t0.k0(elements);
        return c1558t0;
    }

    @NotNull
    public static final C1558t0 g() {
        return new C1558t0(0, 1, null);
    }

    @NotNull
    public static final C1558t0 h(int i10) {
        C1558t0 c1558t0 = new C1558t0(1);
        c1558t0.X(i10);
        return c1558t0;
    }

    @NotNull
    public static final C1558t0 i(int i10, int i11) {
        C1558t0 c1558t0 = new C1558t0(2);
        c1558t0.X(i10);
        c1558t0.X(i11);
        return c1558t0;
    }

    @NotNull
    public static final C1558t0 j(int i10, int i11, int i12) {
        C1558t0 c1558t0 = new C1558t0(3);
        c1558t0.X(i10);
        c1558t0.X(i11);
        c1558t0.X(i12);
        return c1558t0;
    }

    @NotNull
    public static final C1558t0 k(@NotNull int... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1558t0 c1558t0 = new C1558t0(elements.length);
        c1558t0.k0(elements);
        return c1558t0;
    }
}
