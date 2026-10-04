package com.cookiegames.smartcookie.search;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Suggestions {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ Suggestions[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int index;
    public static final Suggestions GOOGLE = new Suggestions("GOOGLE", 0, 0);
    public static final Suggestions DUCK = new Suggestions("DUCK", 1, 1);
    public static final Suggestions BAIDU = new Suggestions("BAIDU", 2, 2);
    public static final Suggestions NAVER = new Suggestions("NAVER", 3, 3);
    public static final Suggestions COOKIE = new Suggestions("COOKIE", 4, 4);
    public static final Suggestions NONE = new Suggestions("NONE", 5, 5);

    public static final class a {
        public a() {
        }

        @NotNull
        public final Suggestions a(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? Suggestions.GOOGLE : Suggestions.NONE : Suggestions.COOKIE : Suggestions.NAVER : Suggestions.BAIDU : Suggestions.DUCK : Suggestions.GOOGLE;
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ Suggestions[] $values() {
        return new Suggestions[]{GOOGLE, DUCK, BAIDU, NAVER, COOKIE, NONE};
    }

    static {
        Suggestions[] suggestionsArr$values = $values();
        $VALUES = suggestionsArr$values;
        $ENTRIES = kotlin.enums.c.c(suggestionsArr$values);
        Companion = new a();
    }

    private Suggestions(String str, int i10, int i11) {
        this.index = i11;
    }

    @NotNull
    public static kotlin.enums.a<Suggestions> getEntries() {
        return $ENTRIES;
    }

    public static Suggestions valueOf(String str) {
        return (Suggestions) Enum.valueOf(Suggestions.class, str);
    }

    public static Suggestions[] values() {
        return (Suggestions[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
