package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.InterfaceC1950a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@T1
public interface InterfaceC1902d0 extends X1<Float> {

    /* JADX INFO: renamed from: androidx.compose.runtime.d0$a */
    public static final class a {
        @InterfaceC1950a(preferredPropertyName = "floatValue")
        @Deprecated
        @NotNull
        public static Float a(@NotNull InterfaceC1902d0 interfaceC1902d0) {
            return Float.valueOf(C1890c0.a(interfaceC1902d0).floatValue());
        }
    }

    float getFloatValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.X1
    @InterfaceC1950a(preferredPropertyName = "floatValue")
    @NotNull
    Float getValue();

    @Override // androidx.compose.runtime.X1
    /* bridge */ /* synthetic */ Float getValue();
}
