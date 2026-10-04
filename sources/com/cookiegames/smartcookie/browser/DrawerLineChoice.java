package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DrawerLineChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DrawerLineChoice[] $VALUES;
    private final int value;
    public static final DrawerLineChoice ONE = new DrawerLineChoice("ONE", 0, 0);
    public static final DrawerLineChoice TWO = new DrawerLineChoice("TWO", 1, 1);
    public static final DrawerLineChoice THREE = new DrawerLineChoice("THREE", 2, 2);

    private static final /* synthetic */ DrawerLineChoice[] $values() {
        return new DrawerLineChoice[]{ONE, TWO, THREE};
    }

    static {
        DrawerLineChoice[] drawerLineChoiceArr$values = $values();
        $VALUES = drawerLineChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(drawerLineChoiceArr$values);
    }

    private DrawerLineChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<DrawerLineChoice> getEntries() {
        return $ENTRIES;
    }

    public static DrawerLineChoice valueOf(String str) {
        return (DrawerLineChoice) Enum.valueOf(DrawerLineChoice.class, str);
    }

    public static DrawerLineChoice[] values() {
        return (DrawerLineChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
