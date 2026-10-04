package com.cookiegames.smartcookie;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AppTheme implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ AppTheme[] $VALUES;
    private final int value;
    public static final AppTheme LIGHT = new AppTheme("LIGHT", 0, 0);
    public static final AppTheme DARK = new AppTheme("DARK", 1, 1);
    public static final AppTheme BLACK = new AppTheme("BLACK", 2, 2);

    private static final /* synthetic */ AppTheme[] $values() {
        return new AppTheme[]{LIGHT, DARK, BLACK};
    }

    static {
        AppTheme[] appThemeArr$values = $values();
        $VALUES = appThemeArr$values;
        $ENTRIES = kotlin.enums.c.c(appThemeArr$values);
    }

    private AppTheme(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<AppTheme> getEntries() {
        return $ENTRIES;
    }

    public static AppTheme valueOf(String str) {
        return (AppTheme) Enum.valueOf(AppTheme.class, str);
    }

    public static AppTheme[] values() {
        return (AppTheme[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
