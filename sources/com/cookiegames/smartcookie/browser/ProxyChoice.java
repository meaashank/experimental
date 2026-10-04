package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ProxyChoice implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ProxyChoice[] $VALUES;
    private final int value;
    public static final ProxyChoice NONE = new ProxyChoice("NONE", 0, 0);
    public static final ProxyChoice ORBOT = new ProxyChoice("ORBOT", 1, 1);
    public static final ProxyChoice I2P = new ProxyChoice("I2P", 2, 2);
    public static final ProxyChoice MANUAL = new ProxyChoice("MANUAL", 3, 3);

    private static final /* synthetic */ ProxyChoice[] $values() {
        return new ProxyChoice[]{NONE, ORBOT, I2P, MANUAL};
    }

    static {
        ProxyChoice[] proxyChoiceArr$values = $values();
        $VALUES = proxyChoiceArr$values;
        $ENTRIES = kotlin.enums.c.c(proxyChoiceArr$values);
    }

    private ProxyChoice(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<ProxyChoice> getEntries() {
        return $ENTRIES;
    }

    public static ProxyChoice valueOf(String str) {
        return (ProxyChoice) Enum.valueOf(ProxyChoice.class, str);
    }

    public static ProxyChoice[] values() {
        return (ProxyChoice[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
