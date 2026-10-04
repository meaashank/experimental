package U0;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: U0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1278a {
    public static final boolean a(@NotNull CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@NotNull CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
