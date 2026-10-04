package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Vc f152530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Vc f152531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Vc f152532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Vc[] f152533d;

    static {
        Vc vc2 = new Vc(com.prism.lib_google_billing.q.f194113a, 0);
        f152530a = vc2;
        Vc vc3 = new Vc("HIDDEN", 1);
        f152531b = vc3;
        Vc vc4 = new Vc("VISIBLE", 2);
        f152532c = vc4;
        Vc[] vcArr = {vc2, vc3, vc4};
        f152533d = vcArr;
        kotlin.enums.c.c(vcArr);
    }

    public Vc(String str, int i10) {
    }

    public static Vc valueOf(String str) {
        return (Vc) Enum.valueOf(Vc.class, str);
    }

    public static Vc[] values() {
        return (Vc[]) f152533d.clone();
    }
}
