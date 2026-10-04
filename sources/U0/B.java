package U0;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class B {
    public static final <T> T[] a(Spanned spanned, int i10, int i11) {
        G.P();
        throw null;
    }

    public static Object[] b(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            spanned.length();
        }
        G.P();
        throw null;
    }

    @NotNull
    public static final Spanned c(@NotNull CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
