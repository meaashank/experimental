package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class e2 implements W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99579b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Double> f99580a;

    public e2(@NotNull X1<Double> x12) {
        this.f99580a = x12;
    }

    @Override // androidx.compose.runtime.W
    public double getDoubleValue() {
        return this.f99580a.getValue().doubleValue();
    }

    @NotNull
    public String toString() {
        return "UnboxedDoubleState(baseState=" + this.f99580a + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.W, androidx.compose.runtime.X1
    @NotNull
    public Double getValue() {
        return this.f99580a.getValue();
    }
}
