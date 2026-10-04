package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface D0 extends W, L0<Double> {

    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "doubleValue")
        @Deprecated
        @NotNull
        public static Double a(@NotNull D0 d02) {
            return Double.valueOf(C0.a(d02).doubleValue());
        }

        @InterfaceC1950a(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void b(@NotNull D0 d02, double d10) {
            d02.setDoubleValue(d10);
        }
    }

    @InterfaceC1950a(preferredPropertyName = "doubleValue")
    void f(double d10);

    @Override // androidx.compose.runtime.W
    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.W, androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "doubleValue")
    @NotNull
    Double getValue();

    @Override // androidx.compose.runtime.W, androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Double getValue();

    void setDoubleValue(double d10);

    @Override // androidx.compose.runtime.L0
    /* bridge */ /* synthetic */ void setValue(Double d10);
}
