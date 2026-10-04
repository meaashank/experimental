package h0;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: h0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4484l {
    @NotNull
    public static final String a(@NotNull Locale locale) {
        return locale.getLanguage();
    }

    @NotNull
    public static final String b(@NotNull Locale locale) {
        return locale.toLanguageTag();
    }

    @NotNull
    public static final String c(@NotNull Locale locale) {
        return locale.getCountry();
    }

    @NotNull
    public static final String d(@NotNull Locale locale) {
        return locale.getScript();
    }
}
