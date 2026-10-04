package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.K;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.j(name = "DeviceFontFamilyNameFontKt")
public final class C2321s {
    @NotNull
    public static final InterfaceC2324v a(@NotNull String str, @NotNull L l10, int i10, @NotNull K.e eVar) {
        return new r(str, l10, i10, eVar);
    }

    public static InterfaceC2324v b(String str, L l10, int i10, K.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            L.f104551b.getClass();
            l10 = L.f104565p;
        }
        if ((i11 & 4) != 0) {
            H.f104527b.getClass();
            i10 = H.f104528c;
        }
        if ((i11 & 8) != 0) {
            eVar = new K.e(new K.a[0]);
        }
        return new r(str, l10, i10, eVar);
    }
}
