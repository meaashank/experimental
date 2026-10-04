package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DrawerSizeChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ DrawerSizeChoice[] $VALUES;
    private final int value;
    public static final DrawerSizeChoice AUTO = new DrawerSizeChoice("AUTO", 0, 0);
    public static final DrawerSizeChoice ONE = new DrawerSizeChoice("ONE", 1, 1);
    public static final DrawerSizeChoice TWO = new DrawerSizeChoice("TWO", 2, 2);
    public static final DrawerSizeChoice THREE = new DrawerSizeChoice("THREE", 3, 3);

    private static final /* synthetic */ DrawerSizeChoice[] $values() {
        return new DrawerSizeChoice[]{AUTO, ONE, TWO, THREE};
    }

    static {
        DrawerSizeChoice[] drawerSizeChoiceArr$values = $values();
        $VALUES = drawerSizeChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(drawerSizeChoiceArr$values);
    }

    private DrawerSizeChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<DrawerSizeChoice> getEntries() {
        return $ENTRIES;
    }

    public static DrawerSizeChoice valueOf(String str) {
        return (DrawerSizeChoice) Enum.valueOf(DrawerSizeChoice.class, str);
    }

    public static DrawerSizeChoice[] values() {
        return (DrawerSizeChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
