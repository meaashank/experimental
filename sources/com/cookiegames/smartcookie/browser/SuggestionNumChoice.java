package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SuggestionNumChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ SuggestionNumChoice[] $VALUES;
    private final int value;
    public static final SuggestionNumChoice THREE = new SuggestionNumChoice("THREE", 0, 0);
    public static final SuggestionNumChoice FOUR = new SuggestionNumChoice("FOUR", 1, 1);
    public static final SuggestionNumChoice FIVE = new SuggestionNumChoice("FIVE", 2, 2);
    public static final SuggestionNumChoice SIX = new SuggestionNumChoice("SIX", 3, 3);
    public static final SuggestionNumChoice SEVEN = new SuggestionNumChoice("SEVEN", 4, 4);
    public static final SuggestionNumChoice EIGHT = new SuggestionNumChoice("EIGHT", 5, 5);

    private static final /* synthetic */ SuggestionNumChoice[] $values() {
        return new SuggestionNumChoice[]{THREE, FOUR, FIVE, SIX, SEVEN, EIGHT};
    }

    static {
        SuggestionNumChoice[] suggestionNumChoiceArr$values = $values();
        $VALUES = suggestionNumChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(suggestionNumChoiceArr$values);
    }

    private SuggestionNumChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<SuggestionNumChoice> getEntries() {
        return $ENTRIES;
    }

    public static SuggestionNumChoice valueOf(String str) {
        return (SuggestionNumChoice) Enum.valueOf(SuggestionNumChoice.class, str);
    }

    public static SuggestionNumChoice[] values() {
        return (SuggestionNumChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
