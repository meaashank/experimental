package androidx.compose.ui.layout;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2190z {
    @Nullable
    public static final Object a(@NotNull O o10) {
        Object objG = o10.g();
        B b10 = objG instanceof B ? (B) objG : null;
        if (b10 != null) {
            return b10.W1();
        }
        return null;
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull Object obj) {
        return pVar.P0(new LayoutIdElement(obj));
    }
}
