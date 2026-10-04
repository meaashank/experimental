package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SiteBlockChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SiteBlockChoice[] $VALUES;
    private final int value;
    public static final SiteBlockChoice NONE = new SiteBlockChoice("NONE", 0, 0);
    public static final SiteBlockChoice WHITELIST = new SiteBlockChoice("WHITELIST", 1, 1);
    public static final SiteBlockChoice BLACKLIST = new SiteBlockChoice("BLACKLIST", 2, 2);

    private static final /* synthetic */ SiteBlockChoice[] $values() {
        return new SiteBlockChoice[]{NONE, WHITELIST, BLACKLIST};
    }

    static {
        SiteBlockChoice[] siteBlockChoiceArr$values = $values();
        $VALUES = siteBlockChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(siteBlockChoiceArr$values);
    }

    private SiteBlockChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<SiteBlockChoice> getEntries() {
        return $ENTRIES;
    }

    public static SiteBlockChoice valueOf(String str) {
        return (SiteBlockChoice) Enum.valueOf(SiteBlockChoice.class, str);
    }

    public static SiteBlockChoice[] values() {
        return (SiteBlockChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
