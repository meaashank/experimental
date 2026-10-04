package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public interface InterfaceC1933n0 extends X1<Integer> {

    /* JADX INFO: renamed from: androidx.compose.runtime.n0$a */
    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "intValue")
        @Deprecated
        @NotNull
        public static Integer a(@NotNull InterfaceC1933n0 interfaceC1933n0) {
            return Integer.valueOf(C1930m0.a(interfaceC1933n0).intValue());
        }
    }

    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "intValue")
    @NotNull
    Integer getValue();

    @Override // androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Integer getValue();
}
