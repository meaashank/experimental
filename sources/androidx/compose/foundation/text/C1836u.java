package androidx.compose.foundation.text;

import androidx.compose.ui.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1836u {
    public static final int a(@NotNull CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static final int b(@NotNull CharSequence charSequence, int i10) {
        while (i10 > 0) {
            if (charSequence.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static final long c(@NotNull CharSequence charSequence, int i10) {
        return a0.b(b(charSequence, i10), a(charSequence, i10));
    }
}
