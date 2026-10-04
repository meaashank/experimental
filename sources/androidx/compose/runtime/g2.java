package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class g2 implements InterfaceC1933n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99688b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Integer> f99689a;

    public g2(@NotNull X1<Integer> x12) {
        this.f99689a = x12;
    }

    @Override // androidx.compose.runtime.InterfaceC1933n0
    public int getIntValue() {
        return this.f99689a.getValue().intValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedIntState(baseState=" + this.f99689a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1933n0, androidx.compose.runtime.X1
    @NotNull
    public Integer getValue() {
        return this.f99689a.getValue();
    }
}
