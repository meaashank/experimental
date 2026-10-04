package com.cookiegames.smartcookie.device;

import kotlin.enums.a;
import kotlin.enums.c;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BuildType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuildType[] $VALUES;
    public static final BuildType DEBUG = new BuildType("DEBUG", 0);
    public static final BuildType RELEASE = new BuildType("RELEASE", 1);

    private static final /* synthetic */ BuildType[] $values() {
        return new BuildType[]{DEBUG, RELEASE};
    }

    static {
        BuildType[] buildTypeArr$values = $values();
        $VALUES = buildTypeArr$values;
        $ENTRIES = c.c(buildTypeArr$values);
    }

    private BuildType(String str, int i10) {
    }

    @NotNull
    public static a<BuildType> getEntries() {
        return $ENTRIES;
    }

    public static BuildType valueOf(String str) {
        return (BuildType) Enum.valueOf(BuildType.class, str);
    }

    public static BuildType[] values() {
        return (BuildType[]) $VALUES.clone();
    }
}
