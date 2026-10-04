package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PasswordChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PasswordChoice[] $VALUES;
    private final int value;
    public static final PasswordChoice NONE = new PasswordChoice("NONE", 0, 0);
    public static final PasswordChoice CUSTOM = new PasswordChoice("CUSTOM", 1, 1);

    private static final /* synthetic */ PasswordChoice[] $values() {
        return new PasswordChoice[]{NONE, CUSTOM};
    }

    static {
        PasswordChoice[] passwordChoiceArr$values = $values();
        $VALUES = passwordChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(passwordChoiceArr$values);
    }

    private PasswordChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<PasswordChoice> getEntries() {
        return $ENTRIES;
    }

    public static PasswordChoice valueOf(String str) {
        return (PasswordChoice) Enum.valueOf(PasswordChoice.class, str);
    }

    public static PasswordChoice[] values() {
        return (PasswordChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
