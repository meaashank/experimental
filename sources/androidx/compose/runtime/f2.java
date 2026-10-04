package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class f2 implements InterfaceC1902d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99677b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Float> f99678a;

    public f2(@NotNull X1<Float> x12) {
        this.f99678a = x12;
    }

    @Override // androidx.compose.runtime.InterfaceC1902d0
    public float getFloatValue() {
        return this.f99678a.getValue().floatValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.f99678a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1902d0, androidx.compose.runtime.X1
    @NotNull
    public Float getValue() {
        return this.f99678a.getValue();
    }
}
