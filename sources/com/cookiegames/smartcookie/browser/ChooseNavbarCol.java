package com.cookiegames.smartcookie.browser;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ChooseNavbarCol implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ChooseNavbarCol[] $VALUES;
    private final int value;
    public static final ChooseNavbarCol NONE = new ChooseNavbarCol("NONE", 0, 0);
    public static final ChooseNavbarCol COLOR = new ChooseNavbarCol("COLOR", 1, 1);

    private static final /* synthetic */ ChooseNavbarCol[] $values() {
        return new ChooseNavbarCol[]{NONE, COLOR};
    }

    static {
        ChooseNavbarCol[] chooseNavbarColArr$values = $values();
        $VALUES = chooseNavbarColArr$values;
        $ENTRIES = kotlin.enums.c.c(chooseNavbarColArr$values);
    }

    private ChooseNavbarCol(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<ChooseNavbarCol> getEntries() {
        return $ENTRIES;
    }

    public static ChooseNavbarCol valueOf(String str) {
        return (ChooseNavbarCol) Enum.valueOf(ChooseNavbarCol.class, str);
    }

    public static ChooseNavbarCol[] values() {
        return (ChooseNavbarCol[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
