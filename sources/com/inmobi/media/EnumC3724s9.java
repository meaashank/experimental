package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3724s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3724s9 f153349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3724s9 f153350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3724s9 f153351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3724s9 f153352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3724s9[] f153353e;

    static {
        EnumC3724s9 enumC3724s9 = new EnumC3724s9("PORTRAIT", 0);
        f153349a = enumC3724s9;
        EnumC3724s9 enumC3724s92 = new EnumC3724s9("LANDSCAPE", 1);
        f153350b = enumC3724s92;
        EnumC3724s9 enumC3724s93 = new EnumC3724s9("REVERSE_PORTRAIT", 2);
        f153351c = enumC3724s93;
        EnumC3724s9 enumC3724s94 = new EnumC3724s9("REVERSE_LANDSCAPE", 3);
        f153352d = enumC3724s94;
        EnumC3724s9[] enumC3724s9Arr = {enumC3724s9, enumC3724s92, enumC3724s93, enumC3724s94};
        f153353e = enumC3724s9Arr;
        kotlin.enums.c.c(enumC3724s9Arr);
    }

    public EnumC3724s9(String str, int i10) {
    }

    public static EnumC3724s9 valueOf(String str) {
        return (EnumC3724s9) Enum.valueOf(EnumC3724s9.class, str);
    }

    public static EnumC3724s9[] values() {
        return (EnumC3724s9[]) f153353e.clone();
    }
}
