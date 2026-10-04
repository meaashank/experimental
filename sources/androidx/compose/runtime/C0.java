package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0 {
    @InterfaceC1950a(preferredPropertyName = "doubleValue")
    @NotNull
    public static Double a(D0 d02) {
        return Double.valueOf(d02.getDoubleValue());
    }

    @InterfaceC1950a(preferredPropertyName = "doubleValue")
    public static void c(D0 d02, double d10) {
        d02.setDoubleValue(d10);
    }

    public static void f(D0 d02, double d10) {
        d02.setDoubleValue(d10);
    }
}
