package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1605q {
    @NotNull
    public static final C1595l a(float f10) {
        return new C1595l(f10);
    }

    @NotNull
    public static final C1597m b(float f10, float f11) {
        return new C1597m(f10, f11);
    }

    @NotNull
    public static final C1599n c(float f10, float f11, float f12) {
        return new C1599n(f10, f11, f12);
    }

    @NotNull
    public static final C1601o d(float f10, float f11, float f12, float f13) {
        return new C1601o(f10, f11, f12, f13);
    }

    @NotNull
    public static final <T extends AbstractC1603p> T e(@NotNull T t10) {
        T t11 = (T) t10.c();
        int iB = t11.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends AbstractC1603p> void f(@NotNull T t10, @NotNull T t11) {
        int iB = t10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    @NotNull
    public static final <T extends AbstractC1603p> T g(@NotNull T t10) {
        return (T) t10.c();
    }
}
