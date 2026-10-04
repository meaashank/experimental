package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface H0 extends InterfaceC1933n0, L0<Integer> {

    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "intValue")
        @Deprecated
        @NotNull
        public static Integer a(@NotNull H0 h02) {
            return Integer.valueOf(G0.a(h02).intValue());
        }

        @InterfaceC1950a(preferredPropertyName = "intValue")
        @Deprecated
        public static void b(@NotNull H0 h02, int i10) {
            h02.setIntValue(i10);
        }
    }

    @InterfaceC1950a(preferredPropertyName = "intValue")
    void c(int i10);

    @Override // androidx.compose.runtime.InterfaceC1933n0
    int getIntValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1933n0, androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "intValue")
    @NotNull
    Integer getValue();

    @Override // androidx.compose.runtime.InterfaceC1933n0, androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Integer getValue();

    void setIntValue(int i10);

    @Override // androidx.compose.runtime.L0
    /* bridge */ /* synthetic */ void setValue(Integer num);
}
