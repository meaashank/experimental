package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.Z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    @NotNull
    public static final CharSequence a(@NotNull l lVar) {
        return lVar.f94358a.subSequence(Z.l(lVar.f94359b), Z.k(lVar.f94359b));
    }

    @NotNull
    public static final CharSequence b(@NotNull l lVar, int i10) {
        return lVar.f94358a.subSequence(Z.k(lVar.f94359b), Math.min(Z.k(lVar.f94359b) + i10, lVar.f94358a.length()));
    }

    @NotNull
    public static final CharSequence c(@NotNull l lVar, int i10) {
        return lVar.f94358a.subSequence(Math.max(0, Z.l(lVar.f94359b) - i10), Z.l(lVar.f94359b));
    }
}
