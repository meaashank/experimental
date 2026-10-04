package b0;

import android.text.Spanned;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.X, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2745X {
    public static final boolean a(@NotNull Spanned spanned, @NotNull Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(@NotNull Spanned spanned, @NotNull Class<?> cls, int i10, int i11) {
        return spanned.nextSpanTransition(i10 - 1, i11, cls) != i11;
    }
}
