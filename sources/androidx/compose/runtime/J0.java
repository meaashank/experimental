package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface J0 extends InterfaceC1975w0, L0<Long> {

    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long a(@NotNull J0 j02) {
            return Long.valueOf(I0.a(j02).longValue());
        }

        @InterfaceC1950a(preferredPropertyName = "longValue")
        @Deprecated
        public static void b(@NotNull J0 j02, long j10) {
            j02.setLongValue(j10);
        }
    }

    @InterfaceC1950a(preferredPropertyName = "longValue")
    void b(long j10);

    @Override // androidx.compose.runtime.InterfaceC1975w0
    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1975w0, androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "longValue")
    @NotNull
    Long getValue();

    @Override // androidx.compose.runtime.InterfaceC1975w0, androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Long getValue();

    void setLongValue(long j10);

    @Override // androidx.compose.runtime.L0
    /* bridge */ /* synthetic */ void setValue(Long l10);
}
