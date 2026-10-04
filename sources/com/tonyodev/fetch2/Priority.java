package com.tonyodev.fetch2;

import dd.o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Priority {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final Priority HIGH = new Priority("HIGH", 0, 1);
    public static final Priority NORMAL = new Priority("NORMAL", 1, 0);
    public static final Priority LOW = new Priority("LOW", 2, -1);

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final Priority a(int i10) {
            return i10 != -1 ? i10 != 0 ? i10 != 1 ? Priority.NORMAL : Priority.HIGH : Priority.NORMAL : Priority.LOW;
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{HIGH, NORMAL, LOW};
    }

    static {
        Priority[] priorityArr$values = $values();
        $VALUES = priorityArr$values;
        $ENTRIES = kotlin.enums.c.c(priorityArr$values);
        Companion = new a();
    }

    private Priority(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<Priority> getEntries() {
        return $ENTRIES;
    }

    @o
    @NotNull
    public static final Priority valueOf(int i10) {
        return Companion.a(i10);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }
}
