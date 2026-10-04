package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ja f152130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ja f152131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Ja[] f152132c;

    static {
        Ja ja2 = new Ja("GET", 0);
        f152130a = ja2;
        Ja ja3 = new Ja("POST", 1);
        f152131b = ja3;
        Ja[] jaArr = {ja2, ja3, new Ja("PUT", 2), new Ja("DELETE", 3), new Ja("PATCH", 4)};
        f152132c = jaArr;
        kotlin.enums.c.c(jaArr);
    }

    public Ja(String str, int i10) {
    }

    public static Ja valueOf(String str) {
        return (Ja) Enum.valueOf(Ja.class, str);
    }

    public static Ja[] values() {
        return (Ja[]) f152132c.clone();
    }
}
