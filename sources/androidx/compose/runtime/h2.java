package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class h2 implements InterfaceC1975w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99697b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Long> f99698a;

    public h2(@NotNull X1<Long> x12) {
        this.f99698a = x12;
    }

    @Override // androidx.compose.runtime.InterfaceC1975w0
    public long getLongValue() {
        return this.f99698a.getValue().longValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedLongState(baseState=" + this.f99698a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1975w0, androidx.compose.runtime.X1
    @NotNull
    public Long getValue() {
        return this.f99698a.getValue();
    }
}
