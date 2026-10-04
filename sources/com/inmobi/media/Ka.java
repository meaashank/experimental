package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ka f152175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Ka[] f152176b;

    static {
        Ka ka2 = new Ka("HIGH", 0);
        Ka ka3 = new Ka("LOW", 1);
        f152175a = ka3;
        Ka[] kaArr = {ka2, ka3};
        f152176b = kaArr;
        kotlin.enums.c.c(kaArr);
    }

    public Ka(String str, int i10) {
    }

    public static Ka valueOf(String str) {
        return (Ka) Enum.valueOf(Ka.class, str);
    }

    public static Ka[] values() {
        return (Ka[]) f152176b.clone();
    }
}
