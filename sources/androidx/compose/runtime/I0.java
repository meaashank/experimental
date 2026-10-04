package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I0 {
    @InterfaceC1950a(preferredPropertyName = "longValue")
    @NotNull
    public static Long a(J0 j02) {
        return Long.valueOf(j02.getLongValue());
    }

    @InterfaceC1950a(preferredPropertyName = "longValue")
    public static void c(J0 j02, long j10) {
        j02.setLongValue(j10);
    }

    public static void f(J0 j02, long j10) {
        j02.setLongValue(j10);
    }
}
