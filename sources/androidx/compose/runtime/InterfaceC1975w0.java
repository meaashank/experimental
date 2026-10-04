package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public interface InterfaceC1975w0 extends X1<Long> {

    /* JADX INFO: renamed from: androidx.compose.runtime.w0$a */
    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long a(@NotNull InterfaceC1975w0 interfaceC1975w0) {
            return Long.valueOf(C1972v0.a(interfaceC1975w0).longValue());
        }
    }

    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "longValue")
    @NotNull
    Long getValue();

    @Override // androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Long getValue();
}
