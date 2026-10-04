package androidx.compose.ui.text.font;

import androidx.compose.runtime.T1;
import androidx.compose.ui.text.InterfaceC2331i;
import androidx.compose.ui.text.font.K;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    @InterfaceC2331i
    @NotNull
    public static final InterfaceC2324v a(int i10, @NotNull L l10, int i11, int i12, @NotNull K.e eVar) {
        return new c0(i10, l10, i11, eVar, i12);
    }

    public static InterfaceC2324v b(int i10, L l10, int i11, int i12, K.e eVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            L.f104551b.getClass();
            l10 = L.f104565p;
        }
        L l11 = l10;
        if ((i13 & 4) != 0) {
            H.f104527b.getClass();
            i11 = H.f104528c;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            F.f104479b.getClass();
            i12 = F.f104480c;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            eVar = K.f104537a.b(l11, i14, new K.a[0]);
        }
        return new c0(i10, l11, i14, eVar, i15);
    }

    @T1
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @InterfaceC4852c0(expression = "Font(resId, weight, style)", imports = {}))
    public static final InterfaceC2324v c(int i10, L l10, int i11) {
        F.f104479b.getClass();
        return new c0(i10, l10, i11, null, F.f104480c, 8, null);
    }

    public static InterfaceC2324v d(int i10, L l10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            L.f104551b.getClass();
            l10 = L.f104565p;
        }
        if ((i12 & 4) != 0) {
            H.f104527b.getClass();
            i11 = H.f104528c;
        }
        return c(i10, l10, i11);
    }

    @T1
    @NotNull
    public static final InterfaceC2324v e(int i10, @NotNull L l10, int i11, int i12) {
        return new c0(i10, l10, i11, new K.e(new K.a[0]), i12);
    }

    public static InterfaceC2324v f(int i10, L l10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            L.f104551b.getClass();
            l10 = L.f104565p;
        }
        if ((i13 & 4) != 0) {
            H.f104527b.getClass();
            i11 = H.f104528c;
        }
        if ((i13 & 8) != 0) {
            F.f104479b.getClass();
            i12 = F.f104480c;
        }
        return e(i10, l10, i11, i12);
    }

    @T1
    @NotNull
    public static final AbstractC2325w g(@NotNull InterfaceC2324v interfaceC2324v) {
        return C2327y.c(interfaceC2324v);
    }
}
