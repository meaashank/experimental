package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class HomepageTypeChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ HomepageTypeChoice[] $VALUES;
    public static final HomepageTypeChoice DEFAULT = new HomepageTypeChoice("DEFAULT", 0, 0);
    public static final HomepageTypeChoice FOCUSED = new HomepageTypeChoice("FOCUSED", 1, 1);
    public static final HomepageTypeChoice INFORMATIVE = new HomepageTypeChoice("INFORMATIVE", 2, 2);
    private final int value;

    private static final /* synthetic */ HomepageTypeChoice[] $values() {
        return new HomepageTypeChoice[]{DEFAULT, FOCUSED, INFORMATIVE};
    }

    static {
        HomepageTypeChoice[] homepageTypeChoiceArr$values = $values();
        $VALUES = homepageTypeChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(homepageTypeChoiceArr$values);
    }

    private HomepageTypeChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<HomepageTypeChoice> getEntries() {
        return $ENTRIES;
    }

    public static HomepageTypeChoice valueOf(String str) {
        return (HomepageTypeChoice) Enum.valueOf(HomepageTypeChoice.class, str);
    }

    public static HomepageTypeChoice[] values() {
        return (HomepageTypeChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
