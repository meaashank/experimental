package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G0 {
    @InterfaceC1950a(preferredPropertyName = "intValue")
    @NotNull
    public static Integer a(H0 h02) {
        return Integer.valueOf(h02.getIntValue());
    }

    @InterfaceC1950a(preferredPropertyName = "intValue")
    public static void c(H0 h02, int i10) {
        h02.setIntValue(i10);
    }

    public static void f(H0 h02, int i10) {
        h02.setIntValue(i10);
    }
}
