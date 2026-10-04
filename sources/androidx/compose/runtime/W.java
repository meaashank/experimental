package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface W extends X1<Double> {

    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "doubleValue")
        @Deprecated
        @NotNull
        public static Double a(@NotNull W w10) {
            return Double.valueOf(V.a(w10).doubleValue());
        }
    }

    double getDoubleValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "doubleValue")
    @NotNull
    Double getValue();

    @Override // androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Double getValue();
}
