package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaScriptChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ JavaScriptChoice[] $VALUES;
    private final int value;
    public static final JavaScriptChoice NONE = new JavaScriptChoice("NONE", 0, 0);
    public static final JavaScriptChoice WHITELIST = new JavaScriptChoice("WHITELIST", 1, 1);
    public static final JavaScriptChoice BLACKLIST = new JavaScriptChoice("BLACKLIST", 2, 2);

    private static final /* synthetic */ JavaScriptChoice[] $values() {
        return new JavaScriptChoice[]{NONE, WHITELIST, BLACKLIST};
    }

    static {
        JavaScriptChoice[] javaScriptChoiceArr$values = $values();
        $VALUES = javaScriptChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(javaScriptChoiceArr$values);
    }

    private JavaScriptChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<JavaScriptChoice> getEntries() {
        return $ENTRIES;
    }

    public static JavaScriptChoice valueOf(String str) {
        return (JavaScriptChoice) Enum.valueOf(JavaScriptChoice.class, str);
    }

    public static JavaScriptChoice[] values() {
        return (JavaScriptChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
