package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class I1 {
    @T1
    @NotNull
    public static final W a(@NotNull X1<Double> x12) {
        return x12 instanceof W ? (W) x12 : new e2(x12);
    }

    @T1
    @NotNull
    public static final InterfaceC1902d0 b(@NotNull X1<Float> x12) {
        return x12 instanceof InterfaceC1902d0 ? (InterfaceC1902d0) x12 : new f2(x12);
    }

    @T1
    @NotNull
    public static final InterfaceC1933n0 c(@NotNull X1<Integer> x12) {
        return x12 instanceof InterfaceC1933n0 ? (InterfaceC1933n0) x12 : new g2(x12);
    }

    @T1
    @NotNull
    public static final InterfaceC1975w0 d(@NotNull X1<Long> x12) {
        return x12 instanceof InterfaceC1975w0 ? (InterfaceC1975w0) x12 : new h2(x12);
    }
}
