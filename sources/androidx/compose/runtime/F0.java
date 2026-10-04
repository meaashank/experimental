package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T1
public interface F0 extends InterfaceC1902d0, L0<Float> {

    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float a(@NotNull F0 f02) {
            return Float.valueOf(E0.a(f02).floatValue());
        }

        @InterfaceC1950a(preferredPropertyName = "floatValue")
        @Deprecated
        public static void b(@NotNull F0 f02, float f10) {
            f02.setFloatValue(f10);
        }
    }

    @InterfaceC1950a(preferredPropertyName = "floatValue")
    void e(float f10);

    @Override // androidx.compose.runtime.InterfaceC1902d0
    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.InterfaceC1902d0, androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "floatValue")
    @NotNull
    Float getValue();

    @Override // androidx.compose.runtime.InterfaceC1902d0, androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Float getValue();

    void setFloatValue(float f10);

    @Override // androidx.compose.runtime.L0
    /* bridge */ /* synthetic */ void setValue(Float f10);
}
