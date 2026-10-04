package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1796n {
    public static final int a(int i10) {
        return Character.charCount(i10);
    }

    public static final int b(@NotNull CharSequence charSequence, int i10) {
        return Character.codePointAt(charSequence, i10);
    }

    public static final int c(@NotNull CharSequence charSequence, int i10) {
        return Character.codePointBefore(charSequence, i10);
    }
}
