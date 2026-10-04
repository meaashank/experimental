package com.tonyodev.fetch2;

import dd.o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Status {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final Status NONE = new Status("NONE", 0, 0);
    public static final Status QUEUED = new Status("QUEUED", 1, 1);
    public static final Status DOWNLOADING = new Status("DOWNLOADING", 2, 2);
    public static final Status PAUSED = new Status("PAUSED", 3, 3);
    public static final Status COMPLETED = new Status("COMPLETED", 4, 4);
    public static final Status CANCELLED = new Status("CANCELLED", 5, 5);
    public static final Status FAILED = new Status("FAILED", 6, 6);
    public static final Status REMOVED = new Status("REMOVED", 7, 7);
    public static final Status DELETED = new Status("DELETED", 8, 8);
    public static final Status ADDED = new Status("ADDED", 9, 9);

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final Status a(int i10) {
            switch (i10) {
                case 0:
                    return Status.NONE;
                case 1:
                    return Status.QUEUED;
                case 2:
                    return Status.DOWNLOADING;
                case 3:
                    return Status.PAUSED;
                case 4:
                    return Status.COMPLETED;
                case 5:
                    return Status.CANCELLED;
                case 6:
                    return Status.FAILED;
                case 7:
                    return Status.REMOVED;
                case 8:
                    return Status.DELETED;
                case 9:
                    return Status.ADDED;
                default:
                    return Status.NONE;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{NONE, QUEUED, DOWNLOADING, PAUSED, COMPLETED, CANCELLED, FAILED, REMOVED, DELETED, ADDED};
    }

    static {
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = kotlin.enums.c.c(statusArr$values);
        Companion = new a();
    }

    private Status(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<Status> getEntries() {
        return $ENTRIES;
    }

    @o
    @NotNull
    public static final Status valueOf(int i10) {
        return Companion.a(i10);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }
}
