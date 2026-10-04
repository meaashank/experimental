package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class E0 {
    @InterfaceC1950a(preferredPropertyName = "floatValue")
    @NotNull
    public static Float a(F0 f02) {
        return Float.valueOf(f02.getFloatValue());
    }

    @InterfaceC1950a(preferredPropertyName = "floatValue")
    public static void c(F0 f02, float f10) {
        f02.setFloatValue(f10);
    }

    public static void f(F0 f02, float f10) {
        f02.setFloatValue(f10);
    }
}
