package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 {
    @NotNull
    public static final Shader a(@NotNull InterfaceC2025e2 interfaceC2025e2, int i10, int i11) {
        return C2043j0.a(interfaceC2025e2, i10, i11);
    }

    public static Shader b(InterfaceC2025e2 interfaceC2025e2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i3.f101130b.getClass();
            i10 = i3.f101131c;
        }
        if ((i12 & 4) != 0) {
            i3.f101130b.getClass();
            i11 = i3.f101131c;
        }
        return C2043j0.a(interfaceC2025e2, i10, i11);
    }

    @NotNull
    public static final Shader c(long j10, long j11, @NotNull List<K0> list, @Nullable List<Float> list2, int i10) {
        return C2043j0.b(j10, j11, list, list2, i10);
    }

    public static Shader d(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i3.f101130b.getClass();
            i10 = i3.f101131c;
        }
        return C2043j0.b(j10, j11, list, list3, i10);
    }

    @NotNull
    public static final Shader e(long j10, float f10, @NotNull List<K0> list, @Nullable List<Float> list2, int i10) {
        return C2043j0.c(j10, f10, list, list2, i10);
    }

    public static Shader f(long j10, float f10, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i3.f101130b.getClass();
            i10 = i3.f101131c;
        }
        return C2043j0.c(j10, f10, list, list3, i10);
    }

    @NotNull
    public static final Shader g(long j10, @NotNull List<K0> list, @Nullable List<Float> list2) {
        return C2043j0.d(j10, list, list2);
    }

    public static Shader h(long j10, List list, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        return C2043j0.d(j10, list, list2);
    }
}
