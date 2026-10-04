package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Qb f152402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Qb f152403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Qb[] f152404c;

    static {
        Qb qb2 = new Qb("SDK", 0);
        f152402a = qb2;
        Qb qb3 = new Qb("TEMPLATE", 1);
        f152403b = qb3;
        Qb[] qbArr = {qb2, qb3};
        f152404c = qbArr;
        kotlin.enums.c.c(qbArr);
    }

    public Qb(String str, int i10) {
    }

    public static Qb valueOf(String str) {
        return (Qb) Enum.valueOf(Qb.class, str);
    }

    public static Qb[] values() {
        return (Qb[]) f152404c.clone();
    }
}
