package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,958:1\n1#2:959\n704#3,2:960\n704#3,2:962\n704#3,2:964\n704#3,2:966\n704#3,2:968\n704#3,2:970\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n927#1:960,2\n936#1:962,2\n937#1:964,2\n947#1:966,2\n948#1:968,2\n949#1:970,2\n*E\n"})
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final W f86913a = new z0(0);

    @NotNull
    public static final W a() {
        return f86913a;
    }

    @NotNull
    public static final W b() {
        return f86913a;
    }

    @NotNull
    public static final W c(long j10) {
        return h(j10);
    }

    @NotNull
    public static final W d(long j10, long j11) {
        return i(j10, j11);
    }

    @NotNull
    public static final W e(long j10, long j11, long j12) {
        return j(j10, j11, j12);
    }

    @NotNull
    public static final W f(@NotNull long... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        z0 z0Var = new z0(elements.length);
        z0Var.k0(elements);
        return z0Var;
    }

    @NotNull
    public static final z0 g() {
        return new z0(0, 1, null);
    }

    @NotNull
    public static final z0 h(long j10) {
        z0 z0Var = new z0(1);
        z0Var.X(j10);
        return z0Var;
    }

    @NotNull
    public static final z0 i(long j10, long j11) {
        z0 z0Var = new z0(2);
        z0Var.X(j10);
        z0Var.X(j11);
        return z0Var;
    }

    @NotNull
    public static final z0 j(long j10, long j11, long j12) {
        z0 z0Var = new z0(3);
        z0Var.X(j10);
        z0Var.X(j11);
        z0Var.X(j12);
        return z0Var;
    }

    @NotNull
    public static final z0 k(@NotNull long... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        z0 z0Var = new z0(elements.length);
        z0Var.k0(elements);
        return z0Var;
    }
}
