package U0;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class F {
    public static int a(@Nullable Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @NonNull
    public static String b(@NonNull String str) {
        return TextUtils.htmlEncode(str);
    }
}
