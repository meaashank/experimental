package com.cookiegames.smartcookie.view;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderingMode implements u4.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ RenderingMode[] $VALUES;
    private final int value;
    public static final RenderingMode NORMAL = new RenderingMode("NORMAL", 0, 0);
    public static final RenderingMode INVERTED = new RenderingMode("INVERTED", 1, 1);
    public static final RenderingMode GRAYSCALE = new RenderingMode("GRAYSCALE", 2, 2);
    public static final RenderingMode INVERTED_GRAYSCALE = new RenderingMode("INVERTED_GRAYSCALE", 3, 3);
    public static final RenderingMode INCREASE_CONTRAST = new RenderingMode("INCREASE_CONTRAST", 4, 4);

    private static final /* synthetic */ RenderingMode[] $values() {
        return new RenderingMode[]{NORMAL, INVERTED, GRAYSCALE, INVERTED_GRAYSCALE, INCREASE_CONTRAST};
    }

    static {
        RenderingMode[] renderingModeArr$values = $values();
        $VALUES = renderingModeArr$values;
        $ENTRIES = kotlin.enums.c.c(renderingModeArr$values);
    }

    private RenderingMode(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<RenderingMode> getEntries() {
        return $ENTRIES;
    }

    public static RenderingMode valueOf(String str) {
        return (RenderingMode) Enum.valueOf(RenderingMode.class, str);
    }

    public static RenderingMode[] values() {
        return (RenderingMode[]) $VALUES.clone();
    }

    @Override // u4.d
    public int getValue() {
        return this.value;
    }
}
