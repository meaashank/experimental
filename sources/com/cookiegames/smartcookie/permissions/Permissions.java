package com.cookiegames.smartcookie.permissions;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Permissions {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Permissions[] $VALUES;
    public static final Permissions GRANTED = new Permissions("GRANTED", 0);
    public static final Permissions DENIED = new Permissions("DENIED", 1);
    public static final Permissions NOT_FOUND = new Permissions("NOT_FOUND", 2);

    private static final /* synthetic */ Permissions[] $values() {
        return new Permissions[]{GRANTED, DENIED, NOT_FOUND};
    }

    static {
        Permissions[] permissionsArr$values = $values();
        $VALUES = permissionsArr$values;
        $ENTRIES = c.c(permissionsArr$values);
    }

    private Permissions(String str, int i10) {
    }

    @NotNull
    public static a<Permissions> getEntries() {
        return $ENTRIES;
    }

    public static Permissions valueOf(String str) {
        return (Permissions) Enum.valueOf(Permissions.class, str);
    }

    public static Permissions[] values() {
        return (Permissions[]) $VALUES.clone();
    }
}
