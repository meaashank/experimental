package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public static final void a(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i10, int i11, int i12) {
        if (charSequence instanceof androidx.compose.foundation.text.input.l) {
            ((androidx.compose.foundation.text.input.l) charSequence).i(cArr, i10, i11, i12);
            return;
        }
        while (i11 < i12) {
            cArr[i10] = charSequence.charAt(i11);
            i11++;
            i10++;
        }
    }
}
