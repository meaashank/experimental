package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkKeys;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3568h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3568h6 f152973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3568h6 f152974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3568h6 f152975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3568h6 f152976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC3568h6[] f152977e;

    static {
        EnumC3568h6 enumC3568h6 = new EnumC3568h6("INFO", 0);
        f152973a = enumC3568h6;
        EnumC3568h6 enumC3568h62 = new EnumC3568h6("DEBUG", 1);
        f152974b = enumC3568h62;
        EnumC3568h6 enumC3568h63 = new EnumC3568h6("ERROR", 2);
        f152975c = enumC3568h63;
        EnumC3568h6 enumC3568h64 = new EnumC3568h6(InMobiNetworkKeys.STATE, 3);
        f152976d = enumC3568h64;
        EnumC3568h6[] enumC3568h6Arr = {enumC3568h6, enumC3568h62, enumC3568h63, enumC3568h64};
        f152977e = enumC3568h6Arr;
        kotlin.enums.c.c(enumC3568h6Arr);
    }

    public EnumC3568h6(String str, int i10) {
    }

    public static EnumC3568h6 valueOf(String str) {
        return (EnumC3568h6) Enum.valueOf(EnumC3568h6.class, str);
    }

    public static EnumC3568h6[] values() {
        return (EnumC3568h6[]) f152977e.clone();
    }
}
