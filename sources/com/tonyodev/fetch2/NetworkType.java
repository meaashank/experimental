package com.tonyodev.fetch2;

import dd.o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class NetworkType {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final NetworkType GLOBAL_OFF = new NetworkType("GLOBAL_OFF", 0, -1);
    public static final NetworkType ALL = new NetworkType("ALL", 1, 0);
    public static final NetworkType WIFI_ONLY = new NetworkType("WIFI_ONLY", 2, 1);
    public static final NetworkType UNMETERED = new NetworkType("UNMETERED", 3, 2);

    public static final class a {
        public a() {
        }

        @o
        @NotNull
        public final NetworkType a(int i10) {
            return i10 != -1 ? i10 != 0 ? i10 != 1 ? i10 != 2 ? NetworkType.ALL : NetworkType.UNMETERED : NetworkType.WIFI_ONLY : NetworkType.ALL : NetworkType.GLOBAL_OFF;
        }

        public a(C4969v c4969v) {
        }
    }

    private static final /* synthetic */ NetworkType[] $values() {
        return new NetworkType[]{GLOBAL_OFF, ALL, WIFI_ONLY, UNMETERED};
    }

    static {
        NetworkType[] networkTypeArr$values = $values();
        $VALUES = networkTypeArr$values;
        $ENTRIES = kotlin.enums.c.c(networkTypeArr$values);
        Companion = new a();
    }

    private NetworkType(String str, int i10, int i11) {
        this.value = i11;
    }

    @NotNull
    public static kotlin.enums.a<NetworkType> getEntries() {
        return $ENTRIES;
    }

    @o
    @NotNull
    public static final NetworkType valueOf(int i10) {
        return Companion.a(i10);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }
}
