package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3802y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3802y3 f153543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3802y3[] f153544b;

    static {
        EnumC3802y3 enumC3802y3 = new EnumC3802y3("URL", 0);
        f153543a = enumC3802y3;
        EnumC3802y3[] enumC3802y3Arr = {enumC3802y3, new EnumC3802y3("HTML", 1)};
        f153544b = enumC3802y3Arr;
        kotlin.enums.c.c(enumC3802y3Arr);
    }

    public EnumC3802y3(String str, int i10) {
    }

    public static EnumC3802y3 valueOf(String str) {
        return (EnumC3802y3) Enum.valueOf(EnumC3802y3.class, str);
    }

    public static EnumC3802y3[] values() {
        return (EnumC3802y3[]) f153544b.clone();
    }
}
