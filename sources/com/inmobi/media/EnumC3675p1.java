package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3675p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3661o1 f153251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f153252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3675p1 f153253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3675p1 f153254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC3675p1[] f153255f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153256a;

    static {
        EnumC3675p1 enumC3675p1 = new EnumC3675p1(0, 0, com.prism.lib_google_billing.q.f194113a);
        f153253d = enumC3675p1;
        EnumC3675p1 enumC3675p12 = new EnumC3675p1(1, 1, "PLAYING");
        f153254e = enumC3675p12;
        EnumC3675p1[] enumC3675p1Arr = {enumC3675p1, enumC3675p12, new EnumC3675p1(2, 2, "PAUSED"), new EnumC3675p1(3, 3, "COMPLETED")};
        f153255f = enumC3675p1Arr;
        kotlin.enums.c.c(enumC3675p1Arr);
        f153251b = new C3661o1();
        f153252c = new SparseArray();
        for (EnumC3675p1 enumC3675p13 : values()) {
            f153252c.put(enumC3675p13.f153256a, enumC3675p13);
        }
    }

    public EnumC3675p1(int i10, int i11, String str) {
        this.f153256a = i11;
    }

    public static EnumC3675p1 valueOf(String str) {
        return (EnumC3675p1) Enum.valueOf(EnumC3675p1.class, str);
    }

    public static EnumC3675p1[] values() {
        return (EnumC3675p1[]) f153255f.clone();
    }
}
