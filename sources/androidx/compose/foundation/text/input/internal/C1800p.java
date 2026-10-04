package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.InterfaceC1798o;
import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1800p {
    @T1
    @NotNull
    public static final InterfaceC1798o a(@NotNull InterfaceC1798o.a aVar, char c10) {
        return new O0(c10);
    }

    @NotNull
    public static final CharSequence b(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull InterfaceC1798o interfaceC1798o, @NotNull Q0 q02) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < lVar.f94358a.length()) {
            int iCodePointAt = Character.codePointAt(lVar, i10);
            int iA = interfaceC1798o.a(i11, iCodePointAt);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iA != iCodePointAt) {
                q02.e(sb2.length(), sb2.length() + iCharCount, Character.charCount(iA));
                z10 = true;
            }
            sb2.appendCodePoint(iA);
            i10 += iCharCount;
            i11++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return z10 ? string : lVar;
    }
}
