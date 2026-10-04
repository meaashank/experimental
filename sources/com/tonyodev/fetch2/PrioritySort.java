package com.tonyodev.fetch2;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class PrioritySort {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ PrioritySort[] $VALUES;
    public static final PrioritySort ASC = new PrioritySort("ASC", 0);
    public static final PrioritySort DESC = new PrioritySort("DESC", 1);

    private static final /* synthetic */ PrioritySort[] $values() {
        return new PrioritySort[]{ASC, DESC};
    }

    static {
        PrioritySort[] prioritySortArr$values = $values();
        $VALUES = prioritySortArr$values;
        $ENTRIES = kotlin.enums.c.c(prioritySortArr$values);
    }

    private PrioritySort(String str, int i10) {
    }

    @NotNull
    public static kotlin.enums.a<PrioritySort> getEntries() {
        return $ENTRIES;
    }

    public static PrioritySort valueOf(String str) {
        return (PrioritySort) Enum.valueOf(PrioritySort.class, str);
    }

    public static PrioritySort[] values() {
        return (PrioritySort[]) $VALUES.clone();
    }
}
