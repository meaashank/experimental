package com.tonyodev.fetch2core;

import dd.o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Reason {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ Reason[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final Reason NOT_SPECIFIED = new Reason("NOT_SPECIFIED", 0, 0);
    public static final Reason DOWNLOAD_ADDED = new Reason("DOWNLOAD_ADDED", 1, 1);
    public static final Reason DOWNLOAD_QUEUED = new Reason("DOWNLOAD_QUEUED", 2, 2);
    public static final Reason DOWNLOAD_STARTED = new Reason("DOWNLOAD_STARTED", 3, 3);
    public static final Reason DOWNLOAD_WAITING_ON_NETWORK = new Reason("DOWNLOAD_WAITING_ON_NETWORK", 4, 4);
    public static final Reason DOWNLOAD_PROGRESS_CHANGED = new Reason("DOWNLOAD_PROGRESS_CHANGED", 5, 5);
    public static final Reason DOWNLOAD_COMPLETED = new Reason("DOWNLOAD_COMPLETED", 6, 6);
    public static final Reason DOWNLOAD_ERROR = new Reason("DOWNLOAD_ERROR", 7, 7);
    public static final Reason DOWNLOAD_PAUSED = new Reason("DOWNLOAD_PAUSED", 8, 8);
    public static final Reason DOWNLOAD_RESUMED = new Reason("DOWNLOAD_RESUMED", 9, 9);
    public static final Reason DOWNLOAD_CANCELLED = new Reason("DOWNLOAD_CANCELLED", 10, 10);
    public static final Reason DOWNLOAD_REMOVED = new Reason("DOWNLOAD_REMOVED", 11, 11);
    public static final Reason DOWNLOAD_DELETED = new Reason("DOWNLOAD_DELETED", 12, 12);
    public static final Reason DOWNLOAD_BLOCK_UPDATED = new Reason("DOWNLOAD_BLOCK_UPDATED", 13, 13);
    public static final Reason OBSERVER_ATTACHED = new Reason("OBSERVER_ATTACHED", 14, 14);
    public static final Reason REPORTING = new Reason("REPORTING", 15, 15);

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final Reason a(int i10) {
            switch (i10) {
                case 1:
                    return Reason.DOWNLOAD_ADDED;
                case 2:
                    return Reason.DOWNLOAD_QUEUED;
                case 3:
                    return Reason.DOWNLOAD_STARTED;
                case 4:
                    return Reason.DOWNLOAD_WAITING_ON_NETWORK;
                case 5:
                    return Reason.DOWNLOAD_PROGRESS_CHANGED;
                case 6:
                    return Reason.DOWNLOAD_COMPLETED;
                case 7:
                    return Reason.DOWNLOAD_ERROR;
                case 8:
                    return Reason.DOWNLOAD_PAUSED;
                case 9:
                    return Reason.DOWNLOAD_RESUMED;
                case 10:
                    return Reason.DOWNLOAD_CANCELLED;
                case 11:
                    return Reason.DOWNLOAD_REMOVED;
                case 12:
                    return Reason.DOWNLOAD_DELETED;
                case 13:
                    return Reason.DOWNLOAD_BLOCK_UPDATED;
                case 14:
                    return Reason.OBSERVER_ATTACHED;
                case 15:
                    return Reason.REPORTING;
                default:
                    return Reason.NOT_SPECIFIED;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ Reason[] $values() {
        return new Reason[]{NOT_SPECIFIED, DOWNLOAD_ADDED, DOWNLOAD_QUEUED, DOWNLOAD_STARTED, DOWNLOAD_WAITING_ON_NETWORK, DOWNLOAD_PROGRESS_CHANGED, DOWNLOAD_COMPLETED, DOWNLOAD_ERROR, DOWNLOAD_PAUSED, DOWNLOAD_RESUMED, DOWNLOAD_CANCELLED, DOWNLOAD_REMOVED, DOWNLOAD_DELETED, DOWNLOAD_BLOCK_UPDATED, OBSERVER_ATTACHED, REPORTING};
    }

    static {
        Reason[] reasonArr$values = $values();
        $VALUES = reasonArr$values;
        $ENTRIES = kotlin.enums.c.c(reasonArr$values);
        Companion = new a();
    }

    private Reason(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<Reason> getEntries() {
        return $ENTRIES;
    }

    @o
    @NotNull
    public static final Reason valueOf(int i10) {
        return Companion.a(i10);
    }

    public static Reason[] values() {
        return (Reason[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static Reason valueOf(String str) {
        return (Reason) Enum.valueOf(Reason.class, str);
    }
}
