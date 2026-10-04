package androidx.collection;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n1#2:926\n*E\n"})
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1553q0 f86675a = new C1553q0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final float[] f86676b = new float[0];

    @NotNull
    public static final A a() {
        return f86675a;
    }

    @NotNull
    public static final A b() {
        return f86675a;
    }

    @NotNull
    public static final A c(float f10) {
        return j(f10);
    }

    @NotNull
    public static final A d(float f10, float f11) {
        return k(f10, f11);
    }

    @NotNull
    public static final A e(float f10, float f11, float f12) {
        return l(f10, f11, f12);
    }

    @NotNull
    public static final A f(@NotNull float... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1553q0 c1553q0 = new C1553q0(elements.length);
        c1553q0.W(elements);
        return c1553q0;
    }

    @NotNull
    public static final float[] g() {
        return f86676b;
    }

    public static final int h(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        return iFloatToIntBits ^ (iFloatToIntBits << 16);
    }

    @NotNull
    public static final C1553q0 i() {
        return new C1553q0(0, 1, null);
    }

    @NotNull
    public static final C1553q0 j(float f10) {
        C1553q0 c1553q0 = new C1553q0(1);
        c1553q0.U(f10);
        return c1553q0;
    }

    @NotNull
    public static final C1553q0 k(float f10, float f11) {
        C1553q0 c1553q0 = new C1553q0(2);
        c1553q0.U(f10);
        c1553q0.U(f11);
        return c1553q0;
    }

    @NotNull
    public static final C1553q0 l(float f10, float f11, float f12) {
        C1553q0 c1553q0 = new C1553q0(3);
        c1553q0.U(f10);
        c1553q0.U(f11);
        c1553q0.U(f12);
        return c1553q0;
    }

    @NotNull
    public static final C1553q0 m(@NotNull float... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        C1553q0 c1553q0 = new C1553q0(elements.length);
        c1553q0.W(elements);
        return c1553q0;
    }
}
