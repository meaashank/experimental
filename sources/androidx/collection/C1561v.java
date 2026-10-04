package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,958:1\n1#2:959\n704#3,2:960\n704#3,2:962\n704#3,2:964\n704#3,2:966\n704#3,2:968\n704#3,2:970\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n927#1:960,2\n936#1:962,2\n937#1:964,2\n947#1:966,2\n948#1:968,2\n949#1:970,2\n*E\n"})
public final class C1561v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1559u f86999a = new C1547n0(0);

    @NotNull
    public static final AbstractC1559u a() {
        return f86999a;
    }

    @NotNull
    public static final AbstractC1559u b() {
        return f86999a;
    }

    @NotNull
    public static final AbstractC1559u c(float f10) {
        return h(f10);
    }

    @NotNull
    public static final AbstractC1559u d(float f10, float f11) {
        return i(f10, f11);
    }

    @NotNull
    public static final AbstractC1559u e(float f10, float f11, float f12) {
        return j(f10, f11, f12);
    }

    @NotNull
    public static final AbstractC1559u f(@NotNull float... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1547n0 c1547n0 = new C1547n0(elements.length);
        c1547n0.k0(elements);
        return c1547n0;
    }

    @NotNull
    public static final C1547n0 g() {
        return new C1547n0(0, 1, null);
    }

    @NotNull
    public static final C1547n0 h(float f10) {
        C1547n0 c1547n0 = new C1547n0(1);
        c1547n0.X(f10);
        return c1547n0;
    }

    @NotNull
    public static final C1547n0 i(float f10, float f11) {
        C1547n0 c1547n0 = new C1547n0(2);
        c1547n0.X(f10);
        c1547n0.X(f11);
        return c1547n0;
    }

    @NotNull
    public static final C1547n0 j(float f10, float f11, float f12) {
        C1547n0 c1547n0 = new C1547n0(3);
        c1547n0.X(f10);
        c1547n0.X(f11);
        c1547n0.X(f12);
        return c1547n0;
    }

    @NotNull
    public static final C1547n0 k(@NotNull float... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1547n0 c1547n0 = new C1547n0(elements.length);
        c1547n0.k0(elements);
        return c1547n0;
    }
}
